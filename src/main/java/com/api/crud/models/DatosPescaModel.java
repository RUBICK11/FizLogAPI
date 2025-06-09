package com.api.crud.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "DatosPesca")
public class DatosPescaModel {

    public enum Marea{Sube,Baja}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCaptura;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuariosModel usuario;

    @ManyToOne
    @JoinColumn(name = "idespecie")
    private EspeciesModel especie;

    @ManyToOne
    @JoinColumn(name = "idUbicacion")
    private PuntosPescaModel ubiacion;

    @Column(name = "Tamanio")
    private double tamanio;

    @Column(name = "Peso")
    private double peso;

    @Column(name = "SeHaSoltado")
    private Boolean seHaSoltado;

    @Column(name = "Mar")
    private String mar;

    @Column(name = "SuperaTallaMinima")
    private Boolean superaTallaMinima;

    @Column(name = "PresionAtmosferica")
    private double presionAtmosferica;

    @Column(name = "Temporal")
    private String temporal;

    @Column(name = "Coeficiente")
    private double coeficiente;

    @Enumerated(EnumType.STRING)
    @Column(name = "Marea")
    private Marea marea;

    @Column(name = "CeboSeñuelo")
    private String ceboSeniuelo;

    @Column(name = "FechaHora")
    private LocalDateTime fechaHora;

    public Long getIdCaptura() {
        return idCaptura;
    }

    public void setIdCaptura(Long idCaptura) {
        this.idCaptura = idCaptura;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getCeboSeniuelo() {
        return ceboSeniuelo;
    }

    public void setCeboSeniuelo(String ceboSeniuelo) {
        this.ceboSeniuelo = ceboSeniuelo;
    }

    public Marea getMarea() {
        return marea;
    }

    public void setMarea(Marea marea) {
        this.marea = marea;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public double getPresionAtmosferica() {
        return presionAtmosferica;
    }

    public void setPresionAtmosferica(double presionAtmosferica) {
        this.presionAtmosferica = presionAtmosferica;
    }

    public String getTemporal() {
        return temporal;
    }

    public void setTemporal(String temporal) {
        this.temporal = temporal;
    }

    public Boolean getSuperaTallaMinima() {
        return superaTallaMinima;
    }

    public void setSuperaTallaMinima(Boolean superaTallaMinima) {
        this.superaTallaMinima = superaTallaMinima;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public Boolean getSeHaSoltado() {
        return seHaSoltado;
    }

    public void setSeHaSoltado(Boolean seHaSoltado) {
        this.seHaSoltado = seHaSoltado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public PuntosPescaModel getUbiacion() {
        return ubiacion;
    }

    public void setUbiacion(PuntosPescaModel ubiacion) {
        this.ubiacion = ubiacion;
    }

    public EspeciesModel getEspecie() {
        return especie;
    }

    public void setEspecie(EspeciesModel especie) {
        this.especie = especie;
    }

    public UsuariosModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosModel usuario) {
        this.usuario = usuario;
    }
}