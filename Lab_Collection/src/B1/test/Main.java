/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1.test;

import B1.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {
//    public static void main(String[] args) {
//        
//        
//        ArrayList listPhonghoc;
//        listPhonghoc = new ArrayList(); 
//        listPhonghoc.add("Phong ly thuyet");
//        listPhonghoc.add("Phong may");
//        listPhonghoc.add("Phong thi nghiem");    
//        
//        System.out.println("Danh sach cac phong hoc: ");
//        System.out.println(listPhonghoc);
//    }
    
    public void AddPhonghoc(){
        
    }

    public void InDanhsach(){

    }    
    
    public void SortTheoDayNha(){
        
    }    

    public void SortTheoDienTich(){
        
    }     
    
    public void SortTheoBongDen(){
        
    }       
    
    public void UpdateSoMayTinh(){
        
    }       
    
    public void XoaPhongHoc(){
        
    }       
    
    public void TongSoPhong(){
        
    }      
 
    public static void main(String[] args) {
    
    PhongHoc list[] = null;
    int a, n = 0;
    boolean flag = true;
    do {
        System.out.print("1.Nhập thông tin CD \n2.Xuất danh sách Album.\n3.Tính tổng giá thành \n4.Tổng số lượng CD \n" +
                "5.Sắp xếp giảm dần theo giá thành\n6.Sắp xếp tăng dần theo tựa CD\n7.Nhập số khác để thoát\nChon so: ");
        a = sc.nextInt();
        switch (a){
            //Input
            case 1:
                System.out.println("Nhập số lượng CD : ");
                n = sc.nextInt();

                list = new PhongHoc[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("CD thứ " +(i+1)+": ");
                    list[i] = new PhongHoc();
                    nhapAlbum(list[i]);
                }
                System.out.println();
                break;

            //dispay
            case 2:
                System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
                for (int i = 0; i < n; i++) {
                    list[i].hienThiAlbum();
                }
                System.out.println();
                break;

            // Sum gia tien    
            case 3:
                int tong = 0;
                for (int i = 0; i < n; i++) {
                    tong += list[i].getGia_thanh();
                }
                System.out.println("" + "Tổng giá thành là : " + tong);
                System.out.println();
                break;

            // Sum so luong CD    
            case 4:
                System.out.println("Tong so luong CD la: " + n);
                System.out.println();
                break;

            // Sap xep giam dan theo gia tien    
            case 5:
                PhongHoc temp = list[0];
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (list[i].getGia_thanh() < list[j].getGia_thanh()) {
                            temp = list[j];
                            list[j] = list[i];
                            list[i] = temp;
                        }
                    }
                }
                System.out.println("Sap xep giam dan theo gia tien da xong, nhap 2 de kiem tra");
                System.out.println();
                break;

            // Sap xep tang dan theo tua CD    
            case 6:
                temp = list[0];
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (list[i].getTua_CD().compareTo(list[j].getTua_CD())>0) {
                            temp = list[j];
                            list[j] = list[i];
                            list[i] = temp;
                        }
                    }
                }
                System.out.println("Sap xep tang dan theo tua CD da xong, nhap 2 de kiem tra");
                System.out.println();
                break;

            //default
            default:
                System.out.println("Cam on quy khach dan su dung dich vu");
                System.out.println();
                flag = false;
                break;
        }
    }while (flag) ;




}   
}
