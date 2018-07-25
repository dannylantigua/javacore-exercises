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
public class Airplane {
    private String _airline, _airCraft, _size;
    private int _numberPassangers;
    
    public Airplane(){}

    public Airplane(String airline, String airCraft, String size, int numberPassangers) {
        this._airline = airline;
        this._airCraft = airCraft;
        this._size = size;
        this._numberPassangers = numberPassangers;
    }

    public String getAirline() {
        return _airline;
    }

    public void setAirline(String airline) {
        this._airline = airline;
    }

    public String getAirCraft() {
        return _airCraft;
    }

    public void setAirCraft(String airCraft) {
        this._airCraft = airCraft;
    }

    public String getSize() {
        return _size;
    }

    public void setSize(String size) {
        this._size = size;
    }

    public int getNumberPassangers() {
        return _numberPassangers;
    }

    public void setNumberPassangers(int numberPassangers) {
        this._numberPassangers = numberPassangers;
    }
    
}
