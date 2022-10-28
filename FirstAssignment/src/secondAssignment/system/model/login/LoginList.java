/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.model.login;

import java.util.ArrayList;

/**
 *
 * @author devshahofficial
 */
public class LoginList {
     private ArrayList<Credentials> loginList;
     public LoginList(){
        loginList = new ArrayList<>();
    }
    public ArrayList<Credentials> getLoginList() {
        return loginList;
    }

    public void setLoginList(ArrayList<Credentials> loginList) {
        this.loginList = loginList;
    }
    public Credentials addlogin(){
        Credentials login = new Credentials();
        loginList.add(login);
        return login;
    }
     
    
}
