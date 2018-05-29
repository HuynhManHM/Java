/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class nhanvienDAL {
    public static List<nhanvien> getall()
    {
        List<nhanvien> list=new ArrayList<>();
        try {
            DBconnect a=new DBconnect();
            String sqlString="SELECT * FROM nhanvien";
            Statement stm=a.getconn().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs= stm.executeQuery(sqlString);
   
            if(!rs.first())
                System.out.println("Khong co du lieu");
            else
            {
                do {                    
                        String manv=rs.getString("manv");
                        String honv=rs.getString("honv");
                        String ns=rs.getString("ngaysinh");
                        String mapb=rs.getString("mapb");
                        String tennv=rs.getString("tennv");
                        String macv=rs.getString("macv");
                        nhanvien nv=new nhanvien(manv, honv, tennv, ns, mapb, macv);
                        list.add(nv);   
                        System.out.println(manv+"    "+honv+"     "+tennv+"      "+ns+"    "+mapb+"    "+macv);
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
            String sql="Select * from nhanvien where manv='"+id+"'";
            Statement stm=a.getconn().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=stm.executeQuery(sql);
            if(rs.first())
            {
                String manv=rs.getString("manv");
                String honv=rs.getString("honv");
                String ns=rs.getString("ngaysinh");
                String mapb=rs.getString("mapb");
                String tennv=rs.getString("tennv");
                String macv=rs.getString("macv");
                nhanvien nv=new nhanvien(manv, honv, tennv, ns, mapb, macv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void them(String manv,String honv,String tennv,String ns,String mapb,String macv)
    {
        try {
            DBconnect a=new DBconnect();
            String sql="insert into nhanvien values(?,?,?,?,?,?)";
            PreparedStatement pstm= a.getconn().prepareStatement(sql);
            pstm.setString(1,manv);
            pstm.setString(2, honv );
            pstm.setString(3, tennv);
            pstm.setString(4, ns);
            pstm.setString(5,mapb);
            pstm.setString(6, macv);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void xoa(String a)
    {
        try {
            DBconnect b=new DBconnect();
            String sql="delete from nhanvien where manv=?";
            PreparedStatement pstm=b.getconn().prepareStatement(sql);
            pstm.setString(1, a);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void sua(String manv,String honv,String tennv,String ns,String mapb,String macv)
    {
        try {
            DBconnect a=new DBconnect();
            String sql="update nhanvien set manv=?,honv=?,tennv=?,ngaysinh=?,mapb=?,macv=? where manv=?";
            PreparedStatement pstm=a.getconn().prepareStatement(sql);
            pstm.setString(1,manv);
            pstm.setString(2, honv );
            pstm.setString(3, tennv);
            pstm.setString(4, ns);
            pstm.setString(5,mapb);
            pstm.setString(6, macv);
            pstm.setString(7,manv);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(bangluongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
