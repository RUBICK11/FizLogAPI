package com.api.crud.models;

import jakarta.persistence.*;


@Entity
@Table(name = "Tecnicas")
public class TecnicasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTecnica;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    public Long getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(Long idTecnica) {
        this.idTecnica = idTecnica;
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
