/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author devshahofficial
 */
public class Doctor extends Person {
    public String availablity; 
    
    public Doctor(String name, Integer patientID, Integer age, String email, City city, House house, Community community) {
        super(name, patientID, age, email, city, house, community);
        
    }

    public String getAvailablity() {
        return availablity;
    }

    public void setAvailablity(String availablity) {
        this.availablity = availablity;
    }
    
    
    
}
