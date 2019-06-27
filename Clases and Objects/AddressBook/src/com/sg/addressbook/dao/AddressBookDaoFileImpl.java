package com.sg.addressbook.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.sg.addressbook.dto.AddressBook;

public class AddressBookDaoFileImpl implements AddressBookDao {

	private Map<String, AddressBook> addressBook = new HashMap<>();
	public static final String ROSTER_FILE = "addressBook.txt";
	public static final String DELIMITER = "::";

	@Override
	public AddressBook addAddressBook(String lastName, AddressBook aBook) throws AddressBookDaoException {
		AddressBook thisAddress = addressBook.put(aBook.getLastName(), aBook);
		writeFile();
		return thisAddress;
	}

	@Override
	public AddressBook removeAddress(String lastName) throws AddressBookDaoException {
		AddressBook removedAddress = addressBook.remove(lastName);
		writeFile();
		return removedAddress;
	}

	@Override
	public List<AddressBook> findAddressByLastName(String lastName) throws AddressBookDaoException {
		loadFile();
		return new ArrayList<AddressBook>(addressBook
				.values()
				.stream()
				.filter(s -> s.getLastName().equalsIgnoreCase(lastName))
				.collect(Collectors.toList()));
	}

	@Override
	public int addressCount() {
		return addressBook.size();
	}

	@Override
	public List<AddressBook> listAllAddresses() throws AddressBookDaoException {
		loadFile();
		return new ArrayList<AddressBook>(addressBook.values());
	}

	private void loadFile() throws AddressBookDaoException {
		Scanner scanner;

		try {
			scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
		} catch (FileNotFoundException e) {
			throw new AddressBookDaoException("-_- Could not load roster data into memory.", e);
		}

		String currentLine;
		String[] currentTokens;
		while (scanner.hasNextLine()) {
			currentLine = scanner.nextLine();
			currentTokens = currentLine.split(DELIMITER);
			AddressBook thisAddress = new AddressBook(currentTokens[0]);
			thisAddress.setFirstName(currentTokens[1]);
			thisAddress.setStreetAddress(currentTokens[2]);
			thisAddress.setCity(currentTokens[3]);
			thisAddress.setState(currentTokens[4]);
			thisAddress.setZipCode(Integer.parseInt(currentTokens[5]));
			addressBook.put(thisAddress.getLastName(), thisAddress);
		}
		scanner.close();
	}

	private void writeFile() throws AddressBookDaoException {
		PrintWriter out;

		try {
			out = new PrintWriter(new FileWriter(ROSTER_FILE));
		} catch (IOException e) {
			throw new AddressBookDaoException("Could not save student data.", e);
		}

		List<AddressBook> addressesList = this.listAllAddresses();
		for(AddressBook thisAddress : addressesList) {
			out.println(thisAddress.getLastName() + DELIMITER
					+ thisAddress.getFirstName() + DELIMITER
					+ thisAddress.getStreetAddress() + DELIMITER
					+ thisAddress.getCity() + DELIMITER
					+ thisAddress.getState() + DELIMITER
					+ thisAddress.getZipCode());
			out.flush();
		}
		out.close();
	}
}
