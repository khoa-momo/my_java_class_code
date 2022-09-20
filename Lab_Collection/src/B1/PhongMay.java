/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

/**
 *
 * @author DELL
 */
public class PhongMay extends PhongHoc{

    protected String MaPhong;
    protected String DayNha; 
    protected float DienTich;
    protected int SoBongDen;     
    
    public PhongMay(){
    }
    public PhongMay(String MaPhong, String DayNha, float DienTich, int SoBongDen) { 
        this.MaPhong = MaPhong;
        this.DayNha = DayNha;
        this.DienTich = DienTich;
        this.SoBongDen = SoBongDen;
    }           
}
