/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class my_regex {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]\\w+@(\\w+[.]?)+$"; 
        Scanner sc = new Scanner(System.in); 
        int check = 1;  
        
        do{           
            System.out.print("Enter the text: ");
            String text = sc.next();               
            System.out.println(text.matches(regex)); 
            if(text.matches(regex) == false){
                check = 0;
            }
        }while(check != 1);
        
        
//        System.out.println("alias".matches(regex)); // true
//        System.out.println("an abacus".matches(regex)); // false
//        System.out.println("abyss".matches(regex)); // true

    }
}
