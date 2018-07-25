/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;
import com.mycompany.classmodeling.Car;
/**
 *
 * @author dannylantigua
 */
public class CarDealershipInventory {
    private Car _car;
    private double _price;
    private String _condition, _location;
    
    public CarDealershipInventory(){}

    public CarDealershipInventory(Car _car, double _price, String _condition, String _location) {
        this._car = _car;
        this._price = _price;
        this._condition = _condition;
        this._location = _location;
    }

    public Car getCar() {
        return _car;
    }

    public void setCar(Car _car) {
        this._car = _car;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public String getCondition() {
        return _condition;
    }

    public void setCondition(String _condition) {
        this._condition = _condition;
    }

    public String getLocation() {
        return _location;
    }

    public void setLocation(String _location) {
        this._location = _location;
    }
}
