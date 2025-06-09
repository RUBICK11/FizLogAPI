package com.api.crud.models;

import jakarta.persistence.*;


@Entity
@Table(name = "tecnicas")
public class TecnicasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idtecnicapesca;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    public Long getIdTecnica() {
        return idtecnicapesca;
    }

    public void setIdTecnica(Long idTecnica) {
        this.idtecnicapesca = idTecnica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
