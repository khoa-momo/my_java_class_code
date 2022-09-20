/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_Linked_List;

/**
 *
 * @author DELL
 */

//Singly LinkedList
public class MyList {
    Node head, tail;
    MyList(){
        head = tail = null;
    }
    
    boolean isEmpty(){
        return head == null;
    }   
    void clear(){
        head = tail = null;
    } 

    //AddLast
    void addLast(Person x){ 
        Node p = new Node(x);
        //TH1: List empty
        if(isEmpty()){
            head = tail = p;
            return;
        }
        //TH2: List is not empty
        tail.next = p;
        tail = p;
    }
    
    //AddLastMany
    void addLastMany(String[] name, int[]age){
        for (int i = 0; i < name.length; i++) {
            addLast(new Person(name[i], age[i]));
        }
    }
    
    //traverse  
    void traverse(){
        Node p = head;
        while (p != null){
            visit(p);
            p = p.next;
        }
        System.out.println();
    }
    void visit(Node p){
        if(p != null){
            System.out.println(p.infor+" ");
        }
    }     
    
}
