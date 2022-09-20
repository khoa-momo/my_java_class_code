/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmanager;

import java.util.Scanner;

/**
 *
 * @author TIEN DUNG
 */
public class CarManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] options = {"List all brands.\n",
                        "Add a new brand.\n",
                        "Search a brand based on its ID.\n",
                        "Update a brand.\n",
                        "Save brands to the file, named brands.txt.\n",
                        "List all cars in ascending order of brand names.\n",
                        "List cars based on a part of an input brand name.\n",
                        "Add a car.\n",
                        "Remove a car based on its ID.\n",
                        "Update a car based on its ID.\n",
                        "Save cars to file, named cars.txt.\n"};
        
        BrandList brandList = new BrandList();
        brandList.loadFromFile("brands.txt");
        CarList carList = new CarList(brandList);
        carList.loadFromFile("cars.txt");
        int choice = 0;
        do {       
            choice = Menu.int_getChoice(options);
            switch(choice){
                case 1: 
                    
                    brandList.listBrands();
                    break;
                case 2:
                    brandList.addBrand();
                    break;
                case 3:
                    System.out.print("Search brand ID: ");
                    int x = brandList.searchID(sc.nextLine());
                    if(x == -1){
                        System.out.println("Not found!\n");
                    }else{
                        System.out.println(brandList.get(x).getBrandName());
                    }
                    break;
                case 4:
                    brandList.updateBrand();
                    break;
                case 5:
                    brandList.saveToFile("brands.txt");
                    break;
                case 6:
                    carList.listCars();
                    break;   
                case 7 :
                    carList.printBasedBrandName();
                    break;
                case 8:
                    carList.addCar();
                    break;
                case 9:
                    carList.removeCar();
                    break;
                case 10:
                    carList.updateCar();
                    break;
                case 11:
                    carList.saveToFile("cars.txt");
                    break;
                    
            }
        } while (choice > 0 && choice <= options.length);
    }
    
}
