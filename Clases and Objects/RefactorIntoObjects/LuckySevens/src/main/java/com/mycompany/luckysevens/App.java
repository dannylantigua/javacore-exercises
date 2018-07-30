/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luckysevens;

import static java.lang.Integer.parseInt;
import java.util.Random;

/**
 *
 * @author dannylantigua
 */
public class App {
    public static void main(String[] args) {
        
        Random randmzr = new Random();
        LuckySevens l7 = new LuckySevens();
        
        int amountDollars = parseInt(ConsoleIO.inputMessage("How many dollars do you have?"));
        l7.playLucky7(amountDollars);
        
        System.out.println("You are broke after "+l7.getNumberRolls()+" rolls.");
        System.out.println("You should have quit after "+l7.getNumRollMaxMoney()+" rolls when you had $"+l7.getMaxMoney()+".");
    }
}
