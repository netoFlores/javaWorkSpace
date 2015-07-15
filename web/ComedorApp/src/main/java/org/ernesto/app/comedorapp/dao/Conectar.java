/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.comedorapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author neto
 */
public class Conectar {
    private Connection connect;

    public Conectar() {
    }

    public Conectar(Connection connect) {
        this.connect = connect;
    }

    public Connection getConnect() {
        return connect;
    }
    
    public void conx(){
        
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comedorApp", "own_comedor", "comedor");
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    
    
}
