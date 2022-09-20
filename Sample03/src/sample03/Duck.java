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
public class Duck extends Animal {
   
    @Override
    public void sound() {
        System.out.println("Quaw quaw!");
    }
    public void swimming() {
        System.out.println("Duck is swimming");
    }
}
