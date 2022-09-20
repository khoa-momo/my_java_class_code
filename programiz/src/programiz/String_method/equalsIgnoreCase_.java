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
public class equalsIgnoreCase_ {
    public void ex1(){ 
        String str1 = "Learn Java";
        String str2 = "learn java";
        String str3 = "Learn Kolin";
        Boolean result;

        // comparing str1 with str2
        result = str1.equalsIgnoreCase(str2);
        System.out.println(result); // true

        // comparing str1 with str3
        result = str1.equalsIgnoreCase(str3);
        System.out.println(result); // false

        // comparing str3 with str1
        result = str3.equalsIgnoreCase(str1);
        System.out.println(result); // false 
    }
    
    public void ex2(){ 
        String str1 = "LEARN JAVA";
        String str2 = "Learn Java";
        
        // if str1 and str2 are equal (ignoring case differences),
        // the result is true
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal");
        }
        else {
            System.out.println("str1 and str2 are not equal");
        }    
    }
 
public static void main(String[] args) {
        equalsIgnoreCase_ e = new equalsIgnoreCase_();
        e.ex1(); 
        System.out.println();
        e.ex2();
        System.out.println();  
    }     
}
