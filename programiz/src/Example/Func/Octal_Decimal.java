/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Func;

/**
 *
 * @author DELL
 */
public class Octal_Decimal {
    public static void main(String[] args) {
        int decimal = 78;
        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
    }

    public static int convertDecimalToOctal(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }   
}


//    public static void main(String[] args) {
//        int octal = 116;
//        int decimal = convertOctalToDecimal(octal);
//        System.out.printf("%d in octal = %d in decimal", octal, decimal);
//    }
//
//    public static int convertOctalToDecimal(int octal)
//    {
//        int decimalNumber = 0, i = 0;
//
//        while(octal != 0)
//        {
//            decimalNumber += (octal % 10) * Math.pow(8, i);
//            ++i;
//            octal/=10;
//        }
//
//        return decimalNumber;
//    }
