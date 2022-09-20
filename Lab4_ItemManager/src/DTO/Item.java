/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Item {
    private int value; 
    private String creator; 

    public Item(){
    }
    public Item(int value, String creator) {
        this.value = value; 
        this.creator = creator; 
    }
    
    public void setValue(int value){
        this.value = value;
    } 
    public int getValue(){
        return value;
    }     
    public void setcCeator(String creator){
        this.creator = creator;
    } 
    public String getCreator(){
        return creator;
    }         
    
    public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter value :");
       value = scanner.nextInt();
       System.out.print("Enter creator :");
       creator = scanner.nextLine(); 
   }    
    public void output(){ 
       System.out.println("Value: " + value); 
       System.out.println("Creator: " + creator); 
    }    
}
