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
public class intern_ {
//The Java String intern() method returns a canonical representation of the string object.
// 
//The syntax of the string intern() method is: 
//string.intern()
//Here, string is an object of the String class.    
    
//    String str1 = new String("xyz");
//    String str2 = new String("xyz");
//
//
//    System.out.println(str1 == str2); // false    
    
    public void ex1(){ 
        String str1 = new String("xyz");
        String str2 = new String("xyz");

        // str1 and str2 doesn't share the same memory pool
        System.out.println(str1 == str2); // false

        // using the intern() method
        // now both str1 and str2 share the same memory pool
        str1 = str1.intern();
        str2 = str2.intern();

        System.out.println(str1 == str2); // true
    } 
    
 
    public static void main(String[] args) {
        intern_ e = new intern_();
        e.ex1(); 
        System.out.println(); 
    }               
}
