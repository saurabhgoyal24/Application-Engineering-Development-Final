/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Goyal
 */
public class CountryNetwork {
    
    private String countryName;
    
    private ArrayList<StateNetwork> stateNetwork;

    public CountryNetwork() {
        stateNetwork = new ArrayList<>();
        
    }

    public ArrayList<StateNetwork> getStateNetwork() {
        return stateNetwork;
    }
    
    public void addState(StateNetwork state){
        stateNetwork.add(state);
        
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    

    @Override
    public String toString() {
        return countryName;
    }
    
    
    
    
}
