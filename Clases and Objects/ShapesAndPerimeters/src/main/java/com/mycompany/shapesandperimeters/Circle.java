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
public class Circle extends Shape {
    
    private double _radius;
    private double _diameter;
    
    @Override
    public double getArea() {
        return 3.14 * Math.pow(_radius, 2);
    }
    
    @Override
    public double getPerimeter() {
        return _radius * _diameter;
    }
}
