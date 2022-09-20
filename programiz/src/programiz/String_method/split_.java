/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.String_method;

import java.util.Arrays;

/**
 *
 * @author DELL
 */

public class split_ {

//The syntax of the string split() method is:
// string.split(String regex, int limit)
//Here, string is an object of the String class.

//split() Parameters
//The string split() method can take two parameters:
//
//regex - the string is divided at this regex (can be strings)
//limit (optional) - controls the number of resulting substrings
//If the limit parameter is not passed, split() returns all possible substrings.
//
//split() Return Value
//returns an array of substrings
//Note: If the regular expression passed to split() is invalid, the split() method raises PatternSyntaxExpression exception.

    public void ex1(){
    String vowels = "a::b::c::d:e";

    // splitting the string at "::"
    // storing the result in an array of strings
    String[] result = vowels.split("::");

    // converting array to string and printing it
    System.out.println("result = " + Arrays.toString(result));
    }
    
//split() With limit Parameter
//If the limit parameter is 0 or negative, split() returns an array containing all substrings.
//If the limit parameter is positive (let's say n), split() returns the maximum of n substrings.
    
    public void ex2(){
        String vowels = "a:bc:de:fg:h";

        // splitting array at ":"

        // limit is -2; array contins all substrings
        String[] result = vowels.split(":", -2);
        System.out.println("result when limit is -2 = " + Arrays.toString(result));

        // limit is 0; array contains all substrings
        result = vowels.split(":", 0);
        System.out.println("result when limit is 0 = " + Arrays.toString(result));

        // limit is 2; array contains a maximum of 2 substrings
        result = vowels.split(":", 2);
        System.out.println("result when limit is 2 = " + Arrays.toString(result));

        // limit is 4; array contains a maximum of 4 substrings
        result = vowels.split(":", 4);
        System.out.println("result when limit is 4 = " + Arrays.toString(result));

        // limit is 10; array contains a maximum of 10 substrings
        result = vowels.split(":", 10);
        System.out.println("result when limit is 10 = " + Arrays.toString(result));        
    }
    
    public void ex3(){
        String vowels = "a+e+f";

        // splitting the string at "+"
        String[] result = vowels.split("\\+");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));        
    }
    
public static void main(String[] args) {
        split_ e = new split_();
        e.ex1();
        //result = [a, b, c, d:e]
        System.out.println();
        e.ex2();
        System.out.println();     
        e.ex3();
        //result = [a, e, f]
        System.out.println(); 
    }
















}