/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.Exceptions;

/**
 *
 * @author DELL
 */
public class try_catch {
//        try {
//          // code
//        }
//        catch(Exception e) {
//          // code
//        }
    
  public static void main(String[] args) {

    try {

      // code that generate exception
      int divideByZero = 5 / 0;
      System.out.println("Rest of code in try block");
    }
    
    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
  }    
    
    
//        try {
//          //code
//        }
//        catch (ExceptionType1 e1) { 
//          // catch block
//        }
//        finally {
//          // finally block always executes
//        }    
    
     
//  public static void main(String[] args) {
//    try {
//      // code that generates exception
//      int divideByZero = 5 / 0;
//    }
//
//    catch (ArithmeticException e) {
//      System.out.println("ArithmeticException => " + e.getMessage());
//    }
//    
//    finally {
//      System.out.println("This is the finally block");
//    }
//  }    
//    
//Output
//
//ArithmeticException => / by zero
//This is the finally block    
    

//  3. Java throw and throws keyword
//The Java throw keyword is used to explicitly throw a single exception.
//
//When we throw an exception, the flow of the program moves from the try block to the catch block.
//
//Example: Exception handling using Java throw
//class Main {
//  public static void divideByZero() {
//
//    // throw an exception
//    throw new ArithmeticException("Trying to divide by 0");
//  }
//
//  public static void main(String[] args) {
//    divideByZero();
//  }
//}
//Output
//
//Exception in thread "main" java.lang.ArithmeticException: Trying to divide by 0
//        at Main.divideByZero(Main.java:5)
//        at Main.main(Main.java:9)
    
    
//Example: Java throws keyword
//import java.io.*;
//
//class Main {
//  // declareing the type of exception
//  public static void findFile() throws IOException {
//
//    // code that may generate IOException
//    File newFile = new File("test.txt");
//    FileInputStream stream = new FileInputStream(newFile);
//  }
//
//  public static void main(String[] args) {
//    try {
//      findFile();
//    }
//    catch (IOException e) {
//      System.out.println(e);
//    }
//  }
//}
//Output
//
//java.io.FileNotFoundException: test.txt (The system cannot find the file specified)    
    
    
    
}
