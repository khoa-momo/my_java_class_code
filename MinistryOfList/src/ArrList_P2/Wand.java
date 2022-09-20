/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrList_P2;

/**
 *
 * @author DELL
 */
public class Wand {
    public String WandId;
    public String Maker;
    public String Owner;
    public float price;

    public Wand() {
    }
    public Wand(String WandId, String Maker, String Owner, float price) {
        this.WandId = WandId;
        this.Maker = Maker;
        this.Owner = Owner;
        this.price = price;
    }

    public String getWandId() {
        return WandId;
    } 
    public void setWandId(String WandId) {
        this.WandId = WandId;
    }

    public String getMaker() {
        return Maker;
    } 
    public void setMaker(String Maker) {
        this.Maker = Maker;
    }

    public String getOwner() {
        return Owner;
    } 
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public float getPrice() {
        return price;
    } 
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return WandId + "\t" + Maker + "\t" + Owner + "\t" + price ;
    }
    
    
    
    
    
}
