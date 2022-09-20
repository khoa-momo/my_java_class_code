/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheWandShop_P1;

/**
 *
 * @author DELL
 */
public class Wand { 

    private String Owner;
    private String Woodtype;
    private String Core;
    private float Price;
    
    public Wand(String Owner, String Woodtype, String Core, float Price) {
        this.Owner = Owner;
        this.Woodtype = Woodtype;
        this.Core = Core;
        this.Price = Price;
    }

    public String getOwner() {
        return Owner;
    }

    public String getWoodtype() {
        return Woodtype;
    }

    public String getCore() {
        return Core;
    }

    public float getPrice() {
        return Price;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setWoodtype(String Woodtype) {
        this.Woodtype = Woodtype;
    }

    public void setCore(String Core) {
        this.Core = Core;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Wand{" + "Owner=" + Owner + ", Woodtype=" + Woodtype + ", Core=" + Core + ", Price=" + Price + '}';
    }
 
    
    
    
    
}
