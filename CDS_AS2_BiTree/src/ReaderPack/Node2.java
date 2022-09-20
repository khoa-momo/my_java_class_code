/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReaderPack;

/**
 *
 * @author DELL
 */

public class Node2 {
    Reader info;
    Node2 left;
    Node2 right;
    Node2() {
    }
    Node2(Reader x) {
        info=x;
        left=right=null;
    }
}
