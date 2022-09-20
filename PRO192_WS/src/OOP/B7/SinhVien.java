/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.B7;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private int Ma_SV;
    private String Ho_ten;
    private String Dia_chi;
    private String So_dt;

    public SinhVien(){
    }
    public SinhVien(int Ma_SV, String Ho_ten, String Dia_chi, String So_dt) {
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


}
