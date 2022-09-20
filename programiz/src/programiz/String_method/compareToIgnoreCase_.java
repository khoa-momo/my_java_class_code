/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programiz.String_method;

/**
 *
 * @author DELL
 */
public class compareToIgnoreCase_ {
    public void ex1(){
        String str1 = "Learn Java";
        String str2 = "learn java";
        String str3 = "Learn Kolin";
        int result;

        // comparing str1 with str2
        result = str1.compareToIgnoreCase(str2);
        System.out.println(result); // 0

        // comparing str1 with str3
        result = str1.compareToIgnoreCase(str3);
        System.out.println(result); // -1

        // comparing str3 with str1
        result = str3.compareToIgnoreCase(str1);
        System.out.println(result); // 1        
    }
    
    public void ex2(){
        String str1 = "LEARN JAVA";
        String str2 = "Learn Java";
        // if str1 and str2 are equal (ignoring case differences),
        // the result is 0
        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("str1 and str2 are equal");
        }
        else {
            System.out.println("str1 and str2 are not equal");
        }
        
    }
    
    public static void main(String[] args) {
        compareToIgnoreCase_ e = new compareToIgnoreCase_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println(); 
    }    
}
