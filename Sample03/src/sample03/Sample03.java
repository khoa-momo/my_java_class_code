/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample03;

import java.util.Scanner;

/**
 *
 * @author KienLT
 */
public class Sample03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Manager manager = new Manager();
        manager.add();
        manager.add();
        manager.add();
        manager.add();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("input code to remove: ");
        String code = scanner.nextLine();
        manager.remove(code);
        
        System.out.println("Before sort");
        manager.display();
        
        System.out.println();
        
        System.out.println("After sort by salary");
        manager.displayBySalary();
        
        
    }
    
}
