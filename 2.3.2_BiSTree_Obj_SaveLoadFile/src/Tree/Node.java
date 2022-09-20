/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author DELL
 */
public class Node {
    Object info;
    Node left, right;

    Node() {
    }
    Node(Object x){
        info = x;
        left = right = null;
    }
    
    
}
