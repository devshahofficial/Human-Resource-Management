/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

/**
 *
 * @author devshahofficial
 */
public class HospitalEmployee extends Person{
    
    private String employeeID;

    public HospitalEmployee(String name, Integer patientID, Integer age, String email, City city, House house, Community community) {
        super(name, patientID, age, email, city, house, community);
        setEmployeeID(employeeID);
    }
    
//    public HospitalEmployee(String name, String age, String contact,String employeeID) {
//        super(name, age, contact);
//        setEmployeeID(employeeID);
//        
//    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if(employeeID.startsWith("EM")&& employeeID.length() == 10){
        this.employeeID = employeeID;
        }
        else{
            throw new IllegalArgumentException("worng employee id");
        }
    }
     @Override
    public String toString() {
        return String.format("[%s] %s",employeeID, super.toString() );
    }
    
    
}
