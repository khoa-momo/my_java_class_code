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
public class Worker extends Person{
    protected double bSalary;
    protected double hrs;
    final double RATE = 5.5;

    public Worker(){
    }
    public Worker(double hrs, double bSalary, String name) {
        super(name);
        this.hrs = hrs;
        this.bSalary = bSalary;
    }

    @Override
    public double getSalary(){
        return bSalary * RATE;
    }   
    @Override
    public void display(){
        System.out.println("Worker name: " + name);
        System.out.println("Worker working hours: " + hrs);
        System.out.println("Worker salary: " + getSalary());
        //System.out.println("Worker salary: " + String.format("%.2f", getSalary()));
    }

}
