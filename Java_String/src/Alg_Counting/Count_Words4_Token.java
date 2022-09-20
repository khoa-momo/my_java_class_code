/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alg_Counting;
import java.util.StringTokenizer;
/**
 *
 * @author DELL
 */
public class Count_Words4_Token {
    // Function to count total number
    // of words in the string
    public static int countWords(String str){
         
        // Check if the string is null
        // or empty then return zero
        if (str == null || str.isEmpty()){
            return 0;
        }
        // Create a StringTokenizer with the
        // given string passed as a parameter
        StringTokenizer tokens = new StringTokenizer(str);
        // Return the number of words
        // in the given string using
        // countTokens() method
        return tokens.countTokens();
    }
     
    // Driver Code
    public static void main(String args[]){
        // Given String str
        String str = "One two  -- ,, . .   three\n four\tfive ";
        // Print the result
        System.out.println("No of words: " +
          countWords(str));
    }
    
}//end
