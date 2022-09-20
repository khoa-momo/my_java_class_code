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
public class Method {
    
}
//returnType methodName() {
//  // method body
//}

//modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
//  // method body
//}

//Example 1: Java Methods
//class Main2 {
//
//  // create a method
//  public int addNumbers(int a, int b) {
//    int sum = a + b;
//    // return value
//    return sum;
//  }
//
//  public static void main(String[] args) {
//    
//    int num1 = 25;
//    int num2 = 15;
//
//    // create an object of Main
//    Main obj = new Main();
//    // calling method
//    int result = obj.addNumbers(num1, num2);
//    System.out.println("Sum is: " + result);
//  }
//}

//Example 2: Method Return Type
//class Main {
//
//// create a method
//  public static int square(int num) {
//
//    // return statement
//    return num * num;
//  }
//
//  public static void main(String[] args) {
//    int result;
//
//    // call the method
//    // store returned value to result
//    result = square(10);
//
//    System.out.println("Squared value of 10 is: " + result);
//  }
//}
//Squared value of 10 is: 100

//
//Method Parameters in Java
//A method parameter is a value accepted by the method. As mentioned earlier, a method can also have any number of parameters. 
//For example,
//
//// method with two parameters
//int addNumbers(int a, int b) {
//  // code
//}
//
//// method with no parameter
//int addNumbers(){
//  // code
//}

//// calling the method with two parameters
//addNumbers(25, 15);
//
//// calling the method with no parameters
//addNumbers()

//Example 3: Method Parameters
class Main2 {

  // method with no parameter
  public void display1() {
    System.out.println("Method without parameter");
  }

  // method with single parameter
  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }

  public static void main(String[] args) {
    
    // create an object of Main
    Main2 obj = new Main2();

    // calling method with no parameter
    obj.display1();
    
    // calling method with the single parameter
    obj.display2(25);
  }
}

//public class math {
//  public static void main(String[] args) {
//    
//    // using the sqrt() method
//    System.out.print("Square root of 4 is: " + Math.sqrt(4));
//  }
//}
//public class Main {
//
//  // method defined
//  private static int getSquare(int x){
//    return x * x;
//  }
//
//  public static void main(String[] args) {
//    for (int i = 1; i <= 5; i++) {
//
//      // method call
//      int result = getSquare(i);
//      System.out.println("Square of " + i + " is: " + result);
//    }
//  }
//}