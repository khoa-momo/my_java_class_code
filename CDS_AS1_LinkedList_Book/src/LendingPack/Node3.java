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
public class Node3 { 
    Lending info3;
    Node3 next3;
    //Node for Lending
    Node3(Lending x, Node3 p) {
      info3=x; 
      next3=p;  
    }    
    Node3(Lending x) {
      info3=x; 
      next3=null;  
    }    
        
}
