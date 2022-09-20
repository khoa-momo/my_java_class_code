/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B3;

/**
 *
 * @author DELL
 */
public class main {
public static void main(String[] args) { 
    Vehicle xe1 = new Vehicle();
    Vehicle xe2 = new Vehicle();      
    Vehicle xe3 = new Vehicle(); 
    
    System.out.println("Nhap thong tin xe 1");  
    xe1.input();
    System.out.println("Nhap thong tin xe 2");  
    xe2.input();
    System.out.println("Nhap thong tin xe 3");  
    xe3.input();  
    System.out.println("================================================================");  
    System.out.println("Ten" + "\t" + "Loai_xe" + "\t" + "Dung_tich" + "\t" + "Gia" + "\t" + "Thue");      
    xe1.display(); 
    xe2.display(); 
    xe3.display(); 
    
}    
}
