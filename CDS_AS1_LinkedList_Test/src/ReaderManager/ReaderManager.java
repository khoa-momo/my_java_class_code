/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReaderManager;

import BookManager.Node;
import LibManager.ValidateInput;
import ReaderManager.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author DELL
 */
public class ReaderManager {
    public Node head,tail;
    public ReaderManager() {
        head=tail=null;  
    }
    void clear() {
        head=tail=null;   
    }
    boolean isEmpty() {
        return(head==null);  
    }

    void visit(Node p) {
        if(p!=null) 
            System.out.println(p.info + " ");
    }
    
    void traverse() {
        Node p=head;
        while(p!=null) {
            visit(p);
            p=p.next;
        }
    } 
        
////Functions     
    void addLast(Reader x) {
        Node q = new Node(x);
        if(isEmpty()) {
            head=tail=q;
            return;
        }
        tail.next=q;
        tail=q;
    }      
    
    void loadFile(String fname) throws IOException { //Using FileReader class
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s; 
        String [] a;
        String xrcode; 
        String xname; 
        int xbyear;  
        while(true) {
            s = br.readLine();
            if(s==null || s.trim().length()<3) 
                break;
            a = s.split("[|]");
            xrcode = a[0].trim();
            xname = a[1].trim();
            xbyear = Integer.parseInt(a[2].trim()); 
            addLast(new Reader(xrcode,xname,xbyear));
        }
        fr.close();
        br.close();
    }

    void addReader() {
        //add Attribute
        String rcode = ValidateInput.inputNonBlankStr("rcode: ", "No blank input!");
        String name = ValidateInput.inputNonBlankStr("name: ", "No blank input!"); 
        int byear = ValidateInput.inputInt("byear: ", "Invalid!", 0, Integer.MAX_VALUE);  
        //add book to List
        Reader reader = new Reader(rcode, name, byear);  
        addLast(reader);
        System.out.println("Reader added successfully!"); 
    }    
    
    void saveFile(String fname) throws IOException { //Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node p = head;
        while(p!=null) {
            pw.printf("%-10s | %-10s | %-10d",p.info2.rcode, p.info2.name, p.info2.byear);
            p=p.next;
        }
        pw.close();
        fw.close();
    }
 
    
}
