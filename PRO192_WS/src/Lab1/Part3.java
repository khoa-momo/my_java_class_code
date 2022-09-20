/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Part3 {
    public static void main(String[] args) {   
        String[] list = new String[10];
        for(int i=0; i<10; i++){
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();
        }
        for(int i=0; i<10; i++){ 
            System.out.println(list[i].toUpperCase()); 	
        }
    } 
       
}
