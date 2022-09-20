/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.FileInputStream;

/**
 *
 * @author DELL
 */
public class Ips_Reader2_Encode {
  public static void main(String[] args) {

    try { 
      FileInputStream file = new FileInputStream("IpsReader2.txt"); 
      InputStreamReader input1 = new InputStreamReader(file);

      // Creates an InputStreamReader specifying the encoding
      InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));

      // Returns the character encoding of the input stream
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
