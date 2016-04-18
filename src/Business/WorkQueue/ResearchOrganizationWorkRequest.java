/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.PharmaceuticalCompany.Drug;

/**
 *
 * @author Saurabh Goyal
 */
public class ResearchOrganizationWorkRequest extends WorkRequest {
    
    private Drug drug;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
}
