/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarPrj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class CarManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 

        ArrayList<String> ops = new ArrayList<String>();
        Collections.addAll(ops, " List all brands", " Add a new brand", " Search a brand based", " Update a brand", " Save brands to the file, named brands.txt", " List all cars in ascending order of brand names", " List cars based on a part of an input brand name", " Add a car", " Remove a car based on its ID", " Update a car based on its ID", " Save cars to file");

        
        ////////////////////////////////////////////////////////////////////////
        BrandList brandList = new BrandList();
        boolean b = brandList.loadFromFile("brands.txt");
        ////////////////////////////////////////////////////////////////////////
        CarList carlist = new CarList(brandList);
        boolean c = carlist.loadFromFile("cars.txt");
        ////////////////////////////////////////////////////////////////////////
        
        
        int choice;
        System.out.println("Menu");
        do {
            menu mn = new menu();
            choice = mn.int_getChoice(ops);
            switch(choice){
                case 1: {
                    if(b == true){
                        brandList.listBrands();
                    }    
                    break;
                }
                case 2: {
                    brandList.addBrand();
                    break;
                }
                case 3: {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter brandID: ");
                    String brandID = sc.nextLine();
                    System.out.println(brandList.searchID(brandID));
                    break;
                }
                case 4: {
                    brandList.updateBrand();
                    break;
                }
                case 5: {
                    brandList.loadFromFile("brands.txt");
                    break;
                }
                
                
                case 6: {
                    carlist.listCars();
                    break;
                }
                case 7: {
                    carlist.printBasedBrandName();
                    break;
                }
                case 8: {
                    carlist.addCar();
                    break;
                }
                
                
                case 9: {
                    boolean rm = carlist.removeCar();
                    if (rm) {
                        System.out.println("Remove successfully." + choice + " " + ops.size());
                    }
                    break;
                }
                case 10: {
                    boolean up = carlist.updateCar();
                    if (up) {
                        System.out.println("Update successfully");
                    }
                    break;
                }
                case 11: {
                    carlist.saveToFile("cars.txt");
                    break;
                }
            }
        } while (choice > 0 && choice <= ops.size());
    }
}
