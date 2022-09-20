/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReaderPack;
 
import LibManager.ValidateInput;
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
    
    public Node2 head2,tail2;
    public ReaderManager() {
        head2=tail2=null;  
    }
    public void clear() {
        head2=tail2=null;   
    }
    public boolean isEmpty() {
        return(head2==null);  
    }

    public void visit(Node2 p) {
        if(p!=null) 
            System.out.println(p.info2 + " ");
    }
    
      
////Functions     
    public void addLast(Reader x) {
        Node2 q = new Node2(x);
        if(isEmpty()) {
            head2=tail2=q;
            return;
        }
        tail2.next2=q;
        tail2=q;
    }
    
    public void addReader() {
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
        int byear = ValidateInput.inputInt("byear: ", "byear must between 1900 and 2010!", 1900, 2010);  
        //add book to List
        Reader reader = new Reader(rcode, name, byear);  
        addLast(reader);
        System.out.println("Reader added successfully!"); 
    }    
    public int checkDupRcode(String xrCode){         
        Node2 p = head2;
        while(p != null){
            if(p.info2.rcode.equals(xrCode)) 
                return 1;
            p = p.next2;
        } 
        return -1;
    } 

   //Load Function    
    public void loadFile(String fname) throws IOException { //Using FileReader class
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
    
    //Save Function
    public void saveFile(String fname) throws IOException { //Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        Node2 p = head2;
        while(p!=null) {
            pw.printf("%-15s | %-15s | %-15d\n",p.info2.rcode, p.info2.name, p.info2.byear);
            p=p.next2;
        }
        pw.close();
        fw.close();
    }    
    public void traverse() {
        Node2 p=head2;
        while(p!=null) {
            visit(p);
            p=p.next2;
        }
    } 
  
 
    //Search Function
    public Node2 searchByRcode(String xrCode){         
        Node2 p = head2;
        while(p != null){
            if(p.info2.rcode.equals(xrCode)) 
                return(p);
            p = p.next2;
        }
        return(null);
    } 

    //Remove Function
    public void removeFirst(Node2 q){
        //empty
        if(isEmpty()) 
            return;
        //list has 1 ele da bi xoa 
        head2 = head2.next2;
        if(head2 == null)
            tail2 = null;
    }
    public void deleteByRcode(Node2 q) {
       //TH1: Q is not in list
       if(q == null) return;
       //TH2: q - head
       if(q == head2){
           removeFirst(q);
           return;
       }
       //TH3: tim ptu trc q
       Node2 p = head2;
       while(p != null && p.next2 != q){ 
           p = p.next2;
       } 
       if(p == null)
           return; 
       Node2 q1 = q.next2; 
       p.next2 = q1; 
       if(p.next2 == null)
           tail2 = p;
    }    
    
    //check Rcode for Lending
    public int checkRcode(String xrCode){         
        Node2 p = head2;
        while(p != null){
            if(p.info2.rcode.equals(xrCode)) 
                return 1;//code existed
            p = p.next2;
        } 
        return -1;
    } 
}
