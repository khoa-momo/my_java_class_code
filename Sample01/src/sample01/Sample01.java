/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample01;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author KienLT
 */
public class Sample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][]  x = new int[2][];
        x[0] = new int[2];
        x[1] = new int[3];
        x[0][0] = 8;
        x[0][1] = 2;
        x[1][0] = 5;
        x[1][1] = 7;
        x[1][2] = 8;
        
        for(int i = 0; i < 2; i++) {
            int len = x[i].length;
            for(int j = 0; j < len; j++) {                
                    System.out.print(x[i][j] +  " ");
            }
            System.out.println();
        }
        
        
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập n = ");
//        int n = scanner.nextInt();
//        
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        
        
//        Scanner scanner = new Scanner(System.in);
//        int a, b;
//        System.out.print("Nhap a = ");
//        a = scanner.nextInt();
//        System.out.print("Nhap b = ");
//        b = scanner.nextInt();
//        
//        int sum = a + b;
//        System.out.printf("Sum of %d and %d is %d\n", a, b, sum);
//        System.out.printf("Sum of %5d and %d is %d\n", a, b, sum);
//        System.out.printf("Sum of %d and %d is %d\n", a, b, sum);
//        System.out.printf("Sum of %-5d and %d is %d\n", a, b, sum);        
//        System.out.printf("%7.2f\n", 8.542);
//        
//        Calendar c = Calendar.getInstance();
//        System.out.printf("Hôm nay là ngày %1$te/%1$tm/%1$tY\n", c);
//        
//        System.err.println("hello");
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap ten: ");
//        String name = scanner.nextLine();        
//        System.out.print("Welcome " + name);
        
        
    }
    
}
