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
public class trim_ {
//The Java String trim() method returns a string with any leading (starting) and trailing (ending) whitespace removed.
// 
//The syntax of the string trim() method is:
//
//string.trim()
//Here, string is an object of the String class.
//
//trim() Parameters
//the trim() method doesn't take any parameters

    public void ex1(){
        String str1 = "     Learn   Java Programming ";
        String str2 = "Learn\nJava Programming\n\n   ";

        System.out.println(str1.trim());
        System.out.println(str2.trim());
    }
    
//Remove All Whitespace Characters
//If you need to remove all whitespace characters from a string,
//you can use the String replaceAll() method with proper regex.    
    
    public void ex2(){
        String str1 = "Learn\nJava \n\n   ";
        String result;

        // replace all whitespace characters with empty string
        result = str1.replaceAll("\\s", "");
        System.out.println(result);  // LearnJava
    }
 
    public static void main(String[] args) {
        trim_ e = new trim_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }           
}
