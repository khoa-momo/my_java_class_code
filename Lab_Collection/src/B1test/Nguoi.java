/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1test;
import java.util.Scanner;
/**
 *
 * @author DELL
 */

public class Nguoi {
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
     
    public Nguoi() {
//        super();
    }
 
    public Nguoi(String hoTen, String gioiTinh, String queQuan) {
//        super();
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }
     
    public String getQueQuan() {
        return queQuan;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + '}';
    }
    
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên học sinh: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();
    }
    
    
    public void hienThiThongTin() {
        Nguoi hs = new Nguoi();   
        System.out.println(hs.toString()); 
//        System.out.println("Họ tên: " + hoTen);
//        System.out.println("Giới tính: " + gioiTinh);
//        System.out.println("Quê quán: " + queQuan);
    }
}