/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Rectangle {
    private float height;
    private float width;

    public Rectangle(){
    }

    public Rectangle(float height,float width) {
        this.height = height;
        this.width = width;
    }

 public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("height :");
       height = scanner.nextFloat();
       
       System.out.print("width :");
       width = scanner.nextFloat();     
 }

 public void area(){
    System.out.println("Area=" +(float)(height*width));
 }
  public void perimeter(){
    System.out.println("Area=" +2*(float)(height+width));
 }


public static void main(String[] args) { 
    Rectangle r = new Rectangle();
    r.input();
    r.area();
    r.perimeter();
}

}