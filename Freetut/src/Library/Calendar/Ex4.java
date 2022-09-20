/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Calendar;

import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class Ex4 {
    //Cộng, trừ thời gian của hệ thống
public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println("Thời gian hiện tại là " + cal.getTime());
         
    // cộng thời gian
    // sử dụng phương thức add()
    cal.add(Calendar.MONTH, 4); // thêm 4 tháng
    cal.add(Calendar.DAY_OF_MONTH, 5);  // và 5 ngày
    System.out.println("Thời gian hiện tại sau khi thay đổi là " + cal.getTime());
         
    // trừ thời gian
    // sử dụng phương thức add()
    cal.add(Calendar.HOUR_OF_DAY, -2);  // giảm giờ hiện tại đi 2 tiếng
    cal.add(Calendar.MINUTE, -3);   // giảm phút hiện tại đi 3 phút
    System.out.println("Thời gian hiện tại sau khi thay đổi là " + cal.getTime());
}    
}
