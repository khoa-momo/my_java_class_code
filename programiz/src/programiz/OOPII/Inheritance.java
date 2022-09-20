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
public class Inheritance {
    
}
//Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
//The new class that is created is known as subclass (child or derived class) and the existing class from where the child class is derived is known as superclass (parent or base class).

////The extends keyword is used to perform inheritance in Java. For example,
//class Animal {
//  // methods and fields
//}
//// use of extends keyword
//// to perform inheritance
//class Dog extends Animal {
//  // methods and fields of Animal
//  // methods and fields of Dog
//}


//Example 1: Java Inheritance
class Animal {
// field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}
// inherit from Animal
class Dog extends Animal {
  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}
class Main{
  public static void main(String[] args) {
    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Rohu";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();
  }
}



//*is-a relationship
//In Java, inheritance is an is-a relationship. That is, we use inheritance 
//only if there exists an is-a relationship between two classes. For example,
//Car is a Vehicle
//Orange is a Fruit
//Surgeon is a Doctor
//Dog is an Animal

//Method Overriding in Java Inheritance
//Example 2: Method overriding in Java Inheritance

class Animal_2 {
  // method in the superclass
  public void eat() {
    System.out.println("I can eat");
  }
}
// Dog inherits Animal
class Dog_2 extends Animal_2  {
  // overriding the eat() method
  @Override
  public void eat() {
    System.out.println("I eat dog food");
  }
  // new method in subclass
  public void bark() {
    System.out.println("I can bark");
  }
}
class Main2 {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog_2 labrador = new Dog_2();

    // call the eat() method
    labrador.eat();
    labrador.bark();
  }
}


//super Keyword in Java Inheritance
//Example 3: super Keyword in Inheritance
class Animal_3 {
  // method in the superclass
  public void eat() {
    System.out.println("I can eat");
  }
}
// Dog inherits Animal
class Dog_3 extends Animal_3 {
  // overriding the eat() method
  @Override
  public void eat() {  
    // call method of superclass
    super.eat();   // ->I can eat
    System.out.println("I eat dog food");
  }
  // new method in subclass
  public void bark() {
    System.out.println("I can bark");
  }
}
class Main_3 {
  public static void main(String[] args) {
    // create an object of the subclass
    Dog_3 labrador = new Dog_3();
    // call the eat() method
    labrador.eat();
    labrador.bark();
  }
}


//protected Members in Inheritance
//In Java, if a class includes protected fields and methods,
//then these fields and methods are accessible from the subclass of the class.
//
//Example 4: protected Members in Inheritance
class Animal_4 {
  protected String name;
  protected void display() {
    System.out.println("I am an animal.");
  }
}

class Dog_4 extends Animal_4 {
  public void getInfo() {
    System.out.println("My name is " + name);
  }
}
class Main_4 {
  public static void main(String[] args) {
    // create an object of the subclass
    Dog_4 labrador = new Dog_4();
    // access protected field and method
    // using the object of subclass
    labrador.name = "Rocky";
    labrador.display();
    labrador.getInfo();
  }
}