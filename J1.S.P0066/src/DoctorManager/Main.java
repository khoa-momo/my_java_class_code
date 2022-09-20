/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorManager;

/**
 *
 * @author DELL
 */
public class Main {
    private static void Menu() {
        //Print menu
        System.out.println("========= Doctor Management ==========\n" +
                                    "1.	Add Doctor\n" +
                                    "2.	Update Doctor\n" +
                                    "3.	Delete Doctor\n" +
                                    "4.	Search Doctor\n" +
                                    "5.	Exit");
    }     
    
    public static void main(String[] args) {
        //Declare object
        DoctorManager doc = new DoctorManager();
        do{            
            Menu();
            int choice = ValidateInput.inputInt("Enter choice from 1 to 5: ", "Choose from 1 to 5 only!", 1, 4);
            switch (choice) {
                case 1:
                    //Add new doctor
                    doc.addDoctor();
                    System.out.println("");   
                    break;
                case 2:
                    //Update doctor
                    doc.updateDoctor();
                    System.out.println("");   
                    break;
                case 3:
                    //Delete doctor
                    doc.deleteDoctor();
                    System.out.println("");   
                    break; 
                case 4:
                    //Search Doctor
                    doc.searchDoctor();
                    System.out.println("");   
                    break;
                case 5:
                    //exit
                    System.exit(0);
            }            
        }while(true);  
    }
}
