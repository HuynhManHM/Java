/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4sw;

/**
 *
 * @author ADMIN
 */
public class Sinhvien {
        private String hoten;
        private String nam;
        private String mssv;
        private String lop;
        public Sinhvien (){}
        public Sinhvien(String mssv,String ten,String nam,String lop)
        {
            this.mssv=mssv;
            this.hoten=ten;
            this.nam=nam;
            this.lop=lop;
        }
        public String getten(){ return hoten;}
        public String getnam() {return nam;}
        public String getgt(){return mssv;}
        public String getlop(){return lop;}
        public void setten(String ten1 ){ this.hoten=ten1;}
        public void setnam(String nam1){this.nam=nam1;}
        public void setgt(String mssv1){this.mssv=mssv1;}
        public void setlop(String lop){this.lop=lop;}
}
