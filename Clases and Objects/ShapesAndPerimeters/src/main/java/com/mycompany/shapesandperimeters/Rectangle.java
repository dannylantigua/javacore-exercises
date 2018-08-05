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
public class Rectangle extends Shape {
    
    private double _lenght;
    private double _width;
    
    @Override
    public double getArea() {
        return _lenght * _width;
    }
    
    @Override
    public double getPerimeter() {
        return (2 * _lenght) + (2 * _width);
    }
}
