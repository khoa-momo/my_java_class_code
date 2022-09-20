/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

import ReaderPack.Node2;
import ReaderPack.ReaderManager;
import BookPack.Node;
import BookPack.BookManager;
import LendingPack.LendingManager;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Main {
    private static void MenuFile() {
        //Print main screen  
        System.out.println("========= Lib Management program =========\n" +
                    "1. Book File\n" +
                    "2. Reader File\n" +
                    "3. Lending\n" +
                    "4. Exit program\n");
    }     
   
    private static void MenuBook() {
        //Print menu of book file
        System.out.println("========= Lib Management program =========\n" +
                    "1.1.      Load data from file\n" +
                    "1.2.      Input & add to the end\n" +
                    "1.3.      Display data\n" +
                    "1.4.      Save book list to file\n" +
                    "1.5.      Search by bcode\n" +
                    "1.6.      Delete by bcode\n" +
                    "1.7.      Sort by bcode\n" +
                    "1.8.      Input & add to beginning\n" +
                    "1.9.      Add after position k\n" +
                    "1.10.     Delete position k\n" +
                    "1.11.     Exit program\n");
    }
    
    private static void MenuReader() {
        //Print menu of reader file
        System.out.println("========= Lib Management program =========\n" +
                    "2.1.      Load data from file\n" +
                    "2.2.      Input & add to the end\n" + 
                    "2.3.      Save reader list to file\n" +
                    "2.4.      Search by rcode\n" +
                    "2.5.      Delete by rcode\n" +
                    "2.6.      Exit program\n");        
    }

    private static void MenuLending() {
        //Print menu of reader file
        System.out.println("========= Lib Management program =========\n" +
                    "3.1.      Input data\n" +
                    "3.2.      Display lending data\n" + 
                    "3.3.      Sort  by bcode + rcode\n" + 
                    "3.4.      Exit program\n");        
    }
    
    public static void main(String[] args) throws IOException {
        Node p;
        Node2 p2;
        BookManager manager = new BookManager();
        ReaderManager manager2 = new ReaderManager();
        LendingManager manager3 = new LendingManager();
        //Book load file
        String fname = "books.txt";
        manager.loadFile(fname);
        int maxsize = manager.size()-1;
        //Reader load file
        String fname2 = "readers.txt";
        manager2.loadFile(fname2);
        ////Lending load file
        String fname3 = "lending.txt";
        manager3.loadFile(fname3);
        do {
            MenuFile();     
            int choosefile = ValidateInput.inputInt("Enter file option: ", "Choose from 1 to 4 only!", 1, 4);
            switch (choosefile){
                //BOOK FILE
                case 1:
                    while (true){
                        MenuBook();
                        int choice = ValidateInput.inputInt("Enter choice from 1 to 11: ", "Choose from 1 to 11 only!", 1, 11); 
                        switch (choice) {
                            case 1:
                                //Loadfile function 
                                System.out.println("After data Load: ");
                                manager.loadData();
                                System.out.println();
                                break;
                            case 2:
                                //addBook function
                                manager.addBook();
                                System.out.println();
                                break; 
                            case 3:
                                //Display function
                                System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s | %-10s\n", "Code", "Title", "Quantity", "Lend", "Price", "Value");
                                System.out.println("--------------------------------------------------------------------------");
                                manager.traverse();
                                System.out.println();
                                break; 
                            case 4:
                                //saveFile function
                                manager.saveFile(fname);
                                System.out.println("Save book to file successfully!");
                                System.out.println();
                                break;   
                            case 5:
                                //searchByBcode function
                                String xbCode = ValidateInput.inputNonBlankStr("Enter Code to search: ", "Invalid!");
                                p = manager.searchByBcode(xbCode);
                                if(p==null){
                                    System.out.println("Book not found!");
                                    System.out.println();
                                }else{
                                    System.out.println("The book found is:");
                                    System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s | %-10s\n", "Code", "Title", "Quantity", "Lend", "Price", "Value");
                                    System.out.println("--------------------------------------------------------------------------");
                                    manager.visit(p);
                                }
                                System.out.println();
                                break;      
                            case 6:
                                //deleteByBcode function
                                String xCode = ValidateInput.inputNonBlankStr("Enter Code to delete: ", "Invalid!");
                                p = manager.searchByBcode(xCode);
                                if(p==null)
                                    System.out.println("Book not found!");
                                else{
                                    manager.deleteByBcode(p);
                                    System.out.println("The book has been deleted!");
                                }
                                System.out.println();
                                break;   
                            case 7:
                                //sortByBcode function
                                manager.sortByBcode();
                                System.out.println("The list has been sorted!");
                                System.out.println();
                                break;   
                            case 8:
                                //addFirstBook function
                                manager.addFirstBook();
                                break;   
                            case 9:
                                //addAfterPos function 
                                int pos = ValidateInput.inputInt("Enter position to add after(List start with 0): ", "Enter from 0 to "+maxsize+"!", 0, maxsize);
                                manager.addAfterPos(pos);
                                System.out.println("The book has been added!");
                                System.out.println();
                                break;   
                            case 10:
                                //deletePos function 
                                int k = ValidateInput.inputInt("Enter position to delete (List start with 0): ", "Enter from 0 to "+maxsize+"!", 0, maxsize);
                                manager.deletePos(k);
                                System.out.println("The book has been deleteed!");
                                System.out.println();
                                break;    
                            case 11: 
                                System.out.println("Thank you for using our service!");
                                System.exit(0); 
                        }                              
                    } 
                //READER FILE
                case 2:
                    while (true){
                        MenuReader();
                        int choice2 = ValidateInput.inputInt("Enter choice from 1 to 6: ", "Choose from 1 to 6 only!", 1, 6);
                        switch (choice2){
                            //Display reader list
                            case 1:
                                System.out.printf("%-15s | %-15s | %-15s\n", "Code", "Name", "Year");
                                System.out.println("--------------------------------------------");
                                manager2.traverse();
                                System.out.println();
                                break;
                            //Add reader
                            case 2:
                                manager2.addReader();
                                System.out.println();
                                break;  
                            //Save list    
                            case 3:
                                manager2.saveFile(fname2);
                                System.out.println("Save book to file successfully!");
                                System.out.println();
                                break;
                            //Search by Rcode     
                            case 4:
                                String xrCode = ValidateInput.inputNonBlankStr("Enter Code to search: ", "Invalid!");
                                p2 = manager2.searchByRcode(xrCode);
                                if(p2==null){
                                    System.out.println("Reader not found!");
                                    System.out.println();
                                }else{
                                    System.out.println("The reader found is:");
                                    System.out.printf("%-15s | %-15s | %-15s\n", "Code", "Name", "Year");
                                    System.out.println("--------------------------------------------");
                                    manager2.visit(p2);
                                }
                                System.out.println();
                                break;      
                            case 5:
                                //deleteByBcode function
                                String xCode = ValidateInput.inputNonBlankStr("Enter Code to delete: ", "Invalid!");
                                p2 = manager2.searchByRcode(xCode);
                                if(p2==null)
                                    System.out.println("Reader not found!");
                                else{
                                    manager2.deleteByRcode(p2);
                                    System.out.println("The book has been deleted!");
                                }
                                System.out.println();
                                break;                                   
                            case 6:
                                System.out.println("Thank you for using our service!");
                                System.exit(0); 
                        }                        
                    }  
                //LENDING FILE    
                case 3:
                    while (true){
                        MenuLending();
                        int choice3 = ValidateInput.inputInt("Enter choice from 1 to 4: ", "Choose from 1 to 4 only!", 1, 4);
                        switch (choice3){
                            //Input & Save
                            case 1:
                                manager3.addLending();
                                System.out.println();
                                break;
                            //Display
                            case 2:
                                System.out.printf("%-15s | %-15s | %-15s\n", "bcode", "rcode", "state");
                                System.out.println("------------------------------------------");
                                manager3.traverse();
                                System.out.println();
                                break;  
                            //Sorting by Bcode and Rcode    
                            case 3:
                                manager3.sortByBRCode();
                                System.out.println("File has been sorted!");
                                System.out.println();
                                break;           
                            case 4:
                                System.out.println("Thank you for using our service!");
                                System.exit(0); 
                        }                        
                    }                      
                //exit program    
                case 4:
                    System.out.println("Thank you for using our service!");
                    System.exit(0); 
            }
        } while (true); 
        
    }//end main
}//end class
