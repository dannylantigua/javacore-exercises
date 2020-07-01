/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Taxes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dannylantigua
 */
public class FlooringMasteryModes {
    
    public final static String MODES_FILE = "modes.txt";
    
    public String loadModes() throws FlooringMasteryPersistenceException {
        Scanner scanner;
        String mode = "";

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(MODES_FILE)));
        } catch (FileNotFoundException e) {
            throw new FlooringMasteryPersistenceException(
                    "-_- Could not load Modes into memory.", e);
        }

        String currentLine;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            mode = currentLine;
        }
        scanner.close();
        return mode;
    }
}
