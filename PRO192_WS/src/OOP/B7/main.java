/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    
static Scanner sc = new Scanner(System.in);
static void nhapThongTinh(SinhVien tt) {
    
    System.out.print("Nhập mã số sinh viên: ");
    tt.setMa_SV(sc.nextInt());
    sc.nextLine();
    
    System.out.print("Nhập họ và tên sinh viên: ");
    tt.setHo_ten(sc.nextLine());
    
    System.out.print("Nhập địa chỉ sinh viên: ");
    tt.setDia_chi(sc.nextLine());
    
    do{
        System.out.print("Nhập số điện thoại bao gồm 7 số: ");
        tt.setSo_dt(sc.nextLine());
    }while(tt.getSo_dt().length() != 7);
}

public static void main(String[] args) {
    //wtf
    SinhVien sv[] = null; 
    int a;
    int n = 0;
    boolean flag = true;
    do {
        System.out.print("1.Nhập thông tin sinh viên. \n2.Xuất bản danh sách sinh viên.\n3.Nhập số khác để thoát \nChon: ");
        a = sc.nextInt();
        switch (a) {
            //Input
            case 1:
                System.out.print("Nhập số lương sinh viên cần khai báo: ");
                n = sc.nextInt();
                //input
                sv = new SinhVien[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("*Sinh viên thứ " + (i+1));
                    sv[i] = new SinhVien();
                  nhapThongTinh(sv[i]);
//                    sv[i].input();
                    System.out.println();
                }
                break;
            
            //output  
            case 2: 
                //sorting
                SinhVien temp = sv[0];
                for (int i = 0; i < sv.length - 1; i++) {
                    for (int j = i + 1; j < sv.length; j++) {
                        if (sv[i].getMa_SV() > sv[j].getMa_SV()) {
                            temp = sv[j];
                            sv[j] = sv[i];
                            sv[i] = temp;
                        }
                    }
                }
                //output
                System.out.printf("%s %20s %15s %15s \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
                for (int i = 0; i < n; i++) {
                    sv[i].display();
                    System.out.println();
                }
                break;
                
            default:
                System.out.println("Goodbye");
                flag = false;
                break;
        }
    }while(flag);

}    
}
