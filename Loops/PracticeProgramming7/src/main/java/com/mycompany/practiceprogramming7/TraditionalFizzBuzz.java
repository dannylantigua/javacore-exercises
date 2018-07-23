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
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        
        System.out.println("How much units fizzing and buzzing do you need in your life?");
        num = mySc.nextInt();
        System.out.println("");
        
        for(int i = 0; i <= (i+1); i++){
            
            if (i == 0){
                System.out.println(i);
                continue;
            }
            
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("fizz buzz");
                cont+=1;
            } else
            if (i % 5 == 0){
                System.out.println("fizz");
                cont+=1;
            } else
            if (i % 3 == 0){
                System.out.println("buzz");
                cont+=1;
            }else{
                System.out.println(i);
            }
            
            if (cont == num){
                System.out.println("TRADITION!!!"); 
                break;
            }
            
        }
    }
}
