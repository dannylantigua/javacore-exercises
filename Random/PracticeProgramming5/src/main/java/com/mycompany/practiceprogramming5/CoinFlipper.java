/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming5;

import java.util.Random;

/**
 *
 * @author dannylantigua
 */
public class CoinFlipper {
    public static void main(String[] args) {
        Random randomizer = new Random();
        
        System.out.println("Ready, Set, Flip....!!");
        int x = randomizer.nextInt(2) + 1;
        System.out.println(x);
        
        switch (x){
            case 1:
                System.out.println("You got HEADS!");
                break;
            case 2:
                System.out.println("You got TAILS!");
                break;
        }
    }
}
