package lms;

public class Book {

    String bcode;
    String title;
    int quantity;
    public int lended;
    double price;

    public Book() {
    }

    public Book(String bcode, String title, int quantity, int lended, double price) {
        this.bcode = bcode;
        this.title = title;
        this.quantity = quantity;
        if (lended <= quantity) {
            this.lended = lended;
        }
        this.price = price;
    }

    public String getBcode() {
        return bcode;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getLended() {
        return lended;
    }

    public double getPrice() {
        return price;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLended(int lended) {
        this.lended = lended;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.bcode + " | " + this.title + "\t" + "|  " + this.quantity + "\t |  " + this.lended + "\t| " + this.price + "\t| " + (Math.ceil(quantity * price * 10) / 10);
    }
}
