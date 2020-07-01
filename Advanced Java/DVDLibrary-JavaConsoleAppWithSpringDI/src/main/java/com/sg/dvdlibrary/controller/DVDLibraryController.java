/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.*;
import com.sg.dvdlibrary.dto.DVDLibrary;
import com.sg.dvdlibrary.ui.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author dannylantigua
 */
public class DVDLibraryController {

    DVDLibraryView view;
    DVDLibraryDao dao;
    UserIO io = new UserIOConsoleImpl();

    public DVDLibraryController(DVDLibraryDao dao,
            DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

    // Main code
    public void runApp() {
        boolean keepGoing = true;
        int menuSelection = 0;

        try {
            while (keepGoing) {
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listDvdCollection();
                        break;
                    case 2:
                        searchDvdByTitle();
                        break;
                    case 3:
                        addDVD();
                        break;
                    case 4:
                        editDvd();
                        break;
                    case 5:
                        removeDvd();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        } catch (DVDLibraryDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    // Menu Options
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    // Unknown command
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    // Exit
    private void exitMessage() {
        view.displayExitBaner();
    }

    // MENU OPTIONS
    //**************************************************************************
    // Add New Dvd
    public void addDVD() throws DVDLibraryDaoException {
        view.displayAddDVDBanner();
        DVDLibrary thisDvd = view.getNewDVDInfo();
        dao.addDvd(thisDvd.getTitle(), thisDvd);
        view.displaySuccessBanner("DVD successfully added to the collection. ");
    }

    // List DVD Library Collection
    public void listDvdCollection() throws DVDLibraryDaoException {
        view.dislpayDisplayAllBanner();
        List<DVDLibrary> dvdList = dao.getAllDvd();
        view.displayDvdCollection(dvdList);
        view.displaySuccessBanner("");
    }

    // Search DVD item by TITLE
    private void searchDvdByTitle() throws DVDLibraryDaoException {
        view.displayDisplayDVD2Banner();
        String dvdTitle = view.getDVDTitleChoice();
        DVDLibrary dvd = dao.getDvdByTitle(dvdTitle);
        view.displayDVD(dvd);
        view.displaySuccessBanner("");
    }

    // Remove a single DVD item
    private void removeDvd() throws DVDLibraryDaoException {
        view.displayRemoveDVDBanner();
        String dvdT = view.getDVDTitleChoice();
        DVDLibrary dvd = dao.getDvdByTitle(dvdT);
        dao.removeDvd(dvd.getTitle());
        view.displaySuccessBanner("DVD successfully removed from collection. ");
    }

    // Edit a single DVD Item
    private void editDvd() throws DVDLibraryDaoException {

        view.dislpayEditDVDBanner();
        String dvdT = view.getDVDTitleChoice();
        DVDLibrary dvd = dao.getDvdByTitle(dvdT);
        view.displayDVD(dvd);
        int optionSelected = view.displayEditDVDOptions();

        switch (optionSelected) {
            case 1:
                dvd.setTitle(io.readString("Insert New Title: "));
                break;
            case 2:
                String date1 = io.readString("Insert New Release Date (MM/DD/YYYY): ");
                dvd.setReleaseDate(LocalDate.parse(date1, DateTimeFormatter.ofPattern("MM/dd/yyyy")));
                break;
            case 3:
                dvd.setMpaaRating(io.readString("Insert New MPAA Rationg: "));
                break;
            case 4:
                dvd.setDirectorName(io.readString("Insert New Director's Name: "));
                break;
            case 5:
                dvd.setStudio(io.readString("Insert New Studio: "));
                break;
            case 6:
                dvd.setUserRating(io.readString("Insert New User Rating: "));
                break;
            case 7:
                break;
            default:
                unknownCommand();
        }

        dao.addDvd(dvd.getItemId(), dvd);
        view.displaySuccessBanner("DVD successfully edited. ");
    }
}
