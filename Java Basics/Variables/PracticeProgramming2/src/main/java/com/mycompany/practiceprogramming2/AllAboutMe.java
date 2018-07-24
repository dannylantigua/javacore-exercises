/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming2;

/**
 *
 * @author dannylantigua
 */
public class AllAboutMe {

    public static void main(String[] args) {

        String name = "Danny Lantigua";
        String favFood = "Mangu";
        int numPets = 1;
        boolean gnocchi = false;
        int whistelAge = 5;

        System.out.println("I am " + name);
        System.out.println("I have " + Integer.toString(numPets) + " pet/s");
        System.out.println("My favorite food is " + favFood);
        System.out.println("It is "+ Boolean.toString(gnocchi) +" that I have eaten gnocchi");
        System.out.println("And when I was "+ Integer.toString(whistelAge) +" years old, I learned to whistle.");
    }
}
