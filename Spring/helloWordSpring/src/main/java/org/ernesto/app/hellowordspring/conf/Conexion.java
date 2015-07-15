/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.hellowordspring.conf;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author neto
 */
public class Conexion {
    protected Connection conn; 
    
    
    public Conexion(){
        this.getConnection();
    }
    
    public void getConnection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/usuario?noAccessToProcedureBodies=true", "own_usuario", "welcome1");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void closeConnection(){
        try {
            if(conn != null){
               conn.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
