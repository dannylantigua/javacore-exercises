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
public class BirthStones {
    public static void main(String[] args) {
        String jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec;
        jan = "Garnet";
        feb = "Amethyst";
        mar = "Aquamarine";
        apr = "Diamond";
        may = "Emerald";
        jun = "Pearl";
        jul = "Ruby";
        aug = "Peridot";
        sep = "Sapphire";
        oct = "Opal";
        nov = "Topaz";
        dec = "Turquoise";
        
        Scanner mySc = new Scanner(System.in);
        System.out.println("What month's birthstone are you wanting to know?");
        int month = parseInt(mySc.nextLine());
        
        switch(month){
            case 1:
                System.out.println("January's birthstone is "+jan);
                break;
            case 2:
                System.out.println("February's birthstone is "+feb);
                break;
            case 3:
                System.out.println("March's birthstone is "+mar);
                break;
            case 4:
                System.out.println("April's birthstone is "+apr);
                break;
            case 5:
                System.out.println("May's birthstone is "+may);
                break;
            case 6:
                System.out.println("June's birthstone is "+jun);
                break;
            case 7:
                System.out.println("July's birthstone is "+jul);
                break;
            case 8:
                System.out.println("August's birthstone is "+aug);
                break;
            case 9:
                System.out.println("September's birthstone is "+sep);
                break;
            case 10:
                System.out.println("October's birthstone is "+oct);
                break;
            case 11:
                System.out.println("November's birthstone is "+nov);
                break;
            case 12:
                System.out.println("December's birthstone is "+dec);
                break;
            default:
                System.out.println("I think you must be confused, "+month+" doesn't match a month.");
        }
    }
}
