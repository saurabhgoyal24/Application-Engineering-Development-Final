/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public abstract class Role {
    private String roleName;

    public Role(String name) {
        this.roleName = name;
    }
    
    public enum RoleType {

        ADMIN("Admin Role"),
        DOCTOR("Doctor Role"),
        NURSE("Nurse Role"),
        LABASSISTANT("Lab Assistant Role"),
        PATIENT("Patient Role"),
        PHARMACYPERSON("Pharmacy Person Role"),
        DRUGMANAGEMENTEMPLOYEE("Drug Management Employee Role"),
        RESEARCHEMPLOYEE("Research Employee Role"),
        DRUGEREGULATORYEMPLOYEE("Drug Regulatory Employee Role"),
        DISEASEMANAGEMENTEMPLOYEE("Disease Management Employee Role");

        private String value;

        private RoleType(String name) {
            this.value = name;
        }

        public String getValue() {
            return value;

        }

        @Override
        public String toString() {
            return value;
        }

    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount,Organization inOrganization,Enterprise inEnterprise,CountryNetwork inCountry, StateNetwork inState, CityNetwork inCity);

    @Override
    public String toString() {
        return roleName;
    }
}
