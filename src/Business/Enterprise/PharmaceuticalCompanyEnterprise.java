/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.PharmaceuticalCompany.Drug;
import Business.PharmaceuticalCompany.DrugItem;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class PharmaceuticalCompanyEnterprise extends Enterprise {

    private ArrayList<Drug> drugList;
    private ArrayList<DrugItem> drugItemList;
    private ArrayList<PharmacyEnterprise> pharmacyEnterpriseList;

    public PharmaceuticalCompanyEnterprise(String name) {
        
        super(name, EnterpriseType.PHARMACEUTICALCOMPANY);
        drugItemList = new ArrayList<>();
        drugList = new ArrayList<>();
        pharmacyEnterpriseList = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public ArrayList<DrugItem> getDrugItemList() {
        return drugItemList;
    }

    public ArrayList<PharmacyEnterprise> getPharmacyEnterpriseList() {
        return pharmacyEnterpriseList;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public String toString() {
        return super.getOrgName();
    }
    

}
