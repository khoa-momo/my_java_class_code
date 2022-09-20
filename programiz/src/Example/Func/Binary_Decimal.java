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
public class Binary_Decimal {
  public static void main(String[] args) {

    // binary number
    long num = 110110111;

    // call method by passing the binary number
    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    } 
    return decimalNumber;
  }    
  
  
//    public static void main(String[] args) {
//    
//    // binary number
//    String binary = "01011011";
//    
//    // convert to decimal
//    int decimal = Integer.parseInt(binary, 2);
//    System.out.println(binary + " in binary = " + decimal + " in decimal.");
//  }
   
}
