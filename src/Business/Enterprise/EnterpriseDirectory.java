/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise>enterpriseList;
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    public Enterprise createAndAddEnterprise(String name, EnterpriseType type){
        
        Enterprise enterprise = null;
        
        if (type == EnterpriseType.HOSPITAL){
            enterprise = new HospitalEnterprise(name);
        }
        
        if (type == EnterpriseType.CLINIC){
            enterprise = new ClinicEnterprise(name);
        }
        
        if (type == EnterpriseType.PHARMACY){
            enterprise = new PharmacyEnterprise(name);
        }
        
        if (type == EnterpriseType.PHARMACEUTICALCOMPANY){
            enterprise = new PharmaceuticalCompanyEnterprise(name);
        }
                       
        enterpriseList.add(enterprise);
        return enterprise;
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
}
