package com.api.crud.models;

import jakarta.persistence.*;



@Entity
@Table(name = "RecomendacionesEquipo")
public class RecomendacionesEquipoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_recomendacion;

    @ManyToOne
    @JoinColumn(name = "idTipoPesca")
    private TecnicasModel tipoPesca;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuariosModel usuario;

    @Column(name = "tipo_caña")
    private String tipo_cania;

    @Column(name = "tipo_cebo")
    private String tipo_cebo;

    @Column(name = "tipo_carrete")
    private String tipo_carrete;

    @Column(name = "tipo_sedal")
    private String tipo_sedal;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Likes")
    private int likes;

    public Long getId_recomendacion() {
        return id_recomendacion;
    }

    public void setId_recomendacion(Long id_recomendacion) {
        this.id_recomendacion = id_recomendacion;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_sedal() {
        return tipo_sedal;
    }

    public void setTipo_sedal(String tipo_sedal) {
        this.tipo_sedal = tipo_sedal;
    }

    public String getTipo_carrete() {
        return tipo_carrete;
    }

    public void setTipo_carrete(String tipo_carrete) {
        this.tipo_carrete = tipo_carrete;
    }

    public String getTipo_cebo() {
        return tipo_cebo;
    }

    public void setTipo_cebo(String tipo_cebo) {
        this.tipo_cebo = tipo_cebo;
    }

    public String getTipo_cania() {
        return tipo_cania;
    }

    public void setTipo_cania(String tipo_cania) {
        this.tipo_cania = tipo_cania;
    }

    public UsuariosModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }

    public TecnicasModel getTipoPesca() {
        return tipoPesca;
    }

    public void setTipoPesca(TecnicasModel tipoPesca) {
        this.tipoPesca = tipoPesca;
    }
}