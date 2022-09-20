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
import java.util.Scanner;

/**
 *
 * @author win
 */
public class BrandList extends ArrayList<Brand> {

    public BrandList() { 
    }

    public boolean loadFromFile(String FileName) {
        try {
            File f = new File(FileName); 
            if (f == null) {
                return false; 
            } else {
                FileReader fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
                //
                String detail = "";
                //
                while ((detail = bf.readLine()) != null) {
                    
                    String[] br = detail.split(", ");
                    //
                    String brandID = br[0];
                    String brandName = br[1];
                    
                    ////////////////////////////////////////////////////////////
                    
                    String[] sbr = br[2].split(": ");
                    //
                    String soundbrand = sbr[0];
                    double price = Double.parseDouble(sbr[1]);
                    
                    ///////////////////////////////////////////////////////////////
                    Brand brand = new Brand(brandID, brandName, soundbrand, price);
                    this.add(brand);
                }
                bf.close();
                fr.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }// 
    public boolean saveToFile(String FileName) {
        if (this.size() == 0) {
            System.out.println("Empty list!");
            return false;
        }
        ////////////////////////////////////////////////////////////////////////
        try {
            File f = new File(FileName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            
            ////////////////////////////////////////////////////////////////////
            for (Brand brand : this) {
                pw.println(brand.getBrandID() + ", " + brand.getBrandName() + ", " + brand.getSoundbrand() + ": " + brand.getPrice());
            }
            ////////////////////////////CLOSING/////////////////////////////////
            pw.close();
            fw.close();
            return true; 
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }//

      
    public Brand getUserChoice() {
        menu mnu = new menu();
        return (Brand) mnu.ref_getChoice(this);
    }
 
    public int searchID(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBrandID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }   
    
/////////////THE VOID///////////////    
    public void addBrand() {
        String brandID;
        String brandName;
        String soundbrand;
        double price;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String ID: ");
            brandID = sc.nextLine();
            if (searchID(brandID) == -1) {
                break;
            }
        } while (true);

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter brandName: ");
            brandName = sc.nextLine();
        } while (brandName.equals(""));

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter soundbrand: ");
            soundbrand = sc.nextLine();
        } while (soundbrand.equals(""));

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter price: ");
            price = sc.nextDouble();
        } while (price <= 0);

        Brand b = new Brand(brandID, brandName, soundbrand, price);
        this.add(b);

    }

    public void updateBrand() {
        String brandName;
        String soundbrand;
        double price;

        System.out.println("Enter update brandID: ");
        Scanner sc = new Scanner(System.in);
        int Pos = searchID(sc.nextLine());
        
        if (Pos < 0) {
            System.out.println("Not Found!");
        } else {
            do {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter brandName: ");
                brandName = sc1.nextLine();
            } while (brandName.equals(""));

            do {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter soundbrand: ");
                soundbrand = sc2.nextLine();
            } while (soundbrand.equals(""));

            do {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter price: ");
                price = sc3.nextDouble();
            } while (price <= 0);

            this.get(Pos).setBrandName(brandName);
            this.get(Pos).setSoundbrand(soundbrand);
            this.get(Pos).setPrice(price);
        }
    }

    public void listBrands() {
        int n = this.size();
        for (int i = 0; i < n; i++) {
            System.out.println(this.get(i));
        }
    }
}
