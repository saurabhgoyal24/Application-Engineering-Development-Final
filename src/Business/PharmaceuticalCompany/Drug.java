/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.PharmaceuticalCompany;

import Business.Enterprise.PharmaceuticalCompanyEnterprise;

/**
 *
 * @author Saurabh Goyal
 */
public class Drug {
    
    private String drugName;
    private int drugId;
    private static int count =10000;
    private DrugGuideline drugGuideline;
    

    public Drug() {
        drugId = count;
        count++;
        drugGuideline = new DrugGuideline();
        
    }
    
    
    
    private PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise;
    
    private float price;
    private String isApproved;
    
    private float drugStrength;
    private  String dosageGuidlines;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(String isApproved) {
        this.isApproved = isApproved;
    }

    public DrugGuideline getDrugGuideline() {
        return drugGuideline;
    }

    public void setDrugGuideline(DrugGuideline drugGuideline) {
        this.drugGuideline = drugGuideline;
    }

    
    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDrugId() {
        return drugId;
    }

    public PharmaceuticalCompanyEnterprise getPharmaceuticalCompanyEnterprise() {
        return pharmaceuticalCompanyEnterprise;
    }

    public void setPharmaceuticalCompanyEnterprise(PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise) {
        this.pharmaceuticalCompanyEnterprise = pharmaceuticalCompanyEnterprise;
    }

    

    public float getDrugStrength() {
        return drugStrength;
    }

    public void setDrugStrength(float drugStrength) {
        this.drugStrength = drugStrength;
    }

    public String getDosageGuidlines() {
        return dosageGuidlines;
    }

    public void setDosageGuidlines(String dosageGuidlines) {
        this.dosageGuidlines = dosageGuidlines;
    }

    @Override
    public String toString() {
        return String.valueOf(drugId);
    }
    
    
}
