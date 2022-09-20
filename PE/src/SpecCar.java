/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class SpecCar extends Car{
    int Type;
    
    public SpecCar(){
    } 
    public SpecCar(String Maker, int Price, int Type) { 
        super.Maker = Maker;
        super.Price = Price;
        this.Type = Type;  
    }  
    public int getType() {
        return Type;
    } 
    public void setType(int Type) {
        this.Type = Type;
    }

    public void setData(){
        System.out.println("XY"+Maker);
        Price = Price + 20;
    }
    public int getValue() {
        if (Type < 7) {
            return Price + 10;
        } else {
            return Price + 15;
        }
    }
    
    @Override
    public String toString() { 
        return super.Maker + "\t" + super.Price + "\t" + Type;
    }
    
    
}
