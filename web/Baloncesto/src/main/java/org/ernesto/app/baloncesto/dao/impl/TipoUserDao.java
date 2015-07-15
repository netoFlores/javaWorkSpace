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
public class TipoUserDao extends Connect implements FacadeDao, Serializable {

    @Override
    public void add(Object obt) {
        try {
            PreparedStatement pst = connect().prepareCall("INSERT INTO tipoUser values(null, ?,?)");
            TipoUser tuser = (TipoUser) obt;
            pst.setString(1, tuser.getTipo());
            pst.setString(2, tuser.getDescripcion());
            pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TipoUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object obt) {
        try {
            String query = "UPDATE tipUser set tipo = ?, descripcion = ? WHERE id = ?";
            PreparedStatement pst = connect().prepareCall(query);
            TipoUser tuse = (TipoUser) obt;
            pst.setString(1, tuse.getTipo());
            pst.setString(2, tuse.getDescripcion());
            pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TipoUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object obt) {
        try {
            String query = "DELETE FROM tipoUser WHERE id = ?";
            PreparedStatement pst = connect().prepareCall(query);
            TipoUser use = (TipoUser) obt;
            pst.setInt(1, use.getId());
            pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TipoUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object findById(Object obt) {
        TipoUser tuser = null;
        try {
            String query = "SELECT * FROM tipoUser WHERE id = ?";
            PreparedStatement pst = connect().prepareCall(query);
            TipoUser use = (TipoUser) obt;
            pst.setInt(1, use.getId());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                tuser = new TipoUser();
                tuser.setId(rs.getInt("id"));
                tuser.setTipo(rs.getString("tipo"));
                tuser.setDescripcion(rs.getString("descripcion"));
                
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TipoUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tuser;
    }

    @Override
    public Object view() {
        List<TipoUser> view = new ArrayList<>();
        try {
            String query = "SELECT * FROM tipoUser ";
            PreparedStatement pst = connect().prepareCall(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                TipoUser tuser = new TipoUser();
                tuser.setId(rs.getInt("id"));
                tuser.setTipo(rs.getString("tipo"));
                tuser.setDescripcion(rs.getString("descripcion"));
                view.add(tuser);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TipoUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return view;
    }

    

}
