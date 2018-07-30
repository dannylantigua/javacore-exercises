/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class InterestCalculator {

    private double _period, _years, _capital, _currentB, _interestRt, _interestAmt;
    private int _bucle = 0;

    public double getPeriod() {
        return _period;
    }

    public void setPeriod(double _period) {
        this._period = _period;
    }

    public double getYears() {
        return _years;
    }

    public void setYears(double _years) {
        this._years = _years;
    }

    public double getCapital() {
        return _capital;
    }

    public void setCapital(double _capital) {
        this._capital = _capital;
    }

    public double getCurrentB() {
        return _currentB;
    }

    public void setCurrentB(double _currentB) {
        this._currentB = _currentB;
    }

    public double getInterestRt() {
        return _interestRt;
    }

    public void setInterestRt(double _interestRt) {
        this._interestRt = _interestRt;
    }

    public double getInterestAmt() {
        return _interestAmt;
    }

    public void setInterestAmt(double _interestAmt) {
        this._interestAmt = _interestAmt;
    }

    public int getBucle() {
        return _bucle;
    }

    public void setBucle(int _bucle) {
        this._bucle = _bucle;
    }
    
    public void divideInterest(){
        if (_period == 1) {
            _interestRt = _interestRt / 12;
            _bucle = 12;
        } else if (_period == 2) {
            _interestRt = _interestRt / 2;
            _bucle = 2;
        } else if (_period == 3) {
            _interestRt = _interestRt / 4;
            _bucle = 4;
        }
    }
    
    public void calculateCapital(){
        System.out.println("\n");
        for (int k = 1; k <= _years; k++) {
            System.out.println("\nYear number: #" + k);
            System.out.println("Your capital beginning the year: " + _capital);
            _interestAmt = 0;

            for (int i = 1; i <= _bucle; i++) {
                _currentB = _capital * (1 + (_interestRt / 100));
                _interestAmt += (_currentB - _capital);
                _capital = _currentB;
            }

            System.out.println("Interest earned this year: " + _interestAmt);
            System.out.println("Your capital at the end of the year: " + _capital);
        }
    }
}
