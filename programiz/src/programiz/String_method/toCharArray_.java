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
public class toCharArray_ {
//The Java String toCharArray() method converts the string to a char array and returns it.
// 
//The syntax of the toCharArray() method is:
//
//string.toCharArray(int startIndex, int endIndex)
//Here, string is an object of the String class.


    public void ex1(){
        String str = "Java Programming";

        // creating a char array
        char[] result;

        result = str.toCharArray();
        System.out.println(result); // Java Programming
    } 
 
    public static void main(String[] args) {
        toCharArray_ e = new toCharArray_();
        e.ex1(); 
        System.out.println(); 
    }            
 
 
}
