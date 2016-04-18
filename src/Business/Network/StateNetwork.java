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
public class StateNetwork {
    private String stateName;
    private ArrayList<CityNetwork> cityNetwork;

    public StateNetwork() {
        cityNetwork = new ArrayList<>();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<CityNetwork> getCityNetwork() {
        return cityNetwork;
    }
    
    public void addCity(CityNetwork city){
        cityNetwork.add(city);
        
    }

    @Override
    public String toString() {
        return stateName;
    }
    
    
    
}
