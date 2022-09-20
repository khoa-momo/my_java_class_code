/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOpS_FileObj;
import java.io.FileOutputStream;
/**
 *
 * @author DELL
 */
public class File_Obj_ops1 {
    public static void main(String[] args) {
        
        String data = "file_Obj_Ops.";

        try {
            FileOutputStream output = new FileOutputStream("file_Obj_Ops.txt");

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
