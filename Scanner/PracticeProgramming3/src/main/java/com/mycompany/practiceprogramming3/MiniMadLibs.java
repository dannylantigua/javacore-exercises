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
public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1, adj1, noun2, adj2, pnoun1, pnoun2, pnoun3, verb1, verb2;
        int num;
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!");
        System.out.println("I need a noun: ");
        noun1 = mySc.nextLine();
        
        System.out.println("Now and adj: ");
        adj1 = mySc.nextLine();
        
        System.out.println("Another noun: ");
        noun2 = mySc.nextLine();
        
        System.out.println("And a number: ");
        num = mySc.nextInt();
        
        System.out.println("Another adj: ");
        adj2 = mySc.nextLine();
        
        System.out.println("A plural noun: ");
        pnoun1 = mySc.nextLine();
        
        System.out.println("Another one: ");
        pnoun2 = mySc.nextLine();
        
        System.out.println("One more: ");
        pnoun3 = mySc.nextLine();
        
        System.out.println("A verb (present tense): ");
        verb1 = mySc.nextLine();
        
        System.out.println("Same verb (past tense): ");
        verb2 = mySc.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1+": the "+ adj1 +" frontier. These are the voyages of the starship "+ noun2 +
                ". Its "+ num +"-year mission: to explore strange "+ adj2 +" "+ pnoun1 +", to seek out "+ adj2 +
                " "+ pnoun2 +" and "+ adj2 +" "+ pnoun3 +", to boldly "+ verb1 +" where no one has "+ verb2 +" before.");
    }
}
