/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author letha
 */
public class Workshop_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Molecule Information");
        ArrayList<Molecule_test> moleculeslist = inputMolecules();
        displayAllMolecules(moleculeslist);
        
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();
        
//        System.out.println("Atom Information");
//        ArrayList<Atom> atomsList = inputAtoms();
//        displayAllAtoms(atomsList);
    }
    
    public static ArrayList<Molecule_test> inputMolecules() {
        Scanner sc = new Scanner(System.in);
        String inputNumber;
        do {
            System.out.print("Enter number of molecules: ");
            inputNumber = sc.nextLine();
//            if (!Molecule_test.checkNumber(inputNumber)) {
//                System.out.println("Please enter positive number");
//            }
        } while (!Molecule_test.checkNumber(inputNumber));
        
        int size = Integer.parseInt(inputNumber);
        ArrayList<Molecule_test> list = new ArrayList();
        
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println("Molecule " + (i + 1));
            System.out.print("Enter structure: ");
            String structure = sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            String input;
            do {
                System.out.print("Enter weight: ");
                input = sc.nextLine();
                if (!Molecule_test.checkWeight(input)) {
                    System.out.println("Please enter positive number and less than 100");
                }
            } while (!Molecule_test.checkWeight(input));
            float weight = Float.parseFloat(input);
            Molecule_test molecule = new Molecule_test(structure, name, weight);
            list.add(molecule);
            System.out.println();
        }
        return list;
    }
    
    public static void displayAllMolecules(ArrayList<Molecule_test> list) {
        System.out.println("Display all molecules");
        for (int i = 0; i < list.size(); i++) {
            Molecule_test molecule = list.get(i);
            molecule.display();
        }
    }
    
//    public static ArrayList<Atom> inputAtoms() {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Atom> list = new ArrayList<>();
//        int count = 0;
//        while (count < 10) {
//            String input;
//            do {                
//                System.out.print("Enter atomic number: ");
//                input = sc.nextLine();
//                if(!Atom.checkNumber(input)){
//                    System.out.println("Please enter positive number");
//                }
//            } while (!Atom.checkNumber(input));
//            int number = Integer.parseInt(input);
//            if(number == 0){
//                break;
//            }
//            System.out.print("Enter symbol: ");
//            String symbol = sc.nextLine();
//            System.out.print("Enter full name: ");
//            String fullname = sc.nextLine();
//            String inputWeight;
//            do {                
//                System.out.print("Enter atomic weight: ");
//                inputWeight = sc.nextLine();
//                if(!Atom.checkWeight(inputWeight)){
//                    System.out.println("Please enter positive number");
//                }
//            } while (!Atom.checkWeight(inputWeight));
//            float weight = Float.parseFloat(inputWeight);
//            Atom atom = new Atom(number, symbol, fullname, weight);
//            list.add(atom);
//            System.out.println();
//        }
//        return list;
//    }
//    
//    public static void displayAllAtoms(ArrayList<Atom> list) {
//        System.out.println("Display all atoms");
//        for (int i = 0; i < list.size(); i++) {
//            Atom atom = list.get(i);
//            atom.display();
//        }
//    }
    
}
