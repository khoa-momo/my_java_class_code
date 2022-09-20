/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S.L1;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        //Nhap vao size
        int n = Validation.getInt("Enter")
                
        int a[] = new int[n];
        //rand arr
        randomArray(a);
        //display
        display(a);
        
        //sort
        
        //display
        
        
    }
    
    private static void randomArray(int[] a){
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(a.length);
        }
    }
    
    private static void display(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
    private static void sort(int[] a){
        throw new UnsupportedOperationException("Not supported yet ");
    }
}
