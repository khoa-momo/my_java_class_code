/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeBase;

/**
 *
 * @author DELL
 */
public class CovertBase {

    int convertNumber() {
        int base = ValidateInput.inputBase("Enter your input: ", "Invalid", 0, 16);
        int number = ValidateInput.inputBase("Enter your input number: ", "Invalid", 0, 16);
        
            if(base == 2){
                int convert = ValidateInput.inputBase("Enter your output", "Invalid", 0, 16);
                if(convert == 10){
                    return number;
                }
            }
    }
    
    int binaryToDecimal(int n){
        int num = n;
        int dec_value = 0;
        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        return dec_value;
    }

    void decToBinary(int n){
        // array to store binary number
        int[] binaryNum = new int[1000];
        // counter for binary array
        int i = 0;
        while (n > 0){
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        } 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    
}
