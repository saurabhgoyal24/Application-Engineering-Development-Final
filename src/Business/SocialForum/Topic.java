/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.SocialForum;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Saurabh Goyal
 */
public class Topic {
    private String topicName;
    private Disease disease;
    private WorkQueue workQueue;

    public Topic() {
        workQueue = new WorkQueue();
    }
    
    

    public String getTopicName() {
        return topicName;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    
    public void setThreadName(String topicName) {
        this.topicName = topicName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return  topicName ;
    }
    
    
}
