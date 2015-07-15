package org.ernesto.app.model;

import java.io.Serializable;

public class Direccion implements Serializable {
    private Integer id;
    private String calle;
    private Integer numeroCasa;
    private String poblacion;
    private String estado;

    public Direccion() {
    }

    public Direccion(String calle, Integer numeroCasa, String poblacion, String estado) {
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.poblacion = poblacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
