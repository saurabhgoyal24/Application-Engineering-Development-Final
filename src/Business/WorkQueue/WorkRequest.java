/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Saurabh Goyal
 */
public abstract class WorkRequest {
    
    private String message;
    private Person  sender;
    private Person receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int requestId;
    private static int count = 10;
    
    public WorkRequest(){
        requestDate = new Date();
        requestId = count;
        count++;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }
    
    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return message ;
    }
    
    
}
