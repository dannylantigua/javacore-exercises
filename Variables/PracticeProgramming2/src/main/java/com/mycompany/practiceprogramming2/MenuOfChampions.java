/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming2;

/**
 *
 * @author dannylantigua
 */
public class MenuOfChampions {

    public static void main(String[] args) {
        
        String firstCourse = "Chicken Wings (Buffalo, BBQ, Fried)";
        float fcPrice = 12;
        String entre = "Pollo Asado (Served with Rice, Beans and Tostones)";
        float ePrice = 16;
        String desert = "Flan de Leche";
        float dPrice = 10;
        
        
        System.out.println("_.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._");
        System.out.println(" ");
        System.out.println("                   Welcome to VIDA LINDA Restaurant");
        System.out.println("                           Today's Menu Is...");
        System.out.println(" ");
        System.out.println("_.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("              " + firstCourse + " $" + Float.toString(fcPrice));
        System.out.println("              " + entre + " $" + Float.toString(ePrice));
        System.out.println("              " + desert + " $" + Float.toString(dPrice));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("_.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._.\"._");
    }
}
