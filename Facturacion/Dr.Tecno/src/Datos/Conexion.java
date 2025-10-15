/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    private static Connection conexion = null; 
    private static final String usr = "root";
    private static final String pswd = "leonidas2327";
    private static final String url = "jdbc:mysql://localhost:3306/drtecno";
    public Conexion() {
    }
    public Connection ObtenerConexion() throws SQLException{
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
        conexion = DriverManager.getConnection(url, usr, pswd); 
        System.out.println("conexion exitosa");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
        return conexion;
    }
}
