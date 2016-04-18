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
public class DrugManagementEmployeeWorkRequest extends WorkRequest{
    
    private Drug drug;
    
    private String senderEnterpriseName;
    private int senderEnterpriseID;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getSenderEnterpriseName() {
        return senderEnterpriseName;
    }

    public void setSenderEnterpriseName(String senderEnterpriseName) {
        this.senderEnterpriseName = senderEnterpriseName;
    }

    public int getSenderEnterpriseID() {
        return senderEnterpriseID;
    }

    public void setSenderEnterpriseID(int senderEnterpriseID) {
        this.senderEnterpriseID = senderEnterpriseID;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
    
    
}
