package com.api.crud.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "PuntosPesca")
public class PuntosPescaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUbicacion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuariosModel usuario;

    @ManyToOne
    @JoinColumn(name = "idZona")
    private ZonasModel zona;

    @ManyToOne
    @JoinColumn(name = "idComuniadad")
    private ComunidadesAutonomasModel comunidadAutonoma;

    @Column(name = "Latitud")
    private double latitud;

    @Column(name = "Longitud")
    private double longitud;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "FechaGuardado")
    private LocalDateTime fechaGuardado;

    @Column(name = "NombrePoblacion")
    private String nombrePoblacion;

    public Long getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Long idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombrePoblacion() {
        return nombrePoblacion;
    }

    public void setNombrePoblacion(String nombrePoblacion) {
        this.nombrePoblacion = nombrePoblacion;
    }

    public LocalDateTime getFechaGuardado() {
        return fechaGuardado;
    }

    public void setFechaGuardado(LocalDateTime fechaGuardado) {
        this.fechaGuardado = fechaGuardado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public ComunidadesAutonomasModel getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    public void setComunidadAutonoma(ComunidadesAutonomasModel comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
    }

    public ZonasModel getZona() {
        return zona;
    }

    public void setZona(ZonasModel zona) {
        this.zona = zona;
    }

    public UsuariosModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }
}