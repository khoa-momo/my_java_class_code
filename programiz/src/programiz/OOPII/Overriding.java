/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.OOPII;

/**
 *
 * @author DELL
 */
public class Overriding {
    
}
//Example 1: Method Overriding
class Animal_5 {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}
class Dog_5 extends Animal_5 {
   @Override
   public void displayInfo() {
      System.out.println("I am a dog."); //**
   }
}
class Main_5 {
   public static void main(String[] args) {
      Dog_5 d1 = new Dog_5();
      d1.displayInfo();
   }
}

//Java Overriding Rules
//Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
//We cannot override the method declared as final and static.
//We should always override abstract methods of the superclass (will be discussed in later tutorials).


//super Keyword in Java Overriding
//Example 2: Use of super Keyword
class Animal_6 {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}
class Dog_6 extends Animal_6 {
   public void displayInfo() {
      super.displayInfo();  //--> I am an animal
      System.out.println("I am a dog.");
   }
}
class Main_6 {
   public static void main(String[] args) {
      Dog_6 d1 = new Dog_6();
      d1.displayInfo();
   }
}


//**Access Specifiers in Method Overriding
//We can only use those access specifiers in subclasses that provide larger access 
//than the access specifier of the superclass.
//Suppose, a method myClass() in the superclass is declared protected. 
//Then, the same method myClass() in the subclass can be either public or protected, but not private.

//Example 3: Access Specifier in Overriding
class Animal_7 {
   protected void displayInfo() {
      System.out.println("I am an animal.");
   }
}
class Dog_7 extends Animal_7 {
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}
class Main_7 {
   public static void main(String[] args) {
      Dog_7 d1 = new Dog_7();
      d1.displayInfo();
   }
}


