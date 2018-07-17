/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming3;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        String name = "";
        String answers = "";
        
        System.out.println("Hello there!\n" +
                        "What's your name? ");
        name = mySc.nextLine();
        
        System.out.println("Hi, "+name+"!  What's your favorite color?");
        answers = mySc.nextLine();
        
        System.out.println("Huh, "+answers+"? Mine's Electric Lime.\n");
        System.out.println("I really like limes. They're my favorite fruit, too.\n"+
                "What's YOUR favorite fruit, "+name+"? ");
        answers = mySc.nextLine();
        
        System.out.println("Really? "+answers+"? That's wild!\n" +
                "Speaking of favorites, what's your favorite number?");
        answers = mySc.nextLine();
        
        System.out.println(answers+" is a cool number. Mine's -7.\n" +
                "Did you know "+answers+" * -7 is "+(parseInt(answers) * -7)+"? That's a cool number too!");
        
        System.out.println("Well, thanks for talking to me, "+name+"!");
    }
}
