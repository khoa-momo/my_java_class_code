/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Final;
import java.io.BufferedReader; 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.PrintWriter; 
import java.io.FileNotFoundException;
import java.io.IOException;  
import java.util.logging.Level;
import java.util.logging.Logger; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class CarList extends ArrayList<Car>{ 
    BrandList brandList;
    
    public CarList(BrandList bList) {
        this.brandList = bList;
    }
    
    public CarList() {
    }
    
    public boolean loadFromFile(String fileName) throws FileNotFoundException, IOException{
        try{
            File file = new File(fileName);
            if(file == null){
                return false;
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String data = "";
                while((data = br.readLine()) != null){ 
                    String[] token = data.split(", ");
                    String carID = token[0];   
                    String brandId = token[1].trim();
                    Brand brand = brandList.get(brandList.searchID(brandId)); 
                    String color = token[2];
                    String frameID = token[3];
                    String engineID = token[4];  
                    Car car = new Car(carID, brand, color, frameID, engineID);
                    this.add(car);      
                } 
                fr.close();
                br.close(); 
                return true;                
            }
        }  catch (FileNotFoundException ex){
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (Exception e){
            System.out.println(e);
            return false;  
        } 
        return true;
    } 
    
    public boolean saveToFile(String FileName) throws FileNotFoundException, IOException{
        if (this.size() == 0) {
            System.out.println("The list is empty!");
            return false;
        }
        try {
            File file = new File(FileName);
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);   
            for (Car c : this) {
               pw.write(c.toString() + "\n"); 
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
  
    //SEARCHING
    public int searchID (String ID){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCarID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }
    
    public int searchFrame (String fID){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getFrameID().equals(fID)) {
                return i;
            }
        }
        return -1;
    }
    
    public int searchEngine (String eID){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getEngineID().equals(eID)) {
                return i;
            }
        }
        return -1;
    } 
   
    public void printBasedBrandName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a part of Car's name to search: ");
        String aPartOfBrandName = scanner.nextLine();
        int n = this.size();
        System.out.println("--Searching result--");
        int check = 0; 
            for (int i = 0; i < n; i++) {
                Car c = this.get(i);
                if (c.getBrand().getBrandName().contains(aPartOfBrandName)) {
                    System.out.println(c.screenString());
                    check++;
                }
            }    
        if (check == 0) {
               System.out.println("This car not existed.");
           }       
    }//
     
    public void addCar(){
        String carID; 
        String color;
        String frameID;
        String engineID; 
        Scanner scanner = new Scanner(System.in);
        
        //Input car ID
        do{
            System.out.print("Enter car ID: ");
            carID = scanner.nextLine().trim();
            if(searchID(carID) == -1) {
                break;
            }else{
                System.out.print("This Car ID is already used, please re-enter.\n");
            }
        }while(true);   
          
        //List brand choice
        Menu menu = new Menu(); 
        Brand brand = (Brand)menu.ref_getChoice(brandList);

        //Input car color
        do{
            System.out.print("Enter car color: ");
            color = scanner.nextLine().trim();
            if(color.isEmpty()){
                System.out.println("Invalid input! Input is blank.");
            }
        }while(color.isEmpty()); 
    
        //Input car frameID
        do{ 
            do{
                System.out.print("Enter frameID: ");
                frameID = scanner.nextLine().trim();
                if(searchID(frameID) == -1) {
                    break;
                }else{
                    System.out.print("This frameID is already used, please re-enter.\n");
                }
            }while(true); 
         }while (!frameID.matches("[fF][\\d]{5}"));
     
        //Input car engineID
        do{ 
            do{
                System.out.print("Enter engineID: ");
                engineID = scanner.nextLine().trim();
                if(searchID(engineID) == -1) {
                    break;
                }else{
                    System.out.print("This engineID is already used, please re-enter.\n");
                }
            }while(true); 
        }while (!engineID.matches("[eE][\\d]{5}"));
        
        //Add new car
        Car car = new Car(carID, brand, color, frameID, engineID); 
        this.add(car);    
        System.out.print("New car has been added!\n");
    } 
    
    
    public boolean removeCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CarID to remove: ");
        String removedID = sc.nextLine();
        int position = searchID(removedID);
        if(position < 0) {
            System.out.println("Not found!");
            return false;
        }else{
            this.remove(position);
        }
        return true; 
    }
    
    public boolean updateCar(){ 
        String color;
        String frameID;
        String engineID; 
        Scanner scanner = new Scanner(System.in);
        
        //Input car ID   
        System.out.print("Updated ID: ");
        String updatedID = scanner.nextLine();
        updatedID = updatedID.trim(); 
        
        if(searchID(updatedID) < 0){
            System.out.println("Not found!");
            return false;
        }else{
            int car = this.searchID(updatedID);
            this.get(car);
            System.out.println("Chose a Brand: ");
            Brand brand = (Brand)Menu.ref_getChoice(brandList);
            this.get(car).setBrand(brand);
         
            //Input car color
            do{
                System.out.print("Update car color to: ");
                color = scanner.nextLine().trim();
                this.get(car).setColor(color);
                if(color.isEmpty()){
                    System.out.println("Invalid input! Input is blank.");
                }
            }while(color.isEmpty());  
            //Input car frameID
            do{ 
                do{
                    System.out.print("Update frameID to: ");
                    frameID = scanner.nextLine().trim();
                    if(searchID(frameID) == -1) {
                        break;
                    }else{
                        System.out.print("This frameID is already used, please re-enter.\n");
                    }
                }while(true); 
                this.get(car).setFrameID(frameID);
             }while (!frameID.matches("[fF][\\d]{5}")); 
            //Input car engineID
            do{ 
                do{
                    System.out.print("Update engineID to: ");
                    engineID = scanner.nextLine().trim();
                    if(searchID(engineID) == -1) {
                        break;
                    }else{
                        System.out.print("This engineID is already used, please re-enter.\n");
                    }
                }while(true); 
                this.get(car).setEngineID(engineID);
            }while (!engineID.matches("[eE][\\d]{5}")); 
        }//
        return true;
    }     
    
    public void listCars(){
        Collections.sort(this);
        int n = this.size();
        for (int i = 0; i < n; i++) {
            Car c = this.get(i);
            System.out.println(c.screenString());
        }   
    }
    
}//
