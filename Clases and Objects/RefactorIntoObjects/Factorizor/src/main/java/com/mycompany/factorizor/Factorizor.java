/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorizor;

/**
 *
 * @author dannylantigua
 */
public class Factorizor {
    private int _numberToFactor;

    public int getNumberToFactor() {
        return _numberToFactor;
    }

    public void setNumberToFactor(int _numberToFactor) {
        this._numberToFactor = _numberToFactor;
    }
    
    public int calculateFactorAndPerfect(){
        int perfectN = 0;
        for (int i = 1; i < _numberToFactor; i++) {
            if (_numberToFactor % i == 0) {
                System.out.println(i);
                perfectN += i;
            }
        }
        return perfectN;
    }
    
    public int calculatePrime(){
        int primeN = 0;
        for (int i = 1; i <= _numberToFactor; i++) {
            if (_numberToFactor % i == 0) {
                primeN++;
            }
        }
        return primeN;
    }
}
