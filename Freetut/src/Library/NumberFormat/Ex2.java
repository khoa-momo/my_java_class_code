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
public class Ex2 {
public static void main(String[] args) {
    // Locale.getDefault() sẽ trả về biến currentLocale
    // là khu vực mặc định của hệ thống máy ảo JVM
    Locale currentLocale = Locale.getDefault();
          
    // getDisplayLanguage() trả về tên ngôn ngữ của currentLocale
    // getDislayCountry() trả về tên quốc gia của currentLocale
    System.out.println(currentLocale.getDisplayLanguage());
    System.out.println(currentLocale.getDisplayCountry());
          
    // getLanguage() trả về mã ngôn ngữ của currentLocale
    // getCountry() trả về mã quốc gia của currentLocale
    System.out.println(currentLocale.getLanguage());
    System.out.println(currentLocale.getCountry());
          
    // getProperty() trả về chuỗi bao gồm các thông tin của hệ thống
    // user.country là quốc gia
    // user.language là ngôn ngữ
    System.out.println(System.getProperty("user.country"));
    System.out.println(System.getProperty("user.language"));
}    
}
