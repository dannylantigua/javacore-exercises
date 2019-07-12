/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interestcalculator;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class App {

    public static void main(String[] args) {
        
        InterestCalculator iCal = new InterestCalculator();
        
        System.out.println("Welcome to Interest Calculator!!\n"
                + "You are able to see how much interest you can earn \n"
                + "by saving money into an account. Type the amount of money, \n"
                + "the interest rate \n"
                + "and the period you will be saving this money.");

        iCal.setCapital(new BigDecimal(ConsoleIO.inputMessage("How much money will you deposit?")));
        iCal.setInterestRt(new BigDecimal(ConsoleIO.inputMessage("What's the annual interest rate?"))); 
        iCal.setYears(Double.parseDouble(ConsoleIO.inputMessage("For how long will you keep the money? (years)")));

        do {
            iCal.setPeriod(Double.parseDouble(ConsoleIO.inputMessage(
                    "Choose the interest compund periods for calculating the interest \n"
                + "1 - monthly \n" + "2 - Every 6 months \n" + "3 - Quaterly")));
        } while (iCal.getPeriod() > 3 || iCal.getPeriod() < 1);

        // Divide the interest                
        iCal.divideInterest();

        //Calculate amount and interest
        iCal.calculateCapital();
    }
}
