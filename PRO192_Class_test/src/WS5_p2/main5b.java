/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5_p2;

import java.util.Scanner;

/**
 *
 * @author letha
 */
public class main5b {

    /**
     * @param args the command line arguments
     */
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
                e[n] = new Worker(hrs, bSalary,name);                
                n++;
            } else if (c == 2) {
                //accept information of Officer
                System.out.print("Enter Officer name: ");
                String name = in.next();
                System.out.print("Enter officer salary: ");
                double salary = in.nextDouble();
                e[n] = new Officer(salary, name);
                n++;
            }
        } while (c != 0);
        //print all objects of e
        for (int i = 0; i < n; i++) {
            //print the instance of Worker only
            if (e[i] instanceof Worker) {
                e[i].display();
                System.out.println();
            }
            //print the instance of Officer only
            if (e[i] instanceof Officer) {
                e[i].display();
                System.out.println();
            }
        }
         








}
}


//        testPerson(); 
    
//    public static void testPhoneNumber() {
//        PhoneNumber list[] = new PhoneNumber[1000];
//        int index = 0;
//        
//        System.out.println("Enter list of phone numbers");
//        int option;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.print("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit): ");
//            option = sc.nextInt();
//            switch (option) {
//                case 1:
//                    PhoneNumber phoneNumber = new PhoneNumber();
//                    phoneNumber.input();
//                    list[index] = phoneNumber;
//                    index++;
//                    break;
//                case 2:
//                    IntPhoneNumber intPhoneNumber = new IntPhoneNumber();
//                    intPhoneNumber.input();
//                    list[index] = intPhoneNumber;
//                    index++;
//                    break;
//                default:
//                    break;
//            }
//        } while (option != 0);
//        
//        System.out.println();
//        System.out.println("List of phone numbers:");
//        for (int i = 0; i < index; i++) {
//            list[i].display();
//        }
//        System.out.println();
//    }
    
//    public static void testPerson() {
//        Person[] e = new Person[10];
//        int n = 0, c = 0;
//        do {
//            System.out.println("Worker (1); Officer(2): ");
//            Scanner in = new Scanner(System.in);
//            c = in.nextInt();
//            if (c == 1) {
//                //accept information of worker
//                System.out.print("Enter worker name: ");
//                String name = in.next();
//                System.out.print("Enter worker working hours: ");
//                int hrs = in.nextInt();
//                System.out.print("Enter worker salary: ");
//                double bSalary = in.nextDouble();
//                e[n] = new Worker(hrs, bSalary,name);                
//                n++;
//            } else if (c == 2) {
//                //accept information of Officer
//                System.out.print("Enter Officer name: ");
//                String name = in.next();
//                System.out.print("Enter officer salary: ");
//                double salary = in.nextDouble();
//                e[n] = new Officer(salary, name);
//                n++;
//            }
//        } while (c != 0);
//        //print all objects of e
//        for (int i = 0; i < n; i++) {
//            //print the instance of Worker only
//            if (e[i] instanceof Worker) {
//                e[i].display();
//                System.out.println();
//            }
//        }
//        
//    }
    
//}
