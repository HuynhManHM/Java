/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DBconnect {
    private Connection conn;
    public DBconnect()
    {
        try {
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=quanlynhanvien","sa","123456");
            Statement stm=conn.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public Connection getconn()
    {return conn;}
    }
