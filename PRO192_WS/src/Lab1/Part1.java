/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Part1 {
    public static void main(String[] args) { 

    int matrix[][];
    int rows;
    int cols;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter rows:");
    rows = sc.nextInt();
    System.out.print("Enter cols:");
    cols = sc.nextInt();
//input
    matrix = new int[rows][cols];
    System.out.println("Enter matrix :");
    for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    System.out.printf("matrix[%d,%d]= ",i+1,j+1);	
                    matrix[i][j] = sc.nextInt();
            }		
    }
//output
    System.out.println("\nMang vua nhap:\n");
    for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    System.out.format("%3d \t",matrix[i][j]); 	
            }		
                    System.out.println("\n");
    }
//Sum
    int sum = 0;
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            sum = sum += matrix[i][j];	
        }		
    }
    System.out.println("Sum: "+sum);
//Average 
    System.out.println("Average:" +(float)sum/(rows*cols));

 
}
}
