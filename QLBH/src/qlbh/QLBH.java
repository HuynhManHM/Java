/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh;

import DAL.DBconnect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAL.*;

/**
 *
 * @author ADMIN
 */
public class QLBH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        DBconnect a=new DBconnect();
        if(a.getconn()!=null)
            System.out.println("connect");
        else System.out.println("no connect");
        //Statement stmStatement=a.getconn().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        //bangluongDAL.them("NV009", 8, 4, 30, 1, 60000);
        //bangluongDAL.xoa("NV009");
        bangluongDAL.getall();
        //System.out.println("Lọc sinh viên\n");
        //bangluongDAL.getid("NV004");
    }
   
}
