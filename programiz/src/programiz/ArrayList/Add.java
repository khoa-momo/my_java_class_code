/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.ArrayList;
import java.util.ArrayList;
import java.util.Collections; 

/**
 *
 * @author DELL
 */
public class Add {
  public static void main(String[] args){
//    // create ArrayList
//    ArrayList<String> languages = new ArrayList();
//
//    // add() method without the index parameter
//    languages.add("Java");
//    languages.add("C");
//    languages.add("Python");
//    System.out.println("ArrayList: " + languages);
//
//    // add() method with the index parameter
//    languages.add(1, "JavaScript");
//    System.out.println("Updated ArrayList: " + languages);
    

 
    ArrayList<Integer> num = new ArrayList<>();
 
    num.add(1);
    num.add(-9);
    num.add(20);
    System.out.println("ArrayList: " + num); 
 
    num.add(1, 90);
    System.out.println("Updated ArrayList: " + num);    
    
    Collections.sort(num);
    System.out.println("2nd Updated ArrayList: " + num);    
    
    int max = Collections.max(num);
    System.out.println("Max: " + max);        
     
    int min = Collections.min(num);
    System.out.println("Max: " + min);        
    
    
    
  }//main    
}
