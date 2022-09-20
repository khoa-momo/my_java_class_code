/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student {
    private String name;  
    private String studentId;
    private String birthDate;
    private String address;
    private String major;
    private double gpa;
    
    public Student(){
    }

    public Student(String name, String studentId, String birthDate, String address, String major, double weight) {
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }
    
    //Get-Set method
    public String getName(){  
    return name;  
    }  
    public void setName(String name){  
    this.name = name;  
    }
    public String getStudentId(){  
    return studentId;  
    }  
    public void setStudentId(String studentId){  
    this.studentId = studentId;  
    }
    public String getBirthDate(){  
    return birthDate;  
    }  
    public void setBirthDate(String birthDate){  
    this.birthDate = birthDate;  
    }
    public String getAddress(){  
    return address;  
    }  
    public void setAddress(String address){  
    this.address = address;  
    } 
    public String getMajor(){  
    return major;  
    }  
    public void setMajor(String major){  
    this.major = major;  
    } 
    public Double getgpa(){  
    return gpa;  
    }  
    public void setgpa(Double gpa){  
    this.gpa = gpa;  
    } 
    
    public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("name :");
       name = scanner.nextLine();
       
       System.out.print("studentId :");
       studentId = scanner.nextLine();
       
       System.out.print("birthDate :");
       birthDate = scanner.nextLine();
       
       System.out.print("address :");
       address = scanner.nextLine();
       
       System.out.print("major :");
       major = scanner.nextLine();
       
       System.out.print("gpa :");
       gpa = scanner.nextDouble(); 
    }
    
    public void printAllAttributes(){
       System.out.println("name :" + name); 
       System.out.println("studentId :" + studentId);
       System.out.println("birthDate :" + birthDate); 
       System.out.println("address :" + address); 
       System.out.println("major :" + major); 
       System.out.println("gpa :" + gpa); 
    }
    
    
public static void main(String[] args) { 
    Student s = new Student();
    s.input();
    s.printAllAttributes();
}
    
}
