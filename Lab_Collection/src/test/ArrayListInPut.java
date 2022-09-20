/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL
 */ 

public class ArrayListInPut { 
    public static void main(String arg[]) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(); 
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        
//        for (int i=0; i<10; i++) { 
//            arrList.add(sc.nextInt());
//        }
        

        for(int i = 0; i < n; i++){
           System.out.println("");
           System.out.print("Printer name: ");
           
           String name = in.readLine();           
           
           System.out.print("Printer price: ");
           
           double price = Double.parseDouble(in.readLine());             
           a.add(new Printer(name, price));
        }
       
        System.err.println("So cua arrlist");
        for (int i=0; i<10; i++) { 
            System.out.print(arrList.get(i)+" ");
        }

    }
}