/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Person.Patient;
import Business.PharmaceuticalCompany.Drug;

/**
 *
 * @author Saurabh Goyal
 */
public class PharmaceuticalCompanyFeedbackRequest extends WorkRequest {
    
    private Drug drug;
    

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    
    
    
}
