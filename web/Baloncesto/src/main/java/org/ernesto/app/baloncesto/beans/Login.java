package org.ernesto.app.baloncesto.beans;

import java.io.IOException;
import javax.faces.context.FacesContext;
import javax.faces.event.FacesEvent;
import org.ernesto.app.baloncesto.dao.impl.UsuarioDao;
import org.ernesto.app.baloncesto.models.Usuario;
import org.ernesto.app.baloncesto.utilidad.Utils;
import org.primefaces.mobile.component.content.Content;

public class Login {

    private String usuario;
    private String clave;

    public Login() {
        usuario = "";
        clave = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String iniciar() //throws IOException 
    {
        if (!usuario.equals("") && !clave.equals("")) {
            
            Usuario use = new Usuario();
            use.setEmail(usuario);
            use.setClave(clave);

            UsuarioDao dao = new UsuarioDao();
            Usuario useL = dao.login(use);
            if (useL != null) {
                Utils.faceMessage("Exito", "Exito");
                Utils.session("nombre", useL.getNombre() +" " +useL.getApellido() );
                //FacesContext.getCurrentInstance().getExternalContext().redirect("exito.jsf");
                return "exito.jsf";
            }

        }

        Utils.faceMessage("Usuario o contraseña no valida", "Usuario o contraseña no valida");
        //FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        return "index.jsf";
    }

    public String cerrar()// throws IOException
    {
        Utils.closeSession("nombre");

        //FacesContext.getCurrentInstance().getExternalContext().redirect("index.jsf");
        return "index.jsf";
    }
}
