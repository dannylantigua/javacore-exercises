/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculator;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class App {
    
    static Scanner mySc = new Scanner(System.in);
    static int num1, num2;
    
    public static void main(String[] args) {
        
        SimpleCalculator cal = new SimpleCalculator();
        int ans = 0;
        
        do{
                System.out.println("WELCOME TO Simple Calculator");
                System.out.println("What do you wish to do next?");
                System.out.println("*************************************************");
                System.out.println("0 - EXIT\n1 - ADD\n2 - SUBSTRACT\n3 - MULTIPLY\n4 - DIVIDE");
                System.out.println("*************************************************");

                ans = parseInt(mySc.nextLine());
                switch (ans){
                    case 0:
                        System.out.println("Thanks for using Simple Calculator. Bye!");
                        break;
                    case 1:
                        userInput("add");
                        System.out.println(cal.addition(num1, num2));
                        break;
                    case 2:
                        userInput("substract");
                        System.out.println(cal.substraction(num1, num2));
                        break;
                    case 3:
                        userInput("multiply");
                        System.out.println(cal.multiplication(num1, num2));
                        break;
                    case 4:
                        userInput("divide");
                        System.out.println(cal.division(num1, num2));
                        break;
                }
                System.out.println("\n\n");
        }while (ans > 0 && ans < 5);
        
    }
    
    public static void userInput(String message){
        System.out.println("What numbers to you wish to "+message+"?");
        System.out.print("First number: ");
        num1 = parseInt(mySc.nextLine());
        System.out.print("Second number: ");
        num2 = parseInt(mySc.nextLine());
        System.out.print("Result: ");
    }
}
