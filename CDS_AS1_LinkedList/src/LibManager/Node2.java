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
public class Node2 { 
    Reader info2;
    Node2 next2;
    //Node for Reader
    Node2(Reader x, Node2 p) {
      info2=x; next2=p;  
    }    
    Node2(Reader x) {
      info2=x; 
      next2=null;  
    }    
}
