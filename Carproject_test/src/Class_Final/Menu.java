/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Final;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu<E> { 
    
    public static int int_getChoice(Object[] options){
        for (int i=0; i<options.length; i++) {
            System.out.println((i+1) + "--" + options [i]);
        }
        System.out.print("Choose 1..." + options.length + ": ");
        Scanner sc = new Scanner(System. in) ;
        return Integer.parseInt(sc.nextLine());
    }      

    public static <E> int int_getChoice(ArrayList<E> options) {
            int size = options.size(); 
        for (int i = 0; i < size; i++) {
            System.out.print((i+1) + "---" + options.get(i));
        }
        System.out.print("Please choose an option 1 to " + size + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    } 
    
    public static <E> E ref_getChoice(ArrayList<E> options) {
        int response;
        int N = options.size();
        do{
            response = int_getChoice(options);
        }while(response < 0 || response > N);
        return options.get(response - 1); 
    }

}//
