/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample07;

import java.util.Scanner;

/**
 *
 * @author KienLT
 */
public class Employee implements Comparable {

    private String name;
    private int age;
    private float salary;
    public Employee() {
    }
    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    } 
    public void setName(String name) {
        this.name = name;
    } 
    public int getAge() {
        return age;
    } 
    public void setAge(int age) {
        this.age = age;
    } 
    public float getSalary() {
        return salary;
    } 
    public void setSalary(float salary) {
        this.salary = salary;
    } 
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

    // So sanh salary bang comparable
    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee emp = (Employee) o;
            if (this.salary > emp.salary) {
                return 1;
            } else if (this.salary < emp.salary) {
                return -1;
            } else {
                return 0;
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Age: ");
        scanner = new Scanner(System.in);
        this.age = scanner.nextInt();
        System.out.print("Salary: ");
        scanner = new Scanner(System.in);
        this.salary = scanner.nextFloat();
    }
    
    public void output(){
        System.out.printf("%-10s %-20d %-20f\n",name,age,salary);
    }         
}
