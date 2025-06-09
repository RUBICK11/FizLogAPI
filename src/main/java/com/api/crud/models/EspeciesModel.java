package com.api.crud.models;

import jakarta.persistence.*;


@Entity
@Table(name = "especies")
public class EspeciesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idespecie;

    @Column(name = "nombrecomun")
    private String nombrecomun;

    @Column(name = "nombrecientifico")
    private String nombrecientifico;

    @Column(name = "tallamediterraneo")
    private int tallamediterraneo;

    @Column(name = "tallacanario")
    private int tallacanario;

    @Column(name = "tallacantabriconwgolfocadiz")
    private int tallacantabriconwgolfocadiz;

    @Column(name = "fotourl")
    private String fotourl;

    @Column(name = "descripcion")
    private String descripcion;

    public Long getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Long idespecie) {
        this.idespecie = idespecie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String foto_url) {
        this.fotourl = foto_url;
    }

    public int getTallacantabriconwgolfocadiz() {
        return tallacantabriconwgolfocadiz;
    }

    public void setTallacantabriconwgolfocadiz(int tallacantabriconwgolfocadiz) {
        this.tallacantabriconwgolfocadiz = tallacantabriconwgolfocadiz;
    }

    public int getTallacanario() {
        return tallacanario;
    }

    public void setTallacanario(int tallacanario) {
        this.tallacanario = tallacanario;
    }

    public int getTallamediterraneo() {
        return tallamediterraneo;
    }

    public void setTallamediterraneo(int tallamediterraneo) {
        this.tallamediterraneo = tallamediterraneo;
    }

    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public void setNombrecientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
    }

    public String getNombrecomun() {
        return nombrecomun;
    }

    public void setNombrecomun(String nombrecomun) {
        this.nombrecomun = nombrecomun;
    }
}