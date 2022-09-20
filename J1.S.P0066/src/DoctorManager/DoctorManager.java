/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorManager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DoctorManager {
    private List<Doctor> listDoctor = new ArrayList();
    
    public DoctorManager() {
        listDoctor.add(new Doctor("DOC 1", "Nguyen Van A", "abc", 25));
        listDoctor.add(new Doctor("DOC 2", "Nguyen Van G", "abc", 51));
        listDoctor.add(new Doctor("DOC 3", "Nguyen Van H", "abc", 68));
        listDoctor.add(new Doctor("DOC 4", "Nguyen Van V", "abc", 47)); 
    } 
    
    public void addDoctor() {
        String code = "";
        while (true) {
            code = ValidateInput.inputString("Enter Doc Code: ", "Code invalid!", "^DOC\\s\\d+$");
            if (checkID(code) != null) {
                System.out.println("Doctor's code is duplicated!");
            } else {
                break;
            }
        }
        String name = ValidateInput.inputString("Enter Name: ", "Name invalid", "^[a-zA-Z ]+$");
        String specialization = ValidateInput.inputString("Enter Specialization: ", "Specialization invalid", "^[a-zA-Z ]+$");
        int availability = ValidateInput.inputInt("Enter Availability: ", "Availability invalid", 1, Integer.MAX_VALUE);
        listDoctor.add(new Doctor(code, name, specialization, availability));
        System.out.println("Doctor is added successfully!");
    }

    public void updateDoctor() {
        //Enter Code
        String id = ValidateInput.inputString("Enter Doctor Code to Update: ", "Doctor code invalid!", "^[a-zA-Z0-9 ]+$");
        Doctor doc = checkID(id);
        if(doc == null){//Code not found
            System.out.println("Code is not in the list!"); 
        }else{ 
            //Update attribute
            String name = ValidateInput.inputStringBlank("Enter Doctor name: ", "Doctor name invalid!", "^[a-zA-Z ]+$"); 
            if (name != null) {
                doc.setName(name);
            } 
            String spec = ValidateInput.inputStringBlank("Enter Specialization: ", "Specialization invalid!", "^[a-zA-Z ]+$");
            if (spec != null) {
                doc.setSpecialization(spec);
            } 
            String avai = ValidateInput.inputStringBlank("Enter Availability: ", "Availability invalid", "^[0-9]+$");
            if (avai != null) {
                int Availability;
                Availability = Integer.parseInt(avai);
                doc.setAvailability(Availability);
            }
            System.out.println("Update doctor successfully!");
        }
    }

    public void deleteDoctor() {
        //Enter Code
        String id = ValidateInput.inputString("Enter Doctor Code to Delete: ", "Doctor Code invalid!", "^[a-zA-Z0-9 ]+$");
        Doctor doc = checkID(id);
        if(doc == null){ //ID not found
            System.out.println("This Code is not exist!"); 
        }else{
            //remove
            listDoctor.remove(doc);
            System.out.println("Delete Doctor successfully!");
        }        
    }

    public void searchDoctor() {
        //Enter Doctor code to search
        String searchCode = ValidateInput.inputString("Enter name to search: ", "Name invalid!", "^[a-zA-Z ]+$"); 
        System.out.printf("%-10s | %-15s | %-20s | %-10s\n", "Code", "Doctor Name", "Specialization", "Availability");
        boolean checkID = false;
        //searching
        for(Doctor doc : listDoctor){ 
            if(doc.getCode().toUpperCase().contains(searchCode.toUpperCase())) {  
                System.out.println(doc);
                checkID = true;
            }
        }
        if(checkID == false){
            System.out.println("\nStudent not found!");
        }        
    }

    //check ID
    private Doctor checkID(String ID) {
        for (Doctor doc : listDoctor) {
            if (doc.getCode().equals(ID)) {
                return doc; //return student
            }
        }
        return null; //no student in list
    }     
}
