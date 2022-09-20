/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package B4;

public class ReservationCode {

    String custonmerName;
    String code;

    public ReservationCode() {
    }

    public ReservationCode(String code, String customerName) {
        this.custonmerName = customerName;
        this.code = code;
    }

    String getCode() {
        String result = "";
        for (int i = 0; i < code.length(); i += 2) {
            result = result + code.substring(i, i + 2);
            result = result + "-";
        }
        return result.substring(0, result.length() - 1);
    }

    @Override
    public String toString() {
        return custonmerName + "\t" + code;
    }

}
