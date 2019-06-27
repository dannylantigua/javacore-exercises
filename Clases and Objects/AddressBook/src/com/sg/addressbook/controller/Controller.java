package com.sg.addressbook.controller;

import java.util.List;

import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoException;
import com.sg.addressbook.dto.AddressBook;
import com.sg.addressbook.ui.AddressBookView;

public class Controller {

	private AddressBookDao dao;
	private AddressBookView view;

	public Controller(AddressBookDao dao, AddressBookView view) {
		this.dao = dao;
		this.view = view;
	}

	public void run() {
		boolean keepGoing = true;
		int menuSelection = 0;
		try {
			while(keepGoing) {
				menuSelection = getMenuSelection();
				switch(menuSelection) {
				case 1:
					addAddress();
					break;
				case 2:
					removeAddress();
					break;
				case 3:
					findAddress();
					break;
				case 4:
					listAddressCount();
					break;
				case 5:
					listAllAddresses();
					break;
				case 6:
					keepGoing = false;
					break;
				default:
					unknownCommand();
				}
			}
			exitMessage();
		} catch (AddressBookDaoException e) {
			view.displayMessage("=== ERROR ===");
			view.displayMessage(e.getMessage());
		}
	}

	private int getMenuSelection() {
		return view.printMenuAndGetSelection();
	}

	private void addAddress() throws AddressBookDaoException {
		view.displayMessage(" ** Add Address Menu:");
		AddressBook newAddBook = view.getNewAddressInfo();
		dao.addAddressBook(newAddBook.getLastName(), newAddBook);
		view.displayMessageValue("Address added. ", true);
	}

	private void removeAddress() throws AddressBookDaoException {
		view.displayMessage(" ** Remove Address Menu:");
		String lastName = view.displayMessageValue("Please enter last name of address to delete: ", false);
		List<AddressBook> myList= dao.findAddressByLastName(lastName);
		view.displayAddresses(myList);
		if (view.displayMessageValue("Really Delete? (Y/N)", false)
				.equalsIgnoreCase("Y")) {
			dao.removeAddress(lastName);
			view.displayMessageValue("Address Deleted. ", true);
		}
	}

	private void findAddress() throws AddressBookDaoException {
		view.displayMessage(" ** Find Address Menu:");
		String lastName = view.displayMessageValue("Please enter last name of address to find: ", false);
		List<AddressBook> myList= dao.findAddressByLastName(lastName);
		view.displayAddresses(myList);
		view.displayMessageValue("", true);
	}

	private void listAddressCount() throws AddressBookDaoException {
		view.displayMessage(" ** List Address Count Menu:");
		view.displayMessageValue("There is/are " +
				dao.addressCount() + " address/es in the book", true);
	}

	private void listAllAddresses() throws AddressBookDaoException {
		view.displayMessage(" ** List Addresses Menu:");
		List<AddressBook> myList = dao.listAllAddresses();
		view.displayAddresses(myList);
		view.displayMessageValue("", true);
	}

	private void unknownCommand() {
		view.displayMessage("Unknown Command.");
	}

	private void exitMessage() {
		view.displayMessage("GOOD BYE!");
	}
}
