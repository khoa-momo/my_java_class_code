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
public class concat_ {
//TheThe Java String concat() method concatenates (joins) two strings and returns it.
// 
//The syntax of the string concat() method is:
//
//string.concat(String str)
//Here, string is an object of the String class.    
     
    public void ex1(){
        String str1 = "Learn ";
        String str2 = "Java";  
        System.out.println(str1.concat(str2)); // "Learn Java"  
        System.out.println(str2.concat(str1)); // "JavaLearn "
    }
 
//Using + Operator for Concatenation
//In Java, you can also use the + operator to concatenate two strings.    
    
    public void ex2(){
        String str1 = "Learn ";
        String str2 = "Java";  
        System.out.println(str1 + str2); // "Learn Java"  
        System.out.println(str2 + str1); // "JavaLearn "
    }
    
// concat() Vs the + Operator for Concatenation
//concat()	the + Operator
//Suppose, str1 is null and str2 is "Java". Then, str1.concat(str2) throws NullPointerException.	
//Suppose, str1 is null and str2 is "Java". Then, str1 + str2 gives "nullJava".
//You can only pass a String to the concat() method.	
//         
//If one of the operands is a string and another is a non-string value. 
//The non-string value is internally converted to a string before concatenation. For example, "Java" + 5 gives "Java5".
    
    public static void main(String[] args) {
        concat_ e = new concat_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }           
     
}
