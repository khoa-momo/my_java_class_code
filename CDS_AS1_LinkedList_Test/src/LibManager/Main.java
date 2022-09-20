/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

import BookManager.Node;
import BookManager.BookManager;
import ReaderManager.ReaderManager;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Main {
    private static void Menu() {
        //Print menu
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
                    "1.10.    Delete position k\n"   +
                    "2.1.      Load data from file\n" +
                    "2.2.      Input & add to the end\n" +
                    "2.3.      Display data\n" +
                    "2.4.      Save reader list to file\n" +
                    "2.5.      Search by rcode\n" +
                    "2.6.      Delete by rcode");
    }
     
    public static void main(String[] args) throws IOException {
            Node p;
            BookManager manager = new BookManager();
            ReaderManager manager2 = new ReaderManager();
            String fname = "books.txt";
            manager.loadFile(fname);
            int maxsize = manager.size()-1;
            
            String fname2 = "readers.txt";
            manager2.loadFile(fname2);
            
        do{            
            Menu();
            int choice = ValidateInput.inputInt("Enter choice from 1 to 10: ", "Choose from 1 to 11 only!", 1, 11);
            
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
                    if(p==null)
                        System.out.println("Book not found!");
                    else{
                        System.out.println("The book found is:");
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
                    int pos = ValidateInput.inputInt("Enter position to add after: ", "Enter from 0 to "+maxsize+"!", 0, maxsize);
                    manager.addAfterPos(pos);
                    System.out.println("The book has been added!");
                    System.out.println();
                    break;   
                case 10:
                    //deletePos function 
                    int k = ValidateInput.inputInt("Enter position to delete: ", "Enter from 0 to "+maxsize+"!", 0, maxsize);
                    manager.deletePos(k);
                    System.out.println("The book has been deleteed!");
                    System.out.println();
                    break;    
                case 11:
                    System.out.printf("%-10s | %-10s | %-10s\n", "Code", "Name", "Year");
                    System.out.println("---------------------------------");
                    manager2.traverse();
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;    
                case 16:
                    //exit
                    System.exit(0);
            }            
        }while(true); 
    }
    
}
