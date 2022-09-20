/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.String;

/**
 *
 * @author DELL
 */
public class Compare_2_strings {
    public void ex(){
        String style = "Bold";
        String style2 = "Bold";

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");        
    
}
    public void ex2(){
        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
    
    public void ex3(){
        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
    
    public void ex4(){
                String style = new String("Bold");
        String style2 = new String("Bold");

        boolean result = style.equals("Bold"); // true
        System.out.println(result);

        result = style2 == "Bold"; // false
        System.out.println(result);

        result = style == style2; // false
        System.out.println(result);

        result = "Bold" == "Bold"; // true
        System.out.println(result);
    }
    
public static void main(String[] args) {
    Compare_2_strings e = new Compare_2_strings();
    e.ex();
    System.out.println();
    e.ex2();
    System.out.println();
    e.ex3();
    System.out.println();
    e.ex4();
    System.out.println();

}
    
    
    
    
    
    
    
    
}
