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
public abstract class Organization {
    int size; 

    public Organization(){
    }
    public Organization(int size) {
        this.size = size; 
    }
    //Set-get method
    public void setSize(int size){
        this.size = size;
    } 
    public int getSize(){
        return size;
    } 
    
    abstract void communicateByTool();
    
    @Override
    public String toString() {
        return String.format("\nthe organization’s size is", +size);
    }
}
