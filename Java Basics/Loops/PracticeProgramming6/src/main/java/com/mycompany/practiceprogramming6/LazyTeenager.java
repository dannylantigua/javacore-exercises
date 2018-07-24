/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming6;

import java.util.Random;

/**
 *
 * @author dannylantigua
 */
public class LazyTeenager {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        int chance = randomizer.nextInt(20 - 1) + 1;
        int i = 1;
        
        do {
            System.out.println("Clean your room!! (x"+i+")");
            if (i == chance){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }
            if (i == 15){
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            
            i+=1;
        } while(i <= chance);
    }
}
