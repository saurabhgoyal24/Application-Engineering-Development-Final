/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Enterprise.Enterprise;

/**
 *
 * @author Saurabh Goyal
 */
public class Patient extends Person {
    
    private String insuranceCompany;
    private String insuranceID;
    private String allergies;
    private Doctor preferredDoctor;
    private Doctor temproryDoctor;
    private Enterprise preferredDoctorEnterprise;
    private Enterprise temproryDoctorEnterprise;
    private String maritalStatus;
    private String dateOfEnrollment;
    private long medicalRecordNumber;
    private static long count = 100000000;
    private String isAssigned = "No";

    public Patient() {
        
        medicalRecordNumber = count;
        count++;
    }

    public String getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(String isAssigned) {
        this.isAssigned = isAssigned;
    }
    
    

    public Doctor getTemproryDoctor() {
        return temproryDoctor;
    }

    public void setTemproryDoctor(Doctor temproryDoctor) {
        this.temproryDoctor = temproryDoctor;
    }

    public Enterprise getPreferredDoctorEnterprise() {
        return preferredDoctorEnterprise;
    }

    public void setPreferredDoctorEnterprise(Enterprise preferredDoctorEnterprise) {
        this.preferredDoctorEnterprise = preferredDoctorEnterprise;
    }

    public Enterprise getTemproryDoctorEnterprise() {
        return temproryDoctorEnterprise;
    }

    public void setTemproryDoctorEnterprise(Enterprise temproryDoctorEnterprise) {
        this.temproryDoctorEnterprise = temproryDoctorEnterprise;
    }
    
    

    public long getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public Doctor getPreferredDoctor() {
        return preferredDoctor;
    }

    public void setPreferredDoctor(Doctor preferredDoctor) {
        this.preferredDoctor = preferredDoctor;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    public String toString() {
        return String.valueOf(super.getSsn());
    }
    
    
    
    
            
}
