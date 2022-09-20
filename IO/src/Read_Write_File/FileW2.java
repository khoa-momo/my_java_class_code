/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_File;
import java.io.FileWriter;
import java.nio.charset.Charset;
/**
 *
 * @author DELL
 */
public class FileW2 {
  public static void main(String[] args) {

    String file = "FileWriter2.txt";

    try {
      // Creates a FileReader with default encoding
      FileWriter output1 = new FileWriter(file);

      // Creates a FileReader specifying the encoding
      FileWriter output2 = new FileWriter(file, Charset.forName("UTF8"));

      // Returns the character encoding of the reader
      System.out.println("Character encoding of output1: " + output1.getEncoding());
      System.out.println("Character encoding of output2: " + output2.getEncoding());

      // Closes the reader
      output1.close();
      output2.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }    
}
