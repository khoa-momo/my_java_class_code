/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Brand;
import model.Car;

/**
 *
 * @author letha
 */
public class CarList extends ArrayList<Car> {

    BrandList brandList;

    public CarList(BrandList brandList) {
        this.brandList = brandList;
    }

    public boolean loadFromFile(String fileName) {
        File file = new File(fileName);
        //check file exist?
        if(!file.exists()){
            return false;
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            //read line from file
            while ((line = br.readLine()) != null) {
                //get propeties of car
                
                String[] arr = line.split(",");
                String carId = arr[0].trim();
                String brandId = arr[1].trim();
                
                Brand brand = brandList.get(brandList.searchId(brandId));
                
                String color = arr[2].trim();
                String frameId = arr[3].trim();
                String engineId = arr[4].trim();
                
                //add car to the list
                this.add(new Car(carId, brand, color, frameId, engineId));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    public boolean saveToFile(String fileName) {
        File file = new File(fileName);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(file));
            for (Car car : this) {
                //write car to the file
                pw.write(car.toString() + "\n");
            }
        } catch (IOException ex) {
            return false;
        } finally {
            pw.close();
        }
        return true;
    }

    public int searchId(String carId) {
        for (int i = 0; i < this.size(); i++) {
            //compare inputted brandId with brandId of each item in the list
            if (this.get(i).getCarId().equals(carId)) {
                return i;//return position
            }
        }
        return -1;
    }

    public int searchFrame(String frameId) {
        for (int i = 0; i < this.size(); i++) {
            //compare inputted frameId with frameId of each item in the list
            if (this.get(i).getFrameId().equals(frameId)) {
                return i;//return position
            }
        }
        return -1;
    }

    public int searchEngine(String engineId) {
        for (int i = 0; i < this.size(); i++) {
            //compare inputted engineId with engineId of each item in the list
            if (this.get(i).getEngineId().equals(engineId)) {
                return i;//return position
            }
        }
        return -1;
    }

    public void addCar() {
        
        String carId = inputId("Car ID: ");
        System.out.println("Brand: ");
        
        Menu menu = new Menu();
        Brand brand = (Brand)menu.ref_getChoice(brandList);
        
        String color = inputString("Color: ");
        String frameId = inputFrameId("Frame ID: ");
        String engineId = inputEngineId("Engine ID: ");
        
        Car car = new Car(carId, brand, color, frameId, engineId);
        //add car to the list
        this.add(car);
    }

    public void printBasedBrandName() {
        String partOfName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a part of brand name: ");
        partOfName = sc.nextLine();
        int count = 0;
        for (int i = 0; i < this.size(); i++) {
            Car car = this.get(i);
            //find brandName that contains inputted name
            if (car.getBrand().getBrandName().contains(partOfName)) {
                System.out.println();
                System.out.println(car.screenString());
                count++;
            }
        }
        //no car found
        if (count == 0) {
            System.out.println("No car is detected!");
        }
    }

    public boolean removeCar() {
        String removeId;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input remove car ID: ");
        removeId = sc.nextLine();
        //find car to remove
        int pos = searchId(removeId);
        //car not found
        if (pos == -1) {
            System.out.println("Not found!");
            return false;
        } else {
            //remove car
            this.remove(pos);
        }
        return true;
    }

    public boolean updateCar() {
        String updateId;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input update car ID: ");
        updateId = sc.nextLine();
        //find car to update
        int pos = searchId(updateId);
        //car not found
        if (pos == -1) {
            System.out.println("Not found!");
            return false;
        } else {
            
            Menu menu = new Menu();
            System.out.println("Update Brand: ");
            Brand brand = (Brand) menu.ref_getChoice(brandList);
            
            
            this.get(pos).setBrand(brand);
            this.get(pos).setColor(inputString("Update Color: "));
            this.get(pos).setFrameId(inputFrameId("Update Frame ID: "));
            this.get(pos).setEngineId(inputEngineId("Update Engine ID: "));
            return true;
        }
    }

    public void listCars() {
        System.out.println("List all cars");
        this.forEach((car) -> {
            System.out.println();
            System.out.println(car.screenString());            
        });
    }
    
    //id can not be empty and duplicate
    public String inputId(String msg) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(msg);
            String brandId = sc.nextLine();
            if (brandId.isEmpty()) {
                System.out.println("Invalid value!");
            } else {
                if (searchId(brandId) != -1) {
                    System.out.println("Car ID already exist");
                } else {
                    return brandId;
                }
            }
        } while (true);
    }

    //string can not be empty
    public String inputString(String msg) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(msg);
            String str = sc.nextLine();
            if (!str.isEmpty()) {
                return str;
            } else {
                System.out.println("Invalid value!");
            }
        } while (true);
    }

    //frameID must be in "F00000" format
    public String inputFrameId(String msg) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(msg);
            String str = sc.nextLine();
            if (!str.isEmpty()) {
                if (str.matches("[fF][\\d]{5}")) {
                    return str.toUpperCase();
                } else {
                    System.out.println("Invalid value!");
                }
            } else {
                System.out.println("Invalid value!");
            }
        } while (true);
    }
    
    //engineID must be in "E00000" format
    public String inputEngineId(String msg) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(msg);
            String str = sc.nextLine();
            if (!str.isEmpty()) {
                if (str.matches("[eE][\\d]{5}")) {
                    return str.toUpperCase();
                } else {
                    System.out.println("Invalid value!");
                }
            } else {
                System.out.println("Invalid value!");
            }
        } while (true);
    }

}
