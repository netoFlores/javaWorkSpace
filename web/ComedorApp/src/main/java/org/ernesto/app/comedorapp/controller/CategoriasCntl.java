/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.comedorapp.controller;

import java.util.List;
import org.ernesto.app.comedorapp.dao.CategoriasDAO;
import org.ernesto.app.comedorapp.modelo.Categorias;

/**
 *
 * @author neto
 */
public class CategoriasCntl {

    
    
    public CategoriasCntl() {
    }
    
    public List<Categorias> listar(){
        CategoriasDAO dao;
        try {
            dao = new CategoriasDAO();
            return dao.verCategorias();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    } 
            
            
    
}

