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
public class charAt_ {
//The Java String charAt() method returns the character at the specified index.
// 
//The syntax of the string charAt() method is:
//
//string.charAt(int index)
//Here, string is an object of the String class.    
    
    public void ex1(){
        String str1 = "Learn Java";
        String str2 = "Learn\nJava";

        // first character
        System.out.println(str1.charAt(0)); // 'L'

        // seventh character
        System.out.println(str1.charAt(6)); // 'J'

        // sixth character
        System.out.println(str2.charAt(5)); // '\n'
    } 
 
    public static void main(String[] args) {
        charAt_ e = new charAt_();
        e.ex1(); 
        System.out.println(); 
    }           
     
}
