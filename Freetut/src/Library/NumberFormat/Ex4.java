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
public class Ex4 {
//Định dạng tiền tệ (currency)
//Để định dạng tiền tệ trong Java bằng NumberFormat chúng ta sẽ sử dụng phương thức getCurrencyInstance(). 
//Cú pháp của phương thức getCurrencyInstance() như sau:
//
//Cú pháp 
//// định dạng tiền tệ của khu vực mặc định của máy ảo JVM
//// khu vực mặc định này là nước Mỹ
//// nên đơn vị của tiền tệ sẽ là $
//                             ---->     NumberFormat.getCurrencyInstance();
// 
//// tạo 1 NumberFormat để định dạng tiền tệ
//// theo tiêu chuẩn của 1 khu vực, quốc gia bất kỳ
//                             ---->     NumberFormat.getCurrencyInstance(Locale inLocale);
//    
//trong đó inLocale là đối tượng bao gồm tên ngôn ngữ và tên quốc gia cần định dạng.    
    
    public static void main(String[] args) {
        double currency = 101.999f;

        // định dạng tiền tệ của khu vực mặc định của máy ảo JVM
        // khu vực mặc định này là nước Mỹ
        // nên đơn vị của tiền tệ sẽ là $
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String str = currencyFormat.format(currency);
        System.out.println("Số " + currency + " sau khi định dạng = " + str);

        long vnd = 10000000L;

        // tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của Việt Nam
        // đơn vị tiền tệ của Việt Nam là đồng
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(vnd);
        System.out.println("Số " + vnd + " sau khi định dạng = " + str1);
    }
    
}
