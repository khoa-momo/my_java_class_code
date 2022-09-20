/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.String_method;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class getBytes_ {
//The Java String getBytes() method encodes the string into a sequence of bytes and stores it in a byte array.
// 
//The syntax of the String getBytes() method are:
//
//string.getBytes()
//string.getBytes(Charset charset)
//string.getBytes(String charsetName)
//Here, string is an object of the String class. 
//The getBytes() method returns a byte array.    
    
//1. getBytes() Without Any Parameters
//If you do not pass any parameters, getBytes() encodes the string using the platform's default charset.    
    
    public void ex1(){
        String str = "Java";
        byte[] byteArray;

        // convert the string to a byte array
        // using platform's default charset
        byteArray = str.getBytes();
        System.out.println(Arrays.toString(byteArray));
    }
    
    
    public void ex2(){
        String str = "Java";
        byte[] byteArray;

        // using UTF-8 for encoding
        byteArray = str.getBytes(Charset.forName("UTF-8"));
        System.out.println(Arrays.toString(byteArray));

        // using UTF-16 for encoding
        byteArray = str.getBytes(Charset.forName("UTF-16"));
        System.out.println(Arrays.toString(byteArray));
    }
 
    public void ex3(){
        String str = "Java";
        byte[] byteArray;

        try {
          byteArray = str.getBytes("UTF-8");
          System.out.println(Arrays.toString(byteArray));

          byteArray = str.getBytes("UTF-16");
          System.out.println(Arrays.toString(byteArray));

          // wrong encoding
          // throws an exception
          byteArray = str.getBytes("UTF-34");
          System.out.println(Arrays.toString(byteArray));

        } catch (Exception e) {
          System.out.println(e + " encoding is wrong");
        }
        
    }
    
    public static void main(String[] args) {
        getBytes_ e = new getBytes_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
        e.ex3();
        System.out.println();         
    }         
}
