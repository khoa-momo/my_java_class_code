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
public class super_keyword {
    
}
//Uses of super keyword
//To call methods of the superclass that is overridden in the subclass.
//To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
//To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.
//Let’s understand each of these uses.

//1. Access Overridden Methods of the superclass
//If methods with the same name are defined in both superclass and subclass, 
//the method in the subclass overrides the method in the superclass. This is called method overriding.
//
//Example 1: Method overriding
class Animal_8 {
  // overridden method
  public void display(){
    System.out.println("I am an animal");
  }
}
class Dog_8 extends Animal_8 {
  // overriding method
  @Override
  public void display(){
    System.out.println("I am a dog");
  }
  public void printMessage(){
    display();
  }
}
class Main_8 {
  public static void main(String[] args) {
    Dog_8 dog1 = new Dog_8();
    dog1.printMessage();
  }
}
//Output:I am a dog



//What if the overridden method of the superclass has to be called?
//We use super.display() if the overridden method display() of superclass Animal needs to be called.
class Animal_9 {
  // overridden method
  public void display(){
    System.out.println("I am an animal"); //**
  }
}
class Dog_9 extends Animal_9 {
  // overriding method
  @Override
  public void display(){  
    System.out.println("I am a dog");  //**
  }
  public void printMessage(){
    // this calls overriding method
    display();   //I am a dog
    // this calls overridden method
    super.display(); //I am an animal
  }
}
class Main_9 {
  public static void main(String[] args) {
    Dog_9 dog1 = new Dog_9();
    dog1.printMessage();
  }
}
//Output
//I am a dog
//I am an animal



//2. Access Attributes of the Superclass
//The superclass and subclass can have attributes with the same name. 
//We use the super keyword to access the attribute of the superclass.
//
//Example 3: Access superclass attribute
class Animal_10 {
  protected String type = "animal";
}

class Dog_10 extends Animal_10 {
  public String type = "mammal";
  public void printType() {
    System.out.println("I am a " + type);
    System.out.println("I am an " + super.type);
  }
}
class Main_10 {
 public static void main(String[] args) {
    Dog_10 dog1 = new Dog_10();
    dog1.printType();
  }
}
//Output:
//I am a mammal
//I am an animal




//3. Use of super() to access superclass constructor
//As we know, when an object of a class is created, its default constructor is automatically called.
//To explicitly call the superclass constructor from the subclass constructor,
//we use super(). It's a special form of the super keyword.
//super() can be used only inside the subclass constructor and must be the first statement.

//Example 4: Use of super()
class Animal_11 {
    // default or no-arg constructor of class Animal
    Animal_11() {
    System.out.println("I am an animal");
  }
}

class Dog_11 extends Animal_11 {
    // default or no-arg constructor of class Dog
    Dog_11() {
    // calling default constructor of the superclass
    super();
    System.out.println("I am a dog");
  }
}
class Main_11 {
  public static void main(String[] args) {
    Dog_11 dog1 = new Dog_11();
  }
}
//Output
//I am an animal
//I am a dog



//**So, why use redundant code if the compiler automatically invokes super()?
//
//It is required if the parameterized constructor (a constructor that takes arguments)
// of the superclass has to be called from the subclass constructor.
//
//The parameterized super() must always be the first statement in the body 
//of the constructor of the subclass, otherwise, we get a compilation error.
//
//Example 5: Call Parameterized Constructor Using super()
class Animal_12 {
//  // default or no-arg constructor
//  Animal_12() {
//    System.out.println("I am an animal");
//  }
  // Didn't need that part above...?  
  // parameterized constructor
  Animal_12(String type) {
    System.out.println("Type: "+type);
  }
}

class Dog_12 extends Animal_12 {
    // default constructor
    Dog_12() {
    // calling parameterized constructor of the superclass
    super("Animal");
    System.out.println("I am a dog");
  }
}
class Main_12 {
  public static void main(String[] args) {
    Dog_12 dog1 = new Dog_12();
  }
}
//Output
//Type: Animal
//I am a dog
// --->
//The compiler can automatically call the no-arg constructor.
//However, it cannot call parameterized constructors.
//If a parameterized constructor has to be called, 
//we need to explicitly define it in the subclass constructor.

//Note that in the above example, we explicitly called the parameterized constructor super("Animal"). 
//The compiler does not call the default constructor of the superclass in this case.