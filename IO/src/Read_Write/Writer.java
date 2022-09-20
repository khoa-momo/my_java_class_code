/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write;
import java.io.FileWriter;
//import java.io.Writer;
/**
 *
 * @author DELL
 */
public class Writer {
    public static void main(String args[]) { 
        String data = "This file is for Writer output"; 
        try { 
            FileWriter output = new FileWriter("Writeroutput.txt"); 
            output.write(data); 
            output.close();
        } 
        catch (Exception e) {
            e.getStackTrace();
        }
        
    }    
}
