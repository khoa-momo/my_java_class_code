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
public class subSequence_ {
//The Java String subSequence() method returns a character sequence (a subsequence) from the string.
 
//The syntax of the subSequence() method is:
//
//string.subSequence(int startIndex, int endIndex)
//Here, string is an object of the String class.

    
    public void ex1(){
        String str = "Java Programming";
        System.out.println(str.subSequence(3, 8)); // a Pro
    } 
    
    public static void main(String[] args) {
        startsWith_ e = new startsWith_();
        e.ex1(); 
        System.out.println(); 
    }           
        
    
    
}
