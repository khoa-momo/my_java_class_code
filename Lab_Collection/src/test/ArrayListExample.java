/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  
class Student2 {
    private int id;
    private String name;
  
    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}
                                                                                
public class ArrayListExample {
    public static final int NUM_OF_ELEMENT = 5;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Create list with compacity = 3
        ArrayList students = null;
        // List<Student> students = new ArrayList<>(3);
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            // Add element to list
            Student2 student = new Student2();
            System.out.print("student: ");
            student = sc.nextLine();
            students.add(student);
        }
        System.out.println(students);
        // Show list student
//        for (Student student : students) {
//            System.out.println(student);
//        }
    }
}
