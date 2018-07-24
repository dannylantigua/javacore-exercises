/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming6;

/**
 *
 * @author dannylantigua
 */
public class LovesMe {
    public static void main(String[] args) {
        int petals = 34;
        Boolean doLove, doNotLove;
        
        doLove = false;
        doNotLove = true;
        System.out.println("Well here goes nothing...");
        while(petals > 0) {
            if (doLove){
                System.out.println("It LOVES me!");
                doLove = false;
                doNotLove = true;
            } else
            if (doNotLove){
                System.out.println("It loves me NOT!");
                doNotLove = false;
                doLove = true;
            }
            petals -= 1;
        }
        
        System.out.println("I knew it! It LOVES ME!");
    }
}
