/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5_p2;

/**
 *
 * @author letha
 */
public abstract class Person {
    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public void display(){
        
    }
    
    public abstract double getSalary();
}
