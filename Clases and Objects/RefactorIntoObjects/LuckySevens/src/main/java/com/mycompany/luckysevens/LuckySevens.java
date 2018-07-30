/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luckysevens;

import java.util.Random;

/**
 *
 * @author dannylantigua
 */
public class LuckySevens {
    private int _numberRolls = 0, _maxMoney = 0, _numRollMaxMoney = 0;
    private static Random randmzr = new Random();

    public LuckySevens() {}

    public int getNumberRolls() {
        return _numberRolls;
    }

    public int getMaxMoney() {
        return _maxMoney;
    }

    public int getNumRollMaxMoney() {
        return _numRollMaxMoney;
    }
    
    public void playLucky7(int amountDollars){
        do{
           int dice1 = randmzr.nextInt(6 -1)+1;
           int dice2 = randmzr.nextInt(6 -1)+1;
           int totalN = dice1 + dice2;
           
           if (totalN == 7){
               amountDollars += 4;
           }else{
               amountDollars--;
           }
           
           _numberRolls++;
           if (amountDollars > _maxMoney){
               _maxMoney = amountDollars;
               _numRollMaxMoney = _numberRolls;
           }
           
        }while (amountDollars >= 0);
    }
}
