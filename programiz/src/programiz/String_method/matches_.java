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
public class matches_ {
//The Java String matches() method checks whether the string matches the given regular expression or not.
// 
//The syntax of the string matches() method is:
//
//string.matches(String regex)
//Here, string is an object of the String class.  
    
    public void ex1(){ 
        // five letter string that starts with 'a' and end with 's'
        String regex = "^a...s$";

        System.out.println("abs".matches(regex)); // false
        System.out.println("alias".matches(regex)); // true
        System.out.println("an abacus".matches(regex)); // false
        System.out.println("abyss".matches(regex)); // true
    }
    
    
    public void ex2(){ 
        // a search pattern for only numbers
        String regex = "^[0-9]+$";

        System.out.println("123a".matches(regex)); // false
        System.out.println("98416".matches(regex)); // true
        System.out.println("98 41".matches(regex)); // false
    }
 
    public static void main(String[] args) {
        matches_ e = new matches_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }          
    
    
    
    
}
