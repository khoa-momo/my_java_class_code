/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_Buffer;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author DELL
 */
public class BufferR2_skip {
    public static void main(String args[]) { 
        char[] array = new char[100]; 
        try { 
          FileReader file = new FileReader("BufferR2.txt"); 
          BufferedReader input = new BufferedReader(file); 
          // Skips the 5 characters
          input.skip(5); 
          // Reads the characters
          input.read(array); 
          System.out.println("Data after skipping 5 characters:");
          System.out.println(array);

          input.close();
        }

        catch (Exception e) {
          e.getStackTrace();
        }
        
    }    
}
