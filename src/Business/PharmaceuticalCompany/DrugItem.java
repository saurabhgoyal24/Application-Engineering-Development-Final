/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.PharmaceuticalCompany;

/**
 *
 * @author Saurabh Goyal
 */
public class DrugItem {
    
    private Drug drug;
    
    private String dateOfManufacturing;
    private String dateOfExpiry;
    private int quantity;

    
    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(String dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.valueOf(drug.getDrugId());
    }
    
    
    
   
}
