/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.PharmacyStore;

import Business.Person.Address;

/**
 *
 * @author Saurabh Goyal
 */
public class PharmacyStore {
    
    private int pharmacyID;
    private static int count = 1000;
    private String name;
    private Address address;

    public PharmacyStore() {
        pharmacyID = count;
        count++;
    }

    public int getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    @Override
    public String toString() {
        return String.valueOf(pharmacyID);
    }
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
