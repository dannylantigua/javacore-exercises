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
public class Car {
    private String _make, _model, _transmission, _year, _color;
    
    public Car(){}

    public Car(String _make, String _model, String _transmission, String _year, String _color) {
        this._make = _make;
        this._model = _model;
        this._transmission = _transmission;
        this._year = _year;
        this._color = _color;
    }

    public String getMake() {
        return _make;
    }

    public void setMake(String _make) {
        this._make = _make;
    }

    public String getModel() {
        return _model;
    }

    public void setModel(String _model) {
        this._model = _model;
    }

    public String getTransmission() {
        return _transmission;
    }

    public void setTransmission(String _transmission) {
        this._transmission = _transmission;
    }

    public String getYear() {
        return _year;
    }

    public void setYear(String _year) {
        this._year = _year;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }
    
}
