/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Func;

/**
 *
 * @author DELL
 */
public class Calling_constructor {
     int sum;

  // first constructor
  Calling_constructor() {
    // calling the second constructor
    this(5, 2);
  }

  // second constructor
  Calling_constructor(int arg1, int arg2) {
    // add two value
    this.sum = arg1 + arg2;
  }

  void display() {
    System.out.println("Sum is: " + sum);
  }

  // main class
  public static void main(String[] args) {

    // call the first constructor
    Calling_constructor obj = new Calling_constructor();

    // call display method
    obj.display();
  }
}



//Example 2: Call the constructor of the superclass from the constructor of the child class
//We can also call the constructor of the superclass from the constructor of child class using super().

// superclass
//class Languages { 
//  // constructor of the superclass
//  Languages(int version1, int version2) { 
//    if (version1 > version2) {
//      System.out.println("The latest version is: " + version1);
//    } 
//    else {
//      System.out.println("The latest version is: " + version2);
//    }
//
//  }
//} 
//// child class
//class Main extends Languages { 
//  // constructor of the child class
//  Main() {
//    // calling the constructor of super class
//    super(11, 8);
//  } 
//  // main method
//  public static void main(String[] args) { 
//    // call the first constructor
//    Main obj = new Main(); 
//  }
//}