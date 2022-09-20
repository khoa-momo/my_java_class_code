/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alg_Counting;

/**
 *
 * @author DELL
 */
public class Count_Words2_NoLib {
    public static void main(String[] args) {
        String str = "welcome to java   tutorial on Java2blog ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++){
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}
