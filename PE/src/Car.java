/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Car {
    String Maker;
    int Price;
    
    public Car(){
    }

    public Car(String Title, int Price) {
        this.Maker = Title;
        this.Price = Price;
    } 
    public String getTitle() {
        return Maker;
    } 
    public void setTitle(String Title) {
        this.Maker = Title;
    } 
    public int getPrice() {
        return Price;
    } 
    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() { 
        return Maker + "\t" + Price;
    }
    
 
    
}
