/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample04;

/**
 *
 * @author KienLT
 */
public class Sample04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IShape[] shape = new IShape[3];
        shape[0] = new Rectangle(7, 4);
        shape[1] = new Triangle(9, 5, 6);
        shape[2] = new Circle(7);
        
        for(IShape s : shape) {
            calculateAP(s);
        }
        
       
        
    }
    
    public static void calculateAP(IShape shape) {
        System.out.printf("Area: %.2f\n", shape.area());
        System.out.printf("Perimeter: %.2f\n", shape.perimeter());
    }
}
