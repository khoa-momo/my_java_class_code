/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.FileWriter;

/**
 *
 * @author DELL
 */
public class Write_File {
   public static void main(String args[]) {

     String data = "This is for write a file!";
     try {
       // Creates a Writer using FileWriter
       FileWriter output = new FileWriter("outputFile.txt");

       // Writes string to the file
       output.write(data);
       System.out.println("Data is written to the file.");

       // Closes the writer
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }    
}
