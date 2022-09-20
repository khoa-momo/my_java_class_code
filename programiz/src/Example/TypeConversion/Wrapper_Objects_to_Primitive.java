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
public class Wrapper_Objects_to_Primitive {
  public static void main(String[] args) {

    // creates objects of wrapper class
    Integer obj1 = Integer.valueOf(23);
    Double obj2 = Double.valueOf(5.55);
    Boolean obj3 = Boolean.valueOf(true);

    // converts into primitive types
    int var1 = obj1.intValue();
    double var2 = obj2.doubleValue();
    boolean var3 = obj3.booleanValue();

    // print the primitive values
    System.out.println("The value of int variable: " + var1);
    System.out.println("The value of double variable: " + var2);
    System.out.println("The value of boolean variable: " + var3);
  }    
}
