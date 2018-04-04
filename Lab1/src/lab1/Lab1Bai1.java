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
public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoten=scanner.nextLine();
        System.out.println("Điểm TB: ");
        double diemtb=scanner.nextDouble();
        System.out.printf("<<%s>><<%f điểm>>",hoten,diemtb);
    }
}
