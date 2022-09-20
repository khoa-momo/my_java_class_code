/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IpS_OpS_Buffer;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
/**
 *
 * @author DELL
 */  
public class Buffer_Ips1 {
    public static void main(String[] args) {
        try {
 
            FileInputStream file = new FileInputStream("Buffer_input.txt"); 
            BufferedInputStream input = new BufferedInputStream(file);

            // Reads first byte from file
            int i = input .read();

            while (i != -1) {
                System.out.print((char) i); 
                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}    