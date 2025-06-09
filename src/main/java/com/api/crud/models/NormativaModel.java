package com.api.crud.models;

import jakarta.persistence.*;



@Entity
@Table(name = "Normativa")
public class NormativaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNormativa;

    @ManyToOne
    @JoinColumn(name = "idComunidad")
    private ComunidadesAutonomasModel idComunidad;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Descripcion")
    private String descripcion;

    public Long getIdNormativa() {
        return idNormativa;
    }

    public void setIdNormativa(Long idNormativa) {
        this.idNormativa = idNormativa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ComunidadesAutonomasModel getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(ComunidadesAutonomasModel idComunidad) {
        this.idComunidad = idComunidad;
    }
}
