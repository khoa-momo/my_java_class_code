/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class sample8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        
        for(int i=0; i<10; i++){
            System.out.print("a[" + i + "] = ");
            try{
                a[i] = sc.nextInt();
            }catch (InputMismatchException | IndexOutOfBoundsException e){
                System.err.println(e);
            }finally{
                System.out.println("Cam on");
            }
        }
        System.err.println("--");
        for (int i=0; i<10; i++){
            System.out.printf("%s \t", a[i]);
        }
        
        
        
    }
}
