/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Hcn_rong {
    public static void main(String[] args) {
    int n;
    int m;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("n = ");
        n = sc.nextInt();
    }while(n <= 0);
    do{
        System.out.print("m = ");
        m = sc.nextInt();
    }while(m <= 0);
    
        for(int i = 1; i <= n; i++)    {
        for(int j = 1 ; j <= m; j++){
            if(i == 1 || j == 1 || i == n || j == m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        }
    }    
}
