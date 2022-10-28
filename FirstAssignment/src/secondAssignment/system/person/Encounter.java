/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

/**
 *
 * @author devshahofficial
 */
public class Encounter {
    PatientDirectory patientList = new PatientDirectory();
        Encounter e;
    
    private VitalSigns signs;
    private String TimeStamp;

    public Encounter( VitalSigns signs, String TimeStamp) {
       
        this.signs = signs;
        this.TimeStamp = TimeStamp;
    }
    
    

   

//    public Encounter(String dateOfEncounter, VitalSigns vitalSigns) {
//        this.dateOfEncounter = dateOfEncounter;
//        this.vitalSigns = vitalSigns;
//    }

    public VitalSigns getVitalSigns() {
        return signs;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.signs = vitalSigns;
    }

    public String getDateOfEncounter() {
        return TimeStamp;
    }

    public void setDateOfEncounter(String dateOfEncounter) {
        this.TimeStamp = dateOfEncounter;
    }
   

    

    public Boolean isVitalSignAbNormalBP(Encounter r, int age) {
        if (age >= 1 && age <= 3) {
            if ((r.getVitalSigns().getBloodPressure() <= 80  || r.getVitalSigns().getBloodPressure() >= 110))
            {
                return true;
            }
        }
        /*Preschooler*/
        if (age >= 4 && age <= 5) {
            if ((r.getVitalSigns().getBloodPressure() <= 80  || r.getVitalSigns().getBloodPressure() >= 110))
            {
                return true;
            }
        }
        /*School Age*/
        if (age >= 6 && age <= 12) {
            if ((r.getVitalSigns().getBloodPressure() <= 80  || r.getVitalSigns().getBloodPressure() >= 120))
            {
                return true;
            }
        }
        /*Adolescent*/
        if (age >= 13) {
            if ((r.getVitalSigns().getBloodPressure() <= 110  || r.getVitalSigns().getBloodPressure() >= 120))
            {
                return true;
            }
        }
        return false;
   
    } 
    public Boolean isVitalSignAbNormalHR(Encounter r, int age) {
        if (age >= 1 && age <= 3) {
            if ((r.getVitalSigns().getHR() <= 80  || r.getVitalSigns().getHR() >= 130))
            {
                return true;
            }
        }
        /*Preschooler*/
        if (age >= 4 && age <= 5) {
            if ((r.getVitalSigns().getHR() <= 80  || r.getVitalSigns().getHR() >= 120))
            {
                return true;
            }
        }
        /*School Age*/
        if (age >= 6 && age <= 12) {
            if ((r.getVitalSigns().getHR() <= 70  || r.getVitalSigns().getHR() >= 110))
            {
                return true;
            }
        }
        /*Adolescent*/
        if (age >= 13) {
            if ((r.getVitalSigns().getHR() <= 55  || r.getVitalSigns().getHR() >= 105))
            {
                return true;
            }
        }
        return false;
    }
    public Boolean isVitalSignAbNormalRespiration(Encounter r, int age) {
        if (age >= 1 && age <= 3) {
            if ((r.getVitalSigns().getRespiratoryRate() <= 80  || r.getVitalSigns().getRespiratoryRate() >= 130))
            {
                return true;
            }
        }
        /*Preschooler*/
        if (age >= 4 && age <= 5) {
            if ((r.getVitalSigns().getRespiratoryRate() <= 80  || r.getVitalSigns().getRespiratoryRate() >= 120))
            {
                return true;
            }
        }
        /*School Age*/
        if (age >= 6 && age <= 12) {
            if ((r.getVitalSigns().getRespiratoryRate() <= 70  || r.getVitalSigns().getRespiratoryRate() >= 110))
            {
                return true;
            }
        }
        /*Adolescent*/
        if (age >= 13) {
            if ((r.getVitalSigns().getRespiratoryRate() <= 55  || r.getVitalSigns().getRespiratoryRate() >= 105))
            {
                return true;
            }
        }
        return false;
   
    } 
     public Boolean isVitalSignAbNormalBT(Encounter r, int age) {
        if (age >= 1 && age <= 3) {
            if ((r.getVitalSigns().getTemperature() <= 97  || r.getVitalSigns().getTemperature() >= 99))
            {
                return true;
            }
        }
        /*Preschooler*/
        if (age >= 4 && age <= 5) {
            if ((r.getVitalSigns().getTemperature() <= 97  || r.getVitalSigns().getTemperature() >= 99))
            {
                return true;
            }
        }
        /*School Age*/
        if (age >= 6 && age <= 12) {
            if ((r.getVitalSigns().getTemperature() <= 97  || r.getVitalSigns().getTemperature() >= 99))
            {
                return true;
            }
        }
        /*Adolescent*/
        if (age >= 13) {
            if ((r.getVitalSigns().getTemperature() <= 90  || r.getVitalSigns().getTemperature() >= 95))
            {
                return true;
            }
        }
        return false;
   
    }
     
     public boolean isPatientNormal() {

        return false;
    }
    
}
