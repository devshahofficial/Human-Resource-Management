/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devshahofficial
 */
public class EncounterHistory {
     private List<Encounter> encounterHistory;
    
    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(List<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter(Encounter encounter) {
        encounterHistory.add(encounter);
        return encounter;
    }
    
}
