/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarPrj;

/**
 *
 * @author win
 */
public class Brand {

    private String brandID;
    private String brandName;
    private String soundbrand;
    private double price;

    public Brand() {
    }

    public Brand(String brandID, String brandName, String soundbrand, double price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.soundbrand = soundbrand;
        this.price = price;
    }

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSoundbrand() {
        return soundbrand;
    }

    public void setSoundbrand(String soundbrand) {
        this.soundbrand = soundbrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brandID + ", " + brandName + ", " + soundbrand + ": " + price;
    }
}
