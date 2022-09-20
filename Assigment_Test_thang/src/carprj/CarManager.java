/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carprj;

import controller.BrandList;
import controller.CarList;
import controller.Menu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author letha
 */
public class CarManager {

    static String fileBrand = "brands.txt";
    static String fileCar = "cars.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> menuList = new ArrayList<>();
        BrandList brandList = new BrandList();
        CarList carList = new CarList(brandList);
        //load brands and cars from file
        loadData(brandList, carList);
        program(menuList, brandList, carList);
    }

    public static void program(ArrayList<String> menuList, BrandList brandList, CarList carList) {
        Scanner sc = new Scanner(System.in);
        menuList.add("List all brands.");
        menuList.add("Add a new brand.");
        menuList.add("Search a brand base on it's ID.");
        menuList.add("Update a brand.");
        menuList.add("Save brand to the file.");
        menuList.add("List all cars in ascending order of brand name.");
        menuList.add("List cars based on a part of an input brand name.");
        menuList.add("Add a car.");
        menuList.add("Remove a car based on its ID.");
        menuList.add("Update a car based on its ID.");
        menuList.add("Save cars to file");
        menuList.add("Exit program");
        int choice;
        Menu menu = new Menu();
        do {
            //get choice
            choice = menu.int_getChoice(menuList);
            switch (choice) {
                case 1:
                    brandList.listBrands();
                    break;
                case 2:
                    brandList.addBrand();
                    break;
                case 3:
                    String brandId;
                    System.out.print("Input brand ID: ");
                    brandId = sc.nextLine();
                    int pos = brandList.searchId(brandId);
                    if (pos != -1) {
                        System.out.println(brandList.get(pos));
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    brandList.updateBrand();
                    break;
                case 5:
                    if (brandList.savetoFile(fileBrand)) {
                        System.out.println("Save to file successful");
                    } else {
                        System.out.println("Save to file failed");
                    }
                    break;
                case 6:
                    Collections.sort(carList);
                    carList.listCars();
                    break;
                case 7:
                    carList.printBasedBrandName();
                    break;
                case 8:
                    carList.addCar();
                    break;
                case 9:
                    if (carList.removeCar()) {
                        System.out.println("Remove car successful");
                    }
                    break;
                case 10:
                    if (carList.updateCar()) {
                        System.out.println("Update car successful");
                    }
                    break;
                case 11:
                    if (carList.saveToFile(fileCar)) {
                        System.out.println("Save to file successful");
                    } else {
                        System.out.println("Save to file failed");
                    }
                    break;
                default:
                    break;
            }
            System.out.println();
        } while (choice != 12);//choice = 12 exit program
    }

    public static void loadData(BrandList brandList, CarList carList) {
        //load brand from file
        if (brandList.loadFromFile(fileBrand)) {
            System.out.println("Loaded brands from file");
        }
        //load car from file
        if (carList.loadFromFile(fileCar)) {
            System.out.println("Loaded cars from file");
        }
    }
}
