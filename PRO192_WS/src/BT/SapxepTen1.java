/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SapxepTen1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);       
        Scanner scan2 = new Scanner(System.in); 
        
        int n; 
        System.out.print("Nhap vao so luong ten can xep: ");
        n = scan.nextInt();
        String str[] = new String[n];

        System.out.println("Nhap ten:");
        for(int i = 0; i < n; i++){
            str[i] = scan2.nextLine();
        }
        
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++) {
                if (str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Cac ten sau khi sap xep:");
        for (int i=0; i<n ; i++){
            System.out.println(str[i]);
        }
    }    
}
