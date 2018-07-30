/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingconcepts;

import java.util.Random;

/**
 *
 * @author dannylantigua
 */
public class RockPaperScissors {

    private int _roundsToPlay; //For the rounds
    private int userEntry = 0, computerEntry = 0;  //For the entries of each round 
    private int ties = 0, userWins = 0, compWins = 0;  //To keep tracks of the results of the rounds
    private Random randzr = new Random();

    public RockPaperScissors() {
    }

    public int getRoundsToPlay() {
        return _roundsToPlay;
    }

    public void setRoundsToPlay(int _roundsToPlay) {
        this._roundsToPlay = _roundsToPlay;
    }

    public void setUserWins(int userWins) {
        this.userWins = userWins;
    }

    public void setCompWins(int compWins) {
        this.compWins = compWins;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public void gameContent(int count) {

        // User ENTRY
        System.out.println("ROUND #" + count);
        System.out.println("Press 1: ROCK, 2: PAPER, 3: SCISSORS ==>");
        userEntry = ConsoleIO.validateUserInput(1, 3);

        // Computer ENTRY
        computerEntry = randzr.nextInt(3 - 1) + 1;

        // Calculate the match
        // It's a Tie
        if (userEntry == computerEntry) {
            System.out.println("It's a TIE. We both chose the same thing!");
            ties += 1;
        }

        //User or Computer Wins
        if ((userEntry == 2 && computerEntry == 1) || (userEntry == 3 && computerEntry == 2)
                || (userEntry == 1 && computerEntry == 3)) {
            System.out.println("You chose " + whatEntry(userEntry) + ", I chose "
                    + whatEntry(computerEntry) + ". You win!");
            userWins += 1;
        } else if ((userEntry == 1 && computerEntry == 2) || (userEntry == 2 && computerEntry == 3)
                || (userEntry == 3 && computerEntry == 1)) {
            System.out.println("You chose " + whatEntry(userEntry) + ", I chose "
                    + whatEntry(computerEntry) + ". I win!");
            compWins += 1;
        }
    }

    public String whatEntry(int num) {
        String rs = "";
        switch (num) {
            case 1:
                rs = "Rock";
                break;
            case 2:
                rs = "Paper";
                break;
            case 3:
                rs = "Scissors";
                break;
        }
        return rs;
    }

    public void resultsOfTheGame() {

        System.out.println(" ");
        System.out.println("========= RESULTS ==========");
        System.out.println("Our match has ended. Let's see how it went:");
        System.out.println("Number of rounds: " + _roundsToPlay);
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Ties: " + ties);

        if (userWins == compWins) {
            System.out.println("Wow! That was intense but we're tied, buddy!\n\n");
        } else if (userWins > compWins) {
            System.out.println("Good job, You WON!!!\n\n");
        } else {
            System.out.println("Somebody has to practice more because I WON!\n\n");
        }
    }
}
