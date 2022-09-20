/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LendingPack;

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
public class LendingManager {
    public Node3 root;
    public LendingManager(){
        root = null;
    }
    public void clear(){
        root = null;
    }
    public void visit(Node3 p) {
       System.out.print(p.info + "  ");
    }
    public boolean isEmpty(){
        return (root == null);
    }
    
//Deep Traverse    
    public void preOrder(Node3 p) { //Root - Left - Right
        if(p==null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    public void inOrder(Node3 p) { //Left - Root - Right
        if(p==null) return;
        inOrder(p.left);
        visit(p);
        System.out.println("");
        inOrder(p.right);
    }
    public void postOrder(Node3 p) { //Left - Right - Root
        if(p==null) return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    
//Breadth-first Traverse
    public void breadth(Node3 p){
        if(p == null) return;
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node3 v;
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
    public void insert(Lending x){
        if(isEmpty()){
            root = new Node3(x);
            return;
        }
        Node3 f, p;
        p = root;
        f = null;
        //Setting node
        while(p!=null){
            if(p.info.bcode2.equals(x.bcode2) && p.info.rcode2.equals(x.rcode2)){ 
                return;
            } 
            f = p;
            if(x.bcode2.compareTo(p.info.bcode2) == 0 ){
                if (x.rcode2.compareTo(p.info.rcode2) < 0) {
                    p = p.left;
                }else{
                    p = p.right;
                } 
            }else if(x.bcode2.compareTo(p.info.bcode2) < 0){
                p = p.left;
            }else{
                p = p.right;
            } 
        } 
        //add node 
        if(x.bcode2.compareTo(f.info.bcode2) == 0){
            if(x.rcode2.compareTo(f.info.rcode2) < 0){
                f.left = new Node3(x);
            }else{
                f.right = new Node3(x);
            }               
        }else if(x.bcode2.compareTo(f.info.bcode2) < 0){ 
            f.left = new Node3(x);
        }else{
            f.right = new Node3(x);
        } 
    } 
    
    //Add Last Function
    public void addLending() {
        //add Attribute 
        String bcode = ValidateInput.inputNonBlankStr("bcode: ", "No blank input!");
        String rcode = ValidateInput.inputNonBlankStr("rcode: ", "No blank input!");  
        int state = ValidateInput.inputInt("state: ", "Invalid, state is must be from 0 to 2!", 0, 2);   
        //add book to List
        Lending lend = new Lending(bcode, rcode, state);
        insert(lend);
        System.out.println("Lending added successfully!"); 
    } 

//Searching
//    public Node searchByBcode(Node p, String bcode) {
//        if(p == null) 
//            return(null);
//        if(p.info.bcode.equals(bcode)) 
//            return p;
//        if(bcode.compareTo(p.info.bcode) < 0)
//            return(searchByBcode(p.left,bcode));
//        else
//            return(searchByBcode(p.right,bcode));
//    }
 
////Save Load File    
    public void loadFile(String fname) throws IOException { // Using FileReader class
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s; 
        String [] a;
        String bcode;
        String rcode; 
        int state; 
        while(true) {
            s = br.readLine();
            if(s==null || s.trim().length()<3) break;
            a = s.split("[|]");
            bcode = a[0].trim();
            rcode = a[1].trim(); 
            state = Integer.parseInt(a[2].trim()); 
            insert(new Lending(bcode, rcode, state));
        }
        fr.close();
        br.close();
    }
    
    public void visit(PrintWriter pw, Node3 p)  throws IOException {
        if(pw==null || p==null) 
            return;
        pw.printf("%-15s | %-15s | %-15s\r\n",
                p.info.bcode2,p.info.rcode2,p.info.state);
    } 
    
    public void saveFileBreadth(String fname, Node3 p) throws IOException { // Using FileReader class
        FileWriter fw = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fw);
        MyQueue q = new MyQueue();
        q.enqueue(p); 
        Node3 r;
        while(!q.isEmpty()) {
            r=q.dequeue();
            visit(pw,r);
            if(r.left!=null) q.enqueue(r.left);
            if(r.right!=null) q.enqueue(r.right);
        }
        pw.close();
        fw.close();
    }        
}
