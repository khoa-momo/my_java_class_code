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
public class Officer extends Person{
    protected double salary;

    public Officer(){
    }
    public Officer(double salary, String name) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary(){
        return salary;
    }    
    @Override
    public void display(){
        System.out.println("Officer name: " + name);
        System.out.println("Officer salary: " + salary);
    }

}