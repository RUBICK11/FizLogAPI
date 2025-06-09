package com.api.crud.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "Incidencias")
public class IncidenciasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idIncidencia;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuariosModel usuario;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Descripcion")
    private String descirpcion;

    @Column(name = "FechaHora")
    private LocalDateTime fechaHora;

    @Column(name = "Resuelto")
    private Boolean resuelto;

    public Long getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(Long idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public Boolean getResuelto() {
        return resuelto;
    }

    public void setResuelto(Boolean resuelto) {
        this.resuelto = resuelto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescirpcion() {
        return descirpcion;
    }

    public void setDescirpcion(String descirpcion) {
        this.descirpcion = descirpcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public UsuariosModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }
}