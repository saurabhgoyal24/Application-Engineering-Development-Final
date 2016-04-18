/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

/**
 *
 * @author Saurabh Goyal
 */
public class Nurse extends Person {
 
    private String nurseType;
    private String trainingSchool;
    private String lisenceNumber;

    public String getNurseType() {
        return nurseType;
    }

    public void setNurseType(String nurseType) {
        this.nurseType = nurseType;
    }

    public String getTrainingSchool() {
        return trainingSchool;
    }

    public void setTrainingSchool(String trainingSchool) {
        this.trainingSchool = trainingSchool;
    }

    public String getLisenceNumber() {
        return lisenceNumber;
    }

    public void setLisenceNumber(String lisenceNumber) {
        this.lisenceNumber = lisenceNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(super.getSsn());
    }
    
    
    
}
