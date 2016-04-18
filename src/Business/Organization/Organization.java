/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.OrganizationType;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public abstract class Organization {

    private String orgName;
    private int orgId;
    private static int count = 0;

    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private OrganizationType organizationType;

    public Organization(OrganizationType organizationType, String name) {
        if (organizationType == null&&name!=null) {
            this.orgName = name;
        }
        if (name == null&&organizationType!=null) {
            this.orgName = organizationType.getValue();
        }
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory();
        workQueue = new WorkQueue();
        this.organizationType = organizationType;
        orgId = count;
        count++;
    }

    public enum OrganizationType {

        DOCTOR("Doctor Organization"),
        NURSE("Nurse Organization"),
        PATIENT("Patient Organization"),
        LAB("Lab Organization"),
//        PHARMACY("Pharmacy Organization"),
        RESEARCH("Research Organization"),
//        PHARMACEUTICALCOMPANY("Pharmacy Company Organization"),
        PHARMACYSTORE("Pharmacy Store Organization"),
        DRUGMANAGEMENT("Drug Management Organization"),
        DRUGREGULATORY("Drug Regulatory Organization"),
        DISEASEMANAGEMENTORGANIZATION("Disease Management Organization");

        private String value;

        private OrganizationType(String name) {
            this.value = name;
        }

        public String getValue() {
            return value;
        }

    }

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return orgName;
    }

    public abstract ArrayList<Role> getSupportedRole();

}
