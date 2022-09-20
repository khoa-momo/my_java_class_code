package Database;

import BST.BinarySearchTree;
import LinkedList.NodeList;
import LinkedList.MyList;
import Model.Book;
import Model.Lending;
import Model.Reader;
import java.util.ArrayList;


public class Database {

    private BinarySearchTree books = new BinarySearchTree();
    private MyList<Lending> lendings = new MyList<>();
    private MyList<Reader> readers = new MyList<>();

    public Database() {
    }

    public BinarySearchTree getBooks() {
        return books;
    }

    public void setBooks(BinarySearchTree books) {
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
    
    public void addBook(Book b) {
        books.insert(b);
    }
    
    public void deleteBookByCopy(Book b){
        books.deleteByCopy(b);
    }
    
    public void balance(){
        books.balance();
    }
    
    public int countBook() {
        ArrayList<Book> t = new ArrayList<>();
        books.inOrderAdd(t, books.root);
        return t.size();
    }

    public void addReader(Reader r) {
        readers.addLast(r);
    }

    public Reader searchReaderByRCode(String rCode) {
        NodeList<Reader> p = readers.head;
        while (p != null) {
            if (p.data.getRcode().equalsIgnoreCase(rCode)) {
                return p.data;
            }
            p = p.next;
        }
        return null;
    }
    
    public void deleteReaderByRCode(String rCode) {
        NodeList<Reader> p = readers.head;
        while (p != null) {
            if (p.data.getRcode().equalsIgnoreCase(rCode)) {
                readers.remove(p);
            }
            p = p.next;
        }
    }

    public void addLending(Lending l) {
        lendings.addLast(l);
    }
    
    public Lending searchLendingByBCodeAndRCode(String bCode, String rCode) {
        NodeList<Lending> p = lendings.head;
        while (p != null) {
            if (p.data.getBcode().equalsIgnoreCase(bCode) && p.data.getRcode().equalsIgnoreCase(rCode)) {
                return p.data;
            }
            p = p.next;
        }
        return null;
    }

    public void sortLendingByBCodeAndRCode() {
        for (NodeList<Lending> p = lendings.head; p != null; p = p.next) {
            for (NodeList<Lending> p2 = p.next; p2 != null; p2 = p2.next) {
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
