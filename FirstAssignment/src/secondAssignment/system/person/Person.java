/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

/**
 *
 * @author devshahofficial
 */
public class Person {
         private String name;
    private Integer patientID;

    private String address;
    private City city;
    private Community community;
    private House house;
    private Integer age;
    private String email;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }



    public String getAddress() {
        return address;
    }

    public void setStreetName(String streetName) {
        this.address = streetName;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
 
    
    
    
     public Person(String name, Integer patientID, Integer age, String email,City city, House house,Community community) {
        this.name = name;
        this.patientID = patientID;
        this.house = house;
        this.community = community;
        this.address = address;
        this.city = city;
        this.age = age;
        this.email = email;
    }
    
//    String name;
//    String age;
//    String contact;
//    
//    public Person(String name, String age, String contact){
//        this.name = name;
//        this.age = age;
//        this.contact = contact;
//        
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" + "name=" + name + ", age=" + age + ", contact=" + contact + '}';
//    }

    
   
    
    
}
