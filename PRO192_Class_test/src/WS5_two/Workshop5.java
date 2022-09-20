/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5_two;

import java.util.Scanner;

/**
 *
 * @author letha
 */
public class Workshop5 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        PhoneNumber list[] = new PhoneNumber[1000];
         
        System.out.println("Enter list of phone numbers");
        System.out.println("---------------------------");
        int pn_amount = 0;
        int choice;
        
        do{
            System.out.print("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit): ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    PhoneNumber phoneNumber = new PhoneNumber();
                    phoneNumber.input(); 
//                    System.out.print("Enter area code: ");
//                    int area = sc.nextInt();
//                    sc.nextLine();
//                    System.out.print("Enter number: ");
//                    String number = sc.nextLine(); 
                    list[pn_amount] = phoneNumber;
                    pn_amount++;
                    break;
                case 2:
                    IntPhoneNumber intPhoneNumber = new IntPhoneNumber();
                    intPhoneNumber.input(); 
//                    System.out.print("Enter country code: ");
//                    String countryCode = sc.nextLine();
//                    System.out.print("Enter area code: ");
//                    area = sc.nextInt();
//                    System.out.print("Enter number: ");
//                    number = sc.nextLine(); 
                    list[pn_amount] = intPhoneNumber;
                    pn_amount++;
                    break;
                default:
                    break;
            }
        }while(choice!=0);
//Output         
        System.out.println("\n List of phone numbers:");
        for (int i=0; i<pn_amount; i++) {
            list[i].display();
        }
    }
    
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
    
}
