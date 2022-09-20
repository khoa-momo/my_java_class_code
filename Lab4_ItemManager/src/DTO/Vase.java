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
public class Vase extends Item{
    private int height; 
    private String material; 

    public Vase(){
    }
    public Vase(int height, String material) {
        this.height = height; 
        this.material = material; 
    }
    
    public void sethHeight(int height){
        this.height = height;
    } 
    public int getHeight(){
        return height;
    }     
    public void setMaterial(String material){
        this.material = material;
    } 
    public String getMaterial(){
        return material;
    }         
    
    public void inputVase(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter height :");
       height = scanner.nextInt();
       scanner.nextLine();
       System.out.print("Enter material :");
       material = scanner.nextLine();  
   }    
    
    public void outputVase(){ 
       System.out.println("height: " + height); 
       System.out.println("material: " + material); 
    }        
}
