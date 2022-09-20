/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReaderManager;

/**
 *
 * @author DELL
 */
public class Node { 
    public Reader info;
    
    public Node next;
    
    //Node for Reader
    public Node(Reader x, Node p) {
      info=x; next=p;  
    }    
    public Node(Reader x) {
      info=x; 
      next=null; //this(x,null);  
    }    
}
