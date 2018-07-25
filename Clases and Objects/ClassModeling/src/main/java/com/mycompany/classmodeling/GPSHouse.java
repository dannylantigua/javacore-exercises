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
public class GPSHouse {
    private String _address, _city, _state, _zipCode;
    private double _latitude;
    
    public GPSHouse(){}
    public GPSHouse(String address, String city, String state, String zipCode, double latitude){
        this._address = address;
        this._city = city;
        this._latitude = latitude;
        this._state = state;
        this._zipCode = zipCode;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        this._address = address;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        this._city = city;
    }

    public String getState() {
        return _state;
    }

    public void setState(String state) {
        this._state = state;
    }

    public String getZipCode() {
        return _zipCode;
    }

    public void setZipCode(String zipCode) {
        this._zipCode = zipCode;
    }

    public double getLatitude() {
        return _latitude;
    }

    public void setLatitude(double latitude) {
        this._latitude = latitude;
    }
    
    // Behaviors
    public void connectToGMaps(){}
    
    public void showMap(){}
}
