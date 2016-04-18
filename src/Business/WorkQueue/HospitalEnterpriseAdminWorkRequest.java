/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;

/**
 *
 * @author Saurabh Goyal
 */
public class HospitalEnterpriseAdminWorkRequest extends WorkRequest {

    private Enterprise senderEnterprise;

    private Doctor doctor;
    private Patient patient;

    public Person getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }

}
