/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Part2a { 
    public static void main(String[] args){ 
        boolean cont = true;
        do{
            try{
//              String s = "";
                Scanner sc = new Scanner(System.in);
                String pattern = "[S][E][0-9][0-9][0-9]"; 
                System.out.print("Enter string:");
                String s = sc.nextLine();
                
                if(!s.matches(pattern))
                    throw new Exception();
                System.out.println("The String is " + s);
                cont = false;
                
            }catch(Exception e){
                System.out.println("The string is invalid");
                cont = true;
            }
        }while(cont);
    }
}
