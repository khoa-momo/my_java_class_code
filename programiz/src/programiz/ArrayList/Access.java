/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author DELL
 */
public class Access {
  public static void main(String[] args) {
//    ArrayList<String> animals = new ArrayList();
//
//    // add elements in the arraylist
//    animals.add("Cat");
//    animals.add("Dog");
//    animals.add("Cow");
//    System.out.println("ArrayList: " + animals);
//
//    // get the element from the arraylist
//    String str = animals.get(1);
//    System.out.print("Element at index 1: " + str);


        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Sunday");
        arrlist.add("Monday");
        arrlist.add("Tuesday");
        arrlist.add("Wednesday");
        arrlist.add("Thursday");
        arrlist.add("Friday");
        arrlist.add("Saturday");

        //using just print 
        System.out.println("\n1.Using Just print:");
        System.out.println(arrlist);
        
        //using for loop 
        System.out.println("\n2.Using For Loop:");
        for (int i=0; i<arrlist.size(); i++){ 		      
            System.out.println(arrlist.get(i)); 		
        }   		

        //using for-each loop
        System.out.println("\n3.Using For-each loop:");		
        for (String str : arrlist){ 		      
            System.out.println(str); 		
        }

        //using iterator
        System.out.println("\n4.Using Iterator:");
        Iterator itr = arrlist.iterator();
        while(itr.hasNext()){
            Object a = itr.next();
            System.out.println(a);
        }
        
        //Using list_iterator 
        Iterator<String> litr = arrlist.listIterator();
        System.out.println("\n5.Using list iterator");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }    
  }//main    
}//class

