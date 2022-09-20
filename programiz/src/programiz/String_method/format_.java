/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.String_method;

import java.util.Locale;

/**
 *
 * @author DELL
 */
public class format_ {
//The Java String format() method returns a formatted string based on the argument passed.
// 
//The syntax of the String format() method is:
//
//String.format(String format, Object... args)
//Here,
//
//format() is a static method. We call the format() method using the class name String.
//... in the above code signifies you can pass more than one object to format().

    public void ex1(){
        String language = "Java";
        int number = 30;
        String result;

        // format object as a string
        result = String.format("Language: %s", language);
        System.out.println(result); // Language: Java

        // format number as a hexadecimal number
        result = String.format("Hexadecimal Number: %x", number); // 1e
        System.out.println(result); // Hexadecimal Number: 1e
    }
    
    
    public void ex2(){ 
        int n1 = 47;
        float n2 = 35.864f;
        double n3 = 44534345.76d;

        // format as an octal number
        System.out.println(String.format("n1 in octal: %o", n1));  // 57

        // format as hexadecimal numbers
        System.out.println(String.format("n1 in hexadecimal: %x", n1));  // 2f
        System.out.println(String.format("n1 in hexadecimal: %X", n1));  // 2F

        // format as strings
        System.out.println(String.format("n1 as string: %s", n1));  // 47
        System.out.println(String.format("n2 as string: %s", n2));  // 35.864

        // format in scientific notation
        System.out.println(String.format("n3 in scientific notation: %g", n3)); // 4.45343e+07
    }

        public void ex3(){ 
            int n1 = 47;
            String text = "Result"; 
            System.out.println(String.format("%s\nhexadecimal: %x", text, n1));    
        }
        
        public void ex4(){
            float n1 = -452.534f;
            double n2 = -345.766d;

            // format floating-point as it is
            System.out.println(String.format("n1 = %f", n1)); // -452.533997
            System.out.println(String.format("n2 = %f", n2)); // -345.766000

            // show up to two decimal places
            System.out.println(String.format("n1 = %.2f", n1)); // -452.53
            System.out.println(String.format("n2 = %.2f", n2)); // -345.77

        }

        public void ex5(){
            int n1 = 46, n2 = -46;
            String result;

            // padding number with spaces
            // the length of the string will be 5
            result = String.format("|%5d|", n1); // |   46|
            System.out.println(result);

            // padding number with numbers 0
            // the length of the string will be 5
            result = String.format("|%05d|", n1); // |00046|
            System.out.println(result);

            // using signs before numbers
            result = String.format("%+d", n1); // +46
            System.out.println(result);
            result = String.format("%+d", n2); // -46
            System.out.println(result);

            // enclose negative number within parenthesis
            // and removing the sign
            result = String.format("%(d", n2); // (46)
            System.out.println(result);

        }
        
        public void ex6(){
            int n = 46;

            System.out.println(String.format("%#o", n)); // 056
            System.out.println(String.format("%#x", n)); // 0x2e

        }
        public void ex7(){ 
            int number = 8652145;
            String result;

            // using the current locale
            result = String.format("Number: %,d", number);
            System.out.println(result);

            // using the GERMAN locale as the first argument
            result = String.format(Locale.GERMAN, "Number in German: %,d", number);
            System.out.println(result);

        } 
 
                
    public static void main(String[] args) {
        format_ e = new format_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
        e.ex3();
        System.out.println(); 
        e.ex4();
        System.out.println(); 
        e.ex5();
        System.out.println(); 
        e.ex6();
        System.out.println(); 
        e.ex7();
        System.out.println();  
    }                
    
}
