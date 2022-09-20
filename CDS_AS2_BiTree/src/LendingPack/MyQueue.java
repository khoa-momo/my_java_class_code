/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LendingPack;
 
import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class MyQueue {
    LinkedList<Node3> t;

    public MyQueue() {
        t = new LinkedList();
    }
    
    void clear(){
        t.clear();
    }
    boolean isEmpty(){
        return(t.isEmpty());
    }
    void enqueue(Node3 p){
        t.addLast(p);
    }
    Node3 dequeue(){
        if(isEmpty()) 
            return null;
        return t.removeFirst();
    }
    Node3 front(){
        if(isEmpty()) 
            return null;
        return t.getFirst();
    }
}
