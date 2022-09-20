/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrList_basic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class Str_print {
    public static void main(String[] args) {
        
        ArrayList<String> arrlist = new ArrayList();
        arrlist.add("Sunday");
        arrlist.add("Monday");
        arrlist.add("Tuesday");
        arrlist.add("Wednesday");
        arrlist.add("Thursday");
        arrlist.add("Friday");
        arrlist.add("Saturday");

        //1-using just print 
        System.out.println("\n1.Using Just print:");
        System.out.println(arrlist);
        
        //2-using for loop 
        System.out.println("\n2.Using For Loop:");
        for (int i=0; i<arrlist.size(); i++){ 		      
            System.out.println(arrlist.get(i)); 		
        }   		

        //3-using for-each loop
        System.out.println("\n3.Using For-each loop:");		
        for (String str : arrlist){ 		      
            System.out.println(str); 		
        }

        //4-using iterator
        System.out.println("\n4.Using Iterator:");
        Iterator itr = arrlist.iterator();
        while(itr.hasNext()){
            Object a = itr.next();
            System.out.println(a);
        }
        
        //5-Using list_iterator 
        Iterator<String> litr = arrlist.listIterator();
        System.out.println("\n5.Using list iterator");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }    
  }//main           
        
//        // Creating arraylist
//        List<String> list_str = new ArrayList();
//        // Add objects to arraylist
//        list_str.add("Java");
//        list_str.add("C++");
//        list_str.add("PHP");
//         
//        // Show list
//        System.out.println("\nCác phần tử có trong list là: ");  
//        System.out.println(list_str);
//         
//        // Show list by for loop
//        System.out.println("\nCác phần tử có trong list là: ");  
//        for (int i = 0; i < list_str.size(); i++) {
//            System.out.println(list_str.get(i));
//        }
//         
//        // Show list through for-each loop
//        System.out.println("\nCác phần tử có trong list là: ");  
//        for (String str : list_str) {
//            System.out.println(str);
//        }
//        
//        // Show list by iterator
//        Iterator<String> iterator = list_str.iterator();
//        System.out.println("\nCác phần tử có trong list là: ");
//        while (iterator.hasNext()) {
//            System.out.println((String) iterator.next());
//        }
//        
//        // Show list by iteratorlist
//        System.out.println("\nCác phần tử có trong list là: ");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }//end     
