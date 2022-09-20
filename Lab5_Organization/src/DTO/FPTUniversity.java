/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author DELL
 */
public class FPTUniversity extends University implements Role{
    
    public String address;

    public FPTUniversity() {
    }
    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }

    @Override
    public void createWorker() {
        System.out.println("providing human resources");
    }

    public String getAddress() {
        return address;
    } 
    public void setAddress(String address) {
        this.address = address;
    }
   
    @Override
    public String toString() {
        return "FPTU has campuses HaNoi, HCM, DaNang, CanTho, QuyNhon";
    } 
}
