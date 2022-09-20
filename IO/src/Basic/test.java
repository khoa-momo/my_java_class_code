/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) { 
        char[] array = new char[100]; 
        try { 
          FileReader file = new FileReader("test.txt"); 
          BufferedReader input = new BufferedReader(file); 
          // Reads characters
          input.read(array);
          System.out.println("Data in the file: ");
          System.out.println(array);
 
          input.close();
        } 
        catch(Exception e) {
          e.getStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input for the test file: ");
        String data = scanner.nextLine(); 
        
        try { 
          FileWriter file = new FileWriter("test.txt"); 
          BufferedWriter output = new BufferedWriter(file); 
          // Writes the string to the file
          output.write(data); 
          output.close();
        }

        catch (Exception e) {
          e.getStackTrace();
        }        
        
        
        
    }    
}
