package Controller;

import Main.Main;
import BST.Node;
import Database.Database;
import Main.Validation;
import Model.Book;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BookController {

    public Database database = new Database();
    public Validation v = new Validation();

    public BookController() {
    }

    public void loadFileBook(){
        database.getBooks().clear();
        try {
            String file = v.inputString("Enter the file name: ");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            String[] a;
            String bCode;
            String title;
            int quantity;
            int lended;
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
                lended = Integer.parseInt(a[3].trim());
                price = Double.parseDouble(a[4].trim());
                database.addBook(new Book(bCode, title, quantity, lended, price));
            }
            fr.close();
            br.close();
            System.err.println("Loaded!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void saveFileBookInorder(){ // Using FileReader class
        try {
            String file = v.inputString("Enter the file name: ");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            ArrayList<Book> list = new ArrayList<>();
            Node p = database.getBooks().root;
            database.getBooks().inOrderAdd(list, p);

            for (Book book : list) {
                pw.printf("%5s | %20s | %2d | %3d | %.1f\r\n", book.getBcode(), book.getTitle(),
                        book.getQuantity(), book.getLended(), book.getPrice());
            }

            pw.close();
            fw.close();
            System.err.println("Saved!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addBook() {
        String code;
        do {
            code = v.inputString("Enter Book's code: ");
            Node check = database.getBooks().search(database.getBooks().root, code);
            if (check != null) {
                System.out.print("The code is duplicated! Please re-enter: ");
            } else {
                break;
            }
        } while (true);

        String name = v.inputString("Enter book's name: ");
        int quantity = v.inputInt("Enter quantity: ", 0, Integer.MAX_VALUE);
        int lended = v.inputInt("Enter number of book lended: ", 0, quantity);
        double price = v.inputDouble("Enter price: ", 0, Double.MAX_VALUE);

        database.addBook(new Book(code, name, quantity, lended, price));
        System.out.println("Added sucessfully!");
    }

    public void inOrder() {
        System.out.println("code |       Title        |  Quantity  |  Lended  |  Price");
        database.getBooks().inOrderTravesal(database.getBooks().root);
    }

    public void breath() {
        System.out.println("code |       Title        |  Quantity  |  Lended  |  Price");
        database.getBooks().breath(database.getBooks().root);
    }

    public void searchBook() {
        String codeSearch = v.inputString("Enter a code to search: ");
        Node b = database.getBooks().search(database.getBooks().root, codeSearch);
        if (b == null) {
            System.out.println("There is no book fit your require!");
        } else {
            System.out.println("code |       Title        |  Quantity  |  Lended  |  Price");
            System.out.printf("%3s | %18s | %10d | %8d | %7.1f\n", b.data.getBcode(), b.data.getTitle(),
                    b.data.getQuantity(), b.data.getLended(), b.data.getPrice());
        }
    }

    public void deleteBook() {
        String code;
        Node book;
        do {
            code = v.inputString("Enter Book's code: ");
            book = database.getBooks().search(database.getBooks().root, code);
            if (book == null) {
                System.out.print("There is no Book fit your input!");
                return;
            } else {
                database.deleteBookByCopy(book.data);
                break;
            }
        } while (true);

        System.out.println("Deleted!");
    }
    
    public void balance(){
        database.balance();
        breath();
    }

    public void countBook() {
        System.out.println("Number of books: " + database.countBook());
    }
    
//f1():  Thực hiện BR  và IN .
//f2():  Tìm bản ghi có code = 6, sửa lại price=9 và BR.
//f3():  Xóa bản ghi có code = 3 (by copying), và BR.
//f4():  Không nhập dữ liệu thêm bản ghi (7,G,3,2,1) và BR.
//f5():  Cân bằng (simple balance) cây con gốc 3 và BR.
    
    public void f1(){
        breath();
        System.out.println("");
        inOrder();
    }
    
    public void f2(){
        Node b = database.getBooks().search(database.getBooks().root, "6");
        b.data.setPrice(9);
        breath();
    }
    
    public void f3(){
        Node book = database.getBooks().search(database.getBooks().root, "3");
        database.deleteBookByCopy(book.data);
        breath();
    }
    
    public void f4(){
        database.addBook(new Book("7", "G", 3, 2, 1));
        breath();
    }
    
    public void f5(){
        
    }

}
