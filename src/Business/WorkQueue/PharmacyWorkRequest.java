/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Person.Patient;
import Business.PharmaceuticalCompany.Drug;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class PharmacyWorkRequest extends WorkRequest{
    
    private Patient patient;
    private Enterprise enterprise;
    private String pharmacyName;
    private Drug drug;

    public Drug getDrugList() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    
    

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    

    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    
}
