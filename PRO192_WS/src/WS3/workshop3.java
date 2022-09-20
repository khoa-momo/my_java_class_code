/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class workshop3 {
    public void main(String []args) {
        Scanner scanner = new Scanner(System.in);         
        System.out.print("Number of molecules: ");
        int n = scanner.nextInt(); 
//      scanner.nextLine();
        Molecules[] mo = new Molecules[100];

        for(int i=1; i<=n; i++) {
            System.out.printf("Nhap vao phan tu thu %d:\n",i);
            mo[i] = new Molecules();
            mo[i].input();
        } 
        System.out.println("Information of the Molecules:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=1; i<=n; i++) {
            System.out.printf("Thong tin phan tu thu %d:\n",i);
            mo[i].display();
        }    

    }
}

 







 