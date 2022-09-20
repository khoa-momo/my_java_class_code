/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write;
import java.io.FileReader;
//import java.io.Reader;
/**
 *
 * @author DELL
 */
public class Reader {
    public static void main(String[] args) { 
        char[] array = new char[100]; 
        try { 
            FileReader input = new FileReader("Readerinput.txt"); 
            System.out.println("Is there data in the stream?  " + input.ready());

            // Reads characters
            input.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array); 
            input.close();
        } 
        catch(Exception e) {
            e.getStackTrace();
        }
        
    }    
}
