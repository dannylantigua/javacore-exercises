/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorizor;

import static java.lang.Integer.parseInt;

/**
 *
 * @author dannylantigua
 */
public class App {
    
    public static void main(String[] args) {
        
        Factorizor fc = new Factorizor();
        int numberToFactor;
        int addNum = 0;
        int isPrime = 0;
       
        numberToFactor = parseInt(ConsoleIO.inputMessage("What number would you like to factor? "));
        fc.setNumberToFactor(numberToFactor);
      
        System.out.println("The factors of " + numberToFactor + " are:");
        // For the factor and perfect number
        addNum = fc.calculateFactorAndPerfect();
        // For prime number
        isPrime = fc.calculatePrime();
        
        if (addNum == fc.getNumberToFactor()) {
            ConsoleIO.Display(numberToFactor + " is a perfect number");
        }else{
            ConsoleIO.Display(numberToFactor + " is NOT a perfect number");
        }
        
        if (isPrime == 2) {
            ConsoleIO.Display(numberToFactor + " is a prime number");
        }else{
            ConsoleIO.Display(numberToFactor + " is NOT a prime number");
        }
    }

    
}
