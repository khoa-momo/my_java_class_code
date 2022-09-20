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
public class double_to_string {
  public static void main(String[] args) {

    // create double variable
    double num1 = 36.33;
    double num2 = 99.99;

    // convert double to string
    // using valueOf()
    String str1 = String.valueOf(num1);
    String str2 = String.valueOf(num2);

    // print string variables
    System.out.println(str1);    // 36.33
    System.out.println(str2);    // 99.99
  }    
}
