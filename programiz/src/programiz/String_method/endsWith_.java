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
public class endsWith_ {
//The Java String endsWith() method checks whether the string ends with the specified string or not.
// 
//The syntax of the string endsWith() method is: 
//string.endsWith(String str)
//Here, string is an object of the String class.    
    
    public void ex1(){
        String str = "Java Programming";

        System.out.println(str.endsWith("mming")); // true
        System.out.println(str.endsWith("g")); // true
        System.out.println(str.endsWith("a Programming")); // true

        System.out.println(str.endsWith("programming")); // false
        System.out.println(str.endsWith("Java")); // false
    }
    
    public static void main(String[] args) {
        endsWith_ e = new endsWith_();
        e.ex1(); 
        System.out.println(); 
    }           
     
}
