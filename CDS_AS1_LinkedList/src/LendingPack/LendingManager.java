/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LendingPack;

import LibManager.ValidateInput;
import LibManager.BookManager;
import LibManager.ReaderManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author DELL
 */
public class LendingManager {
    Node head3,tail3;
    public LendingManager() {
        head3=tail3=null;  
    }
    public void clear() {
        head3=tail3=null;   
    }
    public boolean isEmpty() {
        return(head3==null);  
    }

    public void visit(Node p) {
        if(p!=null) 
            System.out.println(p.info3 + " ");
    }
    
    public void traverse() {
        Node p=head3;
        while(p!=null) {
            visit(p);
            p=p.next3;
        }
    }
      
////Functions     
    public void addLast(Lending x) {
        Node q = new Node(x);
        if(isEmpty()) {
            head3=tail3=q;
            return;
        }
        tail3.next3=q;
        tail3=q;
    }
    
    public void addLending() {
        System.out.println("-Input for state-\n" + 
                           "0: the book is not given to the reader\n" +
                           "1: the book is still at the reader, not given back.\n" +
                           "2: the book is given back to the library.\n");
        BookManager check1 = new BookManager();
        ReaderManager check2 = new ReaderManager();
        
        //add Attribute
        String bcode = ValidateInput.inputNonBlankStr("Enter book code: ", "No blank input!"); 
        String rcode = ValidateInput.inputNonBlankStr("Enter reader code: ", "No blank input!");     
        int state = ValidateInput.inputInt("Enter state: ", "state must between 0 and 2!", 0, 2);  
        //add lending to List
        Lending lend = new Lending(bcode, rcode, state);  
        
        int index1 = check1.checkBcode(bcode); //return 1 -> code existed in list
        int index2 = check2.checkRcode(rcode); //return 1 -> code existed in list
        int checklendquantity = check1.checkLendQuantity();
        
        System.out.println("test: "+index1+" , "+index2 +" "+checklendquantity);
        if (index1==1 || index2==1) {
            if(state != 1){
                addLast(lend);     
            }else if(checklendquantity==1 && state==0){
                addLast(lend);
            }else if(checklendquantity==2 && state==1){
                addLast(lend);
            } 
            System.out.println("Lending information added successfully!"); 
        }else{
            System.out.println("This Book or Reader is not in the list! Or Input violated input's condition!");
        }
        
    }     
    
   //Load Function    
    public void loadFile(String fname) throws IOException { //Using FileReader class
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s; 
        String [] a;
        String bcode; 
        String rcode; 
        int state;  
        while(true) {
            s = br.readLine();
            if(s==null || s.trim().length()<3) 
                break;
            a = s.split("[|]");
            bcode = a[0].trim();
            rcode = a[1].trim();
            state = Integer.parseInt(a[2].trim()); 
            addLast(new Lending(bcode, rcode, state));
        }
        fr.close();
        br.close();
    }
    
    //Save Function
    public void saveFile(String fname) throws IOException { //Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node p = head3;
        while(p!=null) {
            pw.printf("%-15s | %-15s | %-15d\n",p.info3.bcode, p.info3.rcode, p.info3.state);
            p=p.next3;
        }
        pw.close();
        fw.close();
    }   
     
    public void sortByBRCode() {
        Node pi;
        Node pj;
        Lending t;
        for (pi = head3; pi!=null; pi=pi.next3) {
            for(pj = pi.next3; pj!=null; pj=pj.next3){
                if(pi.info3.bcode.compareTo(pj.info3.bcode)>0){
                        t = pi.info3;
                        pi.info3 = pj.info3;
                        pj.info3 = t; 
                }else{
                    if(pi.info3.bcode.compareTo(pj.info3.bcode)==0){
                        if(pi.info3.rcode.compareTo(pj.info3.rcode)>0){
                            t = pi.info3;
                            pi.info3 = pj.info3;
                            pj.info3 = t;         
                        }
                    }
                }
            }
        }
    } 
     
    
}
