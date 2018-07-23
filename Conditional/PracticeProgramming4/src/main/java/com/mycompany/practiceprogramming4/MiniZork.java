/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming4;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { 
                System.out.println("You put your hand in and it's totally empty.");
                System.out.println("It's really very dark. Too dark. You hear a sound you cannot discribe.");
                System.out.println("Find out what it is or run away?");
                action = userInput.nextLine();
                
                if(action.equals("find out what it is")){
                    System.out.println("You take a flashlight out and light an horrible and dangerous creature");
                    System.out.println("You've been eaten by a grue.");
                }else if(action.equals("run away")){
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            }
        } else if (action.equals("go to the house")) {
            System.out.println("It is an abandoned house. Old furniture covered on dust, some lights on and flashing.");
            System.out.println("You're kind of hungry and tired.");
            System.out.println("Go to the kitchen or go to the bedroom");
            action = userInput.nextLine();
            
            if(action.equals("go to the kitchen")){
                System.out.println("Kitchen same as livingroom. Nothing you could get to eat.");
                System.out.println("You open a refrigerator and there's a rotten apple.");
                System.out.println("You close the refrigerator and a masked serial killer is next to you. And kills you.");
            }else if(action.equals("go to the bedroom")){
                System.out.println("You walk upstairs. While doing so you hear some steps on the second floor");
                System.out.println("You run away");
            }
        }
    }
}
