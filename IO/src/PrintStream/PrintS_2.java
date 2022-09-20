/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintStream;

import java.io.PrintStream;

/**
 *
 * @author DELL
 */
public class PrintS_2 {
    public static void main(String[] args) {

        try {
            PrintStream output = new PrintStream("output_PrintS_2.txt");

            int age = 25;

            output.printf("I am %d years old.", age);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }    
}
