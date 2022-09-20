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
public class PrintS {
    public static void main(String[] args) {

        String data = "This file is for PrintS.";

        try {
            PrintStream output = new PrintStream("output_PrintS.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }    
}
