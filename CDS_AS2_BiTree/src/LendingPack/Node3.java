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
    Lending info;
    Node3 left;
    Node3 right;
    Node3() {
    }
    Node3(Lending x) {
        info=x;
        left=right=null;
    }
}
