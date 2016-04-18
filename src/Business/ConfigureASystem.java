/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;

/**
 *
 * @author Saurabh Goyal
 */
public class ConfigureASystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();

        Person person = new Person();
        person.setFirstName("Saurabh");
        person.setLastName("Goyal");
//        person.setAge(22);
        person.setSsn(001773202);

        system.getPersonDirectory().createAndAddPerson(person);
        
        system.getUserAccountDirectory().createUserAccount("sa", "sa", person, new SystemAdminRole());
        
        return system;
    }
}
