/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public void createOrganization(OrganizationType type) {
        Organization organization = null;
        if (type.equals(OrganizationType.DOCTOR)) {
            organization = new DoctorOrganization();
        }
        if (type.equals(OrganizationType.LAB)) {
            organization = new LabOrganization();
        }
        if (type.equals(OrganizationType.NURSE)) {
            organization = new NurseOrganization();
        }
        if (type.equals(OrganizationType.PATIENT)) {
            organization = new PatientOrganization();
        }
//        if (type.equals(OrganizationType.PHARMACEUTICALCOMPANY)) {
//            organization = new PharmaceuticalCompanyOrganization();
//        }
//        if (type.equals(OrganizationType.PHARMACY)) {
//            organization = new PharmacyOrganization();
//        }
        if (type.equals(OrganizationType.PHARMACYSTORE)) {
            organization = new PharmacyStoreOrganization();
        }
        if (type.equals(OrganizationType.RESEARCH)) {
            organization = new ResearchOrganization();
        }
        if(type.equals(OrganizationType.DRUGMANAGEMENT)){
            organization = new DrugManagementOrganization();
        }
        if(type.equals(OrganizationType.DRUGREGULATORY)){
            organization = new DrugRegulatoryOrganization();
        }
        if(type.equals(OrganizationType.DISEASEMANAGEMENTORGANIZATION)){
            organization = new DiseaseManagementOrganization();
        }
        organizationList.add(organization);
    }

}
