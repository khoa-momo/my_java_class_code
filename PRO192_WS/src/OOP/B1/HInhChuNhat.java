/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HInhChuNhat {
    private float height;
    private float width;
    private double area;
    private double perimeter;

    public HInhChuNhat(){
    }
    public HInhChuNhat(float height,float width) {
        this.height = height;
        this.width = width;
        this.area = area;
        this.perimeter = perimeter;
    }
    
    public void setHeight(float height){
        this.height = height;
    } 
    public float getHeight(){
        return height;
    } 
    public void setWidth(float width){
        this.width = width;
    } 
    public float getWidth(){
        return width;
    }
    
 public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("height :");
       height = scanner.nextFloat();
       System.out.print("width :");
       width = scanner.nextFloat();     
 }

 public double area(){
    return area = height*width;
 }
 public double perimeter(){
    return perimeter = 2*(height+width);
 }
 
 @Override
  public String toString(){
    return "The height is: " + height + "\tThe width is: " + width + "\tThe area is: " + area + "\tThe perimeter is: " + perimeter;
 }

public static void main(String[] args) { 
    HInhChuNhat r = new HInhChuNhat();
    r.input();
    r.area();
    r.perimeter();
    System.out.println(r.toString());
    
}    
}
