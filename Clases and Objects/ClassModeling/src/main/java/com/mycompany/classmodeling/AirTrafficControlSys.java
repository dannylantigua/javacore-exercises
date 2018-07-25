/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;
/**
 *
 * @author dannylantigua
 */
public class AirTrafficControlSys {
    private String _weatherConditions, _highwayCondition;
    private String[] _planesInQueuedForTakeOff;
    private String[] _planesInQueuedForLanding;
    
    public AirTrafficControlSys(){}
    
    public AirTrafficControlSys(String weatherConditions, String highwayCondition, String[] planesInQueuedForTakeOff,
            String[] planesInQueuedForLanding){
        this._weatherConditions = weatherConditions;
        this._highwayCondition = highwayCondition;
        this._planesInQueuedForTakeOff = planesInQueuedForTakeOff;
        this._planesInQueuedForLanding = planesInQueuedForLanding;
    }

    public String getWeatherConditions() {
        return _weatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        this._weatherConditions = weatherConditions;
    }

    public String getHighwayCondition() {
        return _highwayCondition;
    }

    public void setHighwayCondition(String highwayCondition) {
        this._highwayCondition = highwayCondition;
    }

    public String[] getPlanesInQueuedForTakeOff() {
        return _planesInQueuedForTakeOff;
    }

    public void setPlanesInQueuedForTakeOff(String[] planesInQueuedForTakeOff) {
        this._planesInQueuedForTakeOff = planesInQueuedForTakeOff;
    }

    public String[] getPlanesInQueuedForLanding() {
        return _planesInQueuedForLanding;
    }

    public void setPlanesInQueuedForLanding(String[] planesInQueuedForLanding) {
        this._planesInQueuedForLanding = planesInQueuedForLanding;
    }
    
    // Behaviors
    public void checkHighway(String _highwayCondition){}
    
    public void checkWeatherConditions(String _weatherConditions){}
    
    public void takeOff(String[] _planesQueuedForTakeOff){}
    
    public void landing(String[] _planesInQueuedForLanding){}
}
