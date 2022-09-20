/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author DELL
 */
public class BeeColony extends Colony implements Role{ 
    String type;

    public BeeColony() {
    }
    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }
    
    //get-set method
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    //method
    @Override
    public String toString() {
        return String.format("The colony’s type is: " +this.type+ "\nsize is about: " +super.size+ "\nand the place is:" +super.place);
    }
    @Override
    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }

 


}
 
    
    
 
