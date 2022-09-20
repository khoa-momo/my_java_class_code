/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
/**
 *
 * @author DELL
 */
public class ArrListscan {
    public static void main(String[] args) {
        // Creating arraylist
        
        List<String> list = new ArrayList<String>();
        
        // Add objects to arraylist
        list.add("Java");
        list.add("C++");
        list.add("PHP");
         
        // Show list
        System.out.println("\nCác phần tử có trong list là: ");  
        System.out.println(list);
//        [Java, C++, PHP]
         
        // Show list by for loop
        System.out.println("\nCác phần tử có trong list bang for loop: ");  
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        Java
//        C++
//        PHP
        
        for (String language : list) {
          System.out.print(list); 
        }
        
    }//end main
}
