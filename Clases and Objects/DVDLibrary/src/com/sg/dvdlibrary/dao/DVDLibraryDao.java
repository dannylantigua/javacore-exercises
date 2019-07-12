package com.sg.dvdlibrary.dao;

import java.util.List;

import com.sg.dvdlibrary.dto.DVDLibrary;

public interface DVDLibraryDao {

	DVDLibrary addDVDToCollection(String title, DVDLibrary dvd)
			throws DVDLibraryDaoException;

	DVDLibrary removeDVD(String title) throws DVDLibraryDaoException;

	List<DVDLibrary> listAllDVDsInCollection() throws DVDLibraryDaoException;

	DVDLibrary getDVD(String title) throws DVDLibraryDaoException;

	List<DVDLibrary> findDVDByTitle(String title) throws DVDLibraryDaoException;
}
