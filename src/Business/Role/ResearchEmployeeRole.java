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
import UserInterface.ResearchEmployeeRole.ResearchEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class ResearchEmployeeRole extends Role {

    public ResearchEmployeeRole() {
        super(RoleType.RESEARCHEMPLOYEE.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CountryNetwork inCountry, StateNetwork inState, CityNetwork inCity) {
        return new ResearchEmployeeWorkAreaJPanel(inOrganization, userAccount.getPerson());
    }

}