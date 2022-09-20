package ChangeBase;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ValidateInput {
    public static Scanner sc = new Scanner(System.in); 
    
    //check int input
    public static int inputInt(String msg, String err, int min, int max) {
        while(true){
            try {
                System.out.print(msg);
                int num = Integer.parseInt(sc.nextLine());
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
    
    //Get base type
    public static int inputBase(String msg, String err, int min, int max) {
        while(true){
            try {
                System.out.print(msg); //Print message
                int baseNum;
                baseNum = Integer.parseInt(sc.nextLine());
                if(baseNum==2||baseNum==10||baseNum==16) {
                    return baseNum;
                }else{
                    System.out.println(err);
                }
            } catch (NumberFormatException ex) {
                System.out.println(err);
            }
        }
    }    
    
    public static String inputValue(String msg, String err, int baseNum) {
        while(true){
            try {
                System.out.print(msg);
                String inputValue = sc.nextLine();
                switch(baseNum){
                    case 2:
                        if(inputValue.matches("[0-1]+")){
                            return inputValue;
                        }
                        break;
                    case 10:
                        if(inputValue.matches("[0-9]+")){
                            return inputValue;
                        }
                        break;
                    case 16:
                        if(inputValue.matches("[0-9a-fA-F]+")){
                            return inputValue;
                        }
                        break;                        
                }
            } catch (NumberFormatException ex) {
                System.out.println(err);
            }
        }
    }    
    
}
