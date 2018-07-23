/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming6;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class BewareTheKraken {
    public static void main(String[] args) {

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        String answ = "";
        Scanner mySc = new Scanner(System.in);

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            if(depthDivedInFt == 3000){
                System.out.println("I can see a white shark nearby. Let's keep going :)");
            }
            
            if(depthDivedInFt == 8000){
                System.out.println("Wow!!!! there's a submarine over there!");
            }
            
            if(depthDivedInFt == 14000){
                System.out.println("Uhhh, I can see and Anglerfish. So ugly!");
            }
            
            if(depthDivedInFt == 10000){
                System.out.println("Ufff, do want to stop going deeper? (y/n): ");  
                answ = mySc.nextLine();
                if (answ == "y"){
                    break;
                }
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 500;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
