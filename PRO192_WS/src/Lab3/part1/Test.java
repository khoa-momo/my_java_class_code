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
public class Test { 
    public static void main(String[] args) {
        
      Car c1 = new Car();
      c1.pressStartButton();        
      c1.pressAcceleratorButton();
      c1.output();   
      
      System.out.println("");
      
      Car c2 = new Car("red", 100, true, true);
      c2.pressAcceleratorButton();
      c2.setColour("black");
      System.out.println("Colour of c2: " + c2.getColour());
      c2.output(); 	
         
         
         
    } 
}
