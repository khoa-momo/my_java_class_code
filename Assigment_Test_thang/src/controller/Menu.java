/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author letha
 */
public class Menu<E> {

    public int int_getChoice(ArrayList<E> options) {
        int response;
        do {
            try {
                int size = options.size();
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < size; i++) {
                    System.out.println((i + 1) + ". " + options.get(i));
                }
                System.out.print("Please choose an option 1.." + size + ": ");
                response = sc.nextInt();
                return response;
            } catch (Exception e) {
            }
        } while (true);

    }

    public E ref_getChoice(ArrayList<E> options) {
        int response;
        int size = options.size(); 
        do {
            response = int_getChoice(options);
        } while (response <= 0 || response > size);
        return options.get(response - 1);
    }
}
