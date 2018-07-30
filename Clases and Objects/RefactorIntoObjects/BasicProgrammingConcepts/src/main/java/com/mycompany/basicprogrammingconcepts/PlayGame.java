/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingconcepts;

import static java.lang.Integer.parseInt;

/**
 *
 * @author dannylantigua
 */
public class PlayGame {
    
    RockPaperScissors rps = new RockPaperScissors();
    
    public void beginGame(){
        System.out.println("Welcome to play Rock, Paper, Scissors!");
        askQuestion();

        if (rps.getRoundsToPlay() < 1 || rps.getRoundsToPlay() > 10) {
            System.out.println("ERROR: We can only play a MAX of 10 rounds. Bye Bye!");
        } else {

            for (int count = 1; count <= rps.getRoundsToPlay(); count++) {
                rps.gameContent(count);
                if (count == rps.getRoundsToPlay()) {
                    rps.resultsOfTheGame();
                    String answer = ConsoleIO.inputMessage("Do you want to play with me again? (y/n): ");
                    if (answer.equalsIgnoreCase("y")) {
                        askQuestion();
                        count = 0;
                        rps.setCompWins(0);
                        rps.setUserWins(0);
                        rps.setTies(0);
                        System.out.println(" ");
                    } else {
                        System.out.println("Thanks for playing!");
                    }
                }
            }
        }
    }
    
    public void askQuestion(){
        rps.setRoundsToPlay(parseInt(ConsoleIO.inputMessage("How many rounds do you wish to play? ")));
    }
}
