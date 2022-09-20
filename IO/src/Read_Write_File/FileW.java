/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Read_Write_File;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class FileW {
    public static void main(String args[]) { 
//    String data = "This is the data in the output file";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input for the FileWriter file: ");
        String data = scanner.nextLine(); 
        try { 
          FileWriter output = new FileWriter("FileWriter.txt"); 
          output.write(data); 
          output.close();
        } 
        catch (Exception e) {
          e.getStackTrace();
        }
        
    }    
}
