/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.hellowordspring.spring;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import org.ernesto.app.hellowordspring.models.Usuario;


/**
 *
 * @author neto
 */
public class DAOUsuario extends org.ernesto.app.hellowordspring.conf.Conexion{
    private Usuario usuario;

    public DAOUsuario() {
        this.getConnection();
    }
    
    public void add(Usuario usuario){
        String query = "INSERT INTO usuario VALUES (null, ?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getApellido());
            pst.setString(3, usuario.getEmail());
            pst.setString(4, usuario.getClave());
            //System.out.println(pst.);
            if(!pst.execute())
                System.out.println("usuario agregado");
            else
                System.out.println("Usuario no agregado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
    public void llamarProcedimiento(Usuario usuario){
        try {
            CallableStatement cas = conn.prepareCall("{call addUsuario(?,?,?,?)}");
            cas.setString(1, usuario.getNombre());
            cas.setString(2, usuario.getApellido());
            cas.setString(3, usuario.getEmail());
            cas.setString(4, usuario.getClave());
            cas.execute();
            System.out.println("Registro ingresado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
