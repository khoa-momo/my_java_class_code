/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3.part1;

/**
 *
 * @author DELL
 */
public class Car {
    protected String Colour;
    protected int EnginePower;
    protected boolean Convertible;
    protected boolean ParkingBrake;
    
    public Car(){
    }
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) { 
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    
    
    public String getColour(){  
    return Colour;  
    }  
    public void setColour(String Colour){  
    this.Colour = Colour;  
    }
    
    public int getEnginePower(){  
    return EnginePower;  
    }  
    public void setEnginePower(int EnginePower){  
    this.EnginePower = EnginePower;  
    }    
    
    public boolean getConvertible(){  
    return Convertible;  
    }  
    public void setConvertible(boolean Convertible){  
    this.Convertible = Convertible;  
    }
    
    public boolean getParkingBrake(){  
    return ParkingBrake;  
    }  
    public void setParkingBrake(boolean ParkingBrake){  
    this.ParkingBrake = ParkingBrake;  
    }
    
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");  
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");  
    }
    
    public void output(){
        System.out.println("Colour: " + Colour);  
        System.out.println("EnginePower: " + EnginePower); 
        System.out.println("Convertible: " + Convertible); 
        System.out.println("ParkingBrake: " + ParkingBrake); 
    }
    
} 