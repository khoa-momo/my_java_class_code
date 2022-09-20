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
public class replace_ {
//The syntax of the replace() method is either
//
//string.replace(char oldChar, char newChar)
//or
//
//string.replace(CharSequence oldText, CharSequence newText)
//Here, string is an object of the String class.
//
//replace() Parameters
//To replace a single character, the replace() method takes these two parameters:
//
//oldChar - the character to be replaced in the string
//newChar - matching characters are replaced with this character
//To replace a substring, the replace() method takes these two parameters:
//
//oldText - the substring to be replaced in the string
//newText - matching substrings are replaced with this string
//replace() Return Value
//The replace() method returns a new string where each occurrence of
//the matching character/text is replaced with the new character/text.   
    
    public void ex1(){ 
        String str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z')); // zbc cbz

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J')); // Java

        // character not in the string
        System.out.println("Hello".replace('4', 'J')); // Hello        
    }   
    
    public void ex2(){ 
        String str1 = "C++ Programming";

        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java")); // Java Programming

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
        System.out.println("Java".replace("C++", "C")); // Java        
    }    
    
     
    
    public static void main(String[] args) {
        replace_ e = new replace_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }        
    
    
    
}
