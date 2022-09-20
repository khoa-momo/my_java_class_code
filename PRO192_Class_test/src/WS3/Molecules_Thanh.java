
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Le Ha Nam
 */
class Molecules {
    private String structure;
    private String name;
    private double weight;

    public Molecules() {
    }


    public Molecules(String structure, String name, double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void display(){
        System.out.println(new String().format("%-12s %-12s %-12s", structure, name,weight));
    }

    @Override
    public String toString() {
        return "Molecules{" + "structure=" + structure + ", name=" + name + ", weight=" + weight + '}';
    }
    
}

class TestMolecules{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Molocules: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        Molecules molecules[]  = new Molecules[10];
        for(int i=0; i<n; i++){
            System.out.print("Enter string structure: ");
            String structure =  scanner.nextLine();
            System.out.print("Enter string name: ");
            String name = scanner.nextLine();
            System.out.print("Enter float weight: ");
            double weight = scanner.nextDouble();
            //
            molecules[i] = new Molecules(structure,name,weight);
            scanner.nextLine();
        }
        for(int i=0; i<n; i++){
            molecules[i].display();
        }
    }
}
    

