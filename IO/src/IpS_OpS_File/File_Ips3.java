/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IpS_OpS_File;

import java.io.FileInputStream;

/**
 *
 * @author DELL
 */
public class File_Ips3 {
   public static void main(String args[]) {

      try {
         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream input = new FileInputStream("input_File_Ips.txt");

         // Skips the 5 bytes
         input.skip(5);
         System.out.println("Input stream after skipping 5 bytes:");

         // Reads the first byte
         int i = input.read();
         while (i != -1) {
            System.out.print((char) i);

            // Reads next byte from the file
            i = input.read();
         }

         // close() method
         input.close();
      }
      catch (Exception e) {
         e.getStackTrace();
      }
   }    
}
