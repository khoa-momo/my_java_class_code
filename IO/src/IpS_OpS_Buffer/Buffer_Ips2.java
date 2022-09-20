/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IpS_OpS_Buffer;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

/**
 *
 * @author DELL
 */
public class Buffer_Ips2 {
   public static void main(String args[]) {    
      try {

         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream file = new FileInputStream("input.txt");
         
         // Creates a BufferedInputStream
         BufferedInputStream buffer = new BufferedInputStream(file);

         // Returns the available number of bytes
         System.out.println("Available bytes at the beginning: " + buffer.available());

         // Reads bytes from the file
         buffer.read();
         buffer.read();
         buffer.read();

         // Returns the available number of bytes
         System.out.println("Available bytes at the end: " + buffer.available());

         buffer.close();
      }

      catch (Exception e) {
         e.getStackTrace();
      }
   }    
}
