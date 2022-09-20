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
public class toLowerCase_ {
//The Java String toLowerCase() method converts all characters in the string to lower case characters.
// 
//The syntax of the string toLowerCase() method is:
//
//string.toLowerCase()
//Here, string is an object of the String class.

    public void ex1(){
        String str1 = "Learn Java";
        String str2 = "Java123";

        // convert to lower case letters
        System.out.println(str1.toLowerCase()); // "learn java"
        System.out.println(str2.toLowerCase()); // "java123"
    } 
 
    public static void main(String[] args) {
        toLowerCase_ e = new toLowerCase_();
        e.ex1(); 
        System.out.println(); 
    }           
}
