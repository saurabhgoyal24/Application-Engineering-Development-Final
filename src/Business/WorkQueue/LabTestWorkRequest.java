/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Person.Patient;

/**
 *
 * @author Saurabh Goyal
 */
public class LabTestWorkRequest extends WorkRequest {
    
    private String LabTestResult;
    private Enterprise enterprise;
    private Patient patient;


    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    

    

    public String getLabTestResult() {
        return LabTestResult;
    }

    public void setLabTestResult(String LabTestResult) {
        this.LabTestResult = LabTestResult;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
}
