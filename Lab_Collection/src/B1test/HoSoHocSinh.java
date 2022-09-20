/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1test;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
 
public class HoSoHocSinh {
    private String lop;
    private Nguoi nguoi;
     
    public HoSoHocSinh() {
        super();
    }
 
    public HoSoHocSinh(String lop, Nguoi nguoi) {
        super();
        this.lop = lop;
        this.nguoi = nguoi;
    }
     
    public String getLop() {
        return lop;
    }
 
    public void setLop(String lop) {
        this.lop = lop;
    }
 
    public Nguoi getNguoi() {
        return nguoi;
    }
 
    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    @Override
    public String toString() {
        return "HoSoHocSinh{" + "lop=" + lop + ", nguoi=" + nguoi + '}';
    }
 
    //INPUT
    public void nhapThongTinHoSo() {
        nguoi = new Nguoi();
        nguoi.nhapThongTin();
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }
     
    //OUTPUT
    public void hienThiThongTinHoSo() {
//        Nguoi hs = new Nguoi();   
//        System.out.println(hs.toString()); 
        nguoi.hienThiThongTin();
        System.out.println("Lớp: " + lop);
    }
}
