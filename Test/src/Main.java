/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Main{
    
    static void foo(int x){
        x += 10;
        System.out.println(x);
    }
    
    public static void main(String [] args){
        int x= 65;
        System.out.println(x);
        foo(x);
        System.out.println(x);
        System.out.println();
    }
 
}