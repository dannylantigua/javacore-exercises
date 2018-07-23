/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming4;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class TriviaNinja {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code		2) Assembly Language");
        System.out.println("3) C#				4) Machine Code");
        int q1 = parseInt(mySc.nextLine());
        System.out.println("YOUR ANSWER: "+q1);
        
        System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper		2) Alan Turing");
        System.out.println("3) Charles Babbage		4) Larry Page");
        int q2 = parseInt(mySc.nextLine());
        System.out.println("YOUR ANSWER: "+q2);
        
        System.out.println("THIRD QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity			2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise	4) The Millennium Falcon");
        int q3 = parseInt(mySc.nextLine());
        System.out.println("YOUR ANSWER: "+q3);
        
        if(q1 == 4 && q2 == 2 && q3 == 3){
            System.out.println("Nice job - you got 3 correct!");
        }else{
            System.out.println("Oops! You didn't get all questions right. Try again.");
        }
    }
}
