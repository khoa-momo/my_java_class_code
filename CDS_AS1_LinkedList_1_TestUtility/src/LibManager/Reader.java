/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibManager;

/**
 *
 * @author DELL
 */
public class Reader {
    String rcode;
    String name;
    int byear;

    public Reader() {
    }

    public Reader(String rcode, String name, int byear) {
        this.rcode = rcode;
        this.name = name;
        this.byear = byear;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getByear() {
        return byear;
    }

    public void setByear(int byear) {
        this.byear = byear;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-10s | %-10d",rcode, name, byear); 
    } 
    
}
