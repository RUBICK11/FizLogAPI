package com.api.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "comunidadesautonomas")
public class ComunidadesAutonomasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idComunidadesAutonomas;

    @Column(name = "nombre")
    private String nombre;

    public int getIdComunidadesAutonomas() {
        return idComunidadesAutonomas;
    }

    public void setIdComunidadesAutonomas(int idComunidadesAutonomas) {
        this.idComunidadesAutonomas = idComunidadesAutonomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
