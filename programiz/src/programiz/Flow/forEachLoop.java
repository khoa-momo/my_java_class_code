/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.Flow;

/**
 *
 * @author DELL
 */
public class forEachLoop {
 public static void main(String[] args) {
 
    // create an array
    int[] numbers = {3, 9, 5, -5};
    
    // for each loop 
    for (int number: numbers) {
      System.out.println(number);
    }  
    
    
    System.out.println(); 
    System.out.println(); 
    char[] vowels = {'a', 'e', 'i', 'o', 'u'}; 
    for (int i = 0; i < vowels.length; ++ i) {
     System.out.println(vowels[i]); 
    }
    System.out.println(); 
   // iterating through an array using a for loop
    for (int i = 0; i < vowels.length; ++ i) {  
     System.out.println(vowels);
    } 
    System.out.println(); 
    System.out.println();     
       // iterating through an array using the for-each loop
    for (char item: vowels) {
     System.out.println(item);
    }
 }    
}
