/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alg_Counting;

/**
 *
 * @author DELL
 */
public class Count_Words3_Split { 
    public static int countWords(String str){ 
        if (str == null || str.isEmpty()){
            return 0;
        }  
        String[] words = str.split("\\s+"); 
        return words.length;
    }
      
    public static void main(String args[]){ 
        String str = "One two   2 3  .. ,, --  three\n four\tfive "; 
        System.out.println("No of words : " + countWords(str));
    }    
    
}//end
