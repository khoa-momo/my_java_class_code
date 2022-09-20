
import Database.Database;
import Ob.Book;
import Ob.Lending;
import Ob.Reader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        int number;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Input invalid! Please enter from " + min + " to " + max);
                    System.out.print("Re-enter: ");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Input invalid! Please enter a number!");
                System.out.print("Re-enter: ");
            }
        } while (true);
    }

    public static double inputDouble(String mess, double min, double max) {
        System.out.print(mess);
        double number;
        do {
            try {
                number = Double.parseDouble(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Input invalid! Please enter from " + min + " to " + max);
                    System.out.print("Re-enter: ");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Input invalid! Please enter a number!");
                System.out.print("Re-enter: ");
            }
        } while (true);
    }

    public static String inputString(String mess) {
        System.out.print(mess);
        String s;
        do {
            s = scanner.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println("Input invalid. Please don't enter a blank/empty string!");
                System.out.print("Re-enter: ");
            } else {
                return s;
            }
        } while (true);
    }

    public static Database database = new Database();

    public static void MenuBook() {
        int option;
        do {
            System.out.println("=========BOOK MANAGEMENT=========");
            System.out.println("1. Load data from file");
            System.out.println("2. Input & add to the end");
            System.out.println("3. Display data");
            System.out.println("4. Save book list to file");
            System.out.println("5. Search by bcode");
            System.out.println("6. Delete by bcode");
            System.out.println("7. Sort by bcode");
            System.out.println("8.  Input & add to beginning");
            System.out.println("9. Add after position  k");
            System.out.println("10. Delete position k");
            System.out.println("11. Quit");
            option = inputInt("Choose 1 option: ", 1, 11);
            switch (option) {
                case 1:
                    loadBookListFromFile();
                    break;
                case 2:
                    addBook("end");
                    break;
                case 3:
                    database.displayBook();
                    break;
                case 4:
                    saveBookListToFile();
                    break;
                case 5:
                    searchBook();
                    break;
                case 6:
                    deleteBook("code");
                    break;
                case 7:
                    database.sortBookByBCode();
                    break;
                case 8:
                    addBook("first");
                    break;
                case 9:
                    addBook("pos");
                    break;
                case 10:
                    deleteBook("pos");
                    break;
                case 11:
                    return;
            }
        } while (true);
    }

    public static void MenuReader() {
        int option;
        do {
            System.out.println("=========READER MANAGEMENT=========");
            System.out.println("1. Load data from file");
            System.out.println("2. Input & add to the end");
            System.out.println("3. Display data");
            System.out.println("4. Save reader list to file");
            System.out.println("5. Search by rcode");
            System.out.println("6. Delete by rcode");
            System.out.println("7. Quit");
            option = inputInt("Choose 1 option: ", 1, 7);
            switch (option) {
                case 1:
                    loadReaderListFromFile();
                    break;
                case 2:
                    addReader();
                    break;
                case 3:
                    database.displayReader();
                    break;
                case 4:
                    saveReaderListToFile();
                    break;
                case 5:
                    searchReader();
                    break;
                case 6:
                    deleteReader();
                    break;
                case 7:
                    return;
            }
        } while (true);
    }

    public static void MenuBookLending() {
        int option;
        do {
            System.out.println("=========LENDING MANAGEMENT=========");
            System.out.println("1. Input data");
            System.out.println("2. Display data");
            System.out.println("3. Sort by bcode + rcode");
            System.out.println("4. Quit");
            option = inputInt("Choose 1 option: ", 1, 4);
            switch (option) {
                case 1:
                    addLending();
                    break;
                case 2:
                    database.displayLending();
                    break;
                case 3:
                    database.sortLendingByBCodeAndRCode();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    public static void loadBookListFromFile() {
        try {
            String file = inputString("Enter the file name: ");
            database.loadFileBook(file);
            System.err.println("Loaded!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //functionCode = last - addLast; first - addFirst; pos - add after position k
    public static void addBook(String fuctionCode) {
        String code;
        do {
            code = inputString("Enter Book's code: ");
            Book check = database.searchBookByBCode(code);
            if (check != null) {
                System.out.print("The code is duplicated! Please re-enter: ");
            } else {
                break;
            }
        } while (true);

        String name = inputString("Enter book's name: ");
        int quantity = inputInt("Enter quantity: ", 0, Integer.MAX_VALUE);
        int lended = inputInt("Enter number of book lended: ", 0, quantity);
        double price = inputDouble("Enter price: ", 0, Double.MAX_VALUE);

        if (fuctionCode.equalsIgnoreCase("last")) {
            database.addBookToEnd(new Book(code, name, quantity, lended, price));
        } else if (fuctionCode.equalsIgnoreCase("first")) {
            database.addBookToBegin(new Book(code, name, quantity, lended, price));
        } else if (fuctionCode.equalsIgnoreCase("pos")) {
            int k = inputInt("Enter position k = ", 0, database.getBooksList().size() - 1);
            database.addBookAfterPosition(k, new Book(code, name, quantity, lended, price));
        } else {
            System.err.println("Wrong functionCode!");
            return;
        }
        System.out.println("Added sucessfully!");
    }

    public static void saveBookListToFile() {
        try {
            String file = inputString("Enter the file name: ");
            database.saveFileBook(file);
            System.err.println("Saved!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void searchBook() {
        String codeSearch = inputString("Enter a code to search: ");
        Book b = database.searchBookByBCode(codeSearch);
        if (b == null) {
            System.out.println("There is no book fit your require!");
        } else {
            System.out.println("code |       Title        |  Quantity  |  Lended  |  Price");
            System.out.printf("%3s | %18s | %10d | %8d | %7.1f\n", b.getBcode(), b.getTitle(),
                    b.getQuantity(), b.getLended(), b.getPrice());
        }
    }
    //functionCode = code - delete by Code; pos - delete at postion k
    public static void deleteBook(String functionCode) {
        if (functionCode.equalsIgnoreCase("code")) {
            String code;
            Book book;
            do {
                code = inputString("Enter Book's code: ");
                book = database.searchBookByBCode(code);
                if (book == null) {
                    System.out.print("There is no Book fit your input!");
                    return;
                } else {
                    database.deleteBookByBCode(code);
                    break;
                }
            } while (true);
        } else if (functionCode.equalsIgnoreCase("pos")) {
            int k = inputInt("Enter postition to delete: ", 0, database.getBooksList().size() - 1);
            database.deleteBookAtPosition(k);
        } else {
            System.err.println("Wrong functionCode!");
            return;
        }
        System.out.println("Deleted!");
    }

    public static void loadReaderListFromFile() {
        try {
            String file = inputString("Enter the file name: ");
            database.loadFileReader(file);
            System.err.println("Loaded!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void addReader() {
        String code;
        do {
            code = inputString("Enter Reader's code: ");
            Reader check = database.searchReaderByRCode(code);
            if (check != null) {
                System.out.print("The code is duplicated! Please re-enter: ");
            } else {
                break;
            }
        } while (true);

        String name = inputString("Enter book's name: ");
        int byear = inputInt("Enter Birth year: ", 1900, 2010);

        database.addReader(new Reader(code, name, byear));
        System.out.println("Added sucessfully!");
    }

    public static void saveReaderListToFile() {
        try {
            String file = inputString("Enter the file name: ");
            database.saveFileReader(file);
            System.err.println("Saved!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void searchReader() {
        String codeSearch = inputString("Enter a code to search: ");
        Reader r = database.searchReaderByRCode(codeSearch);
        if (r == null) {
            System.out.println("There is no reader fit your require!");
        } else {
            System.out.println("code |       Name        |  Birth Year");
            System.out.printf("%4s | %18s | %5d\n", r.getRcode(), r.getName(), r.getByear());
        }
    }

    public static void deleteReader() {
        String code;
        Reader r;
        do {
            code = inputString("Enter Book's code: ");
            r = database.searchReaderByRCode(code);
            if (r == null) {
                System.out.print("There is no Reader fit your input!");
                return;
            } else {
                database.deleteBookByBCode(code);
                break;
            }
        } while (true);
        System.out.println("Deleted!");
    }

    public static void addLending() {
        String bCode = inputString("Enter book's code: ");
        String rCode = inputString("Enter reader's code: ");

        Book book = database.searchBookByBCode(bCode);
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

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("******LIBRARY MANAGEMENT SYSTEM******");
            System.out.println("1. Book List");
            System.out.println("2. Reader List");
            System.out.println("3. Lending List");
            System.out.println("4. Quit");
            option = inputInt("Select the list you want to work on: ", 1, 4);
            switch (option) {
                case 1:
                    MenuBook();
                    break;
                case 2:
                    MenuReader();
                    break;
                case 3:
                    MenuBookLending();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

}
