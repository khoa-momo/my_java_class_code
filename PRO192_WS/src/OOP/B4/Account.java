/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B4;

/**
 *
 * @author DELL
 */
import java.text.NumberFormat;
import java.util.Scanner;
 
public class Account { 
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;
 
    public Account() {
    }  
    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }  
    
    public long getSoTK() {
        return this.soTK;
    } 
    public void setSoTK(long soTK) {
        this.soTK = soTK;
    } 
    public String getTenTK() {
        return this.tenTK;
    } 
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    } 
    public double getSoTienTrongTK() {
        return this.soTienTrongTK;
    } 
    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }
  
    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        return soTK + "-" + tenTK + "-" + str1;
    }
    
    Scanner sc = new Scanner(System.in); 
    
    //phương thức nạp tiền
    public double napTien() {
        double nap;
        System.out.print("Nhap so tien can nap: ");
        nap = sc.nextDouble();
        //nếu số tiền nạp vào lớn hơn 0 thì hợp lệ
        if (nap >= 0) {
            soTienTrongTK = nap + soTienTrongTK;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("Ban vua nap " + str1 + " vao tai khoan.");
        } else {//ngược lại nếu số tiền nộp vào bé hơn 0 thì không hợp lệ
            System.out.println("So tien nap khong hop lẹ!");
        }
        return nap;
    }
 
    //phương thức rút tiền
    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhap so tien can rut: ");
        rut = sc.nextDouble();
        //nếu số tiền rút bé hơn hoặc bằng số tiền còn trong tài khoản + phí thì hợp lệ
        if (rut <= (soTienTrongTK - phi)) {
            soTienTrongTK = soTienTrongTK - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Ban vua rut " + str1 + "Dong tu tai khoan. Phi rut: $5.");
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("So tien rut khong hop le!");
            return rutTien();
        }
        return rut;
    }
 
    //phương thức đáo hạn
    public double daoHan() {
        double laiSuat = 0.035;
        soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return soTienTrongTK;
    }
 
    //display
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
    }
}
