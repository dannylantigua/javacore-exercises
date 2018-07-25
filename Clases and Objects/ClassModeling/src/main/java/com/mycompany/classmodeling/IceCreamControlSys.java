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
public class IceCreamControlSys {
    private String[] _ingredients, _flavors, _colors, _addOns;
    
    public IceCreamControlSys(){}
    
    public IceCreamControlSys(String[] ingredients, String[] flavors, String[] colors, String[] addOns){
        this._ingredients = ingredients;
        this._flavors = flavors;
        this._colors = colors;
        this._addOns = addOns;
    }

    public String[] getIngredients() {
        return _ingredients;
    }

    public void setIngredients(String[] _ingredients) {
        this._ingredients = _ingredients;
    }

    public String[] getFlavors() {
        return _flavors;
    }

    public void setFlavors(String[] _flavors) {
        this._flavors = _flavors;
    }

    public String[] getColors() {
        return _colors;
    }

    public void setColors(String[] _colors) {
        this._colors = _colors;
    }

    public String[] getAddOns() {
        return _addOns;
    }

    public void setAddOns(String[] _addOns) {
        this._addOns = _addOns;
    }
    
    // Behaviors
    public void mixIngredients(String[] ingredients){}
    
    public void pasteurize(){}
    
    public void ageMix(){}
    
    public void flavoringAndColoring(String[] flavors, String[] colors){}
    
    public void freeze(){}
    
    public void addExtraIngredients(String[] addOns){}
    
    public void hardenFinalMix(){}
}
