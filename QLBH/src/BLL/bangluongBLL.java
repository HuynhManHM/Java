/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.bangluongDAL;
/**
 *
 * @author ADMIN
 */
public class bangluongBLL {
    public static void them(String manv,int thang,int nam,int songaycong,float hesoluong,int phucapcv)
    {
        bangluongDAL.them(manv, thang, nam, songaycong, hesoluong, phucapcv);
    }
    public static void xoa(String a)
    {
        bangluongDAL.xoa(a);
    }
    public static void sua(String manv,int thang,int nam,int songaycong,float hesoluong,int phucapcv)
    {
        bangluongDAL.sua(manv, thang, nam, songaycong, hesoluong, phucapcv);
    }
}
