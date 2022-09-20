/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5.a;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PhoneNumber {
    protected int area;
    protected String number;
    
    public PhoneNumber(){
    }
    public PhoneNumber(int a,String n){
        this.area = a;
        this.number = n;
    }
    
//    public void setArea(int a){
//        this.area=a;
//    } 
//    public int getArea(){
//        return area;
//    } 
//    public void setNumber(String n){
//        this.number=n;
//    } 
//    public String getN(){
//        return number;
//    } 
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area code: ");
        area = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter number: ");
        number = sc.nextLine();        
    }
    public void display(){
        System.out.println(area + " - " + number);
    }
    
    
}
