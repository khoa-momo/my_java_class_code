/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

import LibManager.Node;
import LibManager.ValidateInput;
import LibManager.Reader;
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
    Node head2,tail2;
    ReaderManager() {
        head2=tail2=null;  
    }
    void clear() {
        head2=tail2=null;   
    }
    boolean isEmpty() {
        return(head2==null);  
    }

    void visit(Node p) {
        if(p!=null) 
            System.out.println(p.info2 + " ");
    }
    
    void traverse() {
        Node p=head2;
        while(p!=null) {
            visit(p);
            p=p.next2;
        }
    } 
        
////Functions     
    void addLast(Reader x) {
        Node q = new Node(x);
        if(isEmpty()) {
            head2=tail2=q;
            return;
        }
        tail2.next2=q;
        tail2=q;
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
    
    void saveFile(String fname) throws IOException { //Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node p = head2;
        while(p!=null) {
            pw.printf("%-10s | %-10s | %-10d\r\n",p.info2.rcode, p.info2.name, p.info2.byear);
            p=p.next2;
        }
        pw.close();
        fw.close();
    }
 
    Node searchByRcode(String xrCode){         
        Node p = head2;
        while(p != null){
            if(p.info2.rcode.equals(xrCode)) 
                return(p);
            p = p.next2;
        }
        return(null);
    } 

    void removeFirst(Node q){
        //empty
        if(isEmpty()) 
            return;
        //list has 1 ele da bi xoa 
        head2 = head2.next2;
        if(head2 == null)
            tail2 = null;
    }
    void deleteByRcode(Node q) {
       //TH1: Q is not in list
       if(q == null) return;
       //TH2: q - head
       if(q == head2){
           removeFirst(q);
           return;
       }
       //TH3: tim ptu trc q
       Node p = head2;
       while(p != null && p.next2 != q){ 
           p = p.next2;
       } 
       if(p == null)
           return; 
       Node q1 = q.next; 
       p.next2 = q1; 
       if(p.next2 == null)
           tail2 = p;
    }    
}
