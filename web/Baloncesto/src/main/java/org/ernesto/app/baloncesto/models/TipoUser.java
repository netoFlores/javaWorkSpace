package org.ernesto.app.baloncesto.models;

/**
 *
 * @author neto
 */
public class TipoUser {
    private Integer id;
    private String tipo;
    private String descripcion;

    public TipoUser() {
    }

    public TipoUser(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
