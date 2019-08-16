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

	List<DVDLibrary> getDVDsInNYears(int years) throws DVDLibraryDaoException;

	List<DVDLibrary> getDVDsByMPPA(String mpaa) throws DVDLibraryDaoException;

	List<DVDLibrary> getDVDsByDirector(String director) throws DVDLibraryDaoException;

	List<DVDLibrary> getDVDsByStudio(String studio) throws DVDLibraryDaoException;

	List<DVDLibrary> getDVDNewest() throws DVDLibraryDaoException;

	List<DVDLibrary> getDVDOldest() throws DVDLibraryDaoException;

	List<DVDLibrary> getDVDsWithNotes() throws DVDLibraryDaoException;

	int getDVDsAverageAge() throws DVDLibraryDaoException;
}
