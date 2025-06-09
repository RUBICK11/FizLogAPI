package com.api.crud.models;

import jakarta.persistence.*;



@Entity
@Table(name = "PermisosUsuarios")
public class PermisosUsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_permiso;

    @ManyToOne
    @JoinColumn(name = "id_usaurio_origen")
    private UsuariosModel id_usuario_origen;

    @ManyToOne
    @JoinColumn(name = "id_usuario_destino")
    private EspeciesModel id_usuario_destino;

    @Column(name = "PuedeVer")
    private Boolean puedeVer;

    public Long getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(Long id_permiso) {
        this.id_permiso = id_permiso;
    }

    public Boolean getPuedeVer() {
        return puedeVer;
    }

    public void setPuedeVer(Boolean puedeVer) {
        this.puedeVer = puedeVer;
    }

    public EspeciesModel getId_usuario_destino() {
        return id_usuario_destino;
    }

    public void setId_usuario_destino(EspeciesModel id_usuario_destino) {
        this.id_usuario_destino = id_usuario_destino;
    }

    public UsuariosModel getId_usuario_origen() {
        return id_usuario_origen;
    }

    public void setId_usuario_origen(UsuariosModel id_usuario_origen) {
        this.id_usuario_origen = id_usuario_origen;
    }
}