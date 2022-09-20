/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo10;

import java.io.Serializable;

/**
 *
 * @author KienLT
 */
public class Book implements Serializable {

    private String title;
    private String author;
    private float price;
    private int year;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + ", year=" + year + '}';
    }

    public Book() {
    }

    public Book(String title, String author, float price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
