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

    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);

        //Variables
        double period;
        double years;
        double capital;
        double currentB;
        double interestRt;
        int bucle = 0;
        double interestAmt;

        System.out.println("Welcome to Interest Calculator!!\n"
                + "You are able to see how much interest you can earn \n"
                + "by saving money into an account. Type the amount of money, \n"
                + "the interest rate \n"
                + "and the period you will be saving this money.");

        System.out.println("How much money will you deposit?");
        capital = Double.parseDouble(mySc.nextLine());

        System.out.println("What's the annual interest rate?");
        interestRt = Double.parseDouble(mySc.nextLine());
        
        System.out.println("For how long will you keep the money? (years)");
        years = Double.parseDouble(mySc.nextLine());

        System.out.println("Choose the interest compund periods for calculating the interest \n"
                + "1 - monthly \n" + "2 - Every 6 months \n" + "3 - Quaterly");
        do {
            period = Double.parseDouble(mySc.nextLine());
        } while (period > 3 || period < 1);

        // Divide the interest                
        if (period == 1) {
            interestRt = interestRt / 12;
            bucle = 12;
        } else if (period == 2) {
            interestRt = interestRt / 2;
            bucle = 2;
        } else if (period == 3) {
            interestRt = interestRt / 4;
            bucle = 4;
        }
        
        //Calculate amount and interest
        System.out.println("\n");
        for (int k = 1; k <= years; k++){
            System.out.println("\nYear number: #"+k);
            System.out.println("Your capital beginning the year: "+ capital);
            interestAmt = 0;
            
            for (int i = 1; i <= bucle; i++){
                currentB = capital * (1 + (interestRt / 100));
                interestAmt += (currentB - capital);
                capital = currentB;
            }
            
            System.out.println("Interest earned this year: " + interestAmt);
            System.out.println("Your capital at the end of the year: "+ capital);
        }
    }
}
