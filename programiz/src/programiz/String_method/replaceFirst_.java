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
public class replaceFirst_ {
//Java String replaceFirst()
//The Java String replaceFirst() method replaces the first substring that matches the regex of the string with the specified text.
//
//
//The syntax of the replaceFirst() method is:
//
//string.replaceFirst(String regex, String replacement)
//Here, string is an object of the String class.
//
//replaceFirst() Parameters
//The replaceFirst() method takes two parameters.
//
//regex - a regex (can be a typical string) that is to be replaced
//replacement - the first matching substring is replaced with this string
//replaceFirst() Return Value
//The replaceFirst() method returns a new string where the first occurrence 
//of the matching substring is replaced with the replacement string.    
    
    public void ex1(){
        String str1 = "aabbaaac";
        String str2 = "Learn223Java55@";

        // regex for sequence of digits
        String regex = "\\d+";

        // the first occurrence of "aa" is replaced with "zz"
        System.out.println(str1.replaceFirst("aa", "zz")); // zzbbaaac

        // replace the first sequence of digits with a whitespace
        System.out.println(str2.replaceFirst(regex, " ")); // Learn Java55@
    }
    
//Escaping Characters in replaceFirst()
//The replaceFirst() method can take a regex or a typical string as the first argument. It is because a typical string in itself is a regex.
//
//In regex, there are characters that have special meaning. These metacharacters are:
//
//\ ^ $ . | ? * + {} [] ()
//If you need to match substring containing these metacharacters, you can escape these characters using \.    
    
    public void ex2(){
        String str = "a+a-++b";

        // replace the first "+" with "#"
        System.out.println(str.replaceFirst("\\+", "#")); // a#a-++b
    }
 
    public static void main(String[] args) {
        substring_ e = new substring_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }            
    
}
