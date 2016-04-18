/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.PharmaceuticalCompany.Drug;

/**
 *
 * @author Saurabh Goyal
 */
public class CallBackWorkRequest extends WorkRequest {

    private Drug drug;
    private Enterprise senderEnterprise;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
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
