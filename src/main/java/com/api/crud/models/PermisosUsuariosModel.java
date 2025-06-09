package com.api.crud.models;

import jakarta.persistence.*;



@Entity
@Table(name = "permisosusuarios")
public class PermisosUsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idpermiso;

    @ManyToOne
    @JoinColumn(name = "idusuarioorigen")
    private UsuariosModel idusuarioorigen;

    @ManyToOne
    @JoinColumn(name = "idusuariodestino")
    private EspeciesModel idusuariodestino;

    @Column(name = "puedever")
    private Boolean puedeVer;

    public Long getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(Long idpermiso) {
        this.idpermiso = idpermiso;
    }

    public Boolean getPuedeVer() {
        return puedeVer;
    }

    public void setPuedeVer(Boolean puedeVer) {
        this.puedeVer = puedeVer;
    }

    public EspeciesModel getIdusuariodestino() {
        return idusuariodestino;
    }

    public void setIdusuariodestino(EspeciesModel idusuariodestino) {
        this.idusuariodestino = idusuariodestino;
    }

    public UsuariosModel getIdusuarioorigen() {
        return idusuarioorigen;
    }

    public void setIdusuarioorigen(UsuariosModel idusuarioorigen) {
        this.idusuarioorigen = idusuarioorigen;
    }
}