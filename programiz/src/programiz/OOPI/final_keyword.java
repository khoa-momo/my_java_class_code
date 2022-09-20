/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.OOPI;

/**
 *
 * @author DELL
 */
public class final_keyword {
    
}
//In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.
//
//Once any entity (variable, method or class) is declared final, it can be assigned only once. That is,
//
//the final variable cannot be reinitialized with another value
//the final method cannot be overridden
//the final class cannot be extended

//1. Java final Variable
//In Java, we cannot change the value of a final variable. For example,

//class final_ex {
//  public static void main(String[] args) {
//
//    // create a final variable
//    final int AGE = 32;
//
//    // try to change the final variable
//    AGE = 45;
//    System.out.println("Age: " + AGE);
//  }
//}  error

//In Java, the final method cannot be overridden by the child class. For example,
//
//class FinalDemo {
//    // create a final method
//    public final void display() {
//      System.out.println("This is a final method.");
//    }
//}
//class Main extends FinalDemo {
//  // try to override final method
//  public final void display() {
//    System.out.println("The final method is overridden.");
//  }
//  public static void main(String[] args) {
//    Main obj = new Main();
//    obj.display();
//  }
//}


//In Java, the final class cannot be inherited by another class. For example,
//
//// create a final class
//final class FinalClass {
//  public void display() {
//    System.out.println("This is a final method.");
//  }
//}
//
//// try to extend the final class
//class Main extends FinalClass {
//  public  void display() {
//    System.out.println("The final method is overridden.");
//  }
//
//  public static void main(String[] args) {
//    Main obj = new Main();
//    obj.display();
//  }
//}

