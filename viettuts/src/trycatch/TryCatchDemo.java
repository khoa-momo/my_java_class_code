/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author DELL
 */
public class TryCatchDemo {
    public static void main(String[] args) {

        //Xử lý ngoại lệ bằng try catch trong Java
        try {
            int data = 5 / 0;
        } catch (ArithmeticException e) {
            //In ra màn hình tên ngoại lệ
            System.out.println(e);
        }
        System.out.println("Phép chia cho 0");
    }    
}
