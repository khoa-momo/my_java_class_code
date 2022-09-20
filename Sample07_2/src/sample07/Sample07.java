/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample07;

import java.util.Arrays;

/**
 *
 * @author KienLT
 */
public class Sample07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[] emps = new Employee[1];
        Arrays.fill(emps, new Employee());
        for (int i = 0; i < emps.length; i++) {
            emps[i].input();
        }
        System.out.println("-----------------------------");
        for (Employee emp : emps) {
            System.out.println(emp);
        }

//        Employee[] employees = new Employee[10];
//        employees[0] = new Employee("Nguyễn Thanh Bình", 35, 800);
//        employees[1] = new Employee("Hoàng Thu Hương", 32, 700);
//        employees[2] = new Employee("Trần Thanh Vân", 21, 400);
//        employees[3] = new Employee("Bùi Văn Hải", 37, 600);
//        employees[4] = new Employee("Nguyễn Thanh Bình", 24, 500);
//        employees[5] = new Employee("Phạm Thu Phương", 27, 550);
//        employees[6] = new Employee("Trương Quốc Lập", 28, 450);
//        employees[7] = new Employee("Đỗ Thanh Hải", 30, 1000);
//        employees[8] = new Employee("Lê Thu Thủy", 28, 700);
//        employees[9] = new Employee("Nguyễn Thanh Bình", 28, 600);
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println("----------------------------");
//        Arrays.sort(employees, new CompareEmployeeByNameAge());
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println("----------------------------");
//        Employee emp = new Employee("Đỗ Thanh Hải", 30, 1000);
//        int n = Arrays.binarySearch(employees, emp);
//        System.out.println(n);
    }
}
