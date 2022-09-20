/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeBase;

/**
 *
 * @author DELL
 */
public class Main {
    private static void Menu() {
        //Print menu
        System.out.println("========= Base number converter =========\n" +
                            "1.	Convert base number\n" + 
                            "2.	Exit");
    }
    
    public static void main(String[] args) { 
        //Declare object
        CovertBase manager = new CovertBase();
        do{            
            Menu();
            int choice = ValidateInput.inputInt("Enter choice from 1 to 2: ", "Choose from 1 to 2 only!", 1, 2);
            switch (choice) {
                case 1:
                    //Add function
                    manager.convertNumber();
                    break; 
                case 2:
                    //exit
                    System.exit(0);
            }            
        }while(true); 
    }    
}
