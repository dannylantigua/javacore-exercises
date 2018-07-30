/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basicprogrammingconcepts;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class ConsoleIO {

    private static Scanner mySc = new Scanner(System.in);

    public static void Display(String message) {
        System.out.println(message);
    }

    public static String inputMessage(String message) {
        String rs = "";
        System.out.println(message);
        rs = mySc.nextLine();
        return rs;
    }

    public static int validateUserInput(int min, int max) {
        int rs = 0;
        do {
            rs = parseInt(mySc.nextLine());
        } while (rs < min || rs > max);
        return rs;
    }
}
