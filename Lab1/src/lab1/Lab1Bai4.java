/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Lab1Bai4 {
    public static void main(String[] args) {
        int a,b,c;
        float delta;
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhạp a: ");
        a=nhap.nextInt();
        System.out.print("Nhạp b: ");
        b=nhap.nextInt();
        System.out.print("Nhạp c: ");
        c=nhap.nextInt();
        delta=b*b-4*a*c;
        System.out.println("Căn delta: "+Math.sqrt(delta));
    }
}
