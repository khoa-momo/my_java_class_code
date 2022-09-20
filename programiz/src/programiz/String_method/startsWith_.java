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
public class startsWith_ {
//The Java String startsWith() method checks whether the string begins with the specified string or not.
// 
//The syntax of the string startsWith() method is:
//
//string.startsWith(String str, int offset)
//Here, string is an object of the String class.    
    
    public void ex1(){
        String str = "Java Programming";

        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java Program")); // true

        System.out.println(str.startsWith("java")); // false
        System.out.println(str.startsWith("ava")); // false
    }
    public void ex2(){
        String str = "Java Programming";

        // checks in substring "a Programming"
        System.out.println(str.startsWith("Java", 3)); // false
        System.out.println(str.startsWith("a Pr", 3)); // true
    }
 
    public static void main(String[] args) {
        startsWith_ e = new startsWith_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }           
    
    
      
}
