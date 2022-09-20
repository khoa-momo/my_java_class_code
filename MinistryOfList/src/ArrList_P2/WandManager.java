/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrList_P2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class WandManager {   

    public void display(List<Wand> WandList){
        System.out.println("---------------------------------");
        System.out.println("The list: ");
        for (Wand o : WandList){ 		      
            System.out.println("WandId: " +o.getWandId()+ "Maker: " +o.getMaker()+ "\tOwner: " +o.getOwner()+ "\tOwner: " +o.getPrice()); 		
        }           
    }
    
    public void add(List<Wand> WandList){
        //Add
        Scanner sc = new Scanner(System.in);
        System.out.print("Add more how many wand: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("*Infor of student "+i+1);
           
            System.out.print("Enter WandId: ");
            String WandId = sc.next();  
            
            System.out.print("Enter Maker: ");
            String Maker = sc.next();
            
            System.out.print("Enter Owner: ");
            String Owner = sc.next();            
            
            System.out.print("Enter price: "); 
            float price = sc.nextFloat();
            WandList.add(new Wand(WandId, Maker, Owner, price));
        }
    }
        
    public void delete(List<Wand> WandList){
        
    }
    
    public void update(List<Wand> WandList){
        
        
    }

    //sort WandId
    class sortByIdWand implements Comparator<Wand> {
        @Override
        public int compare(Wand o1, Wand o2) {
            return o1.getWandId().compareTo(o2.getWandId());
        }
    } 
    public void f1(List<Wand> WandList) {
        Collections.sort(WandList, new sortByIdWand()); //sort WandId
        System.out.println("---------------------------------");
        System.out.println("List after sorted by WandId");
        for (Wand o : WandList){ 		      
            System.out.println(o); 	
        } 
    }
    
    //sort Maker
    class sortByMaker implements Comparator<Wand> {
        @Override
        public int compare(Wand o1, Wand o2) {
            return o1.getMaker().compareTo(o2.getMaker());
        }
    }        
    public void f2(List<Wand> WandList) { 
        Collections.sort(WandList, new sortByMaker()); //sort Maker
        System.out.println("---------------------------------");
        System.out.println("List after sorted by Maker");
        for (Wand o : WandList){ 		      
            System.out.println(o); 	
        } 
    }
      
    //sort Owner
    class sortByOwner implements Comparator<Wand> {
        @Override
        public int compare(Wand o1, Wand o2) {
            return o1.getOwner().compareTo(o2.getOwner());
        }
    }      
    public void f3(List<Wand> WandList) { 
    Collections.sort(WandList, new sortByOwner()); //sort Owner
        System.out.println("---------------------------------");
        System.out.println("List after sorted by Owner");
        for (Wand o : WandList){ 		      
            System.out.println(o); 	
        }
    }

    //sort Price
    class sortByPrice implements Comparator<Wand> {
        @Override
        public int compare(Wand o1, Wand o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }       
    public void f4(List<Wand> WandList) { 
    Collections.sort(WandList, new sortByOwner()); //sort Price
        System.out.println("---------------------------------");
        System.out.println("List after sorted by price");
        for (Wand o : WandList){ 		      
            System.out.println(o); 	
        }
    }  
    
    
    
    
    
}//endmain
