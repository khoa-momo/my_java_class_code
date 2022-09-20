/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmanager;

/**
 *
 * @author TIEN DUNG
 */
public class Brand {
    private String brandID;
    public String brandName;
    private String sounBrand;
    private double price;

    public Brand() {
    }

    public Brand(String brandID, String brandName, String sounBrand, double price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.sounBrand = sounBrand;
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

    public String getSounBrand() {
        return sounBrand;
    }

    public void setSounBrand(String sounBrand) {
        this.sounBrand = sounBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return brandID + ", " + brandName + ", " + sounBrand + ": " + price + "\n";
    }
    
    
}
