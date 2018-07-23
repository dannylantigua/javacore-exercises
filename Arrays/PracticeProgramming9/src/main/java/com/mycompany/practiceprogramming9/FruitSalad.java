/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming9;

/**
 *
 * @author dannylantigua
 */
public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", 
            "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", 
            "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", 
            "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        String[] fruitSalad = new String[12];
        int appleCount = 0, orangeCount = 0, fsCount = 0;
        
        // Code Recipe for fruit salad should go here!
        for(String salad : fruit){
            if(salad.contains("berry")){
                fruitSalad[fsCount] = salad;
                fsCount++;
            }else
            if(salad.contains("Apple")){
                if (appleCount < 3){
                    fruitSalad[fsCount] = salad;
                    fsCount++;
                    appleCount++;
                }
            }else
            if(salad.contains("Orange")){
                if (orangeCount < 2){
                    fruitSalad[fsCount] = salad;
                    fsCount++;
                    orangeCount++;
                }
            }else
            if(salad.contains("Tomato")){
            }else{
               fruitSalad[fsCount] = salad;
               fsCount++; 
            }
            
            if (fsCount >= 12){
                break;
            }
        }
        
        for(String arr : fruitSalad){
            System.out.println(arr+" ");
        }
        
    }
}
