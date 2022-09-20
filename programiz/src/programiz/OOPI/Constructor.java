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
public class Constructor {
    
}
//class Test {
//  Test() {
//    // constructor body
//  }
//}

//class con {
//  private String name;
//  // constructor
//  con() {
//    System.out.println("Constructor Called:");
//    name = "Programiz";
//  }
//  public static void main(String[] args) {
//    // constructor is invoked while creating an object of the Main class
//    con obj = new con();
//    System.out.println("The name is " + obj.name);
//  }
//}

//3 Types of Constructor
//In Java, constructors can be divided into 3 types:
//No-Arg Constructor
//Parameterized Constructor
//Default Constructor

//1. Java No-Arg Constructors
//private Constructor() {
//   // body of the constructor
//}

//Example 2: Java private no-arg constructor
class no_arg {
  int i;
  // constructor with no parameter
  private no_arg() {
    i = 5;
    System.out.println("Constructor is called");
  }
  public static void main(String[] args) {
    // calling the constructor without any parameter
    no_arg obj = new no_arg();
    System.out.println("Value of i: " + obj.i);
  }
}


//Example 3: Java public no-arg constructors
class Company {
  String name;

  // public constructor
  public Company() {
    name = "Programiz";
  }
}
class com {
  public static void main(String[] args) {

    // object is created in another class
    Company obj = new Company();
    System.out.println("Company name = " + obj.name);
  }
}

//2. Java Parameterized Constructor
class para_con {

  String languages;

  // constructor accepting single value
  para_con(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    para_con obj1 = new para_con("Java");
    para_con obj2 = new para_con("Python");
    para_con obj3 = new para_con("C");
  }
}


//3. Java Default Constructor
class default_con {

  int a;
  boolean b;

  public static void main(String[] args) {

    // A default constructor is called
    default_con obj = new default_con();

    System.out.println("Default Value:");
    System.out.println("a = " + obj.a);
    System.out.println("b = " + obj.b);
  }
}

//The above program is equivalent to:
//class Main {
//  int a;
//  boolean b;
//  // a private constructor
//  private Main() {
//    a = 0;
//    b = false;
//  }
//  public static void main(String[] args) {
//    // call the constructor
//    Main obj = new Main();
//
//    System.out.println("Default Value:");
//    System.out.println("a = " + obj.a);
//    System.out.println("b = " + obj.b);
//  }
//}

//Important Notes on Java Constructors
//Constructors are invoked implicitly when you instantiate objects.
//The two rules for creating a constructor are:
//The name of the constructor should be the same as the class.
//A Java constructor must not have a return type.
//
//If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. 
//The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0
//Constructor types:
//
//No-Arg Constructor - does not accept any arguments
//Parameterized constructor -  accepts arguments
//Default Constructor - is automatically created by the Java compiler if it is not explicitly defined.
//
//A constructor cannot be abstract or static or final.
//A constructor can be overloaded but can not be overridden.


//Example 6: Java Constructor Overloading
class overload_con {
  String language;

  // constructor with no parameter
  overload_con() {
    this.language = "Java";
  }
  // constructor with a single parameter
  overload_con(String language) {
    this.language = language;
  }
  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }
  public static void main(String[] args) {
    // call constructor with no parameter
    overload_con obj1 = new overload_con();
    // call constructor with a single parameter
    overload_con obj2 = new overload_con("Python");

    obj1.getName();
    obj2.getName();
  }
}