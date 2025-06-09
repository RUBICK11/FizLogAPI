package com.api.crud.models;

import jakarta.persistence.*;



@Entity
@Table(name = "recomendacionesequipo")
public class RecomendacionesEquipoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idrecomendacion;

    @ManyToOne
    @JoinColumn(name = "idtecnicapesca")
    private TecnicasModel tipoPesca;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuariosModel usuario;

    @Column(name = "tipocaña")
    private String tipocania;

    @Column(name = "tipocebo")
    private String tipocebo;

    @Column(name = "tipocarrete")
    private String tipocarrete;

    @Column(name = "tiposedal")
    private String tiposedal;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "likes")
    private int likes;

    public Long getIdrecomendacion() {
        return idrecomendacion;
    }

    public void setIdrecomendacion(Long idrecomendacion) {
        this.idrecomendacion = idrecomendacion;
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

    public String getTiposedal() {
        return tiposedal;
    }

    public void setTiposedal(String tiposedal) {
        this.tiposedal = tiposedal;
    }

    public String getTipocarrete() {
        return tipocarrete;
    }

    public void setTipocarrete(String tipocarrete) {
        this.tipocarrete = tipocarrete;
    }

    public String getTipocebo() {
        return tipocebo;
    }

    public void setTipocebo(String tipocebo) {
        this.tipocebo = tipocebo;
    }

    public String getTipocania() {
        return tipocania;
    }

    public void setTipocania(String tipocania) {
        this.tipocania = tipocania;
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