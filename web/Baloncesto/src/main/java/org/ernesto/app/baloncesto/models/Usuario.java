package org.ernesto.app.baloncesto.models;

/**
 *
 * @author neto
 */
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String clave;
    private TipoUser tipoUser;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String email, String clave, TipoUser tipoUser) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
        this.tipoUser = tipoUser;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public TipoUser getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(TipoUser tipoUser) {
        this.tipoUser = tipoUser;
    }
    
}
