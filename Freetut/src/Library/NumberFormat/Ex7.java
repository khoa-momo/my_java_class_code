/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.NumberFormat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author DELL
 */
public class Ex7 {
//Java cung cấp cho chúng ta phương thức setCurrency() để có thể thay đổi từ kiểu đơn vị tiền tệ của quốc gia, 
//khu vực này sang kiểu đơn vị tiền tệ của quốc gia, khu vực khác. Ví dụ dưới đây sẽ minh họa cách sử dụng phương thức này:
    
    public static void main(String[] args) {
        double doubleNumber = 6.32d;

        // tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của của Đức
        Locale locale = new Locale("de", "DE");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String str1 = numberFormat.format(doubleNumber);
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " + str1);

        // thay đổi từ định dạng tiền tệ theo tiêu chuẩn của Đức 
        // sang định dạng tiền tệ theo tiêu chuẩn của Việt Nam
        // sử dụng phương thức setCurrency()
        // Currency.getInstance() sẽ trả về tiền tệ cho 1 quốc gia nào đó (ở đây là Việt Nam)
        Locale localeVN = new Locale("vi", "VN");
        numberFormat.setCurrency(Currency.getInstance(localeVN));
        String str2 = numberFormat.format(doubleNumber);
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " + str2);
    }    
}
