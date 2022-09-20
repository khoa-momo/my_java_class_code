/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author DELL
 */ 
 
class Iterrator {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        // list.add(32);//compile time error
 
        // show list
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
