/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BSTree {
    Node root;
    BSTree(){
        root = null;
    }
    void clear(){
        root = null;
    }
    void visit(Node p) {
       System.out.print(p.info + "  ");
    }
    boolean isEmpty(){
        return (root == null);
    }
    
//Deep Traverse    
    void preOrder(Node p) { //Root - Left - Right
        if(p==null) return;
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    void inOrder(Node p) { //Left - Root - Right
        if(p==null) return;
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
    void postOrder(Node p) { //Left - Right - Root
        if(p==null) return;
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
    
//Breadth-first Traverse
    void breadth(Node p){
        if(p == null) return;
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node v;
        while(!q.isEmpty()){
            v = q.dequeue();
            visit(v);
            if(v.left!=null) 
                q.enqueue(v.left);
            if(v.right!=null) 
                q.enqueue(v.right);
        }
    }
    
////INSERTION
    void insert(Object x){
        if(isEmpty()){
            root = new Node(x);
            return;
        }
        Node f, p;
        p = root;
        f = null;
        while(p!=null){
            if(p.info.number == x.number){
                System.out.println("The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if(x.number < p.info.number){
                p = p.left;
            }else{
                p = p.right;
            } 
        } 
        if(x.number<f.info.number) 
            f.left = new Node(x);
        else
            f.right = new Node(x);
    }
    void insertMany(String[] b, int[] a){
        for (int i = 0; i < a.length; i++) {
            insert(new Object(b[i], a[i]));
        }
    }

////DELETION 
    void deleteByCopy(int x){
        //Setting node
        Node f, p;
        p = root;
        f = null;
        while(p!=null){ //tim node can xoa
            if(p.info.number==x) 
                break;
            f=p;  
            if(x<p.info.number)
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
            p.info.number = p1.info.number; //copy step
            //Delete the copied node - p1
            if(fp1 == null)
                p.left = q.left;
            else
                fp1.right = p1.left;
        }
    }    

//Searching
    Node search(Node p, int xNumber) {
        if(p == null) 
            return(null);
        if(p.info.number==xNumber) 
            return(p);
        if(xNumber<p.info.number)
            return(search(p.left,xNumber));
        else
            return(search(p.right,xNumber));
    }
    
////Balancing    
    void inOrder(List<Object> t, Node p){
        if(p == null)
            return;
         inOrder(t, p.left);
         t.add(p.info);
         inOrder(t, p.right);
    }
    void balance(List<Object> t, int first, int last){ 
        if(first>last) 
            return;
        int mid = (first+last)/2;
        Object x = t.get(mid);
        insert(x);
        balance(t, first, mid-1);
        balance(t, mid+1, last);
    }
    
    void balance(){
        List<Object> t = new ArrayList();
        inOrder(t, root); 
        clear();
        balance(t, 0, t.size()-1);
    }    
 
    ////ROTATION    
    Node rotateRight(Node p){
        if((p==null) || (p.left==null)) //Need left son
            return p; 
        Node q = p.left;
        p.left = q.right;
        q.right = p;
        return q;
    }
    
    Node rotateLeft(Node p){
        if((p==null) || (p.right==null)) //Need right son
            return p; 
        Node q = p.right;
        p.right = q.left;
        q.left = p;
        return q;
    }    
}
