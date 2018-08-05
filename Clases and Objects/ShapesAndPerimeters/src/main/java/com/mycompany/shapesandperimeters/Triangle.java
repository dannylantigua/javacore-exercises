/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shapesandperimeters;

/**
 *
 * @author dannylantigua
 */
public class Triangle extends Shape {
    
    private double _sideA;
    private double _sideB;
    private double _sideC;
    private double _base;
    private double _height;
    
    @Override
    public double getArea() {
        return 0.5 * (_base * _height);
    }
    
    @Override
    public double getPerimeter() {
        return _sideA + _sideB + _sideC;
    }
}
