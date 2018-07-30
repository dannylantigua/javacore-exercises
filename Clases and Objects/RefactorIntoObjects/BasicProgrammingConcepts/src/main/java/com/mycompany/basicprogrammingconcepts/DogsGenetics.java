/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class DogsGenetics {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        Random randmr = new Random();
        
        String[] breeds = {"Chihuahua", "Bernard", "Chow Chow", "Beagle", "Rottweiler",
                            "Poodle", "German Shepherd", "Labrador Retriever", "Husky", "Pug"};
        
        String[] dogGenes = new String[5];
        int randomPercentage = 0, randomBreed = 0;
        int max = 100, min = 1;
        String dogName;
        
        System.out.println("What is your dog's name?");
        dogName = mySc.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+
                dogName+"'s prestigious background right here.\n");
        System.out.println(dogName+" is:\n");
        
        for (int i = 0; i < dogGenes.length; i++){
            if (i < dogGenes.length -1){
                randomPercentage = randmr.nextInt(max - min) + min;
            }else{
                randomPercentage = max;
            }
            randomBreed = randmr.nextInt(10 - 1) + 1;
            
            dogGenes[i] = randomPercentage+"% "+breeds[randomBreed - 1];
            max = max - randomPercentage;
        }
        
        for(String dna : dogGenes){
            System.out.println(dna);
        }
        System.out.println("\nWow, that's QUITE the dog!   ");
    }
}
