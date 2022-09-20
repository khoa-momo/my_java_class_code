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
public class replaceAll_ {
//The syntax of the replaceAll() method is:
//
//string.replaceAll(String regex, String replacement)
//Here, string is an object of the String class.
//
//replaceAll() Parameters
//The replaceAll() method takes two parameters.
//
//regex - a regex (can be a typical string) that is to be replaced
//replacement - matching substrings are replaced with this string
//replaceAll() Return Value
//The replaceAll() method returns a new string where each occurrence 
//of the matching substring is replaced with the replacement string.

    public void ex1(){
        String str1 = "aabbaaac";
        String str2 = "Learn223Java55@";

        // regex for sequence of digits
        String regex = "\\d+"; 
        // all occurrences of "aa" is replaceAll with "zz"
        System.out.println(str1.replaceAll("aa", "zz")); // zzbbzzac 
        // replace a digit or sequence of digits with a whitespace
        System.out.println(str2.replaceAll(regex, " ")); // Learn Java @
    }
    
    public void ex2(){
        String str1 = "+a-+b";
        String str2 = "Learn223Java55@";
        String regex = "\\+"; 
        // replace "+" with "#" using replaceAll()
        // need to espace "+"
        System.out.println(str1.replaceAll("\\+", "#")); // #a-#b 
        // replace "+" with "#" using replace() 
        System.out.println(str1.replace("+", "#")); // #a-#b        
    }
    
public static void main(String[] args) {
        replaceAll_ e = new replaceAll_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }        
 

    
}
