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
public class contains_ {
//The String contains() method checks whether the specified string (sequence of characters) is present in the string or not.
// 
//The syntax of the String contains() method is:
//
//string.contains(CharSequence ch)
//Here, string is an object of the String class.

    public void ex1(){ 
        String str1 = "Learn Java";
        Boolean result;

        // check if str1 contains "Java"
        result = str1.contains("Java");
        System.out.println(result); // true

        // check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result); // false

        // check if str1 contains ""
        result = str1.contains("");
        System.out.println(result); // true
    }
    
    public void ex2(){ 
        String str1 = "Learn Java";
        String str2 = "Java";
        String str3 = "java";
        Boolean result;

        // true because "Learn Java" contains "Java"
        if (str1.contains(str2)) {
          System.out.println(str1 + " contains " + str2);
        }
        else {
          System.out.println(str1 + " doesn't contains " + str2);
        }

        // contains() is case-sensitive
        // false because "Learn Java" doesn't contains "ava"
        if (str1.contains(str3)) {
          System.out.println(str1 + " contains " + str3);
        }
        else {
          System.out.println(str1 + " doesn't contain " + str3);
        }
    }
 
public static void main(String[] args) {
        contains_ e = new contains_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println();  
    }         
}
