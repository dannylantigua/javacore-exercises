/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userioclasslab;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class App {
    
    static UserInput usr = new UserInput();
    static int num1, num2;
    
    public static void main(String[] args) {
        
        SimpleCalculator cal = new SimpleCalculator();
        int ans;
        
        do{
            usr.print("WELCOME TO Simple Calculator");
            usr.print("What do you wish to do next?");
            usr.print("*************************************************");
            usr.print("0 - EXIT\n1 - ADD\n2 - SUBSTRACT\n3 - MULTIPLY\n4 - DIVIDE");
            usr.print("*************************************************");

            ans = usr.readInt("Answer: ");
            switch (ans){
                case 0:
                    usr.print("Thanks for using Simple Calculator. Bye!");
                    break;
                case 1:
                    getInput("add");
                    usr.print(""+cal.addition(num1, num2));
                    break;
                case 2:
                    getInput("substract");
                    usr.print(""+cal.substraction(num1, num2));
                    break;
                case 3:
                    getInput("multiply");
                    usr.print(""+cal.multiplication(num1, num2));
                    break;
                case 4:
                    getInput("divide");
                    usr.print(""+cal.division(num1, num2));
                    break;
            }
            usr.print("\n\n");
        }while (ans > 0 && ans < 5);
        
    }
    
    public static void getInput(String message){
        usr.print("What numbers to you wish to "+message+"?");
        num1 = usr.readInt("First number: ");
        num2 = usr.readInt("Second number: ");
        usr.print("Result: ");
    }
}
