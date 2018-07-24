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
public class ForTimes {
    public static void main(String[] args) {
        int num;
        Scanner mySc = new Scanner(System.in);
        
        System.out.println("Which times table shall I recite?");
        num = mySc.nextInt();
        
        for (int i = 1; i <= 15; i++){
            System.out.println(i +" * "+ num + " is: "+ i*num);
        }
    }
}
