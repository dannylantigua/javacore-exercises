/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVDLibrary;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author dannylantigua
 */
public class DVDLibraryView {

    private UserIO io;

    // Constructor
    public DVDLibraryView(UserIO io) {
        this.io = io;
    }
    
    // =============================== GENERAL =================================
    // Menu List
    public int printMenuAndGetSelection() {
        io.print(" ");
        io.print("Main Menu");
        io.print("1. List DVD Collection");
        io.print("2. Search DVD Collection By Title");
        io.print("3. Create New DVD Item");
        io.print("4. Edit a DVD Item");
        io.print("5. Remove a DVD Item");
        io.print("6. Exit");

        return io.readInt("Please, select from the choices above: ", 1, 6);
    }
    
    // Exit
    public void displayExitBaner() {
        io.print("GOOD BYE!!!!");
    }

    // Unknown Command
    public void displayUnknownCommandBanner() {
        io.print("UNKNOWN COMMAND!!!");
    }
    
    // Error messages
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    // *************************************************************************

    // Add New DVD item to the collection
    public DVDLibrary getNewDVDInfo() {

        String itemId = io.readString("Please enter DVD Item ID: ");
        String title = io.readString("Please enter DVD Title: ");
        String releaseDate = io.readString("Please enter Release Date (MM/DD/YYYY): ");
        String mpaaRating = io.readString("Please enter MPAA Rating: ");
        String directorName = io.readString("Please enter Director's Full Name: ");
        String studio = io.readString("Please enter Studio: ");
        String userRating = io.readString("Please enter any personal rating or notes about this DVD item: ");

        // Set values
        DVDLibrary thisDvd = new DVDLibrary(itemId);
        thisDvd.setTitle(title);
        thisDvd.setReleaseDate(LocalDate.parse(releaseDate, DateTimeFormatter.ofPattern("MM/DD/YYYY")));
        thisDvd.setMpaaRating(mpaaRating);
        thisDvd.setDirectorName(directorName);
        thisDvd.setStudio(studio);
        thisDvd.setUserRating(userRating);

        return thisDvd;
    }

    public void displayAddDVDBanner() {
        io.print("=== Add DVD to Collection ===");
    }

    public void displaySuccessBanner(String msg) {
        io.readString(msg+"Please hit enter to continue");
    }
    // *************************************************************************
    
    // Display DVD Collection
    public void displayDvdCollection(List<DVDLibrary> dvdList) {
        for (DVDLibrary currentDvd : dvdList) {
            io.print(currentDvd.getItemId()+ ": \n"
                    + currentDvd.getTitle()+ " \n"
                    + currentDvd.getReleaseDate().toString()+ " \n"
                    + currentDvd.getMpaaRating()+ " \n"
                    + currentDvd.getDirectorName()+ " \n"
                    + currentDvd.getStudio()+ " \n"
                    + currentDvd.getUserRating());
            
            io.print(" ");
        };
    }

    public void dislpayDisplayAllBanner() {
        io.print("=== Display DVD Collection ===");
    }
    //**************************************************************************
    //Display DVD Item By TITLE
    public void displayDisplayDVD2Banner() {
        io.print("=== Display DVD By TITLE ===");
    }
    
    public String getDVDTitleChoice() {
        return io.readString("Please enter the DVD Title.");
    }

    public void displayDVD(DVDLibrary dvd) {
        if (dvd != null) {
            io.print(dvd.getItemId());
            io.print(dvd.getTitle());
            io.print(dvd.getReleaseDate().toString());
            io.print(dvd.getMpaaRating());
            io.print(dvd.getDirectorName());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
            
            io.print(" ");
        } else {
            io.print("No such DVD in your collection.");
        }
    }
    
    //**************************************************************************
    
    // Remove DVD
    public void displayRemoveDVDBanner() {
        io.print("=== Remove DVD ===");
    }
    //**************************************************************************
    
    // Edit DVD item
    public void dislpayEditDVDBanner(){
        io.print("=== Edit DVD ===");
    }
    
    public int displayEditDVDOptions(){
        io.print(" ");
        io.print("Which option would you like to change:");
        io.print("1. Title");
        io.print("2. Release Date");
        io.print("3. MPAA Rating");
        io.print("4. Director's name");
        io.print("5. Studio");
        io.print("6. User rating / notes");
        io.print("7. Cancel");

        return io.readInt("Please, select from the choices above: ", 1, 7);
    }
}
