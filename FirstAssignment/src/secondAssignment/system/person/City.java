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
public class City {
         String city;
       private ArrayList<Community> communityList = new ArrayList<>() ;
       
        public City(){
        communityList = new ArrayList<>();
    }
    public String getCityName() {
        return "Boston";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
   
    
    public Community addCommunity(Community community){
        communityList.add(community);
        return community;
    }
    
    
    
    public Community getCommunity(String community)
    {
        boolean flag =false;
    for(Community c: communityList)
    {
        
        if (c.getCommunityName().equalsIgnoreCase(community))
        {
            
        flag=true;
        return c;}
    }
    if(flag==false){
        Community c=new Community();
    return  c;}
    return null;
}
    
}
