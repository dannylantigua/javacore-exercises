/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandmaps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author USGDAL
 */
public class StateCapitals2 {

    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);
        // Creating Map
        HashMap<String, Capital> statesMap = new HashMap<>();
        // Instantiating object
        States mySt = new States();
        // Fill map
        statesMap = mySt.fillMapWithCapitalObj();
        // Print
        System.out.println("STATE/CAPITAL PAIRS: ");
        System.out.println("========================");
        printIt(statesMap, 0);

        Integer num = null;
        while (num == null) {
            System.out.println("Please enter the lower limit for capital city population:");
            num = mySc.nextInt();
        }

        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + num + "\n");
        printIt(statesMap, num);

    }

    public static void printIt(HashMap<String, Capital> myMap, Integer num) {
        Set<String> keys = myMap.keySet();
        for (String k : keys) {
            Capital cap = myMap.get(k);
            if (Integer.parseInt(cap.getPopulation()) >= num) {
                System.out.println(k + " - "
                        + cap.getName() + " | " + cap.getPopulation() + " | " + cap.getSquareMileage());
            }
        }
    }
}
