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
public class phongban {
    private String mapb;
    private String tenpb;
    public phongban(String mapb,String tenpb)
    {
        this.mapb=mapb;
        this.tenpb=tenpb;
    }
    public String getmapb()
    {return mapb;}
    public String gettenpb()
    {return tenpb;}
    public void setmapb(String a)
    {this.mapb=a;}
    public void settenpb(String a)
    {this.tenpb=a;}
}
