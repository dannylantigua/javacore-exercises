/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVDLibrary;
import java.util.List;

/**
 *
 * @author dannylantigua
 */
public interface DVDLibraryDao {
    // Add new dvd to collection
    DVDLibrary addDvd(String itemId, DVDLibrary dvd)
            throws DVDLibraryDaoException;
    
    // Remove dvd from collection
    DVDLibrary removeDvd(String itemId)
            throws DVDLibraryDaoException;
    
    // List all DVDs in the collection
    List<DVDLibrary> getAllDvd()
            throws DVDLibraryDaoException;
    
    // List a DVD's infor by title
    DVDLibrary getDvdByTitle(String title)
            throws DVDLibraryDaoException;
}
