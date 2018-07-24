/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorizor;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class Factorizor {

    public static void main(String[] args) {
        // declaration of variables
        Scanner mySc = new Scanner(System.in);
        int numberToFactor = 0;
        int addNum = 0;
        int isPrime = 0;

        System.out.println("What number would you like to factor? ");
        numberToFactor = mySc.nextInt();
        System.out.println("The factors of " + numberToFactor + " are:");
        
        // For the factor and perfect number
        for (int i = 1; i < numberToFactor; i++) {
            if (numberToFactor % i == 0) {
                System.out.println(i);
                addNum += i;
            }
        }
        
        // For prime number
        for (int i = 1; i <= numberToFactor; i++) {
            if (numberToFactor % i == 0) {
                isPrime++;
            }
        }
        
        if (addNum == numberToFactor) {
            System.out.println(numberToFactor + " is a perfect number");
        }else{
            System.out.println(numberToFactor + " is NOT a perfect number");
        }
        
        if (isPrime == 2) {
            System.out.println(numberToFactor + " is a prime number");
        }else{
            System.out.println(numberToFactor + " is NOT a prime number");
        }
    }
}
