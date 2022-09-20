/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

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
    boolean isEmpty(){
        return (root == null);
    }

////INSERTION
    void insert(int x){
        if(isEmpty()){
            root = new Node(x);
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while(p!=null){
            if(p.info == x){
                System.out.println("The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if(x < p.info){
                p = p.left;
            }else{
                p = p.right;
            } 
        } 
        if(x<f.info) 
            f.left = new Node(x);
        else
            f.right = new Node(x);
    }
    
    void insertMany(int[] a){
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }
    
    void visit(Node p) {
       System.out.print(p.info + "  ");
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
    
//Breadth-first 
    void breadth(Node p){
        if(p == null) return;
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node v;
        while(!q.isEmpty()){
            v = q.dequeue();
            visit(v);
            if(v.left!=null) q.enqueue(v.left);
            if(v.right!=null) q.enqueue(v.right);
        }
    }

//Searching
    Node search(Node p, int x) {
        if(p == null) 
            return(null);
        if(p.info==x) 
            return(p);
        if(x<p.info)
            return(search(p.left,x));
        else
            return(search(p.right,x));
    }
    
    Node rotateRight(Node p){
        if((p==null) || (p.left==null))
            return p; 
        Node q = p.left;
        p.left = q.right;
        q.right = p;
        return q;
    }
    
    Node rotateLeft(Node p){
        if((p==null) || (p.right==null))
            return p; 
        Node q = p.right;
        p.right = q.left;
        q.right = p;
        return q;
    }
    
}
