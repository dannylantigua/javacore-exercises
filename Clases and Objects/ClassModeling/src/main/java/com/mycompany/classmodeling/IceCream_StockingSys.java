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
public class IceCream_StockingSys {
    private String[][] _unitsInStore;
    private String[][] _unitsInWarehouse;
    
    // Each string will hold the value of the GroceryPile#, the quantity of
    // units it possess and the size of the unit
    // It would be double or int if the size is managed using an ENUM
    
    public IceCream_StockingSys() {}

    public IceCream_StockingSys(String[][] unitsInStore, String[][] unitsInWarehouse) {
        this._unitsInStore = unitsInStore;
        this._unitsInWarehouse = unitsInWarehouse;
    }

    public String[][] getUnitsInStore() {
        return _unitsInStore;
    }

    public void setUnitsInStore(String[][] _unitsInStore) {
        this._unitsInStore = _unitsInStore;
    }

    public String[][] getUnitsInWarehouse() {
        return _unitsInWarehouse;
    }

    public void setUnitsInWarehouse(String[][] _unitsInWarehouse) {
        this._unitsInWarehouse = _unitsInWarehouse;
    }
    
    // Behaviors
    // When a customer buys an unit
    public void reduceUnitInStore(){}
    
    // When more units are moved to the Store
    public void moveUnitsFromWarehouse(){}
}
