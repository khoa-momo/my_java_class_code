/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookPack;

import LibManager.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BookManager {
    public Node root;
    public BookManager(){
        root = null;
    }
    public void clear(){
        root = null;
    }
    public void visit(Node p) {
       System.out.print(p.info + "  ");
    }
    public boolean isEmpty(){
        return (root == null);
    }
    
//Deep Traverse    
    public void preOrder(Node p) { //Root - Left - Right
        if(p==null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    public void inOrder(Node p) { //Left - Root - Right
        if(p==null) return;
        inOrder(p.left);
        visit(p);
        System.out.println("");
        inOrder(p.right);
    }
    public void postOrder(Node p) { //Left - Right - Root
        if(p==null) return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    
//Breadth-first Traverse
    public void breadth(Node p){
        if(p == null) return;
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node v;
        while(!q.isEmpty()){
            v = q.dequeue();
            visit(v);
            System.out.println("");
            if(v.left!=null) 
                q.enqueue(v.left);
            if(v.right!=null) 
                q.enqueue(v.right);
        }
    }
    
////INSERTION
    public void insert(Book x){
        if(isEmpty()){
            root = new Node(x);
            return;
        }
        Node f, p;
        p = root;
        f = null;
        while(p!=null){ 
            f = p;
            if(x.bcode.compareTo(p.info.bcode) < 0){
                p = p.left;
            }else{
                p = p.right;
            } 
        } 
        if(x.bcode.compareTo(f.info.bcode) < 0) 
            f.left = new Node(x);
        else
            f.right = new Node(x);
    } 
    //Add Last Function
    public void addBook() {
        //add Attribute 
        String bcode;
        do {            
            bcode = ValidateInput.inputNonBlankStr("bcode: ", "No blank input!");
            int index = checkDupBcode(root, bcode);
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
        insert(book);
        System.out.println("Book added successfully!"); 
    }
    
////DELETION 
    public void deleteByCopy(String bcode){
        //Setting node
        Node f, p;
        p = root;
        f = null;
        while(p!=null){ //tim node can xoa
            if(p.info.bcode.equals(bcode)) 
                break;
            f=p;  
            if(bcode.compareTo(p.info.bcode) < 0)
                p=p.left;
            else
                p=p.right;  
        }
        //TH0
        if(p==null)
            return;//ko tim thay
        //TH1: leaf-node
        if(p.left==null && p.right==null){
            if(f==null){    // tree have root only
                root = null;
            }else{
                if(p==f.left)
                    f.left=null;
                else
                    f.right=null;
            }
            return;
        }
        //TH2: 1 child
        //Left child
        if(p.left!=null && p.right==null){
            if(f==null){
                root = p.left;
            }else{
                if(p == f.left)
                    f.left = p.left;
                else
                    f.right = p.left;
            }
        }
        //Right child
        if(p.left==null && p.right!=null){
            if(f == null){
                root = p.right;
            }else{
                if(p == f.left)
                    f.left = p.right;
                else
                    f.right = p.right;
            }
        }
        //TH3: 2 chlid
        if(p.left!=null && p.right!=null){
            Node q = p.left;
            //Setting Node - The rightest node - p1
            Node fp1, p1;
            p1 = q;
            fp1 = null;
            while(p1.right != null){
                fp1=p1;
                p1=p1.right;
            }
            //p1 is the rightmost of node
            p.info.bcode = p1.info.bcode; //copy step
            //Delete the copied node - p1
            if(fp1 == null)
                p.left = q.left;
            else
                fp1.right = p1.left;
        }
    }    

//Searching
    public Node searchByBcode(Node p, String bcode) {
        if(p == null) 
            return(null);
        if(p.info.bcode.equals(bcode)) 
            return p;
        if(bcode.compareTo(p.info.bcode) < 0)
            return(searchByBcode(p.left,bcode));
        else
            return(searchByBcode(p.right,bcode));
    }
    
    public int checkDupBcode(Node p, String bcode) { 
        if(p == null){ 
            return 0;
        }else if(p.info.bcode.equals(bcode)){
            return 1;
        }else if(bcode.compareTo(p.info.bcode) < 0){
            return(checkDupBcode(p.left,bcode));
        }else{
            return(checkDupBcode(p.right,bcode));
        }    
    }
        
////Balancing    
    public void inOrder(List<Book> t, Node p){
        if(p == null)
            return;
         inOrder(t, p.left);
         t.add(p.info);
         inOrder(t, p.right);
    }
    public void balance(List<Book> t, int first, int last){ 
        if(first>last) 
            return;
        int mid = (first+last)/2;
        Book x = t.get(mid);
        insert(x);
        balance(t, first, mid-1);
        balance(t, mid+1, last);
    }
    public void balance(){
        List<Book> t = new ArrayList();
        inOrder(t, root); 
        clear();
        balance(t, 0, t.size()-1);
    }    

////Counting    
    public int count(Node p){
        if(p==null) 
            return(0);
        int k,h,r;
        k = count(p.left);
        h = count(p.right);
        r = k+h+1;
        return(r);
    }
        
////Save Load File    
    public void loadFile(String fname) throws IOException { // Using FileReader class
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s; 
        String [] a;
        String bcode;
        String title;
        int quantity;
        int lended;
        double price;
        while(true) {
            s = br.readLine();
            if(s==null || s.trim().length()<3) break;
            a = s.split("[|]");
            bcode = a[0].trim();
            title = a[1].trim();
            quantity = Integer.parseInt(a[2].trim());
            lended = Integer.parseInt(a[3].trim());
            price = Double.parseDouble(a[4].trim());
            insert(new Book(bcode,title,quantity,lended,price));
        }
        fr.close();
        br.close();
    }
    
    public void visit(PrintWriter pw, Node p)  throws IOException {
        if(pw==null || p==null) 
            return;
        pw.printf("%-10s | %-20s | %-10s | %-10s | %-10.2f\r\n",
                p.info.bcode,p.info.title,p.info.quantity,p.info.lended,p.info.price);
    } 
    
    public void saveFileBreadth(String fname, Node p) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        MyQueue q = new MyQueue();
        q.enqueue(p); 
        Node r;
        while(!q.isEmpty()) {
            r=q.dequeue();
            visit(pw,r);
            if(r.left!=null) q.enqueue(r.left);
            if(r.right!=null) q.enqueue(r.right);
        }
        pw.close();
        fw.close();
    }    
    
    public void saveFileInOrder(String fname, Node p) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        
        if(p==null) 
            return;
        inOrder2(p.left);
        visit(pw,p); 
        System.out.println("");
        inOrder2(p.right);

        
//        MyQueue q = new MyQueue();
//        q.enqueue(p); 
//        
//        while(!q.isEmpty()) {
//            r=q.dequeue();
//            visit(pw,r);
//            if(r.left!=null) q.enqueue(r.left);
//            if(r.right!=null) q.enqueue(r.right);
//        }
        pw.close();
        fw.close();
    }       
    
    public void inOrder2(Node p) { //Left - Root - Right
        if(p==null) 
            return;
        inOrder2(p.left);
        visit(p); 
        inOrder2(p.right);
    }
}
