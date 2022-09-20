/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B7_2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Sinh_Vien {
    private int Ma_SV;
    private String Ho_ten;
    private String Dia_chi;
    private String So_dt;

    public Sinh_Vien(){
    }
    public Sinh_Vien(int Ma_SV, String Ho_ten, String Dia_chi, String So_dt) {
        this.Ma_SV = Ma_SV;
        this.Ho_ten = Ho_ten; 
        this.Dia_chi = Dia_chi;
        this.So_dt = So_dt;        
    }
    
    public void setMa_SV(int Ma_SV){
        this.Ma_SV = Ma_SV;
    } 
    public int getMa_SV(){
        return Ma_SV;
    } 
    public void setHo_ten(String Ho_ten){
        this.Ho_ten = Ho_ten;
    } 
    public String getHo_ten(){
        return Ho_ten;
    } 
    public void setDia_chi(String Dia_chi){
        this.Dia_chi = Dia_chi;
    } 
    public String getDia_chi(){
        return Dia_chi;
    }
    public void setSo_dt(String So_dt){
        this.So_dt = So_dt;
    } 
    public String getSo_dt(){
        return So_dt;
    }

    
@Override
    public String toString() {
        return "Ma_SV = " + Ma_SV + "\tHo_ten = " + Ho_ten + "\tDia_chi = " + Dia_chi + "\tSo_dt = " + So_dt;
    }   
    
    public void display() {
        System.out.printf("%d %20s %15s %15s \n", Ma_SV, Ho_ten, Dia_chi, So_dt);
    }    
    
    static Scanner sc = new Scanner(System.in);
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã số sinh viên: "); 
        Ma_SV = scanner.nextInt();

        System.out.print("Nhập họ và tên sinh viên: ");
        Ho_ten = scanner.nextLine(); 
        scanner.nextLine();

        System.out.print("Nhập địa chỉ sinh viên: "); 
        Dia_chi = scanner.nextLine();       

        System.out.print("Nhập số điện thoại bao gồm 7 số: "); 
        So_dt = scanner.nextLine();
    }
 

public static void main(String[] args) {
    Sinh_Vien sv[] = new Sinh_Vien[100]; 
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
                sv = new Sinh_Vien[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("*Sinh viên thứ " + (i+1));
//                  input(sv[i])
                    sv[i] = new Sinh_Vien();
                    sv[i].input();
                    System.out.println();
                }
                break;
            
            //output  
            case 2: 
                //sorting
                Sinh_Vien temp = sv[0];
                for (int i=0; i<sv.length-1; i++) {
                    for (int j=i+1; j<sv.length; j++) {
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
