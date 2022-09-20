/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student {
    private String rollNumber;
    private String fullName;
    private String phoneNumber;
    private String email;
    
    
public Student(String roll, String name, String phone, String email){
    rollNumber = roll;
    fullName = name;
    phoneNumber = phone;
    this.email = email;
    
}
    
public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Roll number: ");
    rollNumber = sc.nextLine();
    System.out.print("fullName: ");
    fullName = sc.nextLine();
    System.out.print("phoneNumber: ");
    phoneNumber = sc.nextLine();
    System.out.print("email: ");
    email = sc.nextLine();
}

public void display(){
    System.out.println(rollNumber);
    System.out.println(fullName);
    System.out.println(phoneNumber);
    System.out.println(email);
}

/*
public void display(String message){
    System.out.println(message);
    System.out.println(rollNumber);
    System.out.println(fullName);
    System.out.println(phoneNumber);
    System.out.println(email);
}
   */
    
    
    
    
    
}
