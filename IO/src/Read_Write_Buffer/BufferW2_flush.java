/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_Buffer;

import java.io.BufferedWriter;

/**
 *
 * @author DELL
 */
public class BufferW2_flush {
    public static void main(String[] args) {

        String data = "This is a demo of the flush method"; 
        try { 
          java.io.FileWriter file = new java.io.FileWriter("BufferW_flush.txt"); 
          BufferedWriter output = new BufferedWriter(file); 
          // Writes data to the file
          output.write(data); 
          // Flushes data to the destination
          output.flush();
          System.out.println("Data is flushed to the file.");

          output.close();
        }

        catch(Exception e) {
          e.getStackTrace();
        }
    }       
}
