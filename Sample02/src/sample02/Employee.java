/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample02;

import java.util.Scanner;

/**
 *
 * @author KienLT
 */

public class Employee {
    
    private String code;
    private String name;
    private String phone;
    private String email;
    private float salary;

    //constructor?
    public Employee() {
    }

    //constructor?
    public Employee(String code, String name, String phone, String email, float salary) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
    }
    
    
    
//    public void input() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Code: ");
//        code = scanner.nextLine();
//        System.out.print("Name: ");
//        name = scanner.nextLine();
//        System.out.print("Phone: ");
//        phone = scanner.nextLine();
//        System.out.print("Email: ");
//        email = scanner.nextLine();
//        System.out.print("Salary: ");
//        salary = scanner.nextFloat();
//    }
    
    public void display() {
        System.out.println("----- Employee Information-----");
        System.out.println(code);
        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(salary);        
    }
}
