package com.api.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "comunidadesautonomas")
public class ComunidadesAutonomasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcomunidadesautonomas;

    @Column(name = "nombre")
    private String nombre;

    public Long getIdComunidadesAutonomas() {
        return idcomunidadesautonomas;
    }

    public void setIdComunidadesAutonomas(Long idComunidadesAutonomas) {
        this.idcomunidadesautonomas = idComunidadesAutonomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
