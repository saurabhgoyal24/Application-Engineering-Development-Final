/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class IssueNetworkNotificationWorkRequest extends WorkRequest{
    private Enterprise enterprise;
    private ArrayList<String> sentTo;

    public IssueNetworkNotificationWorkRequest() {
        sentTo = new ArrayList<>();
    }

    public ArrayList<String> getSentTo() {
        return sentTo;
    }
    
    
    

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
}
