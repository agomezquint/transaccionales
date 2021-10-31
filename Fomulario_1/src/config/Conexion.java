package config;

import java.sql.*;
import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Conexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "master");
        } catch (Exception e) {
            
            System.out.println("error de conexion bd"+e);
        }
    }

    public Connection getConnection() {
        return con;
    }

}
