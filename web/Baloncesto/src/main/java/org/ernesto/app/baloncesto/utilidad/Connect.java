package org.ernesto.app.baloncesto.utilidad;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author neto
 */
public class Connect {
    
    public Connection connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "desa");
        return conn;
    }
    
}
