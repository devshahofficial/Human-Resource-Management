/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

import java.util.ArrayList;

/**
 *
 * @author devshahofficial
 */
public class PatientDirectory {
     private ArrayList<Patient> patientList;
    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

   
 public void deletePatient(Patient patient) {
//        patientList.remove(patient);
        patientList.removeIf(p -> p.getPatientID().equals(patient.getPatientID()));
    }
   
    
    
    public Patient addPatient(Patient patient) {
        patientList.add(patient);
        return patient;
    }
    
   
    
    public Patient searchPatient(String patientName) {
        for(Patient patient : patientList) {
            if(patient.getName().equalsIgnoreCase(patientName)) {
                return patient;
            }
        }
        return null;
    }  
    
    
}
