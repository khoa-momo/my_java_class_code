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
public class BufferR {
    public static void main(String[] args) { 
        char[] array = new char[100]; 
        try { 
          FileReader file = new FileReader("BufferR.txt"); 
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