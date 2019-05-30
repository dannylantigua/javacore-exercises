/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandmaps;

import java.util.HashMap;

/**
 *
 * @author USGDAL
 */
public class States {

    public HashMap fillMapWithCapitalObj() {
        HashMap<String, Capital> statesMap = new HashMap<>();
        
        statesMap.put("Alabama", new Capital("Montgomery", "205000", "Area: 156 sq mi"));
        statesMap.put("Alaska", new Capital("Juneau", "305000", "Area: 191 sq mi"));
        statesMap.put("Arizona", new Capital("Phoenix", "122000", "Area: 153 sq mi"));
        statesMap.put("Arkansas", new Capital("Little Rock", "96000", "Area: 175 sq mi"));
        statesMap.put("California", new Capital("Sacramento", "108000", "Area: 210 sq mi"));
        statesMap.put("Colorado", new Capital("Denver", "210000", "Area: 213 sq mi"));
        statesMap.put("Connecticut", new Capital("Hartford", "146000", "Area: 120 sq mi"));
        statesMap.put("Delaware", new Capital("Dover", "111000", "Area: 154 sq mi"));
        statesMap.put("Florida", new Capital("Tallahassee", "84000", "Area: 205 sq mi"));
        statesMap.put("Georgia", new Capital("Atlanta", "963000", "Area: 183 sq mi"));
        
        return statesMap;
    }

    public HashMap fillMap() {
        HashMap<String, String> statesMap = new HashMap<>();
        statesMap.put("Alabama", "Montgomery");
        statesMap.put("Alaska", "Juneau");
        statesMap.put("Arizona", "Phoenix");
        statesMap.put("Arkansas", "Little Rock");
        statesMap.put("California", "Sacramento");
        statesMap.put("Colorado", "Denver");
        statesMap.put("Connecticut", "Hartford");
        statesMap.put("Delaware", "Dover");
        statesMap.put("Florida", "Tallahassee");
        statesMap.put("Georgia", "Atlanta");

        statesMap.put("Hawaii", "Honolulu");
        statesMap.put("Idaho", "Boise");
        statesMap.put("Illinois", "Springfield");
        statesMap.put("Indiana", "Indianapolis");
        statesMap.put("Iowa", "Des Moines");
        statesMap.put("Kansas", "Topeka");
        statesMap.put("Kentucky", "Frankfort");
        statesMap.put("Louisiana", "Baton Rouge");
        statesMap.put("Maine", "Augusta");
        statesMap.put("Maryland", "Annapolis");

        return statesMap;
    }
}
