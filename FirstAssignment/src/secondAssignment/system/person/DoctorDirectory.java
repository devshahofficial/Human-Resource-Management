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
public class DoctorDirectory {
       private ArrayList<Doctor> doctorList;
    public DoctorDirectory() {
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

   

   
 public void deleteDoctor(Doctor doctor) {
//        patientList.remove(patient);
        doctorList.removeIf(p -> p.getPatientID().equals(doctor.getPatientID()));
    }
   
    
    
    public Doctor addDoctor(Doctor doctor) {
        doctorList.add(doctor);
        return doctor;
    }
    
   
    
    public Doctor searchDoctor(String doctorName) {
        for(Doctor doctor : doctorList) {
            if(doctor.getName().equalsIgnoreCase(doctorName)) {
                return doctor;
            }
        }
        return null;
    }  
    
    
}
