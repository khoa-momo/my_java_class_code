/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Array;

/**
 *
 * @author DELL
 */
public class Max_arr {
        public static void main(String[] args) {
        double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
        double largest = numArray[0];

        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }

        System.out.format("Largest element = %.2f", largest);
    }
}
