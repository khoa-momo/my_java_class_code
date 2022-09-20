/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrList_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Num {
    public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList();
 
    num.add(1);
    num.add(-9);
    num.add(20);
    System.out.println("ArrayList: " + num); 
 
    num.add(1, 90);
    System.out.println("Updated ArrayList: " + num);    
    
    Collections.sort(num);
    System.out.println("2nd Updated ArrayList (sort 1): " + num);    
    
    int max = Collections.max(num);
    System.out.println("Max: " + max);        
     
    int min = Collections.min(num);
    System.out.println("Max: " + min);        
    
    
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Add a new number (to the end): "); 
    n = sc.nextInt();
    num.add(n);
    System.out.println("3rd Updated ArrayList: " + num);
    
    
    int size;
    System.out.print("Chose size: "); 
    size = sc.nextInt();    
    for(int i=0; i<size; i++){
        System.out.printf("Nhap so thu %d: ",i+1); 
        n = sc.nextInt();
        num.add(n);        
    }
    
    System.out.println("4th Updated ArrayList: " + num);
     
    Collections.sort(num);
    System.out.println("5th Updated ArrayList(sort 2): " + num);        
    
    
    //remove  
    int a = num.remove(0);
    System.out.println("The num that is removed: " + a);
    System.out.println("6th Updated ArrayList(remove 1st number): " + num);
    
    int c;
    System.out.println("Chose the place to remove num: ");
    c = sc.nextInt();   
    int b = num.remove(c);
    System.out.println("The num that is removed: " + b);
    System.out.println("7th Updated ArrayList(remove the numbet that stay at "+c+" place): " + num);   
    
    
    //update
    num.set(0, 3);
    System.out.println("8th Updated ArrayList(change num 1st to 3: " + num);
    
    
    
    
    
    }//end class
}//end main
