/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Manager;

import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class FileProcess {

    static List<Account> readFile(String fileName) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            List<Account> listAccounts = (List<Account>) ois.readObject();
            return listAccounts;
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();        

    }

    static List<Account> writeFile(String fileName) {
        ObjectOutputStream objectOutputStream = null;
        
        try {
            objectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(list);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
