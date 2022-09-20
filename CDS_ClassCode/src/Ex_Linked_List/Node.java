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
public class Node {
    Person infor;
    Node next;
    
    Node(){
    }
    Node(Person x, Node p){
        infor = x;
        next = p;
    }
    
    Node(Person x){
        //this(x,null);
        infor = x;
        next = null;
    }
}
