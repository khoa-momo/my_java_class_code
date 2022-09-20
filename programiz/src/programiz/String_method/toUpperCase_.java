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
public class toUpperCase_ {
//The Java String toUpperCase() method converts all characters in the string to upper case characters.
// 
//The syntax of the string toUpperCase() method is:
//
//string.toUpperCase()  
    
    public void ex1(){
        String str1 = "Learn Java";
        String str2 = "Java123";

        // convert to upper case letters
        System.out.println(str1.toUpperCase()); // "LEARN JAVA"
        System.out.println(str2.toUpperCase()); // "JAVA123"
    } 
 
    public static void main(String[] args) {
        toUpperCase_ e = new toUpperCase_();
        e.ex1(); 
        System.out.println(); 
    }               
}
