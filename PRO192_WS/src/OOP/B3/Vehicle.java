package OOP.B3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL
 */
public class Vehicle {
    private String Ten;
    private String Loai_xe;
    private int Dung_tich;
    private float Gia;
    private float Thue;

    public Vehicle(){
    }
    public Vehicle(String Ten, String Loai_xe, int Dung_tich, float Gia, float Thue) {
        this.Ten = Ten;
        this.Loai_xe = Loai_xe;
        this.Dung_tich = Dung_tich;
        this.Gia = Gia;
        this.Thue = Thue;        
    }
    
    public void setTen(String Ten){
        this.Ten = Ten;
    } 
    public String getTen(){
        return Ten;
    } 
    public void setLoai_xe(String Loai_xe){
        this.Loai_xe = Loai_xe;
    } 
    public String getLoai_xe(){
        return Loai_xe;
    }
    public void setDung_tich(int Dung_tich){
        this.Dung_tich = Dung_tich;
    } 
    public int getDung_tich(){
        return Dung_tich;
    }
    public void setGia(float Gia){
        this.Gia = Gia;
    } 
    public float getGia(){
        return Gia;
    }
    public void setThue(float Thue){
        this.Thue = Thue;
    } 
    public float getThue(){
        return Thue;
    }
       
    public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ten: ");
       Ten = scanner.nextLine();
       System.out.print("Loai_xe: ");
       Loai_xe = scanner.nextLine();
       System.out.print("Dung_tich: ");
       Dung_tich = scanner.nextInt();
       System.out.print("Gia: ");
       Gia = scanner.nextFloat();   
       System.out.print("Thue: ");
       Thue = scanner.nextFloat();   
    }
    public void display(){ 
       System.out.println(Ten + "\t" + Loai_xe + "\t" + Dung_tich + "\t\t" + Gia + "\t" + Thue);  
    }


}
