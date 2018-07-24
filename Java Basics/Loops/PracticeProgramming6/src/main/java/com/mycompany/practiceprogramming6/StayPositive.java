/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming6;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class StayPositive {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        int x = 0;
        
        System.out.println("What number should I count down from?");
        int num = parseInt(mySc.nextLine());
        
        while (num >= 0){
            System.out.print(num+" ");
            x+=1;
            num-=1;
            
            if (x == 10){
                System.out.println(" ");
                x = 0;
            }
        }
        System.out.println(" ");
        System.out.println("Whew, better stop there...! ");
    }
}
