/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample03;

/**
 *
 * @author DELL
 */
class Main {

 // String languages;

  // constructor accepting single value
  Main(String lang) {
  //  languages = lang;
    System.out.println(lang + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Main obj1 = new Main("Java");
    Main obj2 = new Main("Python");
    Main obj3 = new Main("C");
  }
}