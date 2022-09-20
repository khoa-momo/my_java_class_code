/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class PhongHoc {
    
    protected String MaPhong;
    protected String DayNha; 
    protected float DienTich;
    protected int SoBongDen;     
    
    public PhongHoc(){
    }
    public PhongHoc(String MaPhong, String DayNha, float DienTich, int SoBongDen) { 
        this.MaPhong = MaPhong;
        this.DayNha = DayNha;
        this.DienTich = DienTich;
        this.SoBongDen = SoBongDen;
    }    
    
//    public static void main(String[] args) {
//        // ArrayList<String> listPhonghoc = new ArrayList<String>();   
//        ArrayList listPhonghoc;
//        listPhonghoc = new ArrayList(); 
//        listPhonghoc.add("Phong ly thuyet");
//        listPhonghoc.add("Phong may");
//        listPhonghoc.add("Phong thi nghiem");     
//    }
    
 
}
