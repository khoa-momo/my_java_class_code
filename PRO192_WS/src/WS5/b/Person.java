/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5.b;

/**
 *
 * @author DELL
 */
public abstract class Person {
    protected String name;

    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    
    public abstract double getSalary();    
    public void display(){
    }

}