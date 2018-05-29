/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.bangluongDAL;
import DAL.nhanvienDAL;

/**
 *
 * @author ADMIN
 */
public class nhanvineBLL {
    public static void them(String manv,String honv,String tennv,String ns,String mapb,String macv)
    {
        nhanvienDAL.them(manv,honv,tennv,ns,mapb,macv);
    }
    public static void xoa(String a)
    {
        nhanvienDAL.xoa(a);
    }
    public static void sua(String manv,String honv,String tennv,String ns,String mapb,String macv)
    {
        nhanvienDAL.sua(manv,honv,tennv,ns,mapb,macv);
    }
}
