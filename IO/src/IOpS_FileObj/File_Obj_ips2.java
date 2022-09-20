/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOpS_FileObj;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/////////////////////////////////
import java.io.Serializable;

/**
 *
 * @author DELL
 */ 
class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

class File_Obj_ips2 {
    public static void main(String[] args) {
 
        Dog dog = new Dog("Tyson", "Labrador");

        try {
            FileOutputStream file = new FileOutputStream("file_Obj_Ips2.txt"); 
            ObjectOutputStream output = new ObjectOutputStream(file);   //close

            // Writes objects to the output stream
            output.writeObject(dog);

            FileInputStream fileStream = new FileInputStream("file_Obj_Ips2.txt"); 
            ObjectInputStream input = new ObjectInputStream(fileStream);    //close

            // Reads the objects
            Dog newDog = (Dog)input.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            output.close();
            input.close();
        } 
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}    