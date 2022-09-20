/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Molecule_hai {
   
   private String structure; 
   private String name;
   private float weight;
   
   public Molecule_hai (){
        
    }
    public Molecule_hai (String structure, String name, Float weight){
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
       System.out.println("Information of the Molecules:");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println(structure + "\t" + name + "\t" + weight); 
   }
   
    public static void main(String[] args) { 
         
        System.out.println("Number of molecules: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        
       
        Molecule_hai mo = new Molecule_hai ();
          
        mo.input();
        mo.display();            
 

        
        
       }
    
    
      
}
