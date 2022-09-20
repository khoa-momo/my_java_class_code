/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5.a;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main_a{
    public static void main(String[] args) {     
        
        Scanner sc = new Scanner(System.in);
        PhoneNumber list[] = new PhoneNumber[1000];
//      IntPhoneNumber list[] = new IntPhoneNumber[1000];
         
        System.out.println("Enter list of phone numbers");
        System.out.println("---------------------------");
        int pn_amount = 0;
        int choice;
        
        do{
            System.out.print("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit): ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    PhoneNumber phoneNumber = new PhoneNumber();
                    phoneNumber.input(); 
                    list[pn_amount] = phoneNumber;
                    pn_amount++;
                    break;
                case 2:
                    IntPhoneNumber intPhoneNumber = new IntPhoneNumber();
                    intPhoneNumber.input(); 
                    list[pn_amount] = intPhoneNumber;
                    pn_amount++;
                    break;
                default:
                    break;
            }
        }while(choice!=0);
//Output         
        System.out.println("\n List of phone numbers:");
        for (int i=0; i<pn_amount; i++) {
            list[i].display();
        }


}
    
}
