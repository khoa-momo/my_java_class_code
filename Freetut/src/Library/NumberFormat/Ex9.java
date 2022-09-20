/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.NumberFormat;

import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 *
 * @author DELL
 */
public class Ex9 {
//Làm tròn số
//Để làm tròn số trong Java, chúng ta sẽ sử dụng phương thức setRoundingMode().    
    public static void main(String[] args) {
        NumberFormat numf = NumberFormat.getNumberInstance();
        numf.setMaximumFractionDigits(2);   // làm tròn đến 2 chữ số phần thập phân

        // RoundingMode.UP: làm tròn lên
        numf.setRoundingMode(RoundingMode.UP);
        System.out.println("Chế độ làm tròn: " + numf.getRoundingMode());
        System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
        System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
        System.out.println("823.456 sau khi làm tròn = " + numf.format(823.456));

        // RoundingMode.DOWN: làm tròn xuống
        numf.setRoundingMode(RoundingMode.DOWN);
        System.out.println("\nChế độ làm tròn: " + numf.getRoundingMode());
        System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
        System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
        System.out.println("823.456 sau khi làm tròn = " + numf.format(823.455));   
    }    
}
