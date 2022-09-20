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
public class Part2b {
    boolean cont = false;
    public String inputString() throws Exception{
        String pattern="[S][E][0-9][0-9][0-9]";
        String s = "SExxx";
        
        Scanner sc= new Scanner(System.in);
        System.out.print("input the string:");
        s = sc.nextLine();
        if(!s.matches(pattern))
            throw new Exception();
        return s;
    }
    public static void main(String[] args) {
        Part2b obj = new Part2b();
        boolean cont = false;
        do{
            try{
                String s = obj.inputString();
                System.out.println("the string is :" + s);
                cont = false;
            }catch(Exception e){
                   System.out.println("The string is invalid");
                   cont = true;
            }
        }while(cont);
    }

}



