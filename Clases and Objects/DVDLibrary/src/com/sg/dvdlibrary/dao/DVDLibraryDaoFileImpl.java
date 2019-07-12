package com.sg.dvdlibrary.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sg.dvdlibrary.dto.DVDLibrary;

public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

	private Map<String, DVDLibrary> dvdCollection = new HashMap<>();
	public static final String FILE = "dvdCollection.txt";
	public static final String DELIMITER = "::";

	@Override
	public DVDLibrary addDVDToCollection(String title, DVDLibrary dvd) throws DVDLibraryDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DVDLibrary removeDVD(String title) throws DVDLibraryDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DVDLibrary> listAllDVDsInCollection() throws DVDLibraryDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DVDLibrary getDVD(String title) throws DVDLibraryDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DVDLibrary> findDVDByTitle(String title) throws DVDLibraryDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	private void loadFile() throws DVDLibraryDaoException {
		Scanner scanner;

		try {
			scanner = new Scanner(new BufferedReader(new FileReader(FILE)));
		} catch (FileNotFoundException e) {
			throw new DVDLibraryDaoException("-_- Could not load roster data into memory.", e);
		}

		String currentLine;
		String[] currentTokens;
		while (scanner.hasNextLine()) {
			currentLine = scanner.nextLine();
			currentTokens = currentLine.split(DELIMITER);
			DVDLibrary dvd = new DVDLibrary(currentTokens[0]);
			dvd.setReleaseDate(new Date(currentTokens[1]));
			dvd.setMpaaRating(currentTokens[2]);
			dvd.setDirectorName(currentTokens[3]);
			dvd.setStudio(currentTokens[4]);
			dvd.setUserRatingNotes(currentTokens[5]);
			dvdCollection.put(dvd.getTittle(), dvd);
		}
		scanner.close();
	}

	private void writeFile() throws DVDLibraryDaoException {
		PrintWriter out;

		try {
			out = new PrintWriter(new FileWriter(FILE));
		} catch (IOException e) {
			throw new DVDLibraryDaoException("Could not save student data.", e);
		}

		List<DVDLibrary> dvdList = this.listAllDVDsInCollection();
		for(DVDLibrary thisDvd : dvdList) {
			out.println(thisDvd.getTittle() + DELIMITER
					+ thisDvd.getReleaseDate() + DELIMITER
					+ thisDvd.getMpaaRating() + DELIMITER
					+ thisDvd.getDirectorName() + DELIMITER
					+ thisDvd.getStudio() + DELIMITER
					+ thisDvd.getUserRatingNotes());
			out.flush();
		}
		out.close();
	}
}
