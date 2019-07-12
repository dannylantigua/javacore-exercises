/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interestcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class InterestCalculator {

    private double _period, _years;
    private int _bucle = 0;
    private BigDecimal _capital, _currentB, _interestRt, _interestAmt;
    
    private BigDecimal _12month = new BigDecimal("12");
    private BigDecimal _2month = new BigDecimal("2");
    private BigDecimal _4month = new BigDecimal("4");
    private BigDecimal _one = new BigDecimal("1");
    private BigDecimal _oneHund = new BigDecimal("100");

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

    public BigDecimal getCapital() {
        return _capital;
    }

    public void setCapital(BigDecimal _capital) {
        this._capital = _capital;
    }

    public BigDecimal getCurrentB() {
        return _currentB;
    }

    public BigDecimal getInterestRt() {
        return _interestRt;
    }

    public void setInterestRt(BigDecimal _interestRt) {
        this._interestRt = _interestRt;
    }

    public BigDecimal getInterestAmt() {
        return _interestAmt;
    }

    public int getBucle() {
        return _bucle;
    }
    
    public void divideInterest(){
        if (_period == 1) {
            _interestRt = _interestRt.divide(_12month, 2, RoundingMode.HALF_UP);
            _bucle = 12;
        } else if (_period == 2) {
            _interestRt = _interestRt.divide(_2month, 2, RoundingMode.HALF_UP);
            _bucle = 2;
        } else if (_period == 3) {
            _interestRt = _interestRt.divide(_4month, 2, RoundingMode.HALF_UP);
            _bucle = 4;
        }
    }
    
    public void calculateCapital(){
        System.out.println("\n");
        for (int k = 1; k <= _years; k++) {
            System.out.println("\nYear number: #" + k);
            System.out.println("Your capital beginning the year: " + _capital);
            _interestAmt = new BigDecimal("0");

            for (int i = 1; i <= _bucle; i++) {
                _currentB = _capital.multiply(_one.add(_interestRt.divide(_oneHund, 2, RoundingMode.HALF_UP)));     
                //_currentB = _capital * (1 + (_interestRt / 100));
                _interestAmt = _interestAmt.add(_currentB.subtract(_capital));
                //_interestAmt += (_currentB - _capital);
                _capital = _currentB.setScale(2, RoundingMode.HALF_UP);
            }

            System.out.println("Interest earned this year: " + _interestAmt);
            System.out.println("Your capital at the end of the year: " + _capital);
        }
    }
}
