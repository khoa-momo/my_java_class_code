/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Employee{
    protected String code;
    protected String name;
    protected double salary;
    
//constructor 
public Employee(String code, String name, double salary){
    this.code = code;
    this.name = name;
    this.salary = salary;
}
@Override 
public String toString(){
    return String.format("%s co luong la %.2f", name,salary);
}

 
public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Code: ");
    code = sc.nextLine();
    System.out.print("Name: ");
    name = sc.nextLine();
    System.out.print("Salary: ");
    salary = sc.nextDouble();
}

/*
public void display(){
    System.out.print("Code: " + code); 
    System.out.print("Name: " + name); 
    System.out.print("Salary: " + salary); 
}*/



}