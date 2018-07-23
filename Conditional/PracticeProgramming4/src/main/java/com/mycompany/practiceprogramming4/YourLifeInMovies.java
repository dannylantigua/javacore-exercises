/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming4;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class YourLifeInMovies {

    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Hey, let's play a game! What's your name?");
        String myName = mySc.nextLine();

        System.out.println("Ok, " + myName + ", when were you born?");
        int yearBirth = parseInt(mySc.nextLine());

        System.out.println("Well " + myName + "...");
        System.out.print("Did you know that ");
        if (yearBirth <= 2005) {
            System.out.println("the Pixar's 'Up' came out half a decade ago");
            if (yearBirth <= 1995) {
                System.out.println("Also, the first Harry Potter came out over 15 years ago.");
                if (yearBirth <= 1985) {
                    System.out.println("Space Jam came out not last decade, but the one before THAT.");
                    if (yearBirth <= 1975) {
                        System.out.println("And the the original Jurassic Park release is closer to the lunar landing, than today.");
                        if (yearBirth <= 1965) {
                            System.out.println("The MASH has been around for almost half a century!");
                        }
                    }
                }
            }
        }
    }
}
