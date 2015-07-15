/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.baloncesto.dao.impl;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ernesto.app.baloncesto.dao.FacadeDao;
import org.ernesto.app.baloncesto.models.TipoUser;
import org.ernesto.app.baloncesto.models.Usuario;
import org.ernesto.app.baloncesto.utilidad.Connect;
import org.ernesto.app.baloncesto.utilidad.Utils;

/**
 *
 * @author neto
 */
public class UsuarioDao extends Connect implements FacadeDao, Serializable {

    @Override
    public void add(Object obt) {
        try {
            PreparedStatement pst = connect().prepareCall("INSERT INTO usuario values(null, :nombre,:ape,:email,:clave,:tipoU");
            Usuario use = (Usuario) obt;
            pst.setString(1, use.getNombre());
            pst.setString(2, use.getApellido());
            pst.setString(3, use.getEmail());
            pst.setString(4, Utils.md5(use.getClave()));
            pst.setInt(5, use.getTipoUser().getId());
            pst.executeQuery();

        } catch (ClassNotFoundException | SQLException | NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object obt) {
        try {
            String query = "UPDATE usuario set nombre = ?, apellido = ?, email = ?, tipoUser = ? WHERE id = ?";
            PreparedStatement pst = connect().prepareCall(query);
            Usuario use = (Usuario) obt;
            pst.setString(1, use.getNombre());
            pst.setString(2, use.getApellido());
            pst.setString(3, use.getEmail());
            pst.setInt(4, use.getTipoUser().getId());
            pst.setInt(5, use.getId());
            pst.executeQuery();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object obt) {
        try {
            String query = "DELETE FROM usuario WHERE id = ?";
            PreparedStatement pst = connect().prepareCall(query);
            Usuario use = (Usuario) obt;
            pst.setInt(1, use.getId());
            pst.executeQuery();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object findById(Object obt) {
        Usuario usuario = null;
        try {
            String query = "SELECT * FROM usuario WHERE id = ?";
            PreparedStatement pst = connect().prepareCall(query);
            Usuario use = (Usuario) obt;
            pst.setInt(1, use.getId());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setClave(rs.getString("clave"));
                TipoUser tipo = new TipoUser();
                tipo.setId(rs.getInt("tipoUser"));
                tipo = (TipoUser) new TipoUserDao().findById(tipo);
                usuario.setTipoUser(tipo);
                
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuario;
    }

    @Override
    public Object view() {
        List<Usuario> view = new ArrayList<>();
        try {
            String query = "SELECT * FROM usuario ";
            PreparedStatement pst = connect().prepareCall(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setClave(rs.getString("clave"));
                TipoUser tipo = new TipoUser();
                tipo.setId(rs.getInt("tipoUser"));
                tipo = (TipoUser) new TipoUserDao().findById(tipo);
                usuario.setTipoUser(tipo);
                view.add(usuario);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return view;
    }

    public Usuario login(Usuario use) {
        Usuario usuario = null;
        try {
            String query = "SELECT * FROM usuario WHERE email = ? AND clave = ?";
            PreparedStatement pst = connect().prepareCall(query);
            pst.setString(1, use.getEmail());
            pst.setString(2,Utils.md5(use.getClave()));
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setClave(rs.getString("clave"));
                TipoUser tipo = new TipoUser();
                tipo.setId(rs.getInt("tipoUser"));
                tipo = (TipoUser) new TipoUserDao().findById(tipo);
                usuario.setTipoUser(tipo);
                
            }

        } catch (ClassNotFoundException | SQLException | NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    

}
