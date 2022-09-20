/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_Str;
import java.io.StringReader;

/**
 *
 * @author DELL
 */ 
public class StringR {
  public static void main(String[] args) {

    String data = "This is the text read from StringReader.";

    // Create a character array
    char[] array = new char[100];

    try {
      // Create a StringReader
      StringReader input = new StringReader(data);

      //Use the read method
      input.read(array);
      System.out.println("Data read from the string:");
      System.out.println(array);

      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}