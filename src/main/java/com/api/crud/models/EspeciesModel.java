package com.api.crud.models;

import jakarta.persistence.*;


@Entity
@Table(name = "Especies")
public class EspeciesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_especie;

    @Column(name = "nombre_comun")
    private String nombre_comun;

    @Column(name = "nombre_cientifico")
    private String nombre_cientifico;

    @Column(name = "talla_mediterraneo")
    private int talla_mediterraneo;

    @Column(name = "talla_canario")
    private int talla_canario;

    @Column(name = "talla_cantabrico_nw_golfocadiz")
    private int talla_cantabrico_nw_golfocadiz;

    @Column(name = "foto_url")
    private String foto_url;

    @Column(name = "descripcion")
    private String descripcion;

    public Long getId_especie() {
        return id_especie;
    }

    public void setId_especie(Long id_especie) {
        this.id_especie = id_especie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto_url() {
        return foto_url;
    }

    public void setFoto_url(String foto_url) {
        this.foto_url = foto_url;
    }

    public int getTalla_cantabrico_nw_golfocadiz() {
        return talla_cantabrico_nw_golfocadiz;
    }

    public void setTalla_cantabrico_nw_golfocadiz(int talla_cantabrico_nw_golfocadiz) {
        this.talla_cantabrico_nw_golfocadiz = talla_cantabrico_nw_golfocadiz;
    }

    public int getTalla_canario() {
        return talla_canario;
    }

    public void setTalla_canario(int talla_canario) {
        this.talla_canario = talla_canario;
    }

    public int getTalla_mediterraneo() {
        return talla_mediterraneo;
    }

    public void setTalla_mediterraneo(int talla_mediterraneo) {
        this.talla_mediterraneo = talla_mediterraneo;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }
}