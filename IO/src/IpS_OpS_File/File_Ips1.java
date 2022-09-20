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
public class File_Ips1 {
    public static void main(String args[]) {

        try {
           FileInputStream input = new FileInputStream("input_File_Ips.txt"); 
           System.out.println("Data in the file: ");

           // Reads the first byte
           int i = input.read(); 
           while(i != -1) {
              System.out.print((char)i); 
              // Reads next byte from the file
              i = input.read();
           }
           input.close();
        } 
        catch(Exception e) {
           e.getStackTrace();
        }
     
    }    
}
