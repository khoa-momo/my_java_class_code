/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S.P55;

/**
 *
 * @author DELL
 */
public class Doctor_Attribute {
    private String Code;
    private String Name;
    private String Specialization;
    private int Availability;

    public Doctor_Attribute() {
    }

    public Doctor_Attribute(String Code, String Name, String Specialization, int Availability) {
        this.Code = Code;
        this.Name = Name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    @Override
    public String toString() {
        return "Doctor_Attribute{" + "Code=" + Code + ", Name=" + Name + ", Specialization=" + Specialization + ", Availability=" + Availability + '}';
    }
    
    
     
}
