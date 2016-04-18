/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.SocialForum;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class Disease {
    private String diseaseName;
    private float icdCode;
    private String symptoms;
    private String description;
    

    public Disease() {
    }
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public float getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(float icdCode) {
        this.icdCode = icdCode;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return diseaseName;
    }
    
    
    
}
