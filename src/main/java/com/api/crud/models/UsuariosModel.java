package com.api.crud.models;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")
public class UsuariosModel {

    public enum Rol{usuario,administrador}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idusuario;

    @Column(name ="nombreusuario")
    private String nombreusuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "contrasenia")
    private String contrasenia;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Rol rol;

    public Long getIdUsuario() {
        return idusuario;
    }

    public void setIdUsuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreusuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreusuario = nombreUsuario;
    }
}
