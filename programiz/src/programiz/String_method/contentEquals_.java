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
public class contentEquals_ {
//The Java String contentEquals() method checks whether the contents of the String 
//is equal to the specified charSequence/StringBuffer or not.
//
//The syntax of the string contentEquals() method is:
//
//string.contentEquals(StringBuffer sb)
//string.contentEquals(charSequence cs)
//Here, string is an object of the String class.

//contentEquals() Parameters
//The contentEquals() method takes a single parameter.
//
//either StringBuffer or charSequence
//Note: You can pass any class that implements charSequence to the contentEquals() method. 
//    For example: String, StringBuffer, CharBuffer etc.
//
//contentEquals() Return Value
//Returns true if the string contains the same sequence of characters as the specified parameter. If not, returns false.


    public void ex1(){
        String str = "Java";

        String str1 = "Java";
        StringBuffer sb1 = new StringBuffer("Java");
        CharSequence cs1 = "Java";

        String str2 = "JavA";
        StringBuffer sb2 = new StringBuffer("JavA");
        CharSequence cs2 = "JavA";

        System.out.println(str.contentEquals(str1)); // true
        System.out.println(str.contentEquals(sb1)); // true
        System.out.println(str.contentEquals(cs1)); // true

        System.out.println(str.contentEquals(str2)); // false
        System.out.println(str.contentEquals(sb2)); // false
        System.out.println(str.contentEquals(cs2)); // false
    }
    
//Java String equals() Vs contentEquals()
//The Java String equals() method not only compares the content, but also checks if the other object is an instance of String.
//However, contentEquals() only compares the content. For example, 


    public void ex2(){
        String str1 = "Java";
        StringBuffer sb1 = new StringBuffer("Java");

        System.out.println(str1.equals(sb1)); // false
        System.out.println(str1.contentEquals(sb1)); // true
    }
 
    public static void main(String[] args) {
        contentEquals_ e = new contentEquals_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }                
}
