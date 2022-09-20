/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ComparableExample {
    public static void main(String[] args) {
        
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        
        // add students to list
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        
        // sort list student
        Collections.sort(listStudents);
        
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
    }    
}
