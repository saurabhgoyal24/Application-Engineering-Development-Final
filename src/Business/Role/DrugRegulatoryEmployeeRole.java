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
import UserInterface.DrugRegulatoryEmployeeRole.DrugRegulatoryEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class DrugRegulatoryEmployeeRole extends Role {

    public DrugRegulatoryEmployeeRole() {
        super(RoleType.DRUGEREGULATORYEMPLOYEE.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CountryNetwork inCountry, StateNetwork inState, CityNetwork inCity) {
        return new DrugRegulatoryEmployeeWorkAreaJPanel(userProcessContainer,inEnterprise);
    }

}
