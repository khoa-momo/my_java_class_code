/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author DELL
 */
public class Student_Main {
    /* Program for managing student list */ 
    public static void main(String[] args){
       
        // options in menu
        String[] options= {"Add new student", "Search a student", "Update name and mark", 
        "Remove a student", "List all", "Quit"};
        
        int choice = 0; // user choice
        Student_Manager list = new Student_Manager();  // Init empty list //OBJECT //List<Student> list = new ArrList();
                                                                                   //SM list/(name) = new SM();
        do{ 
            System.out.println("\nStudent managing Program");
            choice = Menu.getChoice(options);
            switch (choice){
                case 1: 
                    list.addStudent();           //add
                    break; // Add new student
                case 2: 
                    list.searchStudent(); 
                    break; // Search student
                case 3: 
                    list.updateStudent();       //update
                    break; // Update student
                case 4: 
                    list.removeStudent(); 
                    break; // Remove student
                case 5: 
                    list.printAll();                //list
                    break; // print all students
                default: 
                    System.out.println("Bye!");
            }
        }
        while(choice>0 && choice<6);        
    }        
}
