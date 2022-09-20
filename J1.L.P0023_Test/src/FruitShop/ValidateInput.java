/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FruitShop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

/**
 *
 * @author DELL
 */
public class ValidateInput {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
    //check int input
    public static int inputInt(String msg, String err, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int num;
                num = Integer.parseInt(in.readLine());
                if (min <= num && num <= max) {
                    return num;
                } else {
                    System.out.println(err);
                }
            } catch (IOException ex) {
                System.out.println(err);
            } catch (NumberFormatException ex) {
                System.out.println(err);
            }
        }
    }    
    
    //Check float input
    public static float inputFloat(String msg, String err, float min, float max) {
        while (true) {
            try {
                System.out.print(msg);
                float num;
                num = Float.parseFloat(in.readLine());
                if (min <= num && num <= max) {
                    return num;
                } else {
                    System.out.println(err);
                }
            } catch (IOException ex) {
                System.out.println(err);
            } catch (NumberFormatException ex) {
                System.out.println(err);
            }
        }
    }
    
    //Check string  
    public static String inputString(String msg, String err, String pattern) {
        while (true) {
            try {
                System.out.print(msg);
                String str = in.readLine();
                if (str.matches(pattern)) {
                    return str;
                }
            } catch (IOException ex) {
                System.out.println("IOException");
            }
            System.out.println(err);
        }
    }
    
    
}
