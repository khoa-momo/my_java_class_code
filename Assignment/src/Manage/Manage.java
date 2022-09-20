/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

import lms.Book;
import lms.Reader;
import lms.Lending;
import ListL.*;
import BList.*;
import RList.*;
import java.io.IOException;

public class Manage {

    BookList bl = new BookList();
    ReaderList rl = new ReaderList();
    LenderList ll = new LenderList();
//Book-------------------------------------------------------------------------
    //(1)-------------------------------

    void loadFileB() throws IOException {
        bl.clear();
        System.out.print("Enter file name: ");
        String fname = Validate.checkInputString();
        bl.loadFileBook(fname);
        bl.traverse();
    }

    //(3)-------------------------------
    void displayData() {
        System.out.printf("code|   Title   |Quantity|Lended| Price | Value\n");
        System.out.println("------------------------------------------------");
        bl.traverse();
    }

    //(2)-------------------------------
    void addToEnd() {
        System.out.print("Enter book code: ");
        String bcode = Validate.checkInputString();
        NodeB p = bl.search(bcode);
        if (p != null) {
            System.err.println("This code is duplicate");
            return;
        }
        System.out.print("Enter book name: ");
        String bname = Validate.checkInputString();
        System.out.print("Enter quantity: ");
        int quantity = Validate.checkInputInt();
        System.out.print("Enter price: ");
        double price = Validate.checkInputDouble();

        bl.addLast(new Book(bcode, bname, quantity, 0, price));
        bl.traverse();
    }

    //(4)-------------------------------
    void saveFile() throws IOException {
        System.out.print("Enter file name: ");
        String fname = Validate.checkInputString();
        bl.saveFileBook(fname);
    }

    //(5)-------------------------------
    void searchByBCode() {
        NodeB p = bl.search(Validate.checkInputString());
        if (p == null) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }
    }

    //(6)-------------------------------
    void deleByBCode() {
        bl.dele(Validate.checkInputString());
    }

    //(7)-------------------------------
    void sortByBcode() {
        bl.sortByBCode();
        bl.traverse();
    }

    //(8)-------------------------------
    void addToBeginning() {
        System.out.print("Enter book code: ");
        String bcode = Validate.checkInputString();
        NodeB p = bl.search(bcode);
        if (p != null) {
            System.err.println("This code is duplicate");
            return;
        }
        System.out.print("Enter book name: ");
        String bname = Validate.checkInputString();
        System.out.print("Enter quantity: ");
        int quantity = Validate.checkInputInt();
        System.out.print("Enter price: ");
        double price = Validate.checkInputDouble();

        bl.addFirst(new Book(bcode, bname, quantity, 0, price));
        bl.traverse();
    }

    //(9)-------------------------------
    void addAffter() {
        System.out.print("Enter position k: ");
        int k = Validate.checkInputInt();
        NodeB pos = bl.pos(k);
        System.out.print("Enter book code: ");
        String bcode = Validate.checkInputString();
        System.out.print("Enter book name: ");
        String bname = Validate.checkInputString();
        System.out.print("Enter quantity: ");
        int quantity = Validate.checkInputInt();
        System.out.print("Enter price: ");
        double price = Validate.checkInputDouble();

        bl.insertAfter(pos, new Book(bcode, bname, quantity, 0, price));
        bl.traverse();
    }

    //(10)------------------------------
    void delePos() {
        System.out.print("Enter position k: ");
        int k = Validate.checkInputInt();
        bl.removePos(k);
    }

//Reader-----------------------------------------------------------------------
    void loadFileR() throws IOException {
        rl.clear();
        System.out.print("Enter file name: ");
        String fname = Validate.checkInputString();
        rl.loadFileReader(fname);
    }

    //(2)-------------------------------
    void addEnd() {
        System.out.print("Enter rcode: ");
        String rcode = Validate.checkInputString();
        Node p = rl.search(rcode);
        if (p != null) {
            System.err.println("This code is duplicate");
            return;
        }
        System.out.print("Enter name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter byear: ");
        int byear = Validate.checkInputInt();

        rl.addLast(new Reader(rcode, name, byear));
        rl.traverse();
    }

    //(3)-------------------------------
    void display() {
        rl.traverse();
    }

    //(4)-------------------------------
    void saveList() throws IOException {
        bl.saveFileBook("Reader_rep.txt");
    }

    //(5)-------------------------------
    void searchByRCode() {
        Node p = rl.search(Validate.checkInputString());
        if (p == null) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }
    }

    //(6)-------------------------------
    void deleByRCode() {
        rl.dele(Validate.checkInputString());
    }

//Lending----------------------------------------------------------------------
    Book b = new Book();
//(1)-------------------------------

    void inputData() {
        System.out.print("Enter book code: ");
        String bcode = Validate.checkInputString();
        System.out.print("Enter reader code: ");
        String rcode = Validate.checkInputString();
        System.out.print("Enter state: ");
        int state = Validate.checkInputInt();
        ll.addLast(new Lending(bcode, rcode, state));
    }
//(2)-------------------------------

    void printData() {
        ll.traverse();
    }
}
