/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class student_management {
    private int ID_number;
    private String Ho_ten;
    private float Diem_LT;
    private float Diem_TH;

    public student_management(){
    }
    public student_management(int ID_number, String Ho_ten, float Diem_LT, float Diem_TH) {
        this.ID_number = ID_number;
        this.Ho_ten = Ho_ten;
        this.Diem_LT = Diem_LT;
        this.Diem_TH = Diem_TH;
    }
    
    public void setID_number(int ID_number){
        this.ID_number = ID_number;
    } 
    public int getID_number(){
        return ID_number;
    } 
    public void setHo_ten(String Ho_ten){
        this.Ho_ten = Ho_ten;
    } 
    public String getHo_ten(){
        return Ho_ten;
    }
    public void setDiem_LT(float Diem_LT){
        this.Diem_LT = Diem_LT;
    } 
    public float getDiem_LT(){
        return Diem_LT;
    }
    public void setDiem_TH(float Diem_TH){
        this.Diem_TH = Diem_TH;
    } 
    public float getDiem_TH(){
        return Diem_TH;
    }
     
    public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("ID_number: ");
       ID_number = scanner.nextInt();
       System.out.print("Ho_ten: ");
       Ho_ten = scanner.next();
       System.out.print("Diem_LT: ");
       Diem_LT = scanner.nextFloat();
       System.out.print("Diem_TH: ");
       Diem_TH = scanner.nextFloat();   
    }
    public void display(){ 
       System.out.print(ID_number + "\t" + Ho_ten + "\t" + Diem_LT + "\t" + Diem_TH);  
    }
    public float tinhDiemTB() {
        return (Diem_LT + Diem_TH) / 2;
    }
    @Override
    public String toString() {
        return ID_number + "\t" + Ho_ten + "\t" + Diem_LT + "\t" + Diem_TH;
    } 


}
