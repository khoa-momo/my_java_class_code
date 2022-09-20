/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.String;
import java.util.Random;
/**
 *
 * @author DELL
 */
public class random_strings {
    public void ex(){ 
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder(); 
        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7; 
        for(int i = 0; i < length; i++) { 
          // generate random index number
          int index = random.nextInt(alphabet.length()); 
          // get character specified by index
          // from the string
          char randomChar = alphabet.charAt(index); 
          // append the character to string builder
          sb.append(randomChar); 
        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString); 
        }
    }    
     
    
    public void ex2(){
        // create a string of uppercase and lowercase characters and numbers
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 10;

        for(int i = 0; i < length; i++) {

          // generate random index number
          int index = random.nextInt(alphaNumeric.length());

          // get character specified by index
          // from the string
          char randomChar = alphaNumeric.charAt(index);

          // append the character to string builder
          sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);        
        }
 
    public static void main(String[] args) {
        random_strings e = new random_strings();
        e.ex();
        System.out.println();
        e.ex2();
        System.out.println(); 

}    
    
    
    
    
} 
