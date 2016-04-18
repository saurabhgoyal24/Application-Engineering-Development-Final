/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import Business.Person.Doctor;
import Business.Person.Patient;
import Business.PharmaceuticalCompany.Drug;
import Business.WorkQueue.LabTestWorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Saurabh Goyal
 */
public class Encounter {
    
    private Date dateOfEncounter;
    private int encounterId;
    private static int count=2000;
    private Doctor doctor;
    private Patient patient;
    private VitalSign vitalSign;
    private LabTestWorkRequest labTestWorkRequest;
    private ArrayList<Drug>drugList;
    

    public Encounter() {
        encounterId = count;
        count++;
        vitalSign = new VitalSign();
        drugList = new ArrayList<>();
    }

    public Date getDateOfEncounter() {
        return dateOfEncounter;
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    
    public void setDateOfEncounter(Date dateOfEncounter) {
        this.dateOfEncounter = dateOfEncounter;
    }

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    

    

    public LabTestWorkRequest getLabTestWorkRequest() {
        return labTestWorkRequest;
    }

    public void setLabTestWorkRequest(LabTestWorkRequest labTestWorkRequest) {
        this.labTestWorkRequest = labTestWorkRequest;
    }

    @Override
    public String toString() {
        return String.valueOf(encounterId);
    }
    
    
    
    
}
