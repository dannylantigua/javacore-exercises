/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVDLibrary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author dannylantigua
 */
public class DVDLibraryDaoStubsFileImpl implements DVDLibraryDao {

    private Map<String, DVDLibrary> dvdLibrary = new HashMap<>();

    @Override
    public DVDLibrary addDvd(String itemId, DVDLibrary dvd) throws DVDLibraryDaoException {
        DVDLibrary dvdL = dvdLibrary.put(itemId, dvd);
        return dvdL;
    }

    @Override
    public DVDLibrary removeDvd(String itemId) throws DVDLibraryDaoException {
        DVDLibrary removedDvd = dvdLibrary.remove(itemId);
        return removedDvd;
    }

    @Override
    public List<DVDLibrary> getAllDvd() throws DVDLibraryDaoException {
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
}
