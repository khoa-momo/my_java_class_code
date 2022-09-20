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
        String rcode;
        do {            
            rcode = ValidateInput.inputNonBlankStr("rcode: ", "No blank input!");
            int index = checkDupRcode(rcode);
            if (index == 1) {
                System.out.println("Code is duplicated!");
            }else{
                break;
            }
        } while (true);
        String name = ValidateInput.inputNonBlankStr("name: ", "No blank input!"); 
        int byear = ValidateInput.inputInt("byear: ", "Invalid, byear must between 1900 and 2010!", 1900, 2010);  
        //add book to List
        Reader reader = new Reader(rcode, name, byear);  
        addLast(reader);
        System.out.println("Reader added successfully!"); 
    }    

    int checkDupRcode(String xrCode){         
        Node p = head2;
        while(p != null){
            if(p.info2.rcode.equals(xrCode)) 
                return 1;
            p = p.next2;
        } 
        return -1;
    } 
    
    void saveFile(String fname) throws IOException { //Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node p = head2;
        while(p!=null) {
            pw.printf("%-15s | %-15s | %-15d",p.info2.rcode, p.info2.name, p.info2.byear);
            p=p.next2;
        }
        pw.close();
        fw.close();
    }
 
    
}
