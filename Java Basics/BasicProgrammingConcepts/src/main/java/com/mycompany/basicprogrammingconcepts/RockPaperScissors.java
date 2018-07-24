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
public class RockPaperScissors {
    public static void main(String[] args){
        
        //Variables declaration
        Scanner mySc = new Scanner(System.in);
        Random randzr = new Random();
        
        int roundsToPlay = 0, count = 1; //For the rounds
        int userEntry = 0, computerEntry = 0;  //For the entries of each round 
        int ties = 0, userWins = 0, compWins = 0;  //To keep tracks of the results of the rounds
        
        System.out.println("Welcome to play Rock, Paper, Scissors!");
        System.out.print("How many rounds do you wish to play? ");
        roundsToPlay = mySc.nextInt();
        
        if (roundsToPlay < 1 || roundsToPlay > 10){
            System.out.println("ERROR: We can only play a MAX of 10 rounds. Bye Bye!");
        }else{
            do{
                // User ENTRY
                System.out.println("ROUND #"+count);
                System.out.println("Press 1: ROCK, 2: PAPER, 3: SCISSORS ==>");
                
                // Validate the user always type between 1 and 3
                do{
                    userEntry = mySc.nextInt();
                }while (userEntry < 1 || userEntry > 3);
                
                // Computer ENTRY
                computerEntry = randzr.nextInt(3 - 1) + 1;
                
                // Calculate the match
                // It's a Tie
                if (userEntry == computerEntry){
                    System.out.println("It's a TIE. We both chose the same thing!");
                    ties += 1;
                }
                
                // Paper wraps the rock
                if (userEntry == 2 && computerEntry == 1){
                    System.out.println("You chose Paper, I chose Rock. You win!");
                    userWins += 1;
                }else if (userEntry == 1 && computerEntry == 2){
                    System.out.println("You chose Rock, I chose Paper. I win!");
                    compWins += 1;
                }
                
                // Scissors cut paper
                if (userEntry == 3 && computerEntry == 2){
                    System.out.println("You chose Scissors, I chose Paper. You win!");
                    userWins += 1;
                }else if (userEntry == 2 && computerEntry == 3){
                    System.out.println("You chose Paper, I chose Scissors. I win!");
                    compWins += 1;
                }
                
                // Rock beats Scissors
                if (userEntry == 1 && computerEntry == 3){
                    System.out.println("You chose Rock, I chose Scissors. You win!");
                    userWins += 1;
                }else if (userEntry == 3 && computerEntry == 1){
                    System.out.println("You chose Scissors, I chose Rock. I win!");
                    compWins += 1;
                }
                
                // Results
                if (count == roundsToPlay) {
                    System.out.println(" ");
                    System.out.println("========= RESULTS ==========");
                    System.out.println("Our match has ended. Let's see how it went:");
                    System.out.println("Number of rounds: "+roundsToPlay);
                    System.out.println("User Wins: "+userWins);
                    System.out.println("Computer Wins: "+compWins);
                    System.out.println("Ties: "+ties);
                    
                    if (userWins == compWins){
                        System.out.println("Wow! That was intense but we're tied, buddy!");
                    }else if (userWins > compWins){
                        System.out.println("Good job, You WON!!!");
                    }else{
                        System.out.println("Somebody has to practice more because I WON!");
                    }
                    
                    System.out.println(" ");
                    System.out.println("Do you want to play with me again? (y/n): ");
                    Scanner scn2 = new Scanner(System.in);
                    String answer = scn2.nextLine();
                    
                    if (answer.equals("y")){
                        System.out.print("How many rounds do you wish to play? ");
                        roundsToPlay = mySc.nextInt();
                        count = 0;
                        userWins = 0;
                        compWins = 0;
                        ties = 0;
                        System.out.println(" ");
                    }else{
                        System.out.println("Thanks for playing!");
                    }
                }
                
                count++;
                
            }while(count <= roundsToPlay);
        }
    }
}
