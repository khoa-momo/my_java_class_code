/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

/**
 *
 * @author DELL
 */
public class Node {
    Book info;
    Node next;
    //Node for Book
    Node(Book x, Node p) {
      info=x; next=p;  
    }
    Node(Book x) {
      info=x; 
      next=null;  
    }
    
    
    Reader info2;
    Node next2;
    //Node for Reader
    Node(Reader x, Node p) {
      info2=x; next2=p;  
    }    
    Node(Reader x) {
      info2=x; 
      next2=null;  
    }
    
    
}
