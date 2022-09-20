/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FruitShop;

/**
 *
 * @author DELL
 */
public class Fruit {
    private static int increaseID = 0;
    private int FruitId;
    private String FruitName;
    private float Price;
    private int Quantity;
    private String Origin;

    public Fruit() {
        this.FruitId = ++increaseID;
    }

    public Fruit(String FruitName, float Price, int Quantity, String Origin) {
        this.FruitId = ++increaseID;
        this.FruitName = FruitName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Origin = Origin;
    }

    public int getFruitId() {
        return FruitId;
    }

    public void setFruitId(int FruitId) {
        this.FruitId = FruitId;
    }

    public String getFruitName() {
        return FruitName;
    }

    public void setFruitName(String FruitName) {
        this.FruitName = FruitName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    @Override
    public String toString() {
        return String.format("      %-10s   %-15s %-15s   %-15s", FruitId, FruitName, Origin, Price); 
    }
    
    
}
