package org.ernesto.app.model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private Integer id;
    private String nombre;
    private String apellido;
    private String nit;
    private String dui;
    private String telefono;
    private Direccion direccion;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String nit, String dui, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.dui = dui;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
