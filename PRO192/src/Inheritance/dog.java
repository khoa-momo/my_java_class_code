/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author DELL
 */
public class dog extends animal{
    protected String name;
    protected String color;
    protected double weight;
    
    @Override
    public void sound(){
        System.out.println("Woof");
    }
    public void landing(){
        System.out.println("guarding");
    }
}
