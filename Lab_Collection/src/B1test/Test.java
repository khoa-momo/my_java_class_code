/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1test;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author DELL
 */
 
public class Test {
 
    public static void main(String[] args) {
        ArrayList<HoSoHocSinh> arrHoSo = new ArrayList(); //<>
        
        
        int n;
        HoSoHocSinh hoSoHocSinh;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập số học sinh: ");
        n = scanner.nextInt();
         
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
            hoSoHocSinh = new HoSoHocSinh();
            hoSoHocSinh.nhapThongTinHoSo();
            arrHoSo.add(hoSoHocSinh);
        }
         
        for (int i = 0; i < arrHoSo.size(); i++) {
            System.out.println("\nThông tin học sinh thứ " + (i+1) + ": ");
            arrHoSo.get(i).hienThiThongTinHoSo();
//            arrHoSo.get(i).hoSoHocSinh(t);
        }
         
        System.out.println("\nNhững Học Sinh có quê ở Thái Nguyên là: ");
        // hiển thị những học sinh có quê ở Thái Nguyên
        for (int i = 0; i < arrHoSo.size(); i++) {
            if (arrHoSo.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
                arrHoSo.get(i).hienThiThongTinHoSo();
            }
        }
         
        System.out.println("\nNhững học sinh học lớp 10A1 là: ");
        // hiển thị những học sinh học lớp 10A1
        for (int i = 0; i < arrHoSo.size(); i++) {
            if (arrHoSo.get(i).getLop().equalsIgnoreCase("10A1")) {
                arrHoSo.get(i).hienThiThongTinHoSo();
            }
        }
    }
 
}