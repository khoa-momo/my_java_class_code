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
public class private_constructor {
      // create a public static variable of class type
  private static private_constructor language;

  // private constructor
  private private_constructor() {
    System.out.println("Inside Private Constructor");
  }

  // public static method
  public static private_constructor getInstance() {

     // create object if it's not already created
     if(language == null) {
        language = new private_constructor();
     }

      // returns the singleton object
      return language;
  }

  public void display() {
      System.out.println("Singleton Pattern is achieved");
  }
}

class Main {
  public static void main(String[] args) {
     private_constructor db1;

     // call the getInstance method
     db1= private_constructor.getInstance();

     db1.display();
  }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
