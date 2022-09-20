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
import java.io.IOException;
import java.io.PrintWriter; 

/**
 *
 * @author DELL
 */
public class ReaderManager { 
    public Node2 root;
    public ReaderManager(){
        root = null;
    }
    public void clear(){
        root = null;
    }
    public void visit(Node2 p) {
       System.out.print(p.info + "  ");
    }
    public boolean isEmpty(){
        return (root == null);
    }
    
//Deep Traverse    
    public void preOrder(Node2 p) { //Root - Left - Right
        if(p==null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    public void inOrder(Node2 p) { //Left - Root - Right
        if(p==null) return;
        inOrder(p.left);
        visit(p);
        System.out.println("");
        inOrder(p.right);
    }
    public void postOrder(Node2 p) { //Left - Right - Root
        if(p==null) return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    
//Breadth-first Traverse
    public void breadth(Node2 p){
        if(p == null) return;
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node2 v;
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
    public void insert(Reader x){
        if(isEmpty()){
            root = new Node2(x);
            return;
        }
        Node2 f, p;
        p = root;
        f = null;
        while(p!=null){
            if(p.info.rcode.equals(x.rcode)){
                System.out.println("The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if(x.rcode.compareTo(p.info.rcode) < 0){
                p = p.left;
            }else{
                p = p.right;
            } 
        } 
        if(x.rcode.compareTo(f.info.rcode) < 0) 
            f.left = new Node2(x);
        else
            f.right = new Node2(x);
    } 
    
    //Add Last Function
    public void addReader() {
        //add Attribute 
        String rcode;
        do {            
            rcode = ValidateInput.inputNonBlankStr("rcode: ", "No blank input!");
            int index = checkDupRcode(root, rcode);
            if (index == 1) {
                System.out.println("Code is duplicated!");
            }else{
                break;  
            }      
        } while (true);        
        String name = ValidateInput.inputNonBlankStr("name: ", "No blank input!");  
        int year = ValidateInput.inputInt("year: ", "The birth year of the reader (must between 1900 and 2010)!", 1900, 2010); 
        //add book to List
        Reader reader = new Reader(rcode, name, year);  
        insert(reader);
        System.out.println("Reader added successfully!"); 
    }
    
    public int checkDupRcode(Node2 p, String rcode) { 
        if(p == null){ 
            return 0;
        }else if(p.info.rcode.equals(rcode)){
            return 1;
        }else if(rcode.compareTo(p.info.rcode) < 0){
            return(checkDupRcode(p.left,rcode));
        }else{
            return(checkDupRcode(p.right,rcode));
        }    
    }
////DELETION 
    public void deleteByCopy(String rcode){
        //Setting node
        Node2 f, p;
        p = root;
        f = null;
        while(p!=null){ //tim node can xoa
            if(p.info.rcode.equals(rcode)) 
                break;
            f=p;  
            if(rcode.compareTo(p.info.rcode) < 0)
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
            Node2 q = p.left;
            //Setting Node - The rightest node - p1
            Node2 fp1, p1;
            p1 = q;
            fp1 = null;
            while(p1.right != null){
                fp1=p1;
                p1=p1.right;
            }
            //p1 is the rightmost of node
            p.info.rcode = p1.info.rcode; //copy step
            //Delete the copied node - p1
            if(fp1 == null)
                p.left = q.left;
            else
                fp1.right = p1.left;
        }
    }       

////Searching
    public Node2 searchByRcode(Node2 p, String rcode) {
        if(p == null) 
            return(null);
        if(p.info.rcode.equals(rcode)) 
            return p;
        if(rcode.compareTo(p.info.rcode) < 0)
            return(searchByRcode(p.left,rcode));
        else
            return(searchByRcode(p.right,rcode));
    } 
 
////Save Load File    
    public void loadFile(String fname) throws IOException { // Using FileReader class
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s; 
        String [] a;
        String rcode;
        String name;
        int byear; 
        while(true) {
            s = br.readLine();
            if(s==null || s.trim().length()<3) break;
            a = s.split("[|]");
            rcode = a[0].trim();
            name = a[1].trim();
            byear = Integer.parseInt(a[2].trim()); 
            insert(new Reader(rcode, name, byear));
        } 
        fr.close();
        br.close();
    }
    
    public void visit(PrintWriter pw, Node2 p)  throws IOException {
        if(pw==null || p==null) 
            return;
        pw.printf("%-15s | %-15s | %-15d\r\n",
                p.info.rcode,p.info.name,p.info.byear);
    } 
    
    public void saveFileBreadth(String fname, Node2 p) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        MyQueue q = new MyQueue();
        q.enqueue(p); 
        Node2 r;
        while(!q.isEmpty()) {
            r=q.dequeue();
            visit(pw,r);
            if(r.left!=null) q.enqueue(r.left);
            if(r.right!=null) q.enqueue(r.right);
        }
        pw.close();
        fw.close();
    }    
    
    
    
    public void saveFileInOrder(String fname, BookPack.Node p) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        
        if(p==null) 
            return;
//        inOrder2(p.left);
//        visit(pw,p); 
//        System.out.println("");
//        inOrder2(p.right);

        
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
}
