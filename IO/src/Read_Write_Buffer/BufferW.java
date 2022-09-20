/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_Buffer;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BufferW {
     public static void main(String args[]) { 
//        String data = "BufferW 1";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input for the FileWriter file: ");
        String data = scanner.nextLine(); 
        
        try { 
          FileWriter file = new FileWriter("BufferW.txt"); 
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
