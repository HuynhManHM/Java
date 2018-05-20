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
public class chucvu {
    String macv;
    String tencv;
    public chucvu(String a,String b)
    {
        this.macv=a;
        this.tencv=b;
    }
    public String getmacv()
    {
        return macv;
    }
    public String gettencv()
    {
        return tencv;
    }
    public void setmacv(String a)
    {this.macv=a;}
     public void settencv(String a)
    {this.tencv=a;}
}
