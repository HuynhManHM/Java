/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;
import java.sql.*;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class bangluongDAL {
    public static List<bangluong> getall()
    {
        List<bangluong> list=new ArrayList<>();
        try {
            DBconnect a=new DBconnect();
            String sqlString="SELECT * FROM bangluong";
            Statement stm=a.getconn().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs= stm.executeQuery(sqlString);
   
            if(!rs.first())
                System.out.println("Khong co du lieu");
            else
            {
                do {                    
                        String manv=rs.getString("manv");
                        int thang=rs.getInt("thang");
                        int nam=rs.getInt("nam");
                        int songaycong=rs.getInt("songaycong");
                        float hsluong=rs.getFloat("hesoluong");
                        int phucap=rs.getInt("phucapcv");
                        bangluong bl=new bangluong(manv,thang,nam,songaycong,hsluong,phucap);
                        list.add(bl);
                        
                        System.out.println(manv+"    "+thang+"     "+nam+"      "+songaycong+"    "+hsluong+"    "+phucap);
                } while (rs.next());
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static void getid(String id)
    {
        try {
            DBconnect a=new DBconnect();
            String sql="Select * from bangluong where manv='"+id+"'";
            Statement stm=a.getconn().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=stm.executeQuery(sql);
            if(rs.first())
            {
                String manv=rs.getString("manv");
                int thang=rs.getInt("thang");
                int nam=rs.getInt("nam");
                int songaycong=rs.getInt("songaycong");
                float hsluong=rs.getFloat("hesoluong");
                int phucap=rs.getInt("phucapcv");
                bangluong bl=new bangluong(manv,thang,nam,songaycong,hsluong,phucap);
                System.out.println(manv+"    "+thang+"     "+nam+"      "+songaycong+"    "+hsluong+"    "+phucap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void them(String manv,int thang,int nam,int songaycong,float hesoluong,int phucapcv)
    {
        try {
            DBconnect a=new DBconnect();
            String sql="insert into bangluong values(?,?,?,?,?,?)";
            PreparedStatement pstm= a.getconn().prepareStatement(sql);
            pstm.setString(1,manv);
            pstm.setString(2, String.valueOf(thang));
            pstm.setString(3, String.valueOf(nam));
            pstm.setString(4, String.valueOf(songaycong));
            pstm.setString(5,String.valueOf(hesoluong));
            pstm.setString(6, String.valueOf(phucapcv));
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void xoa(String a)
    {
        try {
            DBconnect b=new DBconnect();
            String sql="delete from bangluong where manv=?";
            PreparedStatement pstm=b.getconn().prepareStatement(sql);
            pstm.setString(1, a);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void sua(String manv,int thang,int nam,int songaycong,float hesoluong,int phucapcv)
    {
        try {
            DBconnect a=new DBconnect();
            String sql="update bangluong set manv=?,thang=?,nam=?,songaycong=?,hesoluong=?,phucapcv=? where manv=?";
            PreparedStatement pstm=a.getconn().prepareStatement(sql);
            pstm.setString(1,manv);
            pstm.setString(2, String.valueOf(thang));
            pstm.setString(3, String.valueOf(nam));
            pstm.setString(4, String.valueOf(songaycong));
            pstm.setString(5,String.valueOf(hesoluong));
            pstm.setString(6, String.valueOf(phucapcv));
            pstm.setString(7,manv);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
