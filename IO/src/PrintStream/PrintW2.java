/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintStream;

import java.io.PrintWriter;

/**
 *
 * @author DELL
 */
public class PrintW2 {
  public static void main(String[] args) {

    try {
      PrintWriter output = new PrintWriter("PrintW2.txt");

      int age = 25; 
      output.printf("I am %d years old.", age);
      output.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }    
}
