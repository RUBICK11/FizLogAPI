package com.api.crud.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "datospesca")
public class DatosPescaModel {

    public enum Marea{Sube,Baja}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcaptura;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuariosModel usuario;

    @ManyToOne
    @JoinColumn(name = "idespecie")
    private EspeciesModel especie;

    @ManyToOne
    @JoinColumn(name = "idubicacion")
    private PuntosPescaModel ubiacion;

    @Column(name = "tamanio")
    private double tamanio;

    @Column(name = "peso")
    private double peso;

    @Column(name = "sehasoltado")
    private Boolean seHaSoltado;

    @Column(name = "mar")
    private String mar;

    @Column(name = "superatallaminima")
    private Boolean superaTallaMinima;

    @Column(name = "presionatmosferica")
    private double presionAtmosferica;

    @Column(name = "temporal")
    private String temporal;

    @Column(name = "coeficiente")
    private double coeficiente;

    @Enumerated(EnumType.STRING)
    @Column(name = "marea")
    private Marea marea;

    @Column(name = "ceboseñuelo")
    private String ceboSeniuelo;

    @Column(name = "fechahora")
    private LocalDateTime fechaHora;

    public Long getIdCaptura() {
        return idcaptura;
    }

    public void setIdCaptura(Long idCaptura) {
        this.idcaptura = idCaptura;
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