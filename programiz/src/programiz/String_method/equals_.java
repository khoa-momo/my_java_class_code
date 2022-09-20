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
public class equals_ {
//The Java String equals() method returns true if two strings are equal. If not, equals() returns false. 
//The syntax of the String equals() method is:
//
//string.equals(String str)
//Here, string is an object of the String class.    
//equals() Parameters
//The equals() method takes a single parameter.
//
//str - the string to be compared
//equals() Return Value
//returns true if the strings are equal
//returns false if the strings are not equal
//returns false if the str argument is null
      
    public void ex1(){ 
        String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kolin";
        Boolean result; 
        // comparing str1 with str2
        result = str1.equals(str2);
        System.out.println(result); // true 
        // comparing str1 with str3
        result = str1.equals(str3);
        System.out.println(result); // false 
        // comparing str3 with str1
        result = str3.equals(str1);
        System.out.println(result); // false        
    }    
    
    public void ex2(){ 
        String str1 = "Learn Python";
        String str2 = "Learn Java";
        
        // if str1 and str2 are equal, the result is true
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        }
        else {
            System.out.println("str1 and str2 are not equal");
        }        
    }
    
    public void ex3(){ 
        String str1 = "Learn Java";
        String str2 = "learn Java";
        Boolean result; 
        // comparing str1 with str2
        result = str1.equals(str2);
        System.out.println(result); // false        
    }
 
public static void main(String[] args) {
        equals_ e = new equals_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
        e.ex3();
        System.out.println();         
    }      
    
}
