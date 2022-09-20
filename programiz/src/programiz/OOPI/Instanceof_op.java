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
public class Instanceof_op {
    
}

//The instanceof operator in Java is used to check whether 
//an object is an instance of a particular class or not.
//Its syntax is:
//              objectName instanceOf className;
//Here, if objectName is an instance of className, 
//the operator returns true. Otherwise, it returns false.

class Ex1 {
  public static void main(String[] args) {

    // create a variable of string type
    String name = "Programiz";
    
    // checks if name is instance of String
    boolean result1 = name instanceof String;
    System.out.println("name is an instance of String: " + result1);

    // create an object of Main
    Ex1 obj = new Ex1();

    // checks if obj is an instance of Main
    boolean result2 = obj instanceof Ex1;
    System.out.println("obj is an instance of Ex1: " + result2);
  }
}

////Java instanceof during Inheritance 
// Java Program to check if an object of the subclass
// is also an instance of the superclass

// superclass
class Animal {
}
// subclass
class Dog extends Animal {
}
class instanceof_Inhe {
  public static void main(String[] args) {
    // create an object of the subclass
    Dog d1 = new Dog();
    // checks if d1 is an instance of the subclass
    System.out.println(d1 instanceof Dog);        // prints true
    // checks if d1 is an instance of the superclass
    System.out.println(d1 instanceof Animal);     // prints true
  }
}

//Java instanceof in Interface
//The instanceof operator is also used to check whether an object of a class 
//is also an instance of the interface implemented by the class. For example,

// Java program to check if an object of a class is also
//  an instance of the interface implemented by the class

//interface Animal {
//}
//
//class Dog implements Animal {
//}
//class Main {
//  public static void main(String[] args) {
//
//    // create an object of the Dog class
//    Dog d1 = new Dog();
//
//    // checks if the object of Dog
//    // is also an instance of Animal
//    System.out.println(d1 instanceof Animal);  // returns true
//  }
//}