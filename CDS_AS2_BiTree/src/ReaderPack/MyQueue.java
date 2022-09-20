/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReaderPack;
 
import LibManager.*;
import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class MyQueue {
    LinkedList<Node2> t;

    public MyQueue() {
        t = new LinkedList();
    }
    
    void clear(){
        t.clear();
    }
    boolean isEmpty(){
        return(t.isEmpty());
    }
    void enqueue(Node2 p){
        t.addLast(p);
    }
    Node2 dequeue(){
        if(isEmpty()) 
            return null;
        return t.removeFirst();
    }
    Node2 front(){
        if(isEmpty()) 
            return null;
        return t.getFirst();
    }
}
