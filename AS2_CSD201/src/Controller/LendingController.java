
package Controller;

import Database.Database;
import LinkedList.NodeList;
import Main.Validation;
import Model.Book;
import Model.Lending;
import Model.Reader;


public class LendingController {
    
    public Database database = new Database();
    public Validation v = new Validation();
    
    public  void addLending() {
        String bCode = v.inputString("Enter book's code: ");
        String rCode = v.inputString("Enter reader's code: ");

        Book book = database.getBooks().search(database.getBooks().root,bCode).data;
        Reader reader = database.searchReaderByRCode(rCode);
        Lending lending = database.searchLendingByBCodeAndRCode(bCode, rCode);

        if (book == null) {
            System.out.println("added failed! The book's code is not existed");
            return;
        }
        if (reader == null) {
            System.out.println("added failed! The book's code is not existed");
            return;
        }
        if (lending != null && lending.getState() == 1) {
            System.out.println("added failed! The book is still borrowing by" + rCode);
            return;
        }
        if (book.getLended() == book.getQuantity()) {
            System.out.println("No more book to borrow!");
            database.addLending(new Lending(bCode, rCode, 0)); //add with state cannot borrow
        } else if (book.getLended() < book.getQuantity()) {
            book.setLended(book.getLended() + 1);
            database.addLending(new Lending(bCode, rCode, 1)); //lended
        }
        System.out.println("Added!");
    }

    public void displayLending() {
        System.out.println("Bcode | Rcode | State ");
        NodeList<Lending> p = database.getLendingsList().head;
        double value;
        while (p != null) {
            System.out.printf("%4s | %4s | %3d \n", p.data.getBcode(), p.data.getRcode(), p.data.getState());
            p = p.next;
        }
    }
    
    public void sortLending(){
        database.sortLendingByBCodeAndRCode();
        displayLending();
    }
}
