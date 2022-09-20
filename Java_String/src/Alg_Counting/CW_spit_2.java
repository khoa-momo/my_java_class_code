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
public class CW_spit_2 {
    public static int checkLetter(String word){ 
        int check = 0;
//        int fault = 0;
        for (int i = 0; i < word.length(); i++) {
            char kt = word.charAt(i);
            if(Character.isLetter(kt)){
                check++;
            } 
        }
        if(check != 0){
            return 1;
        }else{
            return 0;
        }
    }
            
    public static int countWords(String str) { 
        String words[] = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(checkLetter(words[i]) == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str =  "One, ten10 get10 two 123 .year. ,, --  three four five ";
        System.out.println("No of words: " + countWords(str));
    }

}
