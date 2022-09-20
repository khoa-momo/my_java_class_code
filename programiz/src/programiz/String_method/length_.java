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
public class length_ {
//The syntax of the length() method is:
//
//string.length()
//Here, string is an object of the String class.
//
//length() Parameters
//The length() method doesn't take any parameters.    
    
    public void ex1(){ 
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10         
    }
      
public static void main(String[] args) {
        length_ e = new length_();
        e.ex1(); 
        System.out.println(); 
    }        
}
