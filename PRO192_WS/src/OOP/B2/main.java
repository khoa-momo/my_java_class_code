/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B2;

/**
 *
 * @author DELL
 */
public class main {
public static void main(String[] args) { 
    student_management hs1 = new student_management(12,"abc",5,6);
    student_management hs2 = new student_management(13,"def",7,8);        
    student_management hs3 = new student_management();    
    hs3.input();
    System.out.println(hs1.toString());
    System.out.println(hs2.toString());
    System.out.println(hs3.toString()); 
    
}     
}
