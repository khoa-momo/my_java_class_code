/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Ob.Book;
import Ob.Lending;
import Ob.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author quynm
 */
public class Database {

    private MyList<Book> books = new MyList<>();
    private MyList<Lending> lendings = new MyList<>();
    private MyList<Reader> readers = new MyList<>();

    public Database() {
    }

    public MyList<Book> getBooksList() {
        return books;
    }

    public void setBooksList(MyList<Book> books) {
        this.books = books;
    }

    public MyList<Lending> getLendingsList() {
        return lendings;
    }

    public void setLendingsList(MyList<Lending> lendings) {
        this.lendings = lendings;
    }

    public MyList<Reader> getReadersList() {
        return readers;
    }

    public void setReadersList(MyList<Reader> readers) {
        this.readers = readers;
    }

    public void loadFileBook(String fname) throws IOException {
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String[] a;
        String bCode;
        String title;
        int quantity;
        double price;
        while (true) {
            s = br.readLine();
            if (s == null || s.trim().length() < 3) {
                break;
            }
            a = s.split("[|]");
            bCode = a[0].trim();
            title = a[1].trim();
            quantity = Integer.parseInt(a[2].trim());
            price = Double.parseDouble(a[3].trim());
            books.addLast(new Book(bCode, title, quantity, 0, price));
        }
        fr.close();
        br.close();
    }

    public void saveFileBook(String fname) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node<Book> p = books.head;
        while (p != null) {
            pw.printf("%5s | %20s | %2d | %.1f | %3d\r\n", p.data.getBcode(), p.data.getTitle(),
                    p.data.getQuantity(), p.data.getPrice(), p.data.getLended());
            p = p.next;
        }
        pw.close();
        fw.close();
    }

    public void loadFileReader(String fname) throws IOException {
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String[] a;
        String rCode;
        String name;
        int byear;
        while (true) {
            s = br.readLine();
            if (s == null || s.trim().length() < 3) {
                break;
            }
            a = s.split("[|]");
            rCode = a[0].trim();
            name = a[1].trim();
            byear = Integer.parseInt(a[2].trim());
            readers.addLast(new Reader(rCode, name, byear));
        }
        fr.close();
        br.close();
    }

    public void saveFileReader(String fname) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node<Reader> p = readers.head;
        while (p != null) {
            pw.printf("%10s | %30s | %4d\r\n", p.data.getRcode(), p.data.getName(), p.data.getByear());
            p = p.next;
        }
        pw.close();
        fw.close();
    }

    public void addBookToEnd(Book b) {
        books.addLast(b);
    }

    public void addBookToBegin(Book b) {
        books.addFirst(b);
    }

    public void addBookAfterPosition(int k, Book b) {
        books.insertAfter(books.pos(k), b);
    }

    public void addReader(Reader r) {
        readers.addLast(r);
    }

    public void addLending(Lending l) {
        lendings.addLast(l);
    }

    public void displayBook() {
        System.out.println("code |       Title        |  Quantity  |  Lended  |  Price   |   Value");
        Node<Book> p = books.head;
        double value;
        while (p != null) {
            value = p.data.getPrice() * p.data.getQuantity();
            System.out.printf("%2s | %18s | %10d | %8d | %7.1f | %7.1f\n", p.data.getBcode(), p.data.getTitle(),
                    p.data.getQuantity(), p.data.getLended(), p.data.getPrice(), value);
            p = p.next;
        }
    }

    public void displayReader() {
        System.out.println("code |       Name        |  Birth Year");
        Node<Reader> p = readers.head;
        while (p != null) {
            System.out.printf("%4s | %18s | %5d\n", p.data.getRcode(), p.data.getName(), p.data.getByear());
            p = p.next;
        }
    }

    public void displayLending() {
        System.out.println("Bcode | Rcode | State ");
        Node<Lending> p = lendings.head;
        double value;
        while (p != null) {
            System.out.printf("%4s | %4s | %3d \n", p.data.getBcode(), p.data.getRcode(), p.data.getState());
            p = p.next;
        }
    }

    public Book searchBookByBCode(String bCode) {
        Node<Book> p = books.head;
        while (p != null) {
            if (p.data.getBcode().equalsIgnoreCase(bCode)) {
                return p.data;
            }
            p = p.next;
        }
        return null;
    }

    public Reader searchReaderByRCode(String rCode) {
        Node<Reader> p = readers.head;
        while (p != null) {
            if (p.data.getRcode().equalsIgnoreCase(rCode)) {
                return p.data;
            }
            p = p.next;
        }
        return null;
    }

    public Lending searchLendingByBCodeAndRCode(String bCode, String rCode) {
        Node<Lending> p = lendings.head;
        while (p != null) {
            if (p.data.getBcode().equalsIgnoreCase(bCode) && p.data.getRcode().equalsIgnoreCase(rCode)) {
                return p.data;
            }
            p = p.next;
        }
        return null;
    }

    public void deleteBookByBCode(String bCode) {
        Node<Book> p = books.head;
        while (p != null) {
            if (p.data.getBcode().equalsIgnoreCase(bCode)) {
                books.remove(p);
            }
            p = p.next;
        }
    }

    public void deleteBookAtPosition(int k) {
        books.removePos(k);
    }

    public void deleteReaderByRCode(String rCode) {
        Node<Reader> p = readers.head;
        while (p != null) {
            if (p.data.getRcode().equalsIgnoreCase(rCode)) {
                readers.remove(p);
            }
            p = p.next;
        }
    }

    public void sortBookByBCode() {
        for (Node<Book> p = books.head; p != null; p = p.next) {
            for (Node<Book> p2 = p.next; p2 != null; p2 = p2.next) {
                if (p.data.getBcode().compareTo(p2.data.getBcode()) > 0) { //p>p2
                    //swap
                    Book tmp = p.data;
                    p.data = p2.data;
                    p2.data = tmp;
                }
            }
        }
    }

    public void sortLendingByBCodeAndRCode() {
        for (Node<Lending> p = lendings.head; p != null; p = p.next) {
            for (Node<Lending> p2 = p.next; p2 != null; p2 = p2.next) {
                if (p.data.getBcode().compareTo(p2.data.getBcode()) > 0) { //p>p2(Bcode)
                    //swap
                    Lending tmp = p.data;
                    p.data = p2.data;
                    p2.data = tmp;
                } else if (p.data.getBcode().compareTo(p2.data.getBcode()) == 0) { //p=p2 (Bcode)
                    if (p.data.getRcode().compareTo(p2.data.getRcode()) > 0) { //p>p2 (Rcode)
                        //swap
                        Lending tmp = p.data;
                        p.data = p2.data;
                        p2.data = tmp;
                    }
                }
            }
        }
    }

}
