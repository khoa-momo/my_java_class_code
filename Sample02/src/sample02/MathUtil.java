/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample02;

/**
 *
 * @author KienLT
 */
public class MathUtil {
    
    public double add(int num1, int num2) {
        return num1 + num2;
    }
    public double add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public double add(int num1, float num2) {
        return num1 + num2;
    }
    public double add(int num1, double num2) {
        return num1 + num2;
    }
    public double add(float num1, int num2) {
        return num1 + num2;
    }
    public double add(double num1, int num2) {
        return num1 + num2;
    }
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double sum(double[] a) {
        double tong = 0;
        for (double d : a) {
            tong += d;
        }
        return tong;
    }
    
    public static double sumOf(double... a) {
        double tong = 0;
        for (double d : a) {
            tong += d;
        }
        return tong;
    }    
    
}
