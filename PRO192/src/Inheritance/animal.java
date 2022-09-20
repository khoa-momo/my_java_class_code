/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class animal {
    protected String name;
    protected String color;
    protected double weight;
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        name = sc.nextLine();
    }
    
    
    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Color:" + color);
        System.out.println("Weight:" + weight);
    }
    public void sound(){
        System.out.println("No sound");
    }
}
