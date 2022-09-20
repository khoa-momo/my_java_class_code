/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.io.FileOutputStream;
/**
 *
 * @author DELL
 */
public class Ops_Writer2_Encode {
  public static void main(String[] args) {

    try { 
      FileOutputStream file = new FileOutputStream("OpsWriter2.txt"); 
      OutputStreamWriter output1 = new OutputStreamWriter(file);

      // Creates an output stream reader specifying the encoding
      OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));

      // Returns the character encoding of the output stream
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
