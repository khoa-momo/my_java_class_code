/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.TypeConversion;

/**
 *
 * @author DELL
 */
public class Primitive_to_rapper_Objects {
 public static void main(String[] args) {

    // create primitive types
    int var1 = 5;
    double var2 = 5.65;
    boolean var3 = true;

    //converts into wrapper objects
    Integer obj1 = Integer.valueOf(var1);
    Double obj2 = Double.valueOf(var2);
    Boolean obj3 = Boolean.valueOf(var3);

    // checks if obj are objects of
    // corresponding wrapper class
    if(obj1 instanceof Integer) {
      System.out.println("An object of Integer is created.");
    }

    if(obj2 instanceof Double) {
      System.out.println("An object of Double is created.");
    }

    if(obj3 instanceof Boolean) {
      System.out.println("An object of Boolean is created");
    }
  }    
}
