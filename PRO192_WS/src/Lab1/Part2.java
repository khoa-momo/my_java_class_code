/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Part2 {
public static void main(String[] args) {     
    float num1, num2;
    String op;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter num1:");
    num1 = sc.nextFloat();
    System.out.print("Enter num2:");
    num2 = sc.nextFloat();
    System.out.print("Enter op (+ - * /):");
    sc = new Scanner(System.in);
    op = sc.nextLine();    
    if( op.equals("+")){
        System.out.print("The result of "+num1+ op + num2+ " = "+ (num1+num2));
    }else if( op.equals("-")){
        System.out.print("The result of "+num1+ op + num2+ " = "+ (num1-num2));
    }else if( op.equals("*")){
        System.out.print("The result of "+num1+ op + num2+ " = "+ (num1*num2));
    }else if( op.equals("/")){
        System.out.print("The result of "+num1+ op + num2+ " = "+ (num1/num2));
    }
    
}

}
