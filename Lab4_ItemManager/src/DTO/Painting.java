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
public class Painting extends Item{
    private int height; 
    private int witdth; 
    private boolean isWatercolour; 
    private boolean isFramed; 
    
    public Painting(){
    }
    public Painting(int height, int witdth, boolean isWatercolour, boolean isFramed) {
        this.height = height; 
        this.witdth = witdth; 
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    
    public void sethHeight(int height){
        this.height = height;
    } 
    public int getHeight(){
        return height;
    }     
    public void setWitdth(int witdth){
        this.witdth = witdth;
    } 
    public int getWitdth(){
        return witdth;
    }         
    public void setisWatercolour(boolean isWatercolour){
        this.isWatercolour = isWatercolour;
    } 
    public boolean getisWatercolour(){
        return isWatercolour;
    }      
    public void setIsFramed(boolean isFramed){
        this.isFramed = isFramed;
    } 
    public boolean getIsFramed(){
        return isFramed;
    }     
    
    public void inputPainting(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter height :");
       height = scanner.nextInt();
       System.out.print("Enter witdth :");
       witdth = scanner.nextInt(); 
   }    
    public void outputPainting(){ 
       System.out.println("height: " + height); 
       System.out.println("witdth: " + witdth); 
    }           
}
