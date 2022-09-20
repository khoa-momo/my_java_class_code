/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ValidateInput {
    public static Scanner sc = new Scanner(System.in); 
 
    //check int input
    public static int inputInt(String msg, String err, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int num;
                num = Integer.parseInt(sc.nextLine());
                if (min <= num && num <= max) {
                    return num;
                } else {
                    System.out.println(err);
                }
            } catch (NumberFormatException ex) {
                System.out.println(err);
            }
        }
    }
    
    //Check float input
    public static double inputDouble(String msg, String err, double min, double max) {
        while (true) {
            try {
                System.out.print(msg);
                double num;
                num = Double.parseDouble(sc.nextLine());
                if (min <= num && num <= max) {
                    return num;
                } else {
                    System.out.println(err);
                }
            } catch (NumberFormatException ex) {
                System.out.println(err);
            }
        }
    }
    
    //Check string  
    public static String inputString(String msg, String err, String pattern) {
        while (true) {
            System.out.print(msg);
            String string = sc.nextLine();
            if (string.matches(pattern)) {
                return string;
            }else{
                System.out.println(err);
            }
        }
    }    
    
    //Get non-blank string
    public static String inputNonBlankStr(String msg, String err){
        while (true) {
            System.out.print(msg);
            String str = sc.nextLine();
            if (str.length()!=0) {
                return str;
            }else{
                System.out.println(err);
            }
        }
    }
}
