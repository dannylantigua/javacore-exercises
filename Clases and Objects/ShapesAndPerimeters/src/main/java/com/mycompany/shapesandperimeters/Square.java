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
public class Square extends Shape {
    
    private double _size;
    
    @Override
    public double getArea() {
        return Math.pow(_size, 2);
    }
    
    @Override
    public double getPerimeter() {
        return 4 * _size;
    }
}
