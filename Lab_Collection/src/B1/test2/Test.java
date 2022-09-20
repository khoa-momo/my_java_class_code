/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1.test2;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author DELL
 */
public class Test {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<QuanLyLopHoc> arrLopHoc = new ArrayList(); //<>
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.print("1.Nhập thông tin CD \n2.Xuất danh sách Album.\n3.Tính tổng giá thành \n4.Tổng số lượng CD \n" +
                    "5.Sắp xếp giảm dần theo giá thành\n6.Sắp xếp tăng dần theo tựa CD\n7.Nhập số khác để thoát\nChon so: ");
            a = sc.nextInt();
            switch (a){ 
                case 1:
                    QuanLyLopHoc quanLyLopHoc; 
                    System.out.println("Nhập số phong: ");
                    n = sc.nextInt();
                    //Input
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin phong thứ " + (i + 1) + "*");
                        quanLyLopHoc = new QuanLyLopHoc();
                        quanLyLopHoc.nhapThongTinHoSo();
                        arrLopHoc.add(quanLyLopHoc);
                    }
                    System.out.println();
                    break;
 
                case 2:
                //Output
                    for (int i = 0; i < arrLopHoc.size(); i++) {
                        System.out.println("\nThông tin phong thứ " + (i+1) + "*");
                        arrLopHoc.get(i).hienThiThongTinHoSo();
                    }
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



         
//        System.out.println("\nNhững Học Sinh có quê ở Thái Nguyên là: ");
//        // hiển thị những học sinh có quê ở Thái Nguyên
//        for (int i = 0; i < arrLopHoc.size(); i++) {
//            if (arrLopHoc.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
//                arrLopHoc.get(i).hienThiThongTinHoSo();
//            }
//        }
         
//        System.out.println("\nNhững học sinh học lớp 10A1 là: ");
        // hiển thị những học sinh học lớp 10A1
//        for (int i = 0; i < arrLopHoc.size(); i++) {
//            if (arrLopHoc.get(i).getLop().equalsIgnoreCase("10A1")) {
//                arrLopHoc.get(i).hienThiThongTinHoSo();
//            }
//        }




    }     
}
