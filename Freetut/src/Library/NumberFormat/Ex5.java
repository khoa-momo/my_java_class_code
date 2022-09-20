/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author DELL
 */
public class Ex5 {
//Ngoài ra, chúng ta có thể biết được kiểu đơn vị tiền tệ bằng cách sử dụng phương thức getCurrency() như sau:
    public static void main(String[] args) {
        double currency = 101.999f;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String str = currencyFormat.format(currency);
        System.out.println("Số " + currency + " sau khi định dạng = " + str);
        System.out.println("Kiểu đơn vị tiền tệ của " + System.getProperty("user.country") +
            " là " + currencyFormat.getCurrency());

        long vnd = 10000000L;

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(vnd);
        System.out.println("Số " + vnd + " sau khi định dạng = " + str1);
        System.out.println("Kiểu đơn vị tiền tệ của " + localeVN.getCountry() +
            " là " + currencyVN.getCurrency());
        
          
    }    
}
