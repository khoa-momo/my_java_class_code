/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CD {
    private int Ma_CD;
    private String Tua_CD;
    private String Ca_si;
    private int So_bai_hat;
    private float Gia_thanh;

    public CD(){
    }
    public CD(int Ma_CD, String Tua_CD, String Ca_si, int So_bai_hat, int Gia_thanh) {
        this.Ma_CD = Ma_CD;
        this.Tua_CD = Tua_CD;
        this.Ca_si = Ca_si;
        this.So_bai_hat = So_bai_hat;
        this.Gia_thanh = Gia_thanh;        
    }
    
    public void setMa_CD(int Ma_CD){
        this.Ma_CD = Ma_CD;
    } 
    public int getMa_hang(){
        return Ma_CD;
    } 
    public void setTua_CD(String Tua_CD){
        this.Tua_CD = Tua_CD;
    } 
    public String getTua_CD(){
        return Tua_CD;
    }
    public void setCa_si(String Ca_si){
        this.Ca_si = Ca_si;
    } 
    public String getCa_si(){
        return Ca_si;
    }
    public void setSo_bai_hat(int So_bai_hat){
        this.So_bai_hat = So_bai_hat;
    } 
    public int getSo_bai_hat(){
        return So_bai_hat;
    }
    public void setGia_thanh(float Gia_thanh){
        this.Gia_thanh = Gia_thanh;
    } 
    public float getGia_thanh(){
        return Gia_thanh;
    }
    
@Override
    public String toString() {
        return "Ma_CD = " + Ma_CD + "Tua_CD = " + Tua_CD + "Ca_si='" + Ca_si + ", So_bai_hat = " + So_bai_hat + "Gia_thanh = " + Gia_thanh;
    }
    
    //khởi tạo phương thức hiện thị theo format
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",Ma_CD,Tua_CD,Ca_si,So_bai_hat,Gia_thanh);
    }     
    
//    static Scanner sc = new Scanner(System.in);
//    static void nhapAlbum(CD ab) {
//        System.out.print("Nhập mã CD: ");
//        ab.setMa_CD(sc.nextInt());
//        sc.nextLine();
//        System.out.print("Nhập tên CD : ");
//        ab.setTua_CD(sc.nextLine());
//        System.out.print("Nhập tên ca sĩ : ");
//        ab.setCa_si(sc.nextLine());
//        System.out.print("Nhập số lượng bài hát : ");
//        ab.setSo_bai_hat(sc.nextInt());
//        System.out.print("Nhập giá thành : ");
//        ab.setGia_thanh(sc.nextFloat());
//    }
}
