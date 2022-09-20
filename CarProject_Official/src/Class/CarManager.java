/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */ 
public class CarManager {
    public static void main(String[] args) throws IOException { 
    //Main program
        String[] options = {"List all brands", "Add a new brand", "Search a brand based on its ID", "Update a brand", 
        "Save brands to the file, named brands.txt", "List all cars in ascending order of brand names", 
        "List cars based on a part of an input brand name", "Add a car", "Remove a car based on its ID",
        "Update a car based on its ID", "Save cars to file, named cars.txt"};
        
        Scanner scanner = new Scanner(System.in);
        int choice = 0;   
        
        BrandList brandList = new BrandList();
        boolean a = brandList.loadFromFile("brands.txt");
        
        CarList carList = new CarList(brandList);
        boolean b = carList.loadFromFile("cars.txt");        
        
        do{ 
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Welcome to Brands and Cars manager");
            choice = Menu.int_getChoice(options);
            switch (choice){
                case 1:  
                    if(a == true){
                        System.out.println("\n*The Brands list:");
                        brandList.listBrands();
                    }else{
                        System.out.println("File is not founded");
                        System.out.println("");
                    }    
                    System.out.println("");
                    break;
                case 2:  
                    brandList.addBrand();
                    System.out.println("");
                    break;  
                case 3:
                    do{                        
                        System.out.print("Enter brand ID to search: ");
                        int pos = brandList.searchID(scanner.nextLine());
                        if(pos == -1){
                            System.out.println("-This Brand ID is not existed!-");
                        }else{
                            System.out.println("--Search's result--");
                            System.out.println(brandList.get(pos));
                            System.out.println("");
                            break;
                        }
                    }while(true);
                    break; 
                case 4:  
                    brandList.updateBrand();
                    System.out.println("");
                    break;  
                case 5:  
                    boolean c = brandList.saveToFile("File brands.txt");
                    if(c == true){
                        System.out.println("File save successfully.");
                        System.out.println("");
                    }else{
                        System.out.println("File save not successfully");
                        System.out.println("");
                    }                    
                    break;  
                case 6:
                    if(b == true){
                        System.out.println("\n*The Cars list:");
                        carList.listCars();
                    }else{
                        System.out.println("File is not founded");
                        System.out.println("");
                    }     
                    System.out.println("");
                    break; 
                case 7:
                    carList.printBasedBrandName();
                    System.out.println("");
                    break; 
                case 8:
                    carList.addCar();
                    System.out.println("");
                    break; 
                case 9:
                    boolean delete = carList.removeCar();
                    if(delete == true){
                        System.out.println("Remove car successful.");
                    }
                    System.out.println("");
                    break; 
                case 10:
                    boolean m=carList.updateCar();
                    if(m==true){
                        System.out.println("Update car successful.");
                    }
                    System.out.println("");
                    break; 
                case 11:
                    boolean p=carList.saveToFile("cars.txt");
                    if(p==true){
                        System.out.println("File save successful.");
                    }
                    System.out.println("");
                    break; 
                default: 
                    System.out.println("Thank you for using our service!");
            }
        }
        while(choice>0 && choice<11);        
    }//main
}//class
