/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
/**
 *
 * @author DELL
 */
public class LinkedList {
    public static void main(String args[]){
        List<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        } 
        System.out.println();

        // Using the for each loop
        for (String str : ll)
                System.out.print(str + " ");
    }        
}
