/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IpS_OpS_File;

import java.io.FileOutputStream;

/**
 *
 * @author DELL
 */
public class File_Ops1 {
    public static void main(String[] args) {
        
        String data = "This file is for File_Ops."; 
        try {
            FileOutputStream output = new FileOutputStream("output_File_Ops.txt");
            byte[] array = data.getBytes(); 
            // Writes byte to the file
            output.write(array); 
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }    
}
