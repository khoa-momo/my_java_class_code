/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.NumberFormat;

import java.util.Locale;

/**
 *
 * @author DELL
 */
public class Ex6 {
    public static void main(String[] args) {
        Locale[] arr = Locale.getAvailableLocales();
        for (Locale str : arr) {
            System.out.println("Quốc gia: " + str.getDisplayCountry() + 
                ", Mã quốc gia: " + str.getCountry() +
                ", Ngôn ngữ: " + str.getDisplayLanguage() +
                ", Mã ngôn ngữ: " + str.getLanguage());
        }   
    }
}
