/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;
import java.io.FileReader;
/**
 *
 * @author DELL
 */
public class Read_File {
  public static void main(String[] args) {

    char[] array = new char[100];
    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("inputFile.txt");

      // Reads characters
      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }    
}
