/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.PharmaceuticalCompany.DrugItem;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class PharmacyEnterprise extends Enterprise{

    private ArrayList<DrugItem> drugItemList;
    
    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.PHARMACY);
        drugItemList = new ArrayList<>();
    }

    public ArrayList<DrugItem> getDrugItemList() {
        return drugItemList;
    }

    public void setDrugItemList(ArrayList<DrugItem> drugItemList) {
        this.drugItemList = drugItemList;
    }

    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
