/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_Str;
import java.io.StringWriter;
/**
 *
 * @author DELL
 */
public class StringW2 {
  public static void main(String[] args) {

    String data = "This is the original data";

    try {
      // Create a StringWriter with default string buffer capacity
      StringWriter output = new StringWriter();

      // Writes data to the string buffer
      output.write(data);

      // Returns the string buffer
      StringBuffer stringBuffer = output.getBuffer();
      System.out.println("StringBuffer: " + stringBuffer);

      // Returns the string buffer in string form
      String string = output.toString();
      System.out.println("String: " + string);

      output.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }    
}
