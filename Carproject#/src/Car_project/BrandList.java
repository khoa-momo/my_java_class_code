/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car_project; 
import java.io.BufferedReader; 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.PrintWriter; 
//
import java.io.IOException;  
import java.io.FileNotFoundException; 
import java.util.logging.Level;
import java.util.logging.Logger; 
//
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BrandList extends ArrayList<Brand>{
    //Default Constructor
    public BrandList(){
        super();
    } 
     
    //load file
    public boolean loadFromFile(String filename) throws FileNotFoundException, IOException{
        try{
            File file = new File(filename);
            if(file == null){
                return false;
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data = "";
                while((data = br.readLine()) != null){ 
                    String[] token = data.split(", ");
                    String brandID = token[0];
                    String brandName = token[1]; 
                    String[] token2 = token[2].split(": "); 
                    String soundBrand = token2[0];
                    double price = Double.parseDouble(token2[1]);
                    Brand brand = new Brand(brandID, brandName, soundBrand, price);
                    this.add(brand);      
                } 
                br.close();
                fr.close();
                return true;                
            }
        }catch (FileNotFoundException ex){
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e){
            System.out.println(e);
            return false;  
        }
        return true;
    }
    
    //savefile
    public boolean saveToFile(String filename) throws FileNotFoundException, IOException{
        if (this.size() == 0) {
            System.out.println("The list is empty!");
            return false;
        }
        try {
            File file = new File(filename);
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);   
            for (Brand brand : this) {
               pw.write(brand.toString() + "\n"); 
            }            
            pw.close();
            fw.close();
        }catch (FileNotFoundException ex){
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e) {
            System.out.println(e);
            return false; 
        }
        return true;
    }
     
    public Brand getUserChoice(){
        Menu mnu = new Menu();
        return (Brand)mnu.ref_getChoice(this);
    }     
        
    //search Brand
    public int searchID(String ID){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getBrandID().equals(ID)){
                return i; //ID is existed
            }
        } 
        return -1; //ID is not duplicated
    }
       
    //add Brand
    public void addBrand(){
        String brandID;
        String brandName;
        String soundBrand;
        double price;
        Scanner scanner = new Scanner(System.in); 
        
        //Input brand ID
        do{
            System.out.print("Enter brand ID: ");
            brandID = scanner.nextLine().trim();
            if(searchID(brandID) == -1) {
                break;
            }else{
                System.out.print("ID is already used, please re-enter.\n");
            }
        }while(brandID.isEmpty()); 
        
        //Input brand name
        do{
            System.out.print("Enter brand name: ");
            brandName = scanner.nextLine().trim();
            if(brandName.isEmpty()){
                System.out.println("Invalid input! Input is blank.");
            }
        }while(brandName.isEmpty()); 
        
        //Input brand sound
        do{
            System.out.print("Enter sound brand: ");
            soundBrand = scanner.nextLine().trim();
            if(soundBrand.isEmpty()){
                System.out.println("Invalid input! Input is blank.");
            }
        }while(soundBrand.isEmpty()); 
        
        //Input price
        do{            
            System.out.print("Enter price: ");
            price = Double.parseDouble(scanner.nextLine().trim());
            if(price < 0){
                System.out.println("Invalid input! Price have to be positive.");
            }
        }while(price < 0);
        
        //Add section
        Brand brand = new Brand(brandID, brandName, soundBrand, price); 
        this.add(brand);
        System.out.println("Brand " +brandID+ " has been added!");        
    } 
     
    //Update Brand
    public void updateBrand(){
        String brandName;
        String soundBrand;
        double price;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand ID: ");
        String brandID = scanner.nextLine().trim();  
        
        if(searchID(brandID) < 0){
            System.out.println("-This brand ID not existed!-\n");
        }else{
            int index = this.searchID(brandID);
            this.get(index); 
            //update brand name
            do{
                System.out.print("Enter brand name: ");
                brandName = scanner.nextLine().trim();
                this.get(index).setBrandName(brandName);
                if(brandName.isEmpty()){
                    System.out.println("Invalid input! Input is blank.");
                }
            }while(brandName.isEmpty());
            //update brand sound
            do{
                System.out.print("Enter brand sound: ");
                soundBrand = scanner.nextLine().trim();
                this.get(index).setSoundBrand(soundBrand);
                if(soundBrand.isEmpty()){
                    System.out.println("Invalid input! Input is blank.");
                }
            }while(soundBrand.isEmpty()); 
            //update price
            do{            
                System.out.print("Enter price: ");
                price = Double.parseDouble(scanner.nextLine().trim());
                this.get(index).setPrice(price);
                if(price < 0){
                    System.out.println("Price has to be positive.");
                }
            }while(price < 0); 
            System.out.println("Brand " +brandID+ " has been updated!");
        }        
    } 
     
    //list Brands
    public void listBrands(){
        if(this.isEmpty()) 
            System.out.println("Empty list!");
        else{ 
            int n = this.size();
            for (int i = 0; i < n; i++) {
                System.out.println(this.get(i));
            }       
        }        
    }
 
}//end
