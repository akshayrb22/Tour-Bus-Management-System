
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raul naik
 */

public class connection_db {

    
    static Connection conn;
    
    static Connection connection() throws ClassNotFoundException, SQLException
    {
            Class.forName("java.sql.Driver");
            String path="jdbc:mysql://localhost/minipro";
            String user="root";
            String password="Hogwartz@934";
            conn=DriverManager.getConnection(path,user,password);
            return conn;
            //System.out.println("connected");
    }

    
    
}
