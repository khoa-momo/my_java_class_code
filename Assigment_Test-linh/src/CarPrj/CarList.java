/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarPrj;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

import java.util.regex.Pattern;

/**
 *
 * @author win
 */
public class CarList extends ArrayList<Car> {

    BrandList brandList;

    public CarList(BrandList brandList) {
        this.brandList = brandList;
    }

    public CarList() {
    }

    public boolean loadFromFile(String FileName) {
        try {
            File f = new File(FileName);
            if (f == null) {
                return false;
            } else {
                FileReader fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
                String detail = "";
                while ((detail = bf.readLine()) != null) {
                    String[] cl = detail.split(", ");
                    String carID = cl[0];
                    
                    int position = brandList.searchID(cl[1]);
                    Brand brand = brandList.get(position);
                    
                    String color = cl[2];
                    String frameID = cl[3];
                    String engineID = cl[4];

                    Car c = new Car(carID, brand, color, frameID, engineID);
                    this.add(c);
                }
                bf.close();
                fr.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean saveToFile(String FileName) {
        if (this.size() == 0) {
            System.out.println("Empty list!");
            return false;
        }
        try {
            File f = new File(FileName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Car c : this) {
                pw.println(c.getCarID() + ", " + c.getBrand().getBrandID() + ", " + c.getColor() + ", " + c.getFrameID() + ", " + c.getEngineID());
            }
            pw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    ///////////////////////////////SEARCHING///////////////////////////////////////
    public int searchID(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCarID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchFrame(String fID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getFrameID().equals(fID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchEngine(String eID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getEngineID().equals(eID)) {
                return i;
            }
        }
        return -1;
    }

    
    
    public void addCar() {
        String carID;
        Brand brand;
        String color;
        String frameID;
        String engineID;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String ID: ");
            carID = sc.nextLine();
            if (searchID(carID) == -1) {
                break;
            }
        } while (true);

        do { 
            System.out.println("Select a Brand: ");
            BrandList b = new BrandList();
            brand = b.getUserChoice();
        } while (brand == null);

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter color: ");
            color = sc.nextLine();
        } while (color.equals(""));

        boolean checkFrame = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter frameID: ");
            frameID = sc.nextLine();
            if (Pattern.matches("[F]{1}[0-9]{5}", frameID)) {
                checkFrame = false;
            }
            if (searchFrame(frameID) == -1) {
                break;
            }
        } while (checkFrame);

        boolean checkEngine = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter engineID: ");
            engineID = sc.nextLine();
            if (Pattern.matches("[E]{1}[0-9]{5}", engineID)) {
                checkEngine = false;
            }
            if (searchEngine(engineID) == -1) {
                break;
            }
        } while (checkEngine);

        Car c = new Car(carID, brand, color, frameID, engineID);
        this.add(c);
    }

    
    
    
    public void printBasedBrandName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aPartOfBrandName: ");
        String aPartOfBrandName = sc.nextLine();
        int n = this.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            Car c = this.get(i);
            if (c.getBrand().getBrandName().contains(aPartOfBrandName)) {
                System.out.println(c.screenString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No car is detected!");
        }
    }

    public boolean removeCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter removed CarID: ");
        String removedID = sc.nextLine();
        int pos = searchID(removedID);
        if (pos < 0) {
            System.out.println("Not found!");
            return false;
        } else {
            this.remove(pos);
        }
        return true;
    }

    public boolean updateCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter update CarID: ");
        String updatedID = sc.nextLine();
        int pos = searchID(updatedID);
        if (pos < 0) {
            System.out.println("Not found!");
            return false;
        } else {
            Brand brand;
            String color;
            String frameID;
            String engineID;

            do {
                sc = new Scanner(System.in);
                System.out.println("Select a Brand: ");
                BrandList b = new BrandList();
                brand = b.getUserChoice();
            } while (brand == null);

            do {
                sc = new Scanner(System.in);
                System.out.println("Enter color: ");
                color = sc.nextLine();
            } while (color.equals(""));

            boolean checkFrame = true;
            do {
                sc = new Scanner(System.in);
                System.out.println("Enter frameID: ");
                frameID = sc.nextLine();
                if (Pattern.matches("[F]{1}[0-9]{5}", frameID)) {
                    checkFrame = false;
                }
                if (searchFrame(frameID) == -1) {
                    break;
                }
            } while (checkFrame);

            boolean checkEngine = true;
            do {
                sc = new Scanner(System.in);
                System.out.println("Enter engineID: ");
                engineID = sc.nextLine();
                if (Pattern.matches("[E]{1}[0-9]{5}", engineID)) {
                    checkEngine = false;
                }
                if (searchEngine(engineID) == -1) {
                    break;
                }
            } while (checkEngine);

            Car c = new Car(updatedID, brand, color, frameID, engineID);
            this.set(pos, c);
        }
        return true;
    }

    public void listCars() {
        Collections.sort(this);
        int n = this.size();
        for (int i = 0; i < n; i++) {
            Car c = this.get(i);
            System.out.println(c.screenString());
        }
    }
}
