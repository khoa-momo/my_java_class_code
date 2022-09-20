/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeBase;
 
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DecToBin {
    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
   
        // counter for binary array
        int i = 0;
        while (n > 0){
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        } 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    public static Scanner sc = new Scanner(System.in);   
    // driver program
    public static void main (String[] args){
        System.out.println("Enter dec: ");
        int num = Integer.parseInt(sc.nextLine()); 
        System.out.println("Output: ");
        decToBinary(num);
    }   
}
