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
public class Cat extends Animal {

    public Cat() {
        this("No name", "gray", 0.5);
    }

    public Cat(String name, String color, double weight) {
        super(name, color, weight);
    }
    @Override
    public void sound() {
        System.out.println("Meo meo!");
    }
    public void process() {
        this.sound();
        super.input();
        this.sound();
        super.display();
        this.sound();
    }
}
