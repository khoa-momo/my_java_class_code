/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_File;
import java.io.FileReader;
import java.nio.charset.Charset;
/**
 *
 * @author DELL
 */
public class FileR2 {
  public static void main(String[] args) {

    try {
      // Creates a FileReader with default encoding
      FileReader input1 = new FileReader("FileReader2.txt");

      // Creates a FileReader specifying the encoding
      FileReader input2 = new FileReader("FileReader2.txt", Charset.forName("UTF8"));

      // Returns the character encoding of the file reader
      System.out.println("Character encoding of input1: " + input1.getEncoding());
      System.out.println("Character encoding of input2: " + input2.getEncoding());

      // Closes the reader
      input1.close();
      input2.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }    
}
