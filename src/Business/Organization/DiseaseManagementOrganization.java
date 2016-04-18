/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.SocialForum.Disease;
import Business.SocialForum.Topic;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class DiseaseManagementOrganization extends Organization {

    private ArrayList<Disease> diseaseList;
    private ArrayList<Topic>topicList;

    public DiseaseManagementOrganization() {
        super(OrganizationType.DISEASEMANAGEMENTORGANIZATION, null);
        diseaseList = new ArrayList<>();
        topicList = new ArrayList<>();
    }
    
    public ArrayList<Topic> getTopicList() {
        return topicList;
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }
    


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
