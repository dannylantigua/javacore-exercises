/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming6;

import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class GuessMeFinally {

    public static void main(String[] args) {
        Random randzr = new Random();
        int secretNum = randzr.nextInt(100 - (-100)) + (-100);
        int num = 0;

        while (num != secretNum) {

            System.out.println("Guess the number: ");
            Scanner mySc = new Scanner(System.in);
            num = parseInt(mySc.nextLine());
            if (num == secretNum) {
                System.out.println("Finally! It's about time you got it!");
            } else if (num < secretNum) {
                System.out.println("Ha, nice try - too low! Try again!");
            } else {
                System.out.println("Too bad, way too high. Try again!");
            }
        }
    }
}
