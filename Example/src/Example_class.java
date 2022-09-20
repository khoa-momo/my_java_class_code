/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Example_class {
      public static void main(String[] args) {
         
        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("height = ");
            height = sc.nextInt();
        }while(height <= 0);
         
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
            System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
            System.out.print("* ");
            }
            System.out.println("");
        }
         
    }
}
