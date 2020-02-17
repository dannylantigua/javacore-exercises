/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVDLibrary;
import com.sg.dvdlibrary.ui.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author dannylantigua
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

    public static final String COLLECTION_FILE = "dvdcollection.txt";
    public static final String DELIMITER = "::";
    private Map<String, DVDLibrary> dvdLibrary = new HashMap<>();

    public DVDLibraryDaoFileImpl() throws DVDLibraryDaoException {
        loadCollection();
    }

    @Override
    public DVDLibrary addDvd(String itemId, DVDLibrary dvd)
            throws DVDLibraryDaoException {
        DVDLibrary dvdL = dvdLibrary.put(itemId, dvd);
        writeCollection();
        return dvdL;
    }

    @Override
    public DVDLibrary removeDvd(String itemId) throws DVDLibraryDaoException {
        DVDLibrary removedDvd = dvdLibrary.remove(itemId);
        writeCollection();
        return removedDvd;
    }

    @Override
    public List<DVDLibrary> getAllDvd()
            throws DVDLibraryDaoException {
        return dvdLibrary.values().stream().collect(Collectors.toList());
    }

    @Override
    public DVDLibrary getDvdByTitle(String title) throws DVDLibraryDaoException {
        List<DVDLibrary> myList = dvdLibrary.values()
                .stream()
                .filter(s -> s.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());

        DVDLibrary myDVD;
        if (myList.size() > 0) {
            myDVD = myList.get(0);
        } else {
            myDVD = null;
        }
        return myDVD;
    }

    private void loadCollection() throws DVDLibraryDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(COLLECTION_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException(
                    "-_- Could not load Dvd Library data into memory.", e);
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            DVDLibrary currentDvd = new DVDLibrary(currentTokens[0]);
            currentDvd.setTitle(currentTokens[1]);

            //System.out.println(LocalDate.parse(currentTokens[2].toString()));
            //, DateTimeFormatter.ofPattern("YYYY-MM-DD")));
            currentDvd.setReleaseDate(LocalDate.parse(currentTokens[2]));

            //, DateTimeFormatter.ofPattern("MM/DD/YYYY")));
            currentDvd.setMpaaRating(currentTokens[3]);
            currentDvd.setDirectorName(currentTokens[4]);
            currentDvd.setStudio(currentTokens[5]);
            currentDvd.setUserRating(currentTokens[6]);

            dvdLibrary.put(currentDvd.getTitle(), currentDvd);
        }
        scanner.close();
    }

    private void writeCollection() throws DVDLibraryDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(COLLECTION_FILE));
        } catch (IOException e) {
            throw new DVDLibraryDaoException(
                    "Could not save DVD data.", e);
        }

        List<DVDLibrary> dvdList = this.getAllDvd();
        for (DVDLibrary currentDvd : dvdList) {
            out.println(currentDvd.getItemId() + DELIMITER
                    + currentDvd.getTitle() + DELIMITER
                    + currentDvd.getReleaseDate().toString() + DELIMITER
                    + currentDvd.getMpaaRating() + DELIMITER
                    + currentDvd.getDirectorName() + DELIMITER
                    + currentDvd.getStudio() + DELIMITER
                    + currentDvd.getUserRating());

            out.flush();
        }
        out.close();
    }

}
