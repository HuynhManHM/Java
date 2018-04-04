/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author
 */
public class Bai1_AWT {
    Label lba,lbb,lbkq;
    TextField txta,txtb,txtkq,txtr;
    Button btncong,btntru,btnnhan,btnchia;
    public Bai1_AWT()
    {
        Frame f=new Frame();
        f.setTitle("Bai1 AWT");
        f.setSize(300, 200);
        f.setLayout(new GridLayout(4, 2));
        lba=new Label("A=");
        f.add(lba);
        txta= new TextField(20);
        f.add(txta);
        lbb=new Label("B=");
        f.add(lbb);
        txtb= new TextField(20);
        f.add(txtb);
        txtr=new TextField(0);
        f.add(txtr);
        txtr.setVisible(false);
        btncong=new Button("+");
        btncong.addActionListener(new xulicong());
        btntru=new Button("-");
        btntru.addActionListener(new xulitru());
        btnnhan=new Button("*");
        btnnhan.addActionListener(new xulinhan());
        btnchia=new Button("/");
        btnchia.addActionListener(new xulichia());
        Panel p=new  Panel();
        p.setLayout(new FlowLayout());
        p.add(btncong);p.add(btntru);p.add(btnnhan);p.add(btnchia);
        /*f.add(btncong);
        f.add(btntru);
        f.add(btnnhan);
        f.add(btnchia);*/
        f.add(p);
        lbkq=new Label("Tổng");
        f.add(lbkq);
        txtkq=new TextField(20);
        f.add(txtkq);
        bolangnghe xuly =new bolangnghe();
        f.addWindowListener(xuly);
        f.setVisible(true);
    }
    public static void main(String[] args) {
    Bai1_AWT khung=new Bai1_AWT();}
   static class bolangnghe implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
   class xulicong implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a=Integer.parseInt(txta.getText());
        int b=Integer.parseInt(txta.getText());
        int tong=a+b;
        txtkq.setText(String.valueOf(tong));
        }
    }
   class xulitru implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a=Integer.parseInt(txta.getText());
        int b=Integer.parseInt(txta.getText());
        int hieu=a-b;
        txtkq.setText(String.valueOf(hieu));
        }
    }
   class xulinhan implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a=Integer.parseInt(txta.getText());
        int b=Integer.parseInt(txta.getText());
        int tich=a*b;
        txtkq.setText(String.valueOf(tich));
        }
    }
   class xulichia implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int a=Integer.parseInt(txta.getText());
        int b=Integer.parseInt(txta.getText());
        int thuong=a/b;
        txtkq.setText(String.valueOf(thuong));
        }
    }
}
