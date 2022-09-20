/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

/**
 *
 * @author DELL
 */
public class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0));
        System.out.println();
/*2*/   result.setCharAt(1, original.charAt(original.length()-1));
        System.out.println();
/*3*/   result.insert(1, original.charAt(4));
        System.out.println();
/*4*/   result.append(original.substring(1,4));
        System.out.println();
/*5*/   result.insert(3, (original.substring(index, index+2) + " ")); 

        System.out.println(result);
        System.out.println(result);
        System.out.println(result);
    }
    
}
