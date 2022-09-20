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
public class Class_Object {
    
}

//class ClassName {
//  // fields
//  // methods
//}
//class Bicycle {
//
//  // state or field
//  private int gear = 5;
//
//  // behavior or method
//  public void braking() {
//    System.out.println("Working of Braking");
//  }
//}

//className object = new className();
//
//// for Bicycle class
//Bicycle sportsBicycle = new Bicycle();
//
//Bicycle touringBicycle = new Bicycle();

//Access Members of a Class
//We can use the name of objects along with the . operator to access members of a class. For example,
//
//class Bicycle {
//
//  // field of class
//  int gear = 5;
//
//  // method of class
//  void braking() {
//    ...
//  }
//}
//
//// create object
//Bicycle sportsBicycle = new Bicycle();
//
//// access field and method
//sportsBicycle.gear;
//sportsBicycle.braking();

class Lamp {
  
  // stores the value for light
  // true if light is on
  // false if light is off
  boolean isOn;

  // method to turn on the light
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }

  // method to turnoff the light
  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}

class Main {
  public static void main(String[] args) {

    // create objects led and halogen
    Lamp led = new Lamp();
    Lamp halogen = new Lamp();

    // turn on the light by
    // calling method turnOn()
    led.turnOn();

    // turn off the light by
    // calling method turnOff()
    halogen.turnOff();
  }
}