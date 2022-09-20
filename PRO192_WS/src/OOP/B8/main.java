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
public class main {
    static Scanner sc = new Scanner(System.in);

    static void nhapAlbum(CD ab) {
        System.out.print("Nhập mã CD: ");
        ab.setMa_CD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên CD : ");
        ab.setTua_CD(sc.nextLine());
        System.out.print("Nhập tên ca sĩ : ");
        ab.setCa_si(sc.nextLine());
        System.out.print("Nhập số lượng bài hát : ");
        ab.setSo_bai_hat(sc.nextInt());
        System.out.print("Nhập giá thành : ");
        ab.setGia_thanh(sc.nextFloat());
    }
    
public static void main(String[] args) {
    
    CD alb[] = null;
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

                alb = new CD[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("CD thứ " +(i+1)+": ");
                    alb[i] = new CD();
                    nhapAlbum(alb[i]);
                }
                System.out.println();
                break;

            //dispay
            case 2:
                System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
                for (int i = 0; i < n; i++) {
                    alb[i].hienThiAlbum();
                }
                System.out.println();
                break;

            // Sum gia tien    
            case 3:
                int tong = 0;
                for (int i = 0; i < n; i++) {
                    tong += alb[i].getGia_thanh();
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
                CD temp = alb[0];
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (alb[i].getGia_thanh() < alb[j].getGia_thanh()) {
                            temp = alb[j];
                            alb[j] = alb[i];
                            alb[i] = temp;
                        }
                    }
                }
                System.out.println("Sap xep giam dan theo gia tien da xong, nhap 2 de kiem tra");
                System.out.println();
                break;

            // Sap xep tang dan theo tua CD    
            case 6:
                temp = alb[0];
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (alb[i].getTua_CD().compareTo(alb[j].getTua_CD())>0) {
                            temp = alb[j];
                            alb[j] = alb[i];
                            alb[i] = temp;
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
