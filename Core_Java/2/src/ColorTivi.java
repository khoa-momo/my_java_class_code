/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class ColorTivi extends Tivi{
   private int serie;

    public ColorTivi() {
    }

    public ColorTivi(String type, int serie, double price) {
        super(type, price);
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    public double getPrice() {
        double price = 0;
        if(serie > 3000){
            price = 0.9 * super.getPrice();
        }else{
            price = super.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        return super.getType() + "\t" + serie + "\t" + super.getPrice();
    }
    
    
    
 
    
}
