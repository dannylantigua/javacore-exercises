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
public class GuessMe {

    public static void main(String[] args) {
        int secretNum = 9;

        System.out.println("Guess the number");
        Scanner mySc = new Scanner(System.in);
        int num = parseInt(mySc.nextLine());

        if (num == secretNum) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (num < secretNum) {
            System.out.println("Ha, nice try - too low! I chose " + secretNum);
        } else {
            System.out.println("Too bad, way too high. I chose" + secretNum);
        }
    }
}
