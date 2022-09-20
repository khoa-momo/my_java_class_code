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
public class compareTo_ {
    
// The syntax of the compareTo() method is:
//
//string.compareTo(String str)
//Here, string is an object of the String class.
//
//compareTo() Parameters
//The compareTo() method takes a single parameter.
//
//str - the string to be compared
//compareTo() Return Value
//returns 0 if the strings are equal
//returns a negative integer if the string comes before the str argument in the dictionary order
//returns a positive integer if the string comes after the str argument in the dictionary order

    
    public void ex1(){
        String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kolin";
        int result;

        // comparing str1 with str2
        result = str1.compareTo(str2);
        System.out.println(result); // 0

        // comparing str1 with str3
        result = str1.compareTo(str3);
        System.out.println(result); // -1

        // comparing str3 with str1
        result = str3.compareTo(str1);
        System.out.println(result); // 1        
    }   
    
    public void ex2(){
        String str1 = "Learn Python";
        String str2 = "Learn Java";
        
        // if str1 and str2 are equal, the result is 0
        if (str1.compareTo(str2) == 0) {
            System.out.println("str1 and str2 are equal");
        }
        else {
            System.out.println("str1 and str2 are not equal");
        }   
    
    }
    
    public void ex3(){
        String str1 = "Learn Java";
        String str2 = "learn Java";
        int result;

        // comparing str1 with str2
        result = str1.compareTo(str2);
        System.out.println(result); // -32        
        
    }
//When "Learn Java" is compared to "learn Java", 
//we do not get 0. It is because compareTo() takes the letter case into consideration.
//
//Notes: 
//If you need to compare two strings ignoring case differences, use the Java String compareToIgnoreCase() method.
//If you pass null to the compareTo() method, you will get an error.

    
    
    
    
    
    
public static void main(String[] args) {
        compareTo_ e = new compareTo_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }    
    
}
