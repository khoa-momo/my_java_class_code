/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS3;

import java.util.Scanner;

/**
 *
 * @author letha
 */
public class Molecule_test {

    private String structure;
    private String name;
    private float weight;

    public Molecule_test() {
    }

    public Molecule_test(String structure, String name, float weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

//    public String getStructure() {
//        return structure;
//    }
//    public void setStructure(String structure) {
//        this.structure = structure;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public float getWeight() {
//        return weight;
//    }
//    public void setWeight(float weight) {
//        this.weight = weight;
//    }

    public void display() {
        System.out.println(String.format("%-10s", structure) + String.format("%-20s", name) + weight);
    }
    public static boolean checkWeight(String input) {
        float number;
        try {
            number = Float.parseFloat(input);
        } catch (Exception e) {
            return false;
        }
        if (number <= 0 || number >= 100) {
            return false;
        }
        return true;
    }
    public static boolean checkNumber(String input){
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (Exception e) {
            return false;
        }
        if (number <= 0) {
            return false;
        }
        return true;
    }
    

}
