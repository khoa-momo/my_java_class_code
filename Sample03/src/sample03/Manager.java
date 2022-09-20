/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample03;

/**
 *
 * @author KienLT
 */
public class Manager extends Employee {

    private final Employee[] employees;
    
    //constructor for obj arr ???
    public Manager() {
        employees = new Employee[20];
    }
    //constructor with obj arr para ???
    public Manager(Employee[] employees) {
        this.employees = employees;
    }

    private boolean checkCode(String code) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.code.equals(code)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Add method
    public boolean add() {
        Employee emp = new Employee();
        emp.input();
        if (!checkCode(emp.code)) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = emp;
                    return true;
                }
            }
        }
        return false;
    }

    public void remove(String code) { 
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].code.equals(code)) {
                    employees[i] = null;
                    break;
                }
            }
        }
    }

    public void display() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public void displayBySalary() {
        double min = 0;
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null) {
                min = employees[i].salary;
            }
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[j] != null) {
                    if (min > employees[j].salary) {
                        Employee emp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = emp;
                    }
                }
            }
        }
        display();
    }

}
