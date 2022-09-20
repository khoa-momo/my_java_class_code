/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookPack; 

/**
 *
 * @author DELL
 */
public class Node {
    Book info;
    Node next;
    
    //Constructor
    Node(Book x, Node p){
        info=x; 
        next=p;  
    }
    Node(Book x){
        info=x; 
        next=null;  
    }


    
}
