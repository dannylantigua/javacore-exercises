/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingconcepts;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class HealthyHearts {
    public static void main(String[] args) {
        int age, heartR;
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = mySc.nextInt(); 
        heartR = 220 - age;
        
        System.out.println("Your maximum heart rate should be "+ heartR +" beats per minute");
        System.out.println("Your target HR Zone is "+ (heartR * 0.50) +" - "+ (heartR * 0.85) +" beats per minute");
    }
}
