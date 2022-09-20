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

    void nhapAlbum() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Ma_CD: "); 
        Ma_CD = scanner.nextInt();

        System.out.print("Nhập Tua_CD: ");
        Tua_CD = scanner.nextLine();  
        scanner.nextLine();

        System.out.print("Nhập Ca_si: "); 
        Ca_si = scanner.nextLine();       

        System.out.print("Nhập So_bai_hat: "); 
        So_bai_hat = scanner.nextInt();

        System.out.print("Nhập Gia_thanh: "); 
        Gia_thanh = scanner.nextFloat();
        
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
        
    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CD alb[] = new CD[100]; 
    int a, n = 0;
    boolean flag = true;
    do {
        System.out.print("1.Nhập thông tin CD \n2.Xuất danh sách Album.\n3.Tính tổng giá thành \n4.Tổng số lượng CD \n" +
                "5.Sắp xếp giảm dần theo giá thành\n6.Sắp xếp tăng dần theo tựa CD\n7.Nhập số khác để thoát\nChon so: ");
        a = sc.nextInt();
        switch (a){
            //Input
            case 1:
                System.out.print("Nhập số lượng CD: ");
                n = sc.nextInt(); 
                alb = new CD[n];
                for (int i=0; i<n; i++) {
                    System.out.println("*CD thứ "+(i+1));
                    alb[i] = new CD(); 
                    alb[i].nhapAlbum(); 
                }
                System.out.println();
                break;

            //dispay
            case 2:
                System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
                for (int i=0; i < n; i++) {
                    alb[i].hienThiAlbum();
                }
                System.out.println();
                break;

            // Sum gia tien    
            case 3:
                int tong=0;
                for (int i=0; i < n; i++) {
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
                for (int i=0; i<n-1; i++) {
                    for (int j=i+1; j<n; j++) {
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
                for (int i=0; i<n-1; i++) {
                    for (int j=i+1; j<n; j++) {
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
    }while(flag);
 
}     
    
    
}
