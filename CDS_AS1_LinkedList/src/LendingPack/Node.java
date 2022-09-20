/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LendingPack;

/**
 *
 * @author DELL
 */
public class Node { 
    Lending info3;
    Node next3;
    //Node for Lending
    Node(Lending x, Node p) {
      info3=x; 
      next3=p;  
    }    
    Node(Lending x) {
      info3=x; 
      next3=null;  
    }    
        
}
