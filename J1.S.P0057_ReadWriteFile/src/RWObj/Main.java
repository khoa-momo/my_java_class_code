/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RWObj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main { 
    public static void main(String[] args) {
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            List<Account> listAccounts = new ArrayList<>();
//            listAccounts.add(new Account("user", "123456"));
//            listAccounts.add(new Account("admin", "123456"));
//            objectOutputStream = new ObjectOutputStream(new FileOutputStream("account.txt"));
//            
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                objectOutputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } 
//    }
    
    List<Account> listAccounts = FileProcess.readFile("account.txt");
    listAccounts.add(new Account("customer", "123456"));
    FileProcess.writeFile(listAccounts, "accoount.txt");
    
    

    
    
}
