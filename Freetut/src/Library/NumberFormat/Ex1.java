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
public class Ex1 {
//Tạo mới 1 NumberFormat
//Trong Java, NumberFormat được dùng để định dạng số có kiểu là double, float và long theo tiêu chuẩn của một quốc gia, khu vực cụ thể. 
//Để khai báo 1 NumberFormat, chúng ta sẽ import gói thư viện java.text.NumberFormat của Java. Cú pháp import như sau:    
     
    public static void main(String[] args) {
    // tạo 1 NumberFormat để định dạng số của khu vực hiện tại của máy ảo JVM
    NumberFormat nf = NumberFormat.getInstance();
         
    // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
    // bằng cách tạo 1 đối tượng Locale (chi tiết về đối tượng chúng ta sẽ học sau)
    // Locale là đối tượng đại diện duy nhất cho các ngôn ngữ và quốc gia, khu vực
    // khác nhau trên toàn thế giới 
    // trong đó "en" là ngôn ngữ và "EN" là tên quốc gia.
    // Để sử dụng Locale chúng ta sẽ import gói thư viện java.util.Locale của Java
    Locale locale = new Locale("en", "EN");
         
    // NumberFormat.getInstance(locale) 
    // dùng để định dạng số chung cho quốc gia, khu vực được chỉ định (ở đây là nước Anh)
    NumberFormat en = NumberFormat.getInstance(locale);
}
    
    
    
    
    
    
    
    
}
