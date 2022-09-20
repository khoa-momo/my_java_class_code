
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Book {
    private String Title;
    private int Price;
    
    public Book(){
    }
    public Book(String Title, int Price) {
        this.Title = Title;
        this.Price = Price;
    }
    public String getTitle(){
        return Title.toUpperCase();
    }
    public int getPrice(){
        return Price;
    }
    public void setTitle(String title){
        this.Title=title;
    }
    public void setPrice(int price){
        this.Price=price;
    } 

}
