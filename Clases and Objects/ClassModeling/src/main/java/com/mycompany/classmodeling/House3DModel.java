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
public class House3DModel {
    private String[] _walls, _doors, _windows;
    private String _colorPaint, _levels, _material;
    private boolean _firePlace;
    private double _stockPrice;
    
    public House3DModel(){}

    public House3DModel(String[] walls, String[] doors, String[] windows, String colorPaint, 
            String levels, String material, boolean firePlace, double stockPrice) {
        this._walls = walls;
        this._doors = doors;
        this._windows = windows;
        this._colorPaint = colorPaint;
        this._levels = levels;
        this._material = material;
        this._firePlace = firePlace;
        this._stockPrice = stockPrice;
    }

    public String[] getWalls() {
        return _walls;
    }

    public void setWalls(String[] walls) {
        this._walls = walls;
    }

    public String[] getDoors() {
        return _doors;
    }

    public void setDoors(String[] doors) {
        this._doors = doors;
    }

    public String[] getWindows() {
        return _windows;
    }

    public void setWindows(String[] windows) {
        this._windows = windows;
    }

    public String getColorPaint() {
        return _colorPaint;
    }

    public void setColorPaint(String colorPaint) {
        this._colorPaint = colorPaint;
    }

    public String getLevels() {
        return _levels;
    }

    public void setLevels(String levels) {
        this._levels = levels;
    }

    public String getMaterial() {
        return _material;
    }

    public void setMaterial(String material) {
        this._material = material;
    }

    public boolean isFirePlace() {
        return _firePlace;
    }

    public void setFirePlace(boolean firePlace) {
        this._firePlace = firePlace;
    }

    public double getStockPrice() {
        return _stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this._stockPrice = stockPrice;
    }
    
    // Behaviors
    public void buildHouse(String[] _walls, String[] _doors, String[] _windows,
            String _material, String levels){
        
    }
   
    public void paintHouse(String _colorPaint){}
    
    public void setOnSale(String _stockPrice){}
}
