/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.String_method;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class join_ {
//Java String join()
//The Java String join() method returns a new string with the given elements joined with the specified delimiter.
// 
//The syntax of the string join() method is either:
//
//String.join(CharSequence delimiter, 
//            Iterable elements)
// 
//String.join(CharSequence delimiter, 
//            CharSequence... elements)
//        
//Here, ... signifies there can be one or more CharSequence.
//
//Note: join() is a static method. You do not need to create a string object to call this method. 
//Rather, we call the method using the class name String.    
    
    
    
//join() Parameters
//The join() method takes two parameters.
//
//delimiter - the delimiter to be joined with the elements
//elements - elements to be joined
//Notes:
//
//You can pass any class that implements CharSequence to join().
//If an iterable is passed, its elements will be joined. The iterable must implement CharSequence.
//String, StringBuffer, CharBuffer etc. are CharSequence as these classes implement it.
//join() Return Value
//returns a string    
    
    public void ex1(){
        String result;

        result = String.join("-", "Java", "is", "fun");
        System.out.println(result);  // Java-is-fun
    }
    public void ex2(){
        ArrayList<String> text = new ArrayList<>();

        // adding elements to the arraylist
        text.add("Java");
        text.add("is");
        text.add("fun");

        String result;

        result = String.join("-", text);
        System.out.println(result);  // Java-is-fun
    }
 
    public static void main(String[] args) {
        join_ e = new join_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }                
    
    
     
    
    
}
