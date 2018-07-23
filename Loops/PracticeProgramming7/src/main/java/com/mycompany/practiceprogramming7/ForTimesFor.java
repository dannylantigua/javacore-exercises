/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming7;

import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class ForTimesFor {
    public static void main(String[] args) {
        int num, aws;
        int cont = 0;
        double percentage = 0;
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("Which times table shall I recite?");
        num = mySc.nextInt();
        
        for (int i = 1; i <= 15; i++){
            System.out.println(i +" * "+ num + " is: ");
            aws = mySc.nextByte();
            if (aws == (i * num)){
                System.out.println("Correct!");
                cont += 1;
            }else{
                System.out.println("Sorry no, the answer is: "+ i*num);
            }
        }
        
        System.out.println("You got "+cont+" correct!");
        //calculate the percentage
        // ((input - min) * 100) / (max - min)
        percentage = ((cont - 1) * 100) / (15 - 1);
        if (percentage >= 90){
            System.out.println("Congratulations!! Your score is "+percentage+"!!!");
        } else if (percentage <= 50){
            System.out.println("Hmmmmmm!! Your score is "+percentage+"! You need to study more, buddy");
        }
    }
}
