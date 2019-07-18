package com.sg.dvdlibrary.ui;

import java.time.LocalDate;
import java.util.List;

import com.sg.dvdlibrary.dto.DVDLibrary;

public class DVDLibraryView {

	private UserIO io;

	public DVDLibraryView(UserIO io) {
		this.io = io;
	}

	public int printMenuAndGetSelection() {

		io.print("=========================");
		io.print("Initial Menu:");
		io.print("   (Please select option)");
		io.print(" ");
		io.print("   1. Add DVD to Collection");
		io.print("   2. Remove DVD from Collection");
		io.print("   3. Update DVD on Collection");
		io.print("   4. List All DVDs");
		io.print("   5. Search DVDs by title");
		io.print("   6. Exit");

		return io.readInt("Please select from the above choices.", 1, 6);
	}

	public DVDLibrary getNewDVDInfo() {

		LocalDate ld;
		DVDLibrary thisDvd = new DVDLibrary(
				io.readString("Please enter Title:"));
		thisDvd.setDirectorName(io.readString("Please enter Director's Name:"));
		thisDvd.setMpaaRating(io.readString("Please enter MpaaRating:"));
		ld = LocalDate.parse(io.readString("Please enter Release Date (ddMMyyyy):"));
		thisDvd.setReleaseDate(ld);
		thisDvd.setStudio(io.readString("Please enter Studio:"));
		thisDvd.setUserRatingNotes(io.readString("Please enter any comments or review:"));
		return thisDvd;
	}

	/*public DVDLibrary getDVDInfo(DVDLibrary dvd) {

		DVDLibrary thisDvd = new DVDLibrary(
				io.readString("Please enter Title ("+ dvd.getTittle() +"):"));
		thisDvd.setDirectorName(io.readString("Please enter Director's Name ("+ dvd.getDirectorName() +"):"));
		thisDvd.setMpaaRating(io.readString("Please enter MpaaRating ("+ dvd.getMpaaRating() +"):"));
		thisDvd.setReleaseDate(new Date(io.readString("Please enter Release Date ["+
				dvd.getReleaseDate().toString() +"] (ddMMyyyy):")));
		thisDvd.setStudio(io.readString("Please enter Studio ("+ dvd.getStudio() +"):"));
		thisDvd.setUserRatingNotes(io.readString("Please enter any comments or review ("+ dvd.getUserRatingNotes() +"):"));
		return thisDvd;
	}*/

	public void displayDVDs(List<DVDLibrary> dvdCollection) {
		for (DVDLibrary thisDvd : dvdCollection) {
			io.print(thisDvd.getTittle() + " - " + thisDvd.getReleaseDate().toString() + " - Rated " +
					thisDvd.getMpaaRating());
			io.print(thisDvd.getDirectorName());
			io.print(thisDvd.getStudio());
			io.print(thisDvd.getUserRatingNotes());
			io.print(" ");
		}
		io.readString("Please hit enter to continue.");
	}

	public void displayMessage(String msg) {
		io.print(msg);
	}

	public String displayMessageValue(String msg, boolean op) {
		if (op)
			return io.readString(msg + "Please Hit enter to continue");
		else
			return io.readString(msg);
	}
}
