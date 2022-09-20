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
public class hashCode_ {
//The Java String hashCode() method returns a hash code for the string.
//
//
//A hashcode is a number (object's memory address) generated from any object, 
//not just strings. This number is used to store/retrieve objects quickly in a hashtable.
//
//The syntax of the string hashCode() method is:
//
//string.hashCode()
//Here, string is an object of the String class.

//hashCode() Return Value
//returns the hashcode, which is an int value, of the string
//The hash code is computed using formula:
//
//s[0]*31(n-1) + s[1]*31(n-2) + ... + s[n-1]    
    
    
    public void ex1(){
        String str1 = "Java";
        String str2 = "Java Programming";
        String str3 = "";

        System.out.println(str1.hashCode()); // 2301506
        System.out.println(str2.hashCode()); // 1377009627

        // hash code of empty string is 0
        System.out.println(str3.hashCode()); // 0
    } 
 
public static void main(String[] args) {
        hashCode_ e = new hashCode_();
        e.ex1(); 
        System.out.println(); 
    }                
}
