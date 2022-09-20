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
public class StringR2 {
  public static void main(String[] args) {

    String data = "This is the text read from StringReader";
    System.out.println("Original data: " + data);

    // Create a character array
    char[] array = new char[100];

    try {
      // Create a StringReader
      StringReader input = new StringReader(data);

      // Use the skip() method
      input.skip(5);

      //Use the read method
      input.read(array);
      System.out.println("Data after skipping 5 characters:");
      System.out.println(array);

      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
