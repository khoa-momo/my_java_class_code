/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author DELL
 */
public class IO2 {
    public static void main(String[] args) {
    
    // Creates an array of character
    char[] array = new char[1000];

    try {
      // Creates a FileReader
      FileReader file = new FileReader("File cars.txt");

      // Creates a BufferedReader
      BufferedReader input = new BufferedReader(file);

      // Reads characters
      input.read(array);
      System.out.println("Data in the file: ");
      System.out.println(array);

      // Closes the reader
      input.close();
    } 
    catch(Exception e) {
      e.getStackTrace();
    }    
    }    
}
