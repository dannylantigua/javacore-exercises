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
public class Opinionator {
    public static void main(String[] args) {
        Random randomizer = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");

        int x = randomizer.nextInt(5);

        System.out.println("The number we chose was: " + x);

        switch (x) {
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Woolly Mammoths are DEFINITELY the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            case 4:
                System.out.println("Cockatoos are just so awesomme!");
                break;
            case 5:
                System.out.println("Have you ever met a Mole-Rat? They're GREAT!");
                break;
            default:
                System.out.println("No animals found :(");
                break;
        }

        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
}
