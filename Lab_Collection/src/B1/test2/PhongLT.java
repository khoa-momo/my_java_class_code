/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1.test2;
import java.util.Scanner;
/**
 *
 * @author DELL
 */ 
public class PhongLT {
    protected String MaPhong;
    protected String DayNha; 
    protected float DienTich;
    protected int SoBongDen;
     
    public PhongLT() {
        super();
    }
 
    public PhongLT(String MaPhong, String DayNha, float DienTich) {
        super();
        this.MaPhong = MaPhong;
        this.DayNha = DayNha;
        this.DienTich = DienTich;
    }
     
    public float getDienTich() {
        return DienTich;
    }
 
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        MaPhong = scanner.nextLine();
        System.out.print("Nhap Day nha: ");
        DayNha = scanner.nextLine();
        System.out.print("Nhap DienTichn: ");
        DienTich = scanner.nextFloat();
    }
     
    public void hienThiThongTin() {
        System.out.println("Ma phong: " + MaPhong);
        System.out.println("Day nha: " + DayNha);
        System.out.println("DienTichn: " + DienTich);
    }
}