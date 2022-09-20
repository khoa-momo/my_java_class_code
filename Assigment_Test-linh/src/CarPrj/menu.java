/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarPrj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class menu {
    public menu() {
    }
    //Get user choice as an integer.
    public int int_getChoice(ArrayList options) {
        int response;
        int n = options.size();
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "" + options.get(i));
        }
        System.out.println("Please choose an option 1..." + n + ": ");
        Scanner sc = new Scanner(System.in);
        response = sc.nextInt();
        return response;
    }

    //Get the object chosen by user
    public Brand ref_getChoice(ArrayList options) {
        int response;
        int n = options.size();
        do {
            response = int_getChoice(options);
        } while (response < 0 || response > n);
        return (Brand) options.get(response - 1);
    }

}
