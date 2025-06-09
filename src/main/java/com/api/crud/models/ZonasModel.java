package com.api.crud.models;

import jakarta.persistence.*;


@Entity
@Table(name = "Zonas")
public class ZonasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idZona;

    @Column(name = "Tipo")
    private String tipo;

    public Long getIdZona() {
        return idZona;
    }

    public void setIdZona(Long idZona) {
        this.idZona = idZona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}