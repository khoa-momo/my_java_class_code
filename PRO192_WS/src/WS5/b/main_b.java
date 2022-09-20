/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5.b;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main_b {
public static void main(String[] args) { 
    
    Person[] e = new Person[10];
    int n = 0, c = 0;
    do {
        System.out.println("Worker (1); Officer(2): ");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        if (c == 1) {
            //accept information of worker
            System.out.print("Enter worker name: ");
            String name = in.next();
            System.out.print("Enter worker working hours: ");
            int hrs = in.nextInt();
            System.out.print("Enter worker salary: ");
            double bSalary = in.nextDouble();
            //
            e[n] = new Worker(hrs, bSalary,name);                
            n++;
        } else if (c == 2) {
            //accept information of Officer
            System.out.print("Enter Officer name: ");
            String name = in.next();
            System.out.print("Enter officer salary: ");
            double salary = in.nextDouble();
            //
            e[n] = new Officer(salary, name);
            n++;
        }
    } while (c != 0);
    
    
//print all objects of e
    for (int i = 0; i < n; i++) {
        //e[i].display();
        //print the instance of Worker  
        if (e[i] instanceof Worker) {
            System.out.printf("Worker thu %d la:\n",i+1);
            e[i].display();
            System.out.println();
        }
        //print the instance of Officer  
        if (e[i] instanceof Officer) {
            System.out.printf("Officer thu %d la:\n",i+1);
            e[i].display();
            System.out.println();
        }
    }
}
    
    
    
}
 
