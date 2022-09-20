/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        
        boolean kt = true;
        boolean th = true;
        
        //ma hang
        System.out.println("Nhập mã hàng : ");
        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        //ten hang
        do {
            System.out.println("Nhập tên hàng : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.kiemTraTenHang(kt));
        //gia
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(scanner.nextDouble());
        
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        
        System.out.println(tp);
        tp.kiemTraHSD();
    }    
}
