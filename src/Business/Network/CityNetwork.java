/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Saurabh Goyal
 */
public class CityNetwork {
    private String cityName;
    private EnterpriseDirectory enterpriseDirectory;

    public CityNetwork() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

   

    @Override
    public String toString() {
        return cityName;
    }
}
