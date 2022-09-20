/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample03;

/**
 *
 * @author KienLT
 */
public class Dog extends Animal {
    
    @Override
    public void sound() {
        System.out.println("Gâu gâu!");
    }
    public void protect() {
        System.out.println("Dog is protecting");
    }
}
