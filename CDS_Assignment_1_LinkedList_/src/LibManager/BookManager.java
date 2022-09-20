/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DELL
 */
class BookManager {
    Node head,tail;
    BookManager() {
        head=tail=null;  
    }
    void clear() {
        head=tail=null;   
    }
    boolean isEmpty() {
        return(head==null);  
    }

    void visit(Node p) {
        if(p!=null) System.out.println(p.info + " ");
    }
    
    void visitNoLended(Node p) {
        if(p!=null) 
            System.out.printf("%-10s | %-10s | %-10d | %-10.2f\n",p.info.bcode,p.info.title,p.info.quantity,p.info.price);
     }
    
    void traverse() {
        Node p=head;
        while(p!=null) {
            visit(p);
            p=p.next;
        }
    } 
    
    void loadData() {
        Node p=head;
        while(p!=null) {
            visitNoLended(p);
            p=p.next;
        }        
    }
    void addFirst(Book x){ 
        head = new Node(x, head);
        //Empty list
        if(tail == null){
            tail = head;
        }
    }
    
////Functions     
    void addLast(Book x) {
        Node q = new Node(x);
        if(isEmpty()) {
            head=tail=q;
            return;
        }
        tail.next=q;
        tail=q;
    }       
    
    void loadFile(String fname) throws IOException { // Using FileReader class
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s; 
        String [] a;
        //Attribute
        String xbcode; 
        String xtitle; 
        int xquantity; 
        int xlended; 
        double xprice;
        while(true) {
            s = br.readLine();
            if(s==null || s.trim().length()<3) 
                break;
            a = s.split("[|]");
            xbcode = a[0].trim();
            xtitle = a[1].trim();
            xquantity = Integer.parseInt(a[2].trim());
            xlended = Integer.parseInt(a[3].trim());
            xprice = Double.parseDouble(a[4].trim());
            addLast(new Book(xbcode,xtitle,xquantity,xlended,xprice));
        }
        fr.close();
        br.close();
    }

    //Add Last Function
    void addBook() {
        //add Attribute 
        String bcode;
        do {            
            bcode = ValidateInput.inputNonBlankStr("bcode: ", "No blank input!");
            int index = checkDupBcode(bcode);
            if (index == 1) {
                System.out.println("Code is duplicated!");
            }else{
                break;  
            }      
        } while (true);        
        String title = ValidateInput.inputNonBlankStr("title: ", "No blank input!"); 
        int quantity = ValidateInput.inputInt("quantity: ", "Invalid!", 0, Integer.MAX_VALUE); 
        int lended = ValidateInput.inputInt("lended: ", "Invalid, lended have to be smaller than quantity!", 0, quantity);  
        double price = ValidateInput.inputDouble("price: ", "Invalid!", 0, Double.MAX_VALUE);  
        //add book to List
        Book book = new Book(bcode, title, quantity, lended, price);  
        addLast(book);
        System.out.println("Book added successfully!");
        System.out.println("");
    }

    //Add First Function
    void addFirstBook() {
        //add Attribute    
        String bcode;
        do {            
            bcode = ValidateInput.inputNonBlankStr("bcode: ", "No blank input!");
            int index = checkDupBcode(bcode);
            if (index == 1) {
                System.out.println("Code is duplicated!");
            }else{
                break;
            }
        } while (true);  
        String title = ValidateInput.inputNonBlankStr("title: ", "No blank input!"); 
        int quantity = ValidateInput.inputInt("quantity: ", "Invalid!", 0, Integer.MAX_VALUE); 
        int lended = ValidateInput.inputInt("lended: ", "Invalid, lended have to be smaller than quantity!", 0, quantity);  
        double price = ValidateInput.inputDouble("price: ", "Invalid!", 0, Double.MAX_VALUE);  
        //add book to List
        Book book = new Book(bcode, title, quantity, lended, price);  
        addFirst(book);
        System.out.println("Book added first successfully!");
        System.out.println("");
    }
    
    int checkDupBcode(String xbCode){         
        Node p = head;
        while(p != null){
            if(p.info.bcode.equals(xbCode)) 
                return 1;
            p = p.next;
        } 
        return -1;
    } 
    
    void saveFile(String fname) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node p = head;
        while(p!=null) {
            pw.printf("%-10s | %-10s | %-10d | %-10d | %-10.2f\r\n",p.info.bcode,p.info.title,p.info.quantity,p.info.lended,p.info.price);
            p=p.next;
        }
        pw.close();
        fw.close();
    }

    
    Node searchByBcode(String xbCode){         
        Node p = head;
        while(p != null){
            if(p.info.bcode.equals(xbCode)) 
                return(p);
            p = p.next;
        }
        return(null);
    } 

    void sortByBcode() {
        Node pi;
        Node pj;
        Book t;
        for (pi = head; pi!=null; pi=pi.next) {
            for(pj = pi.next; pj!=null; pj=pj.next){
                if(pi.info.bcode.compareTo(pj.info.bcode)>0){
                    t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
            }
        }

    }
    
    void removeFirst(Node q){
        //empty
        if(isEmpty()) 
            return;
        //list has 1 ele da bi xoa 
        head = head.next;
        if(head == null)
            tail = null;
    }
    
    void deleteByBcode(Node q) {
       //TH1: Q is not in list
       if(q == null) return;
       //TH2: q - head
       if(q == head){
           removeFirst(q);
           return;
       }
       //TH3: tim ptu trc q
       Node p = head;
       while(p != null && p.next != q){ 
           p = p.next;
       } 
       if(p == null)
           return; 
       Node q1 = q.next; 
       p.next = q1; 
       if(p.next == null)
           tail = p;
    }
    
    Node pos(int k){
        int i = 0;
        Node p = head;
        while(p != null){
            if(i == k)
                return(p);
                p = p.next;
                i++;
        }
        return(null);
    }
    
    int size(){
        int count = 0;
        Node p = head;
        while(p != null){
            count++;
            p=p.next;
        }
        return(count);
    }

    void insertAfter(Node q, Book x){
        //TH1: If Q not in the list
        if(q == null) 
            return;
        //TH2: Q in the list // ptu sau q  -  giong addfirst
        Node q1 = q.next;
        Node p = new Node(x, q1); 
        q.next = p;
        //TH3: If Q is the tail
        if(q == tail){ 
            tail = p; //P is the new tail
        }
    }
        
    void addAfterPos(int k) {
        //add Attribute
        String bcode = ValidateInput.inputNonBlankStr("bcode: ", "No blank input!");
        String title = ValidateInput.inputNonBlankStr("title: ", "No blank input!"); 
        int quantity = ValidateInput.inputInt("quantity: ", "Invalid!", 0, Integer.MAX_VALUE); 
        int lended = ValidateInput.inputInt("lended: ", "Invalid!", 0, Integer.MAX_VALUE);  
        double price = ValidateInput.inputDouble("price: ", "Invalid!", 0, Double.MAX_VALUE);  
        //add book to List
        Book xBook = new Book(bcode, title, quantity, lended, price);
        Node q = pos(k);
        insertAfter(q, xBook); 
    } 
    
    void deletePos(int k) {
        Node p = pos(k);
        deleteByBcode(p);
    }
    
}
