/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

/**
 *
 * @author fauzan
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection mysqlkoneksi;
    
    public static Connection databaseDB() throws SQLException{
        try{
        String url = "jdbc:mysql://localhost:3306/uaspbo_0013";
        String user = "root";
        String pass = "";
           
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysqlkoneksi = DriverManager.getConnection(url, user, pass);
        
     }catch(SQLException e){
        System.out.println("Koneksi ke Database Gagal " + e.getMessage());
     }
    return mysqlkoneksi;
    }
}
    
