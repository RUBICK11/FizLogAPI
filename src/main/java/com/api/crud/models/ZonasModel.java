package com.api.crud.models;

import jakarta.persistence.*;


@Entity
@Table(name = "zonas")
public class ZonasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idzona;

    @Column(name = "tipo")
    private String tipo;

    public Long getIdZona() {
        return idzona;
    }

    public void setIdZona(Long idZona) {
        this.idzona = idZona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}