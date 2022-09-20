/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Manager;

import java.util.List;

/**
 *
 * @author DELL
 */
public class AccountManager {

    public void createAccount() {
        List<Account> listAccount = FileProcess.readFile("user.dat");
        String username = Validation.getString("Enter Username: ", 
                "Enter atleast 5 character and no space1", "[a-zA-Z]{5,}");
        String password = Validation.getString("Enter password: ", 
                "Ener aleast 6 character", "[a-zA-Z]{6,}");  
    }

    
    public void login() {
        List<Account> listAccount = FileProcess.readFile("user.dat");
        System.out.println(listAccount);
        String username = "";
        while (true) {            
            username = Validation.getString("Enter Username: ", 
                "Enter atleast 5 character and no space1", "[a-zA-Z]{5,}");      
            if()
        }

        String password = Validation.getString("Enter password: ", 
                "Ener aleast 6 character", "[a-zA-Z]{6,}");  
                                                                                                        
                                                                                                                    
        if(isCorrectAccount(username, password, listAccount)){
            System.err.println("Login successfull!");
        }else{                                                                                      
            System.out.println("Usernam or password incorrect!");                                                   
        }                                                                                   
    }                                                                                           
                                                                                            
    private boolean isCorrectAccount(String username, String password, List<Account> listAccount) {
        for(Account account : listAccount){
            if(account.getUsername().equalsIgnoreCase(username) && account.getPassword().equalsIgnoreCase(password)){
                return true;
            }
        }
        return false;
    }
    
}
