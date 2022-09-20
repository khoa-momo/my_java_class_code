/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IpS_OpS;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 *
 * @author DELL
 */
public class Ips1 {
    public static void main(String args[]) {
        byte[] array = new byte[100]; 
        try {
          InputStream input = new FileInputStream("input.txt"); 
          System.out.println("Available bytes in the file: " + input.available());
          // Read byte from the input stream
          input.read(array);
          System.out.println("Data read from the file: ");
          // Convert byte array into string
          String data = new String(array);
          System.out.println(data);

          // Close the input stream
          input.close();
        } catch (Exception e) {
          e.getStackTrace();
        }
        
    }    
}
