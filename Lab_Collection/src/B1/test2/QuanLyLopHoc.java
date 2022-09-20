/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1.test2;

/**
 *
 * @author DELL
 */ 
import java.util.Scanner;
 
public class QuanLyLopHoc {
    private String lop;
    private PhongLT phongLT;
     
    public QuanLyLopHoc() {
        super();
    }
 
    public QuanLyLopHoc(String lop, PhongLT phongLT) {
        super();
        this.lop = lop;
        this.phongLT = phongLT;
    }
     
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
 
    public PhongLT getPhongLT() {
        return phongLT;
    }
    public void setPhongLT(PhongLT phongLT) {
        this.phongLT = phongLT;
    }
 
    public void nhapThongTinHoSo() {
        phongLT = new PhongLT();
        phongLT.nhapThongTin();
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }
     
    public void hienThiThongTinHoSo() {
        phongLT.hienThiThongTin();
        System.out.println("Lớp: " + lop);
    }
}