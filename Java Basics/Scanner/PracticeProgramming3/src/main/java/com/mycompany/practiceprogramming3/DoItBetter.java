/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming3;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class DoItBetter {
    public static void main(String[] args) {
        int q1, q2, q3;
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        q1 = mySc.nextInt();
        
        System.out.println("What is the number of hotdogs you can eat?");
        q2 = mySc.nextInt();
        
        System.out.println("Number of languages you know: ");
        q3 = mySc.nextInt();
        
        System.out.println("Pffff!!! I can run "+ (q1 * 2) +" miles, I can eat "+ (q2 * 2) +" hotdogs and"+
                " I know "+ (q3 + 1) +" languages XD");
    }
}
