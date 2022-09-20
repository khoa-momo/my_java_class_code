/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;

import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;

import java.io.PrintWriter;

import java.io.FileNotFoundException;
import java.io.IOException; 

import java.util.logging.Level;
import java.util.logging.Logger;

//////////////////////////
import java.util.ArrayList;
import java.util.Scanner;
import model.Brand;

/**
 *
 * @author letha
 */
public class BrandList extends ArrayList<Brand> {

    public BrandList() {
    }

    public boolean loadFromFile(String fileName) {
        
        File file = new File(fileName); 
        //check file existt?
        if(!file.exists()){
            return false;
        }
        
        ////////////////////////////////////////////////////////////////////////
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            //read line in file
            while ((line = br.readLine()) != null) {
                 
                //get properties of brand \\\\\\ READ....???????
                String[] arr = line.split("[,:]");
                //
                String brandId = arr[0].trim();
                String brandName = arr[1].trim();
                String soundBrand = arr[2].trim();
                double price = Double.parseDouble(arr[3].trim());
                
                
                //add brand to the list
                this.add(new Brand(brandId, brandName, soundBrand, price));
            }
        //    
        //    
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
        
    }//   
    
    public boolean savetoFile(String fileName) {
        File file = new File(fileName);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(file));
            for (Brand brand : this) {
                //write brand to the file
                pw.write(brand.toString() + "\n");
            }
        } catch (IOException ex) {
            return false;
        } finally {
            pw.close();
        }
        return true;
    }

    public Brand getUserChoice() {
        Menu menu = new Menu();
        return (Brand) menu.ref_getChoice(this);
    }
    
    
    public int searchId(String brandId) {
        for (int i = 0; i < this.size(); i++) {
            //compare inputted brandId with brandId of each item in the list
            if (this.get(i).getBrandId().equals(brandId)) {
                return i;//return position
            }
        }
        return -1;
    }
 
 
////////////////////////////////////THE VOID/////////////////////////////////////        
    public void addBrand() {
        String brandId, brandName, soundBrand; double price;
        
        brandId = inputId("Brand Id: ");
        brandName = inputString("Brand Name: ");
        soundBrand = inputString("Sound Brand: ");
        price = inputPrice("Price: ");
        Brand brand = new Brand(brandId, brandName, soundBrand, price);
        //add brand to the list
        this.add(brand);
    }

    public void updateBrand() {
        String brandId;
        Scanner sc = new Scanner(System.in);
        System.out.print("Brand ID: ");
        brandId = sc.nextLine();
        //find brand to update
        int pos = searchId(brandId);
        //car not found
        if (pos == -1) {
            System.out.println("Not found!");
        } else {
            this.get(pos).setBrandName(inputString("Update Brand Name: "));
            this.get(pos).setSoundBrand(inputString("Update Sound Brand: "));
            this.get(pos).setPrice(inputPrice("Update Price: "));
        }
    }
 
    public void listBrands() {
        System.out.println("List all brands");
        this.forEach((brand) -> {
            System.out.println(brand);
        });
    }  
    
//////////////////////////////////INPUT CONDITION////////////////////////////////////////////////    
    //string can not be blank
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
   
    //price must be number and greater than 0
    public double inputPrice(String msg) {
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(msg);
                double price = sc.nextDouble();
                if (price <= 0) {
                    throw new Exception();
                }
                return price;
            } catch (Exception e) {
                System.out.println("Invalid value!");
            }
        } while (true);
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
                    System.out.println("Brand ID already exist");
                } else {
                    return brandId;
                }
            }
        } while (true);
    }
}
