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
public class Lab1Bai2 {
    public static void main(String[] args) {
        float a,b,dt,cv;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        a=scanner.nextFloat();
        System.out.print("Nhập chiều dài: ");
        b=scanner.nextFloat();
        cv=2*(a+b);
        dt=a*b;
        System.out.println("Chu vi là "+cv);
        System.out.println("Diện tích là "+dt);
        System.out.println("Cạnh nhỏ nhất là "+Math.min(a,b));
    }
}
