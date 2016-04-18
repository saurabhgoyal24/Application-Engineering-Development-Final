/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name, EnterpriseType enterpriseType) {
        super(null,name);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
    }

    
    
    
    public enum EnterpriseType{
        HOSPITAL("Hospital Enterprise"),
        CLINIC("Clinic Enterprise"),
        PHARMACY("Pharmacy Enterprise"),
        PHARMACEUTICALCOMPANY("Pharmaceutical Company Enterprise"),
        MAINAUTHORITY("Main Authority Enterprise");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    @Override
    public String toString() {
        return super.getOrgName();
    }
    
    
}
