/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class EmergencyEnquiryWorkRequest extends WorkRequest {
    
    private long medicalRecordNumber;
    private ArrayList<Encounter> encounterHistory;
    private Enterprise enterprise;
    private Doctor doctor;

    public EmergencyEnquiryWorkRequest() {
        encounterHistory = new ArrayList<>();
    }

    
    public long getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(long medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
}
