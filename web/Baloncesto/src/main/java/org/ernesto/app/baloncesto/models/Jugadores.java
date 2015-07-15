package org.ernesto.app.baloncesto.models;

import java.util.Date;

/**
 *
 * @author neto
 */
public class Jugadores {
    private Integer id;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private Equipos equipo;

    public Jugadores() {
    }

    public Jugadores(String nombre, String apellido, Date fechaNac, Equipos equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.equipo = equipo;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }
    
    
}
