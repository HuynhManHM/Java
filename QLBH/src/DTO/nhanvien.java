/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class nhanvien {
    private String manv;
    private String honv;
    private String tennv;
    private String ngaysinh;
    private String mapb;
    private String macv;
    public nhanvien(String manv,String honv,String tennv,String ngaysinh,String mapb,String macv)
    {
        this.manv=manv;
        this.honv=honv;
        this.tennv=tennv;
        this.ngaysinh=ngaysinh;
        this.mapb=mapb;
        this.macv=macv;
    }
    public String getmanv()
    {return manv;}
    public String gethonv()
    {return honv;}
    public String gettennv()
    {return tennv;}
    public String getns()
    {return ngaysinh;}
    public String getmapb()
    {return mapb;}
    public String getmacv()
    {return macv;}
    public void setmanv(String a)
    {this.manv=a;}
    public void sethonv(String a)
    {this.honv=a;}
    public void settennv(String a)
    {this.tennv=a;}
    public void setngaysinh(String a)
    {this.ngaysinh=a;}
    public void setmapb(String a)
    {this.mapb=a;}
    public void setmacv(String a)
    {this.macv=a;}
}
