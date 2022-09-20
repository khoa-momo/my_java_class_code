/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FruitShop;
 
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author DELL
 */
public class Shop extends ArrayList<Fruit>{
    //ArrayList - listFruits for fruits in the store
    private ArrayList<Fruit> listFruits = new ArrayList();
    //Hashtable with customer name and their list order
    private Hashtable <String, ArrayList<Fruit>> listOrder = new Hashtable();
    
    public Shop() {
        listFruits.add(new Fruit("Coconut", 2, 10, "Viet Nam"));
        listFruits.add(new Fruit("Orange", 3, 15, "US"));
        listFruits.add(new Fruit("Apple", 4, 6, "Thailand"));
        listFruits.add(new Fruit("Grape", 6, 3, "France"));
    }
    
    public void CreateFruit() {
        while (true) {      
            //Other Attribute of fruit
            String name = ValidateInput.inputString("Enter fruit's name: ", "Invalid input!", "[a-zA-Z ]+");
            float price = ValidateInput.inputFloat("Enter fruit's price: ", "Invalid input!", 0, Float.MAX_VALUE);
            int quantity = ValidateInput.inputInt("Enter fruit's quantity: ", "Invalid input!", 0, Integer.MAX_VALUE);
            String origin = ValidateInput.inputString("Enter fruit's origin: ", "Invalid", "[a-zA-Z ]+");
            //Add fruit to list
            Fruit list = new Fruit(name, price, quantity, origin);
            listFruits.add(list);
            System.out.println("New fruit has been added!");
            //Choose Yes or No to continue
            String yesno = ValidateInput.inputString("Do you want to continue (Y/N)?", "You have to choose Y or N", "^[YN]$");
            if(yesno.toUpperCase().equals("N")){
                break; //out of loop
            }         
        }
        System.out.println("");   
    }

    public void viewOrders() {
        //view the final list

    }

    public void shopping() {
        //List for the customer's order
        ArrayList<Fruit> listBoughtItem = new ArrayList();
        while (true) {
            System.out.println("List of Fruit:");
            System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
            //show fruit list
            displayFruit();
            
            
            //get list size
//            int listSize = 1; 
//            if (!listFruits.isEmpty()) {
//                listSize = listFruits.get(listFruits.size() - 1).getFruitId();
//            } 

            //Get fruit id to order - ID have to be in the list
            while (true) {
                //input item id
                int IDChoice = ValidateInput.inputInt("Enter fruit item id: ", "Id have to be larger 1", 1, Integer.MAX_VALUE);
                //IDChoice = input - ex: 1
                int fruit = findFruitById(IDChoice);    
                //If ID is in the list then continue else re-enter ID
                if(fruit == -1) 
                    System.out.println("FruitID is not the list!"); 
                else
                    System.out.println("You selected: " + this.get(fruit).getFruitName()); 
                    break; 
            } 
//            int quantity = Validation.getInt("Please input quantity: ", "Quantity[1-" + fruit.getQuantity() + "]", 1, fruit.getQuantity());
//            String choose = Validation.getString("Do you want to order now (Y/N)", "Please enter y|n|Y|N", "^[yYnN]$");            
            
            String YesNo = ValidateInput.inputString("Do you want to order now (Y/N)?", "You have to choose Y or N", "^[YN]$");
            if(YesNo.toUpperCase().equals("y")) {
                break;
            }        
            System.out.println("OK");
        }

    }
     
    //Display list fruit
    public void displayFruit(){
        for (Fruit fruit : listFruits) {
            System.out.println(fruit);
        }
    }

    //Check fruit ID in list to order
    private int findFruitById(int IDChoice) {
        int listSize = listFruits.get(listFruits.size() - 1).getFruitId();
        for (int i = 0; i < listSize; i++) { 
            if (this.get(i).getFruitId() == IDChoice) {
                return i; //return ID
            }
        }
        return -1; //Fruit id not in the list
    }
    
}
