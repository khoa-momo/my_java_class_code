/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrList_P1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner; 
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
  
//        List<Student> list = new ArrayList();  //declare part
        
        //1-Add obj // first-obj -> then add
//        Student s0 = new Student("Harry", 12, 8);
//        Student s1 = new Student("Ron", 12, 7);
//        Student s2 = new Student("Hermione", 13, 10);
//        Student s3 = new Student("Ginny", 11, 9);

//        list.add(s0);
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
        
        //declare the list
        List<Student> list = new ArrayList(); 
        list.add(new Student("Bill", 21, 6)); 
        list.add(new Student("Harry", 12, 8)); 
        list.add(new Student("Hermione", 13, 10)); 
        list.add(new Student("Ginny", 11, 9)); 
        list.add(new Student("Ron", 12, 7)); 
        
//        System.out.println(list.toString());
        
        //Add
        Scanner sc = new Scanner(System.in);
        System.out.print("Add more how many students: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("*Infor of student "+i+1);
            //
            System.out.print("Enter name: ");
            String name = sc.next();   
            System.out.print("Enter age: ");
            int age = sc.nextInt(); 
            System.out.print("Enter mark: "); 
            float mark = sc.nextFloat();
            list.add(new Student(name, age, mark));
        }
        
        //Show
        System.out.println("---------------------------------");
        System.out.println("The list: ");
        for (Student o : list){ 		      
            System.out.println("Name: " +o.getName()+ "\t\tAge: " +o.getAge()+ "\t\tMark: " +o.getMark()); 		
        }        
        
        //sort by mark
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getMark() - o2.getMark());
            }
        });
        
        System.out.println("---------------------------------");
        System.out.println("List after sorted by mark");
        for (Student o : list){ 		      
            System.out.println("Name: " +o.getName()+ "\t\tAge: " +o.getAge()+ "\t\tMark: " +o.getMark()); 		
        }    
        
        //sort by age
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getAge() - o2.getAge());
            }
        });
        
        System.out.println("---------------------------------");
        System.out.println("List after sorted by age");
        for (Student o : list){ 		      
            System.out.println("Name: " +o.getName()+ "\t\tAge: " +o.getAge()+ "\t\tMark: " +o.getMark()); 		
        }       
        
        //sort by name
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });        
        
        System.out.println("---------------------------------");
        System.out.println("List after sorted by name");
        for (Student o : list){ 		      
            System.out.println("Name: " +o.getName()+ "\t\tAge: " +o.getAge()+ "\t\tMark: " +o.getMark()); 		
        } 
    
        //Remove  
        System.out.println("The mark to remove: "); 
        float mark = sc.nextFloat();
//        int size = list.size();
        for (int i = 0; i < list.size(); i++) {    //size
            if (list.get(i).getMark() == mark) {
                list.remove(i);  
                break;
            }
        } 
        
        System.out.println("---------------------------------");
        System.out.println("List after sb was remove");        
        for (Student o : list){ 		      
            System.out.println("Name: " +o.getName()+ "\tAge: " +o.getAge()+ "\tMark: " +o.getMark()); 		
        }        
        
        
        System.out.println("The mark to remove people that have smaller mark: "); 
        float mark2 = sc.nextFloat(); 
        for (int i = 0; i < list.size(); i++) {     // De i < size --> bi loi
            if (list.get(i).getMark() <= mark2) {
                list.remove(i); 
                i--;
//                list.remove(list.get(i)); 
            }
        } 
        
        System.out.println("---------------------------------");
        System.out.println("List after sb was remove bc their mark smaller than");        
        for (Student o : list){ 		      
            System.out.println("Name: " +o.getName()+ "\tAge: " +o.getAge()+ "\tMark: " +o.getMark()); 		
        }               
        
        
        //Set - Update
        
//        System.out.println("The age to set/update: "); 
//        int age = sc.nextInt();         
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getAge() == age) {  
//                list.get(i).setAge(); 
////                list.get(i).setMark(); 
//            }
//        }        
        
        
    }//main 
}//class


