/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Saurabh Goyal
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;
    private static EcoSystem system1;
    private ArrayList<CountryNetwork> countryNetworkList;
    private Enterprise mainAuthorityEnterprise;

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    public static void setObjectOnce(EcoSystem system) {
        system1 = system;
    }

    private EcoSystem() {
        super(null, null);
        countryNetworkList = new ArrayList<>();
    }

    public Enterprise getMainAuthorityEnterprise() {
        return mainAuthorityEnterprise;
    }

    public void setMainAuthorityEnterprise(Enterprise mainAuthorityEnterprise) {
        this.mainAuthorityEnterprise = mainAuthorityEnterprise;
    }

    public ArrayList<CountryNetwork> getCountryNetworkList() {
        return countryNetworkList;
    }

    public CountryNetwork createCountryNetwork() {
        CountryNetwork countryNetwork = new CountryNetwork();
        countryNetworkList.add(countryNetwork);
        return countryNetwork;

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public static boolean cheackIfUsernameIsUnique(String username) {

        EcoSystem system = system1;

        System.out.println("1");

        if (system.getMainAuthorityEnterprise() != null) {
            System.out.println("2");
            for (UserAccount ua : system.getMainAuthorityEnterprise().getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(username)) {
                    JOptionPane.showMessageDialog(null, "Username already exists.");
                    return false;
                }
            }
            for (Organization o : system.getMainAuthorityEnterprise().getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        JOptionPane.showMessageDialog(null, "Username already exists.");
                        return false;
                    }
                }
            }
        }

        System.out.println("3");

        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getUsername().equals(username)) {
                JOptionPane.showMessageDialog(null, "Username already exists.");
                return false;
            }
        }
        System.out.println("4");
        for (CountryNetwork cn : system.getCountryNetworkList()) {
            for (StateNetwork sn : cn.getStateNetwork()) {
                for (CityNetwork cin : sn.getCityNetwork()) {
                    for (Enterprise e : cin.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getUsername().equals(username)) {
                                JOptionPane.showMessageDialog(null, "Username already exists.");
                                return false;
                            }
                        }
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                if (ua.getUsername().equals(username)) {
                                    JOptionPane.showMessageDialog(null, "Username already exists.");
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("5");
        return true;
    }

    public static boolean checkIfSsnIsUnique(int ssn, Organization or) {

        EcoSystem system = system1;
        System.out.println("1");

        if (system.getMainAuthorityEnterprise() != null) {
            System.out.println("2");
            for (Organization o : system.getMainAuthorityEnterprise().getOrganizationDirectory().getOrganizationList()) {
                if (o == or) {
                    for (Person p : o.getPersonDirectory().getPerosonList()) {
                        if (p.getSsn() == ssn) {
                            JOptionPane.showMessageDialog(null, "Person with this ssn already exists.");
                            return false;
                        }
                    }
                }
            }
        }

        System.out.println("3");

      System.out.println("4");
        for (CountryNetwork cn : system.getCountryNetworkList()) {
            for (StateNetwork sn : cn.getStateNetwork()) {
                for (CityNetwork cin : sn.getCityNetwork()) {
                    for (Enterprise e : cin.getEnterpriseDirectory().getEnterpriseList()) {
                      for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            if (o == or) {
                                for (Person p : o.getPersonDirectory().getPerosonList()) {
                                    if (p.getSsn() == ssn) {
                                        JOptionPane.showMessageDialog(null, "Person with this ssn already exists.");
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("5");
        return true;
    }

}
