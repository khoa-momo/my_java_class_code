/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.String_method;

/**
 *
 * @author DELL
 */
public class isEmpty_ {
//The Java String isEmpty() method checks whether the string is empty or not. 
//The syntax of the string isEmpty() method is: 
//string.isEmpty()
//Here, string is an object of the String class.
//    
//isEmpty() Parameters
//The isEmpty() method does not take any parameters.
//
//isEmpty() Return Value
//returns true if the string is empty (length is 0)
//returns false if the string is not empty

    public void ex1(){ 
        String str1 = "Java Programming";
        String str2 = "";

        System.out.println(str1.isEmpty()); // false
        System.out.println(str2.isEmpty()); // true
    } 
    
 
    public static void main(String[] args) {
        isEmpty_ e = new isEmpty_();
        e.ex1(); 
        System.out.println(); 
    }           
     
}