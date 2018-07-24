/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming5;

import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        Scanner mysc = new Scanner(System.in);

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("How many sides does your dice have?");
        int diceSides = parseInt(mysc.nextLine());
        
        int rollResult = diceRoller.nextInt(diceSides) + 1;
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        } else if (rollResult == diceSides){
            System.out.println("You rolled a critical! Nice Job!");
        }
    }
}
