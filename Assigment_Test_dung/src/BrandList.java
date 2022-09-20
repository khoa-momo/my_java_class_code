/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmanager;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TIEN DUNG
 */
public class BrandList extends ArrayList<Brand>{
//
    public BrandList() {
        super();
    }
    
    public boolean loadFromFile(String filename){
        File f = new File(filename);
        if(f == null){
            return false;
        }else{
            FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            int data = fis.read();
            StringBuilder sb = new StringBuilder();
            String line;
            while (data != -1) {
                if (((char) data == '\n') || ((char) data == '\r')) {
                    line = sb.toString();
                    String[] s = line.split(",");
                    String brandID = s[0].trim();
                    String brandName = s[1]; 
                    String[] s1 = s[2].split(":");
                    String soundBrand=s1[0];            
                    double price = Double.parseDouble(s1[1]);
                    Brand b = new Brand(brandID,brandName,soundBrand,price);
                    this.add(b);
                    sb.delete(0, sb.length());
                    data = fis.read();
                }
                sb.append((char) data);
                data = fis.read();
            }
                  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
        return true;
}
    
    
//   
    public boolean saveToFile(String filename){
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(filename,false));
            String data = new String();
            for (int i = 0; i < this.size(); i++) {
                data += this.get(i);
            }
            dos.writeBytes(data);
            dos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if(dos != null){
                    dos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true; 
    }
//    
    public int searchID(String bID){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getBrandID().equals(bID)){
                return i;
            }
        } 
        return -1;
    }
//   
    public Brand getUserChoice(){
        Menu mnu = new Menu();
        return (Brand)mnu.ref_getChoice(this);
    }
//    
    public void addBrand(){
        Scanner sc = new Scanner(System.in);
        String ID;
        do{
            System.out.print("ID: ");
            ID = sc.nextLine().trim();
            if(searchID(ID) > 0){
                System.out.println("ID is duplicated.");
            }
        }while(searchID(ID) > 0);
        String brandName;
        do{
            System.out.print("Brand name: ");
            brandName = sc.nextLine();
            if(brandName.isEmpty()){
                System.out.println("The brand name is not blank.");
            }
        }while(brandName.isEmpty());
        
        String soundBrand;
        do{
            System.out.print("Sound brand: ");
            soundBrand = sc.nextLine();
            if(soundBrand.isEmpty()){
                System.out.println("The ound brand is not blank.");
            }
        }while(soundBrand.isEmpty());
        double price;
        do {            
            System.out.print("Price: ");
            price = sc.nextDouble();
            if(price < 0){
                System.out.println("Price > 0.");
            }
        } while(price < 0);
        
        Brand brand = new Brand(ID,brandName,soundBrand,price);
        
        this.add(brand);
        System.out.println("Brand new has been added");
    }
//    
    public void updateBrand(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Receive brand ID: ");
        String brandID = sc.nextLine();
        brandID = brandID.trim();
        if(searchID(brandID) < 0){
            System.out.println("Not found!");
        }else{
            int b = this.searchID(brandID);
            this.get(b);
            String brandName;
            do{
                System.out.print("Brand name: ");
                brandName = sc.nextLine();
                this.get(b).setBrandName(brandName);
                if(brandName.isEmpty()){
                    System.out.println("The brand name is not blank.");
                }
            }while(brandName.isEmpty());

            String soundBrand;
            do{
                System.out.print("Sound brand: ");
                soundBrand = sc.nextLine();
                this.get(b).setSounBrand(soundBrand);
                if(soundBrand.isEmpty()){
                    System.out.println("The ound brand is not blank.");
                }
            }while(soundBrand.isEmpty());
            double price;
            do {            
                System.out.print("Price: ");
                price = sc.nextDouble();
                this.get(b).setPrice(price);
                if(price < 0){
                    System.out.println("Price > 0.");
                }
            } while(price < 0);

            System.out.println("Brand new has been updated");
        }
    }
    
//
    public void listBrands(){
        for (Brand brand : this) {
            System.out.println(brand);
        }
    }
    
}
