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
 
public class Atoms { 
    
    private float number; 
    private String symbol;
    private String fullname;
    private float weight;
    
    public Atoms (){
    }
   
    public Atoms (Float number, String symbol, String fullname, Float weight){
        this.number = number;
        this.symbol = symbol;
        this.symbol = fullname;
        this.weight = weight;
    }
   
    public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter atomic number :");
       number = scanner.nextFloat();
       System.out.print("Enter symbol :");
       symbol = scanner.nextLine();
       System.out.print("Enter full name :");
       fullname = scanner.nextLine();
       System.out.print("Enter atomic weight :");
       weight = scanner.nextFloat(); 
   }
    
    public void display(){
       System.out.println("Atomic Information");
       System.out.println("==================");
       System.out.println(number + "\t" + symbol + "\t" + fullname + "\t" + weight); 
    }
   
    public static void main(String[] args) { 
         
        System.out.print("Number of Atoms: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        Atoms[] atom = new Atoms[100];
        for(int i=0; i<=n; i++) {
            atom[i] = new Atoms();
            atom[i].input();
        }
        System.out.println("Molecules info: ");
        for(int i=0; i<=n; i++) {
            atom[i].display();
        }        
        
        
//       do{
//           Atoms atom = new Atoms();
//           int i=1;
//           System.out.printf("Atoms no.%d: \n",i);
//           atom.input();
//           atom.display();   
//           i++;
//           n--;
//       }while(n>0);
    }
}
