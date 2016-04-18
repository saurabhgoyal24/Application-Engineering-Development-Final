/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class PersonDirectory {
 
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPerosonList() {
        return personList;
    }

    public void setPerosonList(ArrayList<Person> perosonList) {
        this.personList = perosonList;
    }
    
    
    public void createAndAddPerson(Person p){
        personList.add(p);
        
    }
    
}
