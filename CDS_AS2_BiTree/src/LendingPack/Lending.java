/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LendingPack;    
/**
 *
 * @author DELL
 */
public class Lending{  
    String bcode2;
    String rcode2;
    int state; 
    
    public Lending() {
    } 
    public Lending(String bcode2, String rcode2, int state) {
        this.bcode2 = bcode2;
        this.rcode2 = rcode2;
        this.state = state;
    }

    public String getBcode() {
        return bcode2;
    } 
    public void setBcode(String bcode) {
        this.bcode2 = bcode;
    } 
    public String getRcode() {
        return rcode2;
    } 
    public void setRcode(String rcode) {
        this.rcode2 = rcode;
    } 
    public int getState() {
        return state;
    } 
    public void setState(int state) {
        this.state = state;
    } 
    
    @Override
    public String toString() {
        return String.format("%-15s | %-15s | %-15d", bcode2, rcode2, state);
    }    
    
}
