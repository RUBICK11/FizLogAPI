package com.api.crud.models;

import jakarta.persistence.*;



@Entity
@Table(name = "normativas")
public class NormativaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idnormativa;

    @ManyToOne
    @JoinColumn(name = "idcomunidadesautonomas")
    private ComunidadesAutonomasModel idComunidad;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    public Long getIdNormativa() {
        return idnormativa;
    }

    public void setIdNormativa(Long idNormativa) {
        this.idnormativa = idNormativa;
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
