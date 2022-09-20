/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Ips_Reader {
    public static void main(String[] args) {
        char[] array = new char[100];
        try { 
          FileInputStream file = new FileInputStream("IpsReader.txt"); 
          InputStreamReader input = new InputStreamReader(file); 
          // Reads characters from the file
          input.read(array);
          System.out.println("Data in the stream:");
          System.out.println(array);

          // Closes the reader
          input.close();
        }

        catch(Exception e) {
          e.getStackTrace();
        }
        
    }    
}
