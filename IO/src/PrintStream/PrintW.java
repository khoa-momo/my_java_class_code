/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PrintW {
    public static void main(String[] args) { 
//    String data = "PrintW.";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input for the FileWriter file: ");
        String data = scanner.nextLine(); 
        try {
           PrintWriter output = new PrintWriter("PrintW.txt"); 
           output.print(data);
           output.close();
        }
        catch(Exception e) {
           e.getStackTrace();
        }
        
    }    
}
