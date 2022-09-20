/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DELL
 */ 

public class Node{
    Ticket info;
    Node next;
    Node() {
    }
    
    Node(Ticket x, Node q) {
        info = x;
        next = q;
    }
    
    Node(Ticket x) {
        this(x,null);
    } 

}