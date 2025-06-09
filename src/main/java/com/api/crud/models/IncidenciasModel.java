package com.api.crud.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "incidencias")
public class IncidenciasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idincidencia;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuariosModel usuario;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descirpcion;

    @Column(name = "fechahora")
    private LocalDateTime fechaHora;

    @Column(name = "resuelto")
    private Boolean resuelto;

    public Long getIdIncidencia() {
        return idincidencia;
    }

    public void setIdIncidencia(Long idIncidencia) {
        this.idincidencia = idIncidencia;
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