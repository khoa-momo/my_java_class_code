/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.String;

/**
 *
 * @author DELL
 */
public class Capitalize_first_char {
    public void ex(){
    // create a string
    String name = "programiz";

    // create two substrings from name
    // first substring contains first letter of name
    // second substring contains remaining letters
    String firstLetter = name.substring(0, 1);
    String remainingLetters = name.substring(1, name.length());

    // change the first letter to uppercase
    firstLetter = firstLetter.toUpperCase(); 
    // join the two substrings
    name = firstLetter + remainingLetters;
    System.out.println("Name: " + name);        
    }   
     
    public void ex2(){
    // create a string
    String message = "everyone loves java"; 
    // stores each characters to a char array
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;

    for(int i = 0; i < charArray.length; i++) { 
      // if the array element is a letter
      if(Character.isLetter(charArray[i])) { 
        // check space is present before the letter
        if(foundSpace) { 
          // change the letter into uppercase
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      } 
      else {
        // if the new character is not character
        foundSpace = true;
      }
    } 
    // convert the char array to the string
    message = String.valueOf(charArray);
    System.out.println("Message: " + message);        
    }    
     
    
    public static void main(String[] args) {
        Capitalize_first_char e = new Capitalize_first_char();
        e.ex();
        System.out.println();
        e.ex2();
        System.out.println();  
}    
    
}
