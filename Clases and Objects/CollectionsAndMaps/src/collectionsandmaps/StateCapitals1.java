/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author USGDAL
 */
public class StateCapitals1 {
    public static void main(String[] args) {
        // Creating Map
        HashMap<String, String> statesMap = new HashMap<>();
        // Instantiating object
        States mySt = new States();
        // Fill map
        statesMap = mySt.fillMap();
        // Print
        System.out.println("STATES AND CAPITALS \n \n");
        
        System.out.println("STATES:");
        System.out.println("=========");
        Set<String> keys = statesMap.keySet();
        for (String k : keys) System.out.println(k);
        
        System.out.println("\n \n");
        System.out.println("CAPITALS: ");
        System.out.println("===========");
        Collection<String> stateValues = statesMap.values();
        for (String v : stateValues) System.out.println(v);
        
        System.out.println("\n \n");
        System.out.println("STATES/CAPITALS PAIR: ");
        System.out.println("=========================");
        for(String k : keys){
            System.out.println(k + " - " + statesMap.get(k));
        }
    }
}
