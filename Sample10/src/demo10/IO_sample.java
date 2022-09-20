/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo10;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class IO_sample {
    public static void main(String[] args) {


            //        FileOutputStream fos = null;
//        try {
//            //int
//            File file = new File("data.txt");
//            fos = new FileOutputStream(file);
//            String s = "Hello";
//            try {
//                fos.write(s.getBytes());
//            } catch (IOException ex) {
//                Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                if (fos != null) {
//                    fos.close();
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

//            File file = new File("data.txt");
//            //writeToFile(file, "hello", true);
//            String s = readFromFile(file);
//            System.out.println(s);


            



//        Book book = new Book("HP", "JKR", 65000F, 1995);
                
        ObjectInputStream ois = null;
        try {    
            ois = new ObjectInputStream(new FileInputStream("book.dat"));
            Book book = (Book)ois.readObject();
            
            System.out.println(book);
        } catch (IOException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
                
//        ObjectOutputStream oos = null;
//        try {    
//            oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
//            oos.writeObject(book);
//            
//        } catch (IOException ex) {
//            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                oos.close();
//            } catch (IOException ex) {
//                Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } 
    } 
    
    //byte stream
    public static String readFromFile(File file){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] buffer = new byte[256];
            StringBuilder sb = new StringBuilder();
              
                while(fis.read(buffer) != -1){
                    sb.append(new String(buffer));
                }
            return sb.toString();
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
    public static void writeToFile(File file, String data, boolean append){
        FileOutputStream fos = null; 
        try {
            //int
            fos = new FileOutputStream(file, append);
                fos.write(data.getBytes());
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static String readFromFileByFilter(File file) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream(file));
//            StringBuilder sb = new StringBuilder();
//            String line = null;
//            while((line = dis.readLine()) != null) {
//                sb.append(line);
//            }
//            return sb.toString();
            return dis.readUTF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }    
        
    
    public static void writeToFileByFilter(File file, String data, boolean append){
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                new FileOutputStream(file, append));
            dos.writeUTF(data);
            dos.writeUTF("\n");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO_sample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    

    
    
    
    
    
    
    
}//end sample
