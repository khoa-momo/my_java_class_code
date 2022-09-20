/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample03;

import java.util.Scanner;

/**
 *
 * @author KienLT
 */
public class Animal {
    protected String name;    
    protected String color;
    protected double weight;

    public Animal() {
    }
    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Color: ");
        color = scanner.nextLine();
        System.out.print("Weight: ");
        weight = scanner.nextDouble();
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
    public void sound() {
        System.out.println("No sound");
    }
}
