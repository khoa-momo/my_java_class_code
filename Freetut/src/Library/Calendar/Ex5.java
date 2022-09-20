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
public class Ex5 {
    //Phương thức roll()
//Chúng ta có thể hình dung về ứng dụng của phương thức roll() như sau: Giả sử hôm nay là tháng 12 năm 2017, 
//nếu chúng ta tăng tháng của ngày hiện tại lên 1 thì kết quả sẽ là tháng 1 năm 2018. 
//Trong trường hợp chúng ta muốn tăng tháng nhưng vẫn giữ nguyên năm thì 
//Java cung cấp cho chúng ta phương thức roll() với cú pháp như sau:

//Cú pháp
//1.Calendar cal = Calendar.getInstance();
//2.cal.roll(int field, int amount);
// 
//trong đó field là tên giá trị cần thay đổi và amount là số lượng được thêm vào hay trừ đi. 
//Nếu amount > 0 thì sẽ tăng giá trị field lên ứng với giá trị amount, 
//còn amount < 0 thì sẽ giảm giá trị của field ứng với giá trị amount đó.    
    
    
public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println("Thời gian hiện tại truoc khi thay đổi là " + cal.getTime());
         
    // thay đổi tháng thành 12
    cal.set(Calendar.MONTH, Calendar.DECEMBER);
    System.out.println("Thời gian hiện tại sau khi thay đổi là " + cal.getTime());
 
    // tăng tháng sử dụng phương thức roll()
    // lúc này tháng sẽ là tháng 1 và năm vẫn giữ nguyên
    cal.roll(Calendar.MONTH, 1);
    System.out.println("Thời gian hiện tại sau khi thay đổi là " + cal.getTime());
}    
}
