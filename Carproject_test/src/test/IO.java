/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author DELL
 */
public class IO { 
    public static void main(String[] args) { 
        char[] array = new char[1000]; 
        try { 
          FileReader file = new FileReader("File brands2.txt"); 
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
        
    }
}
