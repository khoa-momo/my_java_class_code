/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS3;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Molecule2 {
    private String structure;
    private String name;
    private Float weight;
    
//    public Molecule(){
//        
//    }
//    public Molecule(String struc, String name, Float weight){
//        structure = struc;
//        this.name = name;
//        this.weight = weight;
//    }
    public void input(String struc, String namez, Float weightz){
        structure = struc;
        name = namez;
        weight = weightz;
    }
    
    public void display(){        
        System.out.println(structure + "\t" + name + "\t" + weight);   
    }   
    
    public static void main(String[] args) {
        // TODO code application logic here

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many are atomic you want to add :");
        n = scanner.nextInt();

        System.out.println("Atomic infomation");
        System.out.println("===============================================");
        }
}
