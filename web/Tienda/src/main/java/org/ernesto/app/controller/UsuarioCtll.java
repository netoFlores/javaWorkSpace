package org.ernesto.app.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import org.ernesto.app.controller.Utils.Utils;
import org.ernesto.app.model.Usuario;
import org.ernesto.app.model.dao.UsuarioDao;

public class UsuarioCtll {

    private Usuario usuario;
    private UsuarioDao usuariodao = new UsuarioDao();
    private String clave2 = "";

    public UsuarioCtll() {
    }

    @PostConstruct
    private void init() {
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getClave2() {
        return clave2;
    }

    public void setClave2(String clave2) {
        this.clave2 = clave2;
    }

    public List<Usuario> listar() {
        return usuariodao.listar();
    }

    public void agregar() {
        if (usuario != null) {
            try {
                if (usuario.getClave().equals(clave2)) {
                    usuariodao.save(usuario);
                    Utils.addMessage("Ingreso", "Se ingreso exitosamente");
                }else{
                    Utils.addMessage("Clave", "La contraseña no es iguales.");
                }
            } catch (Exception e) {
                Utils.addMessage("Ingreso", "No se pudo ingresar el usuario");
            }

        }
    }

}
