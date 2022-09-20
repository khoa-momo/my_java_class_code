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
public class IntPhoneNumber extends PhoneNumber{
    protected String countryCode;
    
    public IntPhoneNumber(){
    }
    public IntPhoneNumber(String cc, int a, String n){
        super(a, n);
        this.countryCode = cc;        
    }
    
//    public void setCountryCode(String cc){
//        this.countryCode = cc;
//    } 
//    public String getCountryCode(){
//        return countryCode;
//    } 
    
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country code: ");
        countryCode = sc.nextLine();
        System.out.print("Enter area code: ");
        area = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Enter number: ");
        number = sc.nextLine();
    }
    @Override
    public void display(){
//        super.display();
//        System.out.println(countryCode);
        System.out.println(countryCode + " - " + area + " - " + number);
    }
}
