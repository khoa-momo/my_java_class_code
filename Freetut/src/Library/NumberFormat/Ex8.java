/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.NumberFormat;

import java.text.NumberFormat;

/**
 *
 * @author DELL
 */
public class Ex8 {
//    Định dạng 1 số ở dạng phần trăm
//Để định dạng 1 số ở dạng phần trăm, chúng ta sẽ sử dụng phương thức getPercentageInstance() của NumberFormat.  
public static void main(String[] args) {
    double percentageDoubleNumber = 0.758d;
         
    // định dạng số percentageDoubleNumber ở dạng phần trăm
    // theo khu vực mặc định của máy ảo JVM
    // khu vực mặc định này là nước Mỹ
    // lưu ý là phần trăm của số sẽ được làm tròn
    NumberFormat numEN = NumberFormat.getPercentInstance();
    String percentageEN = numEN.format(percentageDoubleNumber);
    System.out.println("Số " + percentageDoubleNumber + " ở dạng phần trăm = " + percentageEN); 
}    
}
