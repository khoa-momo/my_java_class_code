/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS5_two;
import java.util.Scanner;

/**
 *
 * @author letha
 */
public class IntPhoneNumber extends PhoneNumber {

    protected String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }

    @Override
    public void display() {
        System.out.println(countryCode + " - " + area + " - " + number);
    }
    
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

}
