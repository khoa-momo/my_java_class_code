/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DELL
 */
public class Ticket {
    String path;
    int price;

    public Ticket() {
    }

    public Ticket(String path, int price) {
        this.path = path;
        this.price = price;
    }

    @Override
    public String toString() {
        return "(" + path + ", " + price + ")";
    }
    
    
}
