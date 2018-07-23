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
public class MaybeItLovesMe {
    public static void main(String[] args) {
        double petals = 0;
        Boolean doLove, doNotLove;
        int range = (89 - 13) + 1;
        petals = ((Math.random() * range) + 13);
        
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
        
        if(!doLove){
           System.out.println("Oh, wow! It really LOVES  ME!"); 
        }else 
        if (!doNotLove){
            System.out.println("Awwww, bummer.");
        }
        
    }
}
