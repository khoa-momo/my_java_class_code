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
public class this_keyword {
    
}
//this Keyword
//In Java, this keyword is used to refer to the current object inside a method or a constructor. For example,

class this_key {
    int instVar;
    this_key(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        this_key obj = new this_key(8);
        System.out.println("object reference = " + obj);
    }
}


//Using this for Ambiguity Variable Names
class MyClass {
    // instance variable
    int age;
    // parameter
    MyClass(int age){
        age = age;
    }
}
//First, let's see an example without using this keyword:
//class Main {
//    int age;
//    Main(int age){
//        age = age;
//    }
//    public static void main(String[] args) {
//        Main obj = new Main(8);
//        System.out.println("obj.age = " + obj.age);
//    }
//}
//          Output: mc.age = 0

//Now, let's rewrite the above code using this keyword.
//class Main {
//    int age;
//    Main(int age){
//        this.age = age;
//    }
//    public static void main(String[] args) {
//        Main obj = new Main(8);
//        System.out.println("obj.age = " + obj.age);
//    }
//}
//          Output:obj.age = 8



//this with Getters and Setters
//Another common use of this keyword is in setters and getters methods of a class. For example:
//class Main {
//   String name;
//
//   // setter method
//   void setName( String name ) {
//       this.name = name;
//   }
//
//   // getter method
//   String getName(){
//       return this.name;
//   }
//
//   public static void main( String[] args ) {
//       Main obj = new Main();
//
//       // calling the setter and the getter method
//       obj.setName("Toshiba");
//       System.out.println("obj.name: "+obj.getName());
//   }
//}
//          Output: obj.name: Toshiba


//Using this in Constructor Overloading
//While working with constructor overloading, we might have to invoke one constructor from another constructor. 
//In such a case, we cannot call the constructor explicitly. Instead, we have to use this keyword.
//
//Here, we use a different form of this keyword. That is, this(). Let's take an example,
class Complex {
    private int a, b;
    // constructor with 2 parameters
    private Complex( int i, int j ){
        this.a = i;
        this.b = j;
    }
    // constructor with single parameter
    private Complex(int i){
        // invokes the constructor with 2 parameters
        this(i, i); 
    }
    // constructor with no parameter
    private Complex(){
        // invokes the constructor with single parameter
        this(0);
    }
    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }
    public static void main( String[] args ) {
        // creating object of Complex class
        // calls the constructor with 2 parameters
        Complex c1 = new Complex(2, 3);
        // calls the constructor with a single parameter
        Complex c2 = new Complex(3);
        // calls the constructor with no parameters
        Complex c3 = new Complex();

        // print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

//Passing this as an Argument
//We can use this keyword to pass the current object as an argument to a method. For example,
class ThisExample {
    // declare variables
    int x;
    int y;
    ThisExample(int x, int y) {
       // assign values of variables inside constructor
        this.x = x;
        this.y = y;

        // value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        // call the add() method passing this as argument
        add(this);

        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
    void add(ThisExample o){
        o.x += 2;
        o.y += 2;
    }
}

class ex {
    public static void main( String[] args ) {
        ThisExample obj = new ThisExample(1, -2);
    }
}