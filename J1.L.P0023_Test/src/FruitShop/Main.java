/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FruitShop;

/**
 *
 * @author DELL
 */
public class Main {
    private static void Menu() {
        //Print menu
        System.out.println("=======FRUIT SHOP SYSTEM=======\n" +
                        "1.	Create Fruit\n" +
                        "2.	View orders\n" +
                        "3.	Shopping (for buyer)\n" +
                        "4.	Exit");
    }
    
    public static void main(String[] args) { 
        //Declare object
        Shop fruitShop = new Shop();
        do{            
            Menu();
            int choice = ValidateInput.inputInt("Enter choice from 1 to 4: ", "Choose from 1 to 4 only!", 1, 4);
            switch (choice) {
                case 1:
                    //Add new product
                    fruitShop.CreateFruit();
                    break;
                case 2:
                    //View Order function for customer information
                    fruitShop.viewOrders();
                    break;
                case 3:
                    //Shopping function to show fruit list
                    fruitShop.shopping();
                    break; 
                case 4:
                    //exit
                    System.exit(0);
            }            
        }while(true); 
    }
}
