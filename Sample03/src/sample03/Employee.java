/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample03;

import java.util.Scanner;

/**
 *
 * @author KienLT
 */
public class Employee {
    protected String code;
    protected String name;
    protected double salary;
    
    public Employee() {
    }
    public Employee(String code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s có lương là %.2f", name, salary);
    }
    public void input() {
        System.out.println("Input employee infor!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Code: ");
        code = scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Salary: ");
        salary = scanner.nextFloat();
    }
    
}
