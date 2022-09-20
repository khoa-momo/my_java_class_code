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
public class PhoneNumber {

    protected int area;
    protected String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    public void display() {
        System.out.println(area + " - " + number);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area code: ");
        area = sc.nextInt();
        //
        sc.nextLine();
        System.out.print("Enter number: ");
        number = sc.nextLine();
    }
}
