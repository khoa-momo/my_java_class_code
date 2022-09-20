/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.String;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author DELL
 */
public class String_to_Date {
        public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
        
        
//     public class TimeString {
//
//    public static void main(String[] args) {
//        String string = "July 25, 2017";
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
//        LocalDate date = LocalDate.parse(string, formatter);
//
//        System.out.println(date);
//    }
//}
}
