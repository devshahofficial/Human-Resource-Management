/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

/**
 *
 * @author devshahofficial
 */
public class VitalSigns {
     private double HR;
    private double bloodPressure;
    private double weight;
    private double respiratoryRate;
    private double temperature;

    public VitalSigns(double HR, double bloodPressure, double weight, double respiratoryRate, double temperature) {
        this.HR = HR;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.respiratoryRate = respiratoryRate;
        this.temperature = temperature;
    }

 

    
    public double getHR() {
        return HR;
    }

    public void setHR(double HR) {
        this.HR = HR;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    
    @Override
    public String toString() {
        return "VitalSigns{" + "HR=" + HR + ", bloodPressure=" + bloodPressure + ", weight=" + weight + ", respiratoryRate=" + respiratoryRate + ", temperature=" + temperature + '}';
    }


    
    
}
