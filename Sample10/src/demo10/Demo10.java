/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo10;
 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import java.io.DataInputStream;
import java.io.DataOutputStream;

/////////////////////////////////////

import java.io.FileNotFoundException; 
import java.io.IOException;
 
/////////////////////////////////////

import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 * @author KienLT
 */
public class Demo10 { 
    public static void main(String[] args) {

//        File file = new File("data.txt");
//        writeToFileByFilter(file, "Hoàng Thu Thảo", false);
//        String s = readFromFileByFilter(file);
//        System.out.println(s); 

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream( new FileInputStream("book.dat"));
            Book book = (Book)ois.readObject();
            System.out.println(book);
        } catch (IOException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        ObjectOutputStream oos = null;
//        try {
//            Book book = new Book("Java Programming", "Trần Văn Thắng", 65000F, 2020);
//            oos = new ObjectOutputStream(
//                    new FileOutputStream("book.dat"));
//            oos.writeObject(book);
//        } catch (IOException ex) {
//            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                oos.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    //FIS
    public static String readFromFile(File file) { 
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] buffer = new byte[256];
            StringBuilder sb = new StringBuilder();
            
            while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
            }
            return sb.toString();
        //
        //
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
 
    
    public static void writeToFile(File file, String data, boolean append) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, append);
            fos.write(data.getBytes());
            fos.flush();
        //    
        //    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    public static void writeToFileByFilter(File file, String data, boolean append) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                    new FileOutputStream(file, append));
            dos.writeUTF(data);
            dos.writeUTF("\n");
        ///////////////////////////////////////////////////////////////////////////    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Demo10.class.getName()).log(Level.SEVERE, null, ex);
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

}
