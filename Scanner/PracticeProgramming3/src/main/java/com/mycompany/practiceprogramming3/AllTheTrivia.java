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
public class AllTheTrivia {
    public static void main(String[] args) {
        String q1, q2, q3, q4;
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("1,024 Gigabytes is equal to one what?");
        q1 = mySc.nextLine();
        
        System.out.println("In our solar system which is the only planet that rotates clockwise?");
        q2 = mySc.nextLine();
        
        System.out.println("The largest volcano ever discovered in our solar system is located on which planet?");
        q3 = mySc.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        q4 = mySc.nextLine();
        
        System.out.println("Wow, 1,024 Gigabytes is a "+q3+"!");
        System.out.println("I didn't know that the largest ever volcano was discovered on "+q1+"!");
        System.out.println("That's amazing that "+q2+" is the most abundant element in the atmosphere...");
        System.out.println(q4+" is the only planet that rotates clockwise, neat!");
    }
}
