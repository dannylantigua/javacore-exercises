package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryDaoException;
import com.sg.dvdlibrary.dto.DVDLibrary;
import com.sg.dvdlibrary.ui.DVDLibraryView;

public class DVDLibraryController {

	private DVDLibraryDao dao;
	private DVDLibraryView view;

	public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
		this.dao = dao;
		this.view = view;
	}

	public void run() {
		boolean keepGoing = true;
		int getMenu = 0;
		try {
			while(keepGoing) {
				getMenu = getMenuSelection();
				switch(getMenu) {
				case 1:
					addDVDtoCollection();
					break;
				case 2:
					removeDVDFromCollection();
					break;
				case 3:
					updateDVDInfo();
					break;
				case 4:
					listAllDVDsInCollection();
					break;
				case 5:
					searchDVDsByTitle();
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
			view.displayMessage("=== ERROR ===");
			view.displayMessage(e.getMessage());
		}
	}

	private void addDVDtoCollection() throws DVDLibraryDaoException {
		view.displayMessage(" ** Add DVD to Collection Menu:");
		DVDLibrary dvd = view.getNewDVDInfo();
		dao.addDVDToCollection(dvd.getTittle(), dvd);
		view.displayMessageValue("DVD added to Collection. ", true);
	}

	private void removeDVDFromCollection() throws DVDLibraryDaoException {
		view.displayMessage(" ** Remove DVD from Collection Menu:");
		String title = view.displayMessageValue("Please enter the Title of the DVD to delete: ", false);
		DVDLibrary dvd = dao.getDVD(title);
		if (view.displayMessageValue("Are you sure you want to delete this DVD? (Y/N)", false)
				.equalsIgnoreCase("Y")) {
			dao.removeDVD(dvd.getTittle());
			view.displayMessageValue("DVD deleted from Collection. ", true);
		}
	}

	private void updateDVDInfo() throws DVDLibraryDaoException {
		/*view.displayMessage(" ** Update DVD Menu:");
		String title = view.displayMessageValue("Please enter the Title of the DVD to update: ", false);
		DVDLibrary dvd = view.getDVDInfo(dao.getDVD(title));
		dao.addDVDToCollection(dvd.getTittle(), dvd);
		view.displayMessageValue("DVD updated successfully. ", true);*/
	}

	private void listAllDVDsInCollection() throws DVDLibraryDaoException {
		view.displayMessage(" ** List DVDs in Collection Menu:");
		view.displayDVDs(dao.listAllDVDsInCollection());
		view.displayMessageValue("", true);
	}

	private void searchDVDsByTitle() throws DVDLibraryDaoException {
		view.displayMessage(" ** Search DVDs by Title Menu:");
		String title = view.displayMessageValue("Please enter the Title: ", false);
		view.displayDVDs(dao.findDVDByTitle(title));
		view.displayMessageValue("", true);
	}

	private int getMenuSelection() {
		return view.printMenuAndGetSelection();
	}

	private void unknownCommand() {
		view.displayMessage("Unknown Command.");
	}

	private void exitMessage() {
		view.displayMessage("GOOD BYE!");
	}
}
