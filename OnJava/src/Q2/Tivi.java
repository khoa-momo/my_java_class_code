/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author DELL
 */
public class Tivi {
    private double price;
    private String type;

    public Tivi() {
    }

    public Tivi(double price, String type) {
        this.price = price;
        this.type = type;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    @Override
    public String toString() {
        return "price: " + price + "type: ";
    }
    
    
    
}
