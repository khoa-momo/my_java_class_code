/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

import BookPack.BookManager;
import BookPack.Node;
import ReaderPack.ReaderManager;
import ReaderPack.Node2;
import LendingPack.LendingManager;
import LendingPack.Node3;
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
                    "1.2.      Input & insert data\n" +
                    "1.3.      In-order traverse\n" +
                    "1.4.      Breadth-first traverse\n" +
                    "1.5.      In-order traverse to file\n" + //Save
                    "1.6.      Search by bcode\n" +
                    "1.7.      Delete by bcode by copying\n" +
                    "1.8.      Simply balancing\n" +
                    "1.9.      Count number of books\n" +
                    "1.10.     Back to main screen");
    }
    
    private static void MenuReader() {
        //Print menu of reader file
        System.out.println("========= Lib Management program =========\n" +
                    "2.1.      Load data from file\n" +
                    "2.2.      Input & add to the end\n" +
                    "2.3.      Display data\n" +
                    "2.4.      Save reader list to file\n" +
                    "2.5.      Search by rcode\n" +
                    "2.6.      Delete by rcode\n" +
                    "2.7.      Back to main screen");        
    }

    private static void MenuLending() {
        //Print menu of lending file
        System.out.println("========= Lib Management program =========\n" +
                    "3.1.      Input data\n" +
                    "3.2.      Display lending data\n" + 
                    "3.3.      Sort  by bcode + rcode\n" + 
                    "3.4.      Back to main screen\n");        
    }
    
    public static void main(String[] args) throws IOException { 
        BookManager manager1 = new BookManager();
        String fname1 = "books.txt";
        manager1.loadFile(fname1);
        
        ReaderManager manager2 = new ReaderManager();
        String fname2 = "readers.txt";
        manager2.loadFile(fname2);
        
        LendingManager manager3 = new LendingManager();
        String fname3 = "lending.txt";
        manager3.loadFile(fname3);
        
        do {
            MenuFile();    
            int choosefile = ValidateInput.inputInt("Enter file option: ", "Choose from 1 to 4 only!", 1, 4);
            switch (choosefile){
////////////////BOOK FILE
                case 1:
                    int choice;
                    do {                        
                        MenuBook();
                        choice = ValidateInput.inputInt("Enter choice from 1 to 10: ", "Choose from 1 to 10 only!", 1, 10); 
                        switch (choice) {
                            case 1:
                                //Loadfile function 
                                System.out.println("Data after Load: "); 
                                manager1.breadth(manager1.root);                                
                                System.out.println();
                                break;
                            case 2:
                                //addBook function
                                manager1.addBook();
                                System.out.println();
                                break; 
                            case 3:
                                //Display function
                                System.out.printf("%-10s | %-20s | %-10s | %-10s | %-10s \n", "Code", "Title", "Quantity", "Lend", "Price");
                                System.out.println("--------------------------------------------------------------------");
                                manager1.inOrder(manager1.root);
                                System.out.println();
                                break; 
                            case 4:
                                //Breadth-first traverse function
                                System.out.printf("%-10s | %-20s | %-10s | %-10s | %-10s \n", "Code", "Title", "Quantity", "Lend", "Price");
                                System.out.println("--------------------------------------------------------------------");
                                manager1.breadth(manager1.root);
                                System.out.println();
                                break; 
                            case 5:
                                //saveFile by in-order Traverse function
                                manager1.saveFileBreadth("books.txt",manager1.root);
//                                manager1.saveFileInOrder("books2.txt",manager1.root);
                                System.out.println("Save book to file successfully!");
                                System.out.println();
                                break;                                   
                            case 6:
                                //searchByBcode function
                                String xbCode = ValidateInput.inputNonBlankStr("Enter Code to search: ", "Invalid!");
                                Node q = manager1.searchByBcode(manager1.root, xbCode);
                                if(q==null){
                                    System.out.println("Book not found!");
                                }else{
                                    System.out.println("The book found is:");
                                    System.out.printf("%-10s | %-20s | %-10s | %-10s | %-10s \n", "Code", "Title", "Quantity", "Lend", "Price");
                                    System.out.println("--------------------------------------------------------------------");
                                    manager1.visit(q);
                                    System.out.println();
                                }
                                System.out.println();
                                break;      
                            case 7:
                                //deleteByBcode function
                                String xCode = ValidateInput.inputNonBlankStr("Enter Code to delete: ", "Invalid!");
                                Node r = manager1.searchByBcode(manager1.root, xCode);
                                if(r==null){
                                    System.out.println("Book not found!");
                                }else{
                                    manager1.deleteByCopy(xCode);
                                    System.out.println("The book has been deleted!");
                                }
                                System.out.println();
                                break;   
                            case 8:
                                //Simply balancing function
                                manager1.balance();
                                System.out.println("The list has been balanced!");
                                System.out.println();
                                break;   
                            case 9:
                                //Count number of books function
                                int k = 0;
                                k = manager1.count(manager1.root); 
                                System.out.println("Number of books: " + k);
                                System.out.println("");
                                break;   
                            case 10: 
                                System.out.println();
                                break; 
                        }                              
                    } while (choice != 10); 
                    break;
////////////////READER FILE
                case 2:
                    int choice2;
                    do {                        
                        MenuReader();
                        choice2 = ValidateInput.inputInt("Enter choice from 1 to 7: ", "Choose from 1 to 7 only!", 1, 7);
                        switch (choice2){
                            case 1:
                                //Loadfile function 
                                System.out.println("After data Load: ");
                                manager2.breadth(manager2.root);      
                                System.out.println();
                                break;
                            case 2:
                                //Add reader
                                manager2.addReader();
                                System.out.println();
                                break;
                            case 3:
                                //Breadth-first traverse
                                System.out.printf("%-15s | %-15s | %-15s\n", "Code", "Name", "Year");
                                System.out.println("--------------------------------------------");
                                manager2.breadth(manager2.root);      
                                System.out.println();
                                break;
                            case 4:
                                 //saveFile by in-order Traverse function
                                manager2.saveFileBreadth("readers.txt",manager2.root); 
                                System.out.println("Save reader to file successfully!");    
                                System.out.println();
                                break;  
                            case 5: 
                                //searchByBcode function
                                String xrCode = ValidateInput.inputNonBlankStr("Enter Code to search: ", "Invalid!");
                                Node2 q = manager2.searchByRcode(manager2.root, xrCode);
                                if(q==null){
                                    System.out.println("Reader not found!");
                                }else{
                                    System.out.println("The reader found is:");
                                    System.out.printf("%-15s | %-15s | %-15s\n", "Code", "Name", "Year");
                                    System.out.println("--------------------------------------------");
                                    manager2.visit(q);
                                    System.out.println();
                                }
                                System.out.println();
                                break;      
                            case 6:
                                //deleteByBcode function
                                String xCode = ValidateInput.inputNonBlankStr("Enter Code to delete: ", "Invalid!");
                                Node2 m = manager2.searchByRcode(manager2.root, xCode);
                                if(m==null){
                                    System.out.println("Reader not found!");
                                }else{
                                    manager2.deleteByCopy(xCode);
                                    System.out.println("The Reader has been deleted!");
                                }
                                System.out.println();
                                break;                                   
                            case 7: 
                                System.out.println();
                                break;
                        }                                      
                    } while (choice2 != 7); 
                    break;
////////////////LENDING FILE    
                case 3:
                    int choice3;
                    do {                        
                        MenuLending();
                        choice3 = ValidateInput.inputInt("Enter choice from 1 to 4: ", "Choose from 1 to 4 only!", 1, 4);
                        switch (choice3){
                            case 1:
                                //Input data
                                manager3.addLending();
                                System.out.println();
                                manager3.saveFileBreadth("lending.txt",manager3.root); 
                                break;
                            case 2:
                                //Display
                                System.out.printf("%-15s | %-15s | %-15s\n", "bcode", "rcode", "state");
                                System.out.println("--------------------------------------------");
                                manager3.breadth(manager3.root);  
                                System.out.println();
                                break;  
                            case 3:
                                //Sorting by Bcode and Rcode  
                                System.out.println("Show file in in-order traverse:");
                                manager3.inOrder(manager3.root); 
                                System.out.println();
                                break;           
                            case 4:
                                System.out.println(); 
                                break;
                        }                               
                    } while (choice3 != 4);    
                    break;
////////////////Exit program    
                case 4:
                    System.out.println("Thank you for using our service!");
                    System.exit(0); 
            }
        } while (true);
    }
}
