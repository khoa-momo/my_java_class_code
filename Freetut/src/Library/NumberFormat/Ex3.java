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
public class Ex3 {
//Định dạng số
//Để định dạng số bằng NumberFormat, Java cung cấp cho chúng ta phương thức format(). 
//Cú pháp của phương thức format() như sau:

//Cú pháp
//1.format(double number);
//2.format(long number); 
//Phương thức này sẽ trả về kết quả có kiểu dữ liệu là String (chuỗi) ứng với số number sau khi định dạng.    
    
    
    public static void main(String[] args) {
        NumberFormat currentLocale = NumberFormat.getInstance();

        // định dạng số của khu vực mặc định của máy ảo JVM
        // sử dụng phương thức format()
        double doubleNumber = 10.08d;
        String str = currentLocale.format(doubleNumber);
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " + str);

        // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        // đối với số có kiểu long được định dạng theo chuẩn của nước Anh
        // thì phần ngàn của số được phân cách bằng dấu phẩy
        long longNumber = 12345678L;
        String str1 = en.format(longNumber);
        System.out.println("Số " + longNumber + " sau khi định dạng = " + str1);

        // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của Việt Nam
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);

        // đối với số float được định dạng theo chuẩn của Việt Nam
        // thì phần thập phân của số được phân cách bằng dấu phẩy
        double doubleNumber1 = 10.17d;
        String str2 = vn.format(doubleNumber1);
        System.out.println("Số " + doubleNumber1 + " sau khi định dạng = " + str2);
    }   
    
}
