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
public class Statue extends Item{
    private int weight; 
    private String colour; 
    
    public Statue(){
    }
    public Statue(int weight, String colour) {
        this.weight = weight; 
        this.colour = colour; 
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    } 
    public int getWeight(){
        return weight;
    }     
    public void setColour(String colour){
        this.colour = colour;
    } 
    public String getColour(){
        return colour;
    }         
    
    public void inputStatue(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter weight :");
       weight = scanner.nextInt();
       scanner.nextLine();
       System.out.print("Enter colour :");
       colour = scanner.nextLine(); 
       
   }    
    public void outputStatue(){ 
       System.out.println("Weight: " + weight); 
       System.out.println("Colour: " + colour); 
    }       
}
