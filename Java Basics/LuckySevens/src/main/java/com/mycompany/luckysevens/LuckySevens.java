/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class LuckySevens {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        Random randmzr = new Random();
        int numberRolls = 0, maxMoney = 0, numRollMaxMoney = 0;
        
        System.out.println("How many dollars do you have?");
        int amountDollars = mySc.nextInt();
        
        do{
           int dice1 = randmzr.nextInt(6 -1)+1;
           int dice2 = randmzr.nextInt(6 -1)+1;
           int totalN = dice1 + dice2;
           
           if (totalN == 7){
               amountDollars += 4;
           }else{
               amountDollars--;
           }
           
           numberRolls++;
           if (amountDollars > maxMoney){
               maxMoney = amountDollars;
               numRollMaxMoney = numberRolls;
           }
           
        }while (amountDollars >= 0);
        
        System.out.println("You are broke after "+numberRolls+" rolls.");
        System.out.println("You should have quit after "+numRollMaxMoney+" rolls when you had $"+maxMoney+".");
    }
}
