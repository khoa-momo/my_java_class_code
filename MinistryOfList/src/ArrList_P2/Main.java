/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrList_P2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner; 
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
   
        List<Wand> WandList = new ArrayList(); 
        WandList.add(new Wand("Wa86", "Olivander", "Ron", 21));
        WandList.add(new Wand("Wa45", "Olivander", "Bill", 12));  
          
//        System.out.println(list.toString());
        Scanner sc = new Scanner(System.in);

         
//        //sort func 1
//        Collections.sort(WandList, new Comparator<Wand>() {
//            @Override
//            public int compare(Wand o1, Wand o2) {
//                return o1.getWandId().compareTo(o2.getWandId());
//            }
//        });
//        
//        System.out.println("---------------------------------");
//        System.out.println("List after sorted by WandId");
//        for (Wand o : WandList){ 		      
//            System.out.println(o); 	
//        }    
        
//        //sort func 2
//        Collections.sort(WandList, new Comparator<Wand>() {
//            @Override
//            public int compare(Wand o1, Wand o2) {
//                return o1.getMaker().compareTo(o2.getMaker());
//            }
//        });
//        
//        System.out.println("---------------------------------");
//        System.out.println("List after sorted by Maker");
//        for (Wand o : WandList){ 		      
//            System.out.println(o); 		
//        }       
        
//        //sort func 3
//        Collections.sort(WandList, new Comparator<Wand>() {
//            @Override
//            public int compare(Wand o1, Wand o2) {
//                return o1.getOwner().compareTo(o2.getOwner());
//            }
//        });        
//        
//        System.out.println("---------------------------------");
//        System.out.println("List after sorted by Owner");
//        for (Wand o : WandList){ 		      
//            System.out.println(o); 	
//        } 
    
//        //sort func 4
//        Collections.sort(WandList, new Comparator<Wand>() {
//            @Override
//            public int compare(Wand o1, Wand o2) {
//                return (int) (o1.getPrice() - o2.getPrice());
//            }
//        });
//        
//        System.out.println("---------------------------------");
//        System.out.println("List after sorted by price");
//        for (Wand o : WandList){ 		      
//            System.out.println(o); 		
//        }


        //Remove  
        System.out.println("The mark to remove: "); 
        float price = sc.nextFloat();
//        int size = list.size();
        for (int i = 0; i < WandList.size(); i++) {    //size
            if (WandList.get(i).getPrice() == price) {
                WandList.remove(i);  
                break;
            }
        } 
        
        System.out.println("---------------------------------");
        System.out.println("List after sb was remove");        
        for (Wand o : WandList){ 		      
            System.out.println("WandId: " +o.getWandId()+ "Maker: " +o.getMaker()+ "\tOwner: " +o.getOwner()+ "\tOwner: " +o.getPrice()); 		
        }      
        
        
        System.out.println("The mark to remove people that have smaller mark: "); 
        float price2 = sc.nextFloat(); 
        for (int i = 0; i < WandList.size(); i++) {     // De i < size --> bi loi
            if (WandList.get(i).getPrice() <= price2) {
                WandList.remove(i); 
                i--;
//                list.remove(list.get(i)); 
            }
        } 
        
        System.out.println("---------------------------------");
        System.out.println("List after sb was remove bc their mark smaller than");        
        for (Wand o : WandList){ 		      
            System.out.println("WandId: " +o.getWandId()+ "Maker: " +o.getMaker()+ "\tOwner: " +o.getOwner()+ "\tOwner: " +o.getPrice()); 		
        }             
        
        
        
    }//main 
}//class


