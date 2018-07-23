/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming8;

import java.util.Random;

/**
 *
 * @author dannylantigua
 */
public class BarelyControlledChaos {
    
    
    
    public static void main(String[] args) {

        String color = chooseColor();  
        String animal = chooseAnimal();
        String colorAgain = chooseColor(); 
        int weight = randomInteger(200, 5);
        int distance = randomInteger(20, 10);
        int number = randomInteger(20000, 10000);
        int time = randomInteger(6, 2);          
    
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal 
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over " 
            + number + " " + colorAgain + " poppies for nearly " 
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, " 
            + "let me tell you!");
    } 
    
    public static String chooseColor(){
        Random randzr = new Random();
        String colors[] = {"White","Black","Red","Blue","Yellow","Brown","Light Blue","Pink"};
        int chooseItem = randzr.nextInt(8 - 1) + 1;
        return colors[chooseItem - 1];
    }
    
    public static String chooseAnimal(){
        Random randzr = new Random();
        String animals[] = {"Dog","Cat","Turtle","Hasmter","Dove"};
        int chooseItem = randzr.nextInt(5 - 1) + 1;
        return animals[chooseItem - 1];
    }
    
    public static int randomInteger (int max, int min){
        Random randzr = new Random();
        return randzr.nextInt(5 - 1) + 1;
    }
}
