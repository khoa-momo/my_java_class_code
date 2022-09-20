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
public class indexOf_ {
//Java String indexOf()
//The String indexOf() method returns the index of the first occurrence of the specified character/substring within the string.
// 
//The syntax of the String indexOf() method either
//
//string.indexOf(int ch, int fromIndex)
//or
//
//string.indexOf(String str, int fromIndex)
//Here, string is an object of the String class.    
    
    
//indexOf() Parameters
//To find the index of a character, indexOf() takes these two parameters:
//
//ch - the character whose starting index is to be found
//fromIndex (optional) - if fromIndex is passed, the ch character is searched starting from this index
//To find the index of the specified substring within the string, indexOf() takes these two parameters:
//
//str - the string whose starting index is to be found
//fromIndex (optional) - if fromIndex is passed, the str string is searched starting from this index
//indexOf() Return Value
//returns the index of the first occurrence of the specified character/string
//returns -1 if the specified character/string is not found.    
    
    public void ex1(){ 
        String str1 = "Learn Java";
        int result;

        // getting index of character 'J'
        result = str1.indexOf('J');
        System.out.println(result); // 6

        // the first occurrence of 'a' is returned
        result = str1.indexOf('a');
        System.out.println(result); // 2

        // character not in the string
        result = str1.indexOf('j');
        System.out.println(result); // -1

        // getting the index of "ava"
        result = str1.indexOf("ava");
        System.out.println(result); // 7

        // substring not in the string
        result = str1.indexOf("java");
        System.out.println(result); // -1

        // index of empty string in the string
        result = str1.indexOf("");
        System.out.println(result); // 0
    }
    
    public void ex2(){ 
        String str1 = "Learn Java programming";
        int result;

        // getting the index of character 'a'
        // search starts at index 4
        result = str1.indexOf('a', 4);
        System.out.println(result); // 7

        // getting the index of "Java"
        // search starts at index 8
        result = str1.indexOf("Java", 8);
        System.out.println(result); // -1
    }
   
 
public static void main(String[] args) {
        indexOf_ e = new indexOf_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println();  
    }     
    
    
}
