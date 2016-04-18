/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.PharmacyStore.PharmacyStore;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class PharmacyStoreOrganization extends Organization {

    private ArrayList<PharmacyStore> pharmacyStoreList;
    
    public PharmacyStoreOrganization() {
        super(OrganizationType.PHARMACYSTORE, null);
        pharmacyStoreList = new ArrayList<>();
    }

    public ArrayList<PharmacyStore> getPharmacyStoreList() {
        return pharmacyStoreList;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
