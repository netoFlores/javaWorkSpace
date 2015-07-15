/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.comedorapp.modelo;

import java.util.Objects;

/**
 *
 * @author neto
 */
public class DetalleVentas implements java.io.Serializable{
    private Integer id;
    private Integer cantidad;
    private Platillos idPlatillo;
    private Ventas idVentas;

    public DetalleVentas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Platillos getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Platillos idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public Ventas getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Ventas idVentas) {
        this.idVentas = idVentas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleVentas other = (DetalleVentas) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleVentas{" + "id=" + id + ", cantidad=" + cantidad + ", idPlatillo=" + idPlatillo + ", idVentas=" + idVentas + '}';
    }
    
    
}
