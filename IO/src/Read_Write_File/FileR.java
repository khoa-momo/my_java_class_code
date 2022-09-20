/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_File;
import java.io.FileReader;
/**
 *
 * @author DELL
 */
public class FileR {
    public static void main(String[] args) {  
        
        char[] array = new char[100]; 
        try { 
          FileReader input = new FileReader("FileReader.txt"); 
          // Reads characters
          input.read(array);
          System.out.println("Data in the file: ");
          System.out.println(array);
 
          input.close();
        } 
        catch(Exception e) {
          e.getStackTrace();
        }
    
    }    
}
