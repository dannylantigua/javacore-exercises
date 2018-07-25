/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;
import com.mycompany.classmodeling.Airplane;

/**
 *
 * @author dannylantigua
 */
public class AirplaneFlightSimulator {
    private Airplane _plane;
    private String _userName;
    private double _hoursOfFlight, _score;
    
    public AirplaneFlightSimulator(){}

    public AirplaneFlightSimulator(Airplane plane, String userName, double hoursOfFlight, double score) {
        this._plane = plane;
        this._userName = userName;
        this._hoursOfFlight = hoursOfFlight;
        this._score = score;
    }

    public Airplane getPlane() {
        return _plane;
    }

    public void setPlane(Airplane plane) {
        this._plane = plane;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        this._userName = userName;
    }

    public double getHoursOfFlight() {
        return _hoursOfFlight;
    }

    public void setHoursOfFlight(double hoursOfFlight) {
        this._hoursOfFlight = hoursOfFlight;
    }

    public double getScore() {
        return _score;
    }

    public void setScore(double score) {
        this._score = score;
    }
    
    public void flightPlane(){}
}
