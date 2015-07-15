/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ernesto.app.postgresqlejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author neto
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comedorApp", "own_comedor", "comedor");
        PreparedStatement ps = conn.prepareStatement("select * from categorias");
        ResultSet rs = ps.executeQuery();
        System.out.println("ID\tnombre");
        while(rs.next()){
            System.out.println(rs.getInt("id") + "\t" + rs.getString("nombre"));            
        }
        
    }
}
