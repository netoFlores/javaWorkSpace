/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.comedorapp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.ernesto.app.comedorapp.modelo.Categorias;
/**
 *
 * @author neto
 */
public class CategoriasDAO extends Conectar {
    
    public void addCategoria(Categorias categorias){
        try {
            this.conx();
            PreparedStatement pstm = this.getConnect().prepareStatement("INSERT INTO categorias(nombre) values (?)");
            pstm.setString(1, categorias.getNombre());
            pstm.executeUpdate();
            
                    
        } catch (Exception e) {
        }
    }
    
    public List<Categorias> verCategorias(){
        List<Categorias> lista = new ArrayList<>();
        try {
            this.conx();
            PreparedStatement pstm = this.getConnect().prepareStatement("SELECT * FROM CATEGORIAS");
            ResultSet rs = pstm.executeQuery();
            
            
            while(rs.next()){
                Categorias c = new Categorias();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                lista.add(c);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
}
