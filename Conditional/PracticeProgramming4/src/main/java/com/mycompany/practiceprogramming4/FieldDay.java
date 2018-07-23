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
public class FieldDay {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("What is your last name?");
        String lname = mySc.nextLine();
        
        String teamName = "";
        
        if(lname.compareTo("Baggins") < 0){
            teamName = "Red Dragons";
        }else if(lname.compareTo("Baggins") > 0 && lname.compareTo("Dresden") <= 0){
            teamName = "Dark Wizards";
        }else if(lname.compareTo("Dresden") > 0 && lname.compareTo("Howl") <= 0){
            teamName = "Moving Castles";
        }else if(lname.compareTo("Howl") > 0 && lname.compareTo("Potter") <= 0){
            teamName = "Golden Snitches";
        }else if(lname.compareTo("Potter") > 0 && lname.compareTo("Vimes") <= 0){
            teamName = "Night Guards";
        }else if(lname.compareTo("Vimes") > 0){
            teamName = "Black Holes";
        }
        
        System.out.println("Aha! You’re on the team “"+teamName+"”!\n" +
                            "Good luck in the games!");
    }
}
