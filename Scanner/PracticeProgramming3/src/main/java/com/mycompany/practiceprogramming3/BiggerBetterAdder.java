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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        int a,b,c;
        Scanner mySc =  new Scanner(System.in);
        
        System.out.println("Insert value for a:");
        a = parseInt(mySc.nextLine());
        
        System.out.println("Insert value for b:");
        b = parseInt(mySc.nextLine());
        
        System.out.println("Insert value for c:");
        c = parseInt(mySc.nextLine());
        
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        
        int allAdded = a + b + c;
        System.out.println("All added numbers equals "+ allAdded);
        System.out.println("All added numbers equals "+ allAdded);
    }
}
