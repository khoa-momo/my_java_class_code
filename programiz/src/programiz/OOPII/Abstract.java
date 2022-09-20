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
public class Abstract {
    
}
//Java Abstract Class
//The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class. For example,
//
//// create an abstract class
//abstract class Language {
//  // fields and methods
//}
//...
//
//// try to create an object Language
//// throws an error
//Language obj = new Language(); 
//An abstract class can have both the regular methods and abstract methods. For example,
//
//abstract class Language {
//
//  // abstract method
//  abstract void method1();
//
//  // regular method
//  void method2() {
//    System.out.println("This is regular method");
//  }
//}

//Java Abstract Method
//A method that doesn't have its body is known as an abstract method. We use the same abstract keyword to create abstract methods. For example,
//
//abstract void display();
//Here, display() is an abstract method. The body of display() is replaced by ;.
//
//If a class contains an abstract method, then the class should be declared abstract. Otherwise, it will generate an error. For example,
//
//// error
//// class should be abstract
//class Language {
//
//  // abstract method
//  abstract void method1();
//}

//Example: Java Abstract Class and Method
//Though abstract classes cannot be instantiated, we can create subclasses from it. 
//We can then access members of the abstract class using the object of the subclass. For example,

abstract class Language_1 {
  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}
class Main_Ab extends Language_1 {
  public static void main(String[] args) {
    // create an object of Main
    Main_Ab obj = new Main_Ab();

    // access method of abstract class
    // using object of Main class
    obj.display();
  }
}
//Output: This is Java programming

//Implementing Abstract Methods
//If the abstract class includes any abstract method, then all the child classes inherited from
//the abstract superclass must provide the implementation of the abstract method. For example,\

abstract class Animal_Ab {
    abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
      }
}

class Dog_Ab extends Animal_Ab {
  // provide implementation of abstract method
  public void makeSound() {
    System.out.println("Bark bark");
  }
}

class Main_Ab2 {
  public static void main(String[] args) {
    // create an object of Dog class
    Dog_Ab d1 = new Dog_Ab();
    d1.makeSound();
    d1.eat();
  }
}


//Accesses Constructor of Abstract Classes
//An abstract class can have constructors like the regular class. 
//And, we can access the constructor of an abstract class from the subclass using the super keyword. For example,
//
//abstract class Animal {
//   Animal() {
//      ….
//   }
//}
//
//class Dog extends Animal {
//   Dog() {
//      super();
//      ...
//   }
//}

//Java Abstraction
//The major use of abstract classes and methods is to achieve abstraction in Java.
//
//Abstraction is an important concept of object-oriented programming that allows us 
//to hide unnecessary details and only show the needed information.
//
//This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.

//Example 3: Java Abstraction
abstract class Animal_Âb3 {
  abstract void makeSound();
}

class Dog_Âb3 extends Animal_Âb3 {
  // implementation of abstract method
  public void makeSound() {
    System.out.println("Bark bark.");
  }
}

class Cat extends Animal_Âb3 {
  // implementation of abstract method
  public void makeSound() {
    System.out.println("Meows ");
  }
}

class Main_Âb3 {
  public static void main(String[] args) {
    Dog_Âb3 d1 = new Dog_Âb3();
    d1.makeSound();
    Cat c1 = new Cat();
    c1.makeSound();
  }
}

//Note: We can also use interfaces to achieve abstraction in Java. 


//Key Points to Remember
//We use the abstract keyword to create abstract classes and methods.
//An abstract method doesn't have any implementation (method body).
//A class containing abstract methods should also be abstract.
//We cannot create objects of an abstract class.
//To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
//
//A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, 
//it's not mandatory to override abstract methods.
//
//We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,
//Animal.staticMethod();








