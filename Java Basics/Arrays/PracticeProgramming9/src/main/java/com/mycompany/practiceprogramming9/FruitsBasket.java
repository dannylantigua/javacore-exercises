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
public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", 
            "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", 
            "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", 
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", 
            "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", 
            "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};

        // Fruit sorting code goes here!
        int count1 = 0, count2 = 0;
        
        for(String fruits : fruit){
            if ("Apple".equals(fruits)){
                count1++;
            }else 
             if ("Orange".equals(fruits)){
                count2++;
            }
        }
        
        String[] apples = new String[count1];
        String[] oranges = new String[count2];
        
        count1 = 0; count2 = 0;
        for(String fruits : fruit){
            if ("Apple".equals(fruits)){
                apples[count1] = "Apple";
                count1++;
            }else 
             if ("Orange".equals(fruits)){
                oranges[count2] = "Orange";
                count2++;
            }
        }
        
        System.out.println("Total # of Fruits in the basket: "+fruit.length);
        System.out.println("Number of apples: "+apples.length);
        System.out.println("Number of oranges: "+oranges.length);
    }
}
