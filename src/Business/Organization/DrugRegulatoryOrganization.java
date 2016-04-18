/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class DrugRegulatoryOrganization extends Organization {

    public DrugRegulatoryOrganization() {
        super(OrganizationType.DRUGREGULATORY, null);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
