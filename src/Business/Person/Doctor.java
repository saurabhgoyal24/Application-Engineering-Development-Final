/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class Doctor extends Person {
    private int lisenceNumber;
    private String specialization;
    private ArrayList<Enterprise> enterpriseList; 

    private ArrayList<Patient> patientList;

    public Doctor() {
        patientList = new ArrayList<>();
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    
    
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    

    public int getLisenceNumber() {
        return lisenceNumber;
    }

    public void setLisenceNumber(int lisenceNumber) {
        this.lisenceNumber = lisenceNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(super.getSsn());
    }
    
    
    
}
