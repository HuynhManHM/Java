/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class bangluong {
    private String manv;
    private int thang;
    private int nam;
    private int songaycong;
    private float hesoluong;
    private int phucapcv;
    public bangluong(String a,int thang,int nam,int songaycong,float hsluong,int phucapcv)
    {
        this.manv=a;
        this.thang=thang;
        this.nam=nam;
        this.songaycong=songaycong;
        this.hesoluong=hsluong;
        this.phucapcv=phucapcv;
    }
    public String getmanv()
    {
        return manv;
    }
    public int getthang()
    {return thang;}
    public int getnam()
    {return nam;}
    public int getsongaycong()
    {return songaycong;}
    public float gethsluong()
    {return hesoluong;}
    public int getphucapcv()
    {return phucapcv;}
    public void setmanv(String a)
    {
        this.manv=a;
    }
    public void setthang(int thang)
    {this.thang=thang;}
    public void setnam(int nam)
    {this.nam=nam;}
    public void setsongaycong(int a)
    {this.songaycong=a;}
    public void sethsluong(int a)
    {this.hesoluong=a;}
    public void setphucapcv(int thang)
    {this.phucapcv=thang;}
}
