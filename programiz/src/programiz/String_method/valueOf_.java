/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.String_method;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class valueOf_ {
//The Java String valueOf() method returns the string representation of the argument passed. 
//
//The syntax of the String valueOf() method for different data types is:
//
//String.valueOf(boolean b)
//String.valueOf(char c)
//String.valueOf(char[] data)
//String.valueOf(double d)
//String.valueOf(float f)
//String.valueOf(int b)
//String.valueOf(long l)
//String.valueOf(Object o)
//Here, valueOf() is a static method. We call the valueof() method using the class name like this: String.valueOf(b);
    
    
    //Java String valueOf() for Numbers
    public void ex1(){
        int a = 5;
        long l = -2343834L;
        float f = 23.4f;
        double d = 923.234d;

        // convert numbers to strings
        System.out.println(String.valueOf(a));  // "5"
        System.out.println(String.valueOf(l));  // "-2343834"
        System.out.println(String.valueOf(f));  // "23.4"
        System.out.println(String.valueOf(d));  // "923.234"
    }
    
    //Convert char and char array to String
    public void ex2(){
        char c = 'J';
        char ch[] = {'J', 'a', 'v', 'a'};

        // convert char to string
        System.out.println(String.valueOf(c));  // "J"

        // convert char array to string
        System.out.println(String.valueOf(ch));  // "Java"
    }
 
//Convert subarray of the char Array to String
//You can also convert a subarray of a character array to string. For this, we use this syntax.
//
//valueOf(char[] data, int offset, int length)    
    
    public void ex3(){
        char ch[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int offset = 2;
        int length = 4;
        String result;

        // subarray {'o', 'g', 'r', 'm'} is converted to string
        result = String.valueOf(ch, offset, length);
        System.out.println(result);  // "ogrm"
    }

    public void ex4(){
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");

        String result;

        // Output: "[Java, Python, Kotlin]"
        result = String.valueOf(languages);
        System.out.println(result);
    }

    
    public static void main(String[] args) {
        valueOf_ e = new valueOf_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
        e.ex3(); 
        System.out.println();
        e.ex4();
        System.out.println();         
    }           
    
    
}
