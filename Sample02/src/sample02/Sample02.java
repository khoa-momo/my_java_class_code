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
public class Sample02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] a = {5, 6, 3, 8, 2};
        System.out.println(MathUtil.sum(a));        
        System.out.println(MathUtil.sumOf(a));
        System.out.println(MathUtil.sumOf(4,5));
        System.out.println(MathUtil.sumOf(1, 4, 8));
        System.out.println(MathUtil.sumOf(3, 2, 1, 7, 9, 3));
        
        
//        Employee emp = new Employee("EMP002", "Vũ Hoàng Phương", 
//                "0923453444","phuong@gmail.com", 89.43F);        
//        emp.input();
//        emp.display();
    }
    
}
