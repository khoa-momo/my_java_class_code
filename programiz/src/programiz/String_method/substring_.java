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
public class substring_ {
//The syntax of the substring() method is:
//
//string.substring(int startIndex, int endIndex)
//Here, string is an object of the String class.
//
//substring() Parameters
//The substring() method takes two parameters.
//
//startIndex - the begining index
//endIndex (optional) - the ending index
//substring() Return Value
//The substring() method returns a substring from the given string.
//
//The substring begins with the character at the startIndex and extends to the character at index endIndex - 1.
//If the endIndex is not passed, the substring begins with the character at the specified index and extends to the end of the string.


    public void ex1(){
        String str1 = "program";

        // from the first character to the end
        System.out.println(str1.substring(0));  // program 
        // from the 4th character to the end
        System.out.println(str1.substring(3));  // gram
    }
    public void ex2(){
        String str1 = "program";

        // from 1st to the 7th  character
        System.out.println(str1.substring(0, 7));  // program 
        // from 1st to the 5th  character
        System.out.println(str1.substring(0, 5));  // progr 
        // from 4th to the 5th character
        System.out.println(str1.substring(3, 5));  // gr
    }
 
    public static void main(String[] args) {
        substring_ e = new substring_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }            
}
