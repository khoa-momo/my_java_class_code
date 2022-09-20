/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
 
import javax.xml.xpath.XPath;

/**
 *
 * @author DELL
 */
public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return(head == null);
    }
    void clear() {
        head = tail = null;
    }
                                                
    void visit(Node p) {
        if(p != null) 
            System.out.print(p.info);
    }
    void traverse(){
        Node p = head;
        while(p!=null){
            visit(p);
            p = p.next;
        }
        System.out.println();
    }  
//Main Function        
//    String[] a={"HN","HP","TH","HU","DN","QB","NT"};
//    int[] b = {300,180,200,190,430,200,100};
    
    void addLast(Ticket x){
        Node n = new Node(x);
        if(isEmpty()) {
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }    
    void addEnd(String xPath, int xPrice) {
        if(xPath.equals("HN")||(xPrice<0 || xPrice>230)){
            return;
        }else{
            addLast(new Ticket(xPath, xPrice));
        } 
    }    
                                                            
    void addLastMany(String[] a, int[] b) {
        int n,i; 
        n = a.length; // length of the String list
        for(i=0; i<n ;i++) {
            addLast(new Ticket(a[i],b[i]));
        } 
    }
 
    Node searchByPath(String dn) {
        Node p = head;
        while(p != null){
            if(p.info.path.equals(dn)) 
                return(p);
            p = p.next;
        }
        return(null);
    }
                                                        
    //Insert Ticket x - Q after xPrice - P
    void insertAfter(Ticket x, int xPrice) {
        //Step 1: Find that xPrice node
        Node p = head;
        while(p != null){
            if(p.info.price == xPrice) 
                break;
                p = p.next;
        }
        //Step 2: Found it! -> add
        if(p == null)
            return;
        //phan tu sau p
        Node q1 = p.next;
        Node q = new Node(x, q1);
        //Noi p vao q
        p.next = q;
        //neu p la duoi
        if(p == tail)
            tail = q; //Q is the new tail
    }

    void removeFirst() {
        //empty
        if(isEmpty()) return;
        //list has 1 ele da bi xoa 
        head = head.next;
        if(head == null)
            tail = null;
    }
                                            
    Node cheapestPrice() {
        if(isEmpty())
            return null;
        Node p, q; //q dan dau
        p = q = head;
        int min = p.info.price;
        while (p != null) {            
            if(p.info.price < min){
                q = p;
                min = p.info.price;
            }
            p = p.next;
        }
        return(q);
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
    
    void remove(Node q) {
       if(q == null) return;
       //TH1: q - head
       if(q == head){
           removeFirst(q);
           return;
       }
       //Th2: tim ptu trc q
       Node p = head;
       while(p != null && p.next != q){ 
           p = p.next;
       }
       //ko tim thay p = null
       if(p == null)
           return;
       //tim thay p la node trc q
       //tim node sau q
       Node q1 = q.next;
       //noi truoc voi sau
       p.next = q1;
       //q la cuoi p.next==null
       if(p.next == null)
           tail = p;
    }

    
    
}
