package com.softwareguild.main.dao;

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

import com.sg.dvdlibrary.dao.DVDLibraryDaoException;
import com.sg.dvdlibrary.dto.DVDLibrary;
import com.softwareguild.main.model.Quizes;
import com.softwareguild.main.model.Student;

public class StudentQuizesDaoFileImpl implements StudentQuizesDao {

	public static final String COLLECTION_FILE = "studentquizes.txt";
	public static final String DELIMITER = "::";
	private Map<String, Quizes> quizesList = new HashMap<>();

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student removeStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	private void loadCollection() throws Exception {
		Scanner scanner;

		try {
			scanner = new Scanner(
					new BufferedReader(
							new FileReader(COLLECTION_FILE)));
		} catch (FileNotFoundException e) {
			throw new Exception(
					"-_- Could not load data into memory.", e);
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
