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

public class Molecules { 
    
    private String structure; 
    private String name;
    private float weight;
   
    //default constructor
    public Molecules (){
    }
    //constructor with para
    public Molecules (String structure, String name, Float weight){
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }
   
    public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Structure :");
       structure = scanner.nextLine();
       System.out.print("Name :");
       name = scanner.nextLine();
       System.out.print("Weight :");
       weight = scanner.nextFloat(); 
    }
    
    public void display(){
       System.out.println(structure + "\t" + name + "\t" + weight); 
    }
   
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);         
        System.out.print("Number of molecules: ");
        int n = scanner.nextInt(); 
//        scanner.nextLine();

//class obj
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
      
//        do{
//             Scanner scanner = new Scanner(System.in);         
//             System.out.print("Number of molecules: ");
//             int n = scanner.nextInt(); 
//           Molecules mo = new Molecules();
//           int i=1;
//           System.out.printf("Molecule no.%d: \n",i);
//           mo.input();
//           mo.display();   
//           i++;
//           n--;
//       }while(n>0);
}        
      
}
