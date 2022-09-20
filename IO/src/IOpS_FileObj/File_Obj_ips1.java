/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOpS_FileObj;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/////////////////////////////////
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author DELL
 */
public class File_Obj_ips1 {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is programiz";

        try{
            FileOutputStream file = new FileOutputStream("file_Obj_Ips.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);   //close

            // Writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream("file_Obj_Ips.txt"); 
            ObjectInputStream objStream = new ObjectInputStream(fileStream);    //close
            
            System.out.println("Integer data :" + objStream.readInt()); //Using the readInt() method
            System.out.println("String data: " + objStream.readObject()); //Using the readObject() method

            output.close(); //Obj_OpS
            objStream.close();  //Obk_IpS
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }    
}
