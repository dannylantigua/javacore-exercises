package com.sg.addressbook.ui;

import java.util.List;

import com.sg.addressbook.dto.AddressBook;

public class AddressBookView {

	private UserIO io;

	public AddressBookView(UserIO io) {
		this.io = io;
	}

	public int printMenuAndGetSelection() {

		io.print("=========================");
		io.print("Initial Menu:");
		io.print("   (Please select option)");
		io.print(" ");
		io.print("   1. Add Address");
		io.print("   2. Delete Address");
		io.print("   3. Find Address");
		io.print("   4. List Address Count");
		io.print("   5. List All Addresses");
		io.print("   6. Exit");

		return io.readInt("Please select from the above choices.", 1, 5);
	}

	public AddressBook getNewAddressInfo() {

		AddressBook thisAddress = new AddressBook(
				io.readString("Please enter AddressID:"));
		thisAddress.setFirstName(io.readString("Please enter First Name:"));
		thisAddress.setLastName(io.readString("Please enter Last Name:"));
		thisAddress.setStreetAddress(io.readString("Please enter Street Address:"));
		thisAddress.setCity(io.readString("Please enter City:"));
		thisAddress.setState(io.readString("Please enter State:"));
		thisAddress.setZipCode(io.readInt("Please enter Zip Code:"));
		return thisAddress;
	}

	public void displayAddresses(List<AddressBook> addressesList) {
		for (AddressBook thisAddress : addressesList) {
			io.print(thisAddress.getFirstName() + " " + thisAddress.getLastName());
			io.print(thisAddress.getStreetAddress());
			io.print(thisAddress.getCity() + ", " +
					thisAddress.getState() + ", " +
					thisAddress.getZipCode());
			io.print(" ");
		}
		io.readString("Please hit enter to continue.");
	}

	public void displayBanner(String msg) {
		io.print("=== " + msg + " Menu: ===");
	}

	public void generalMessageBanner(String msg) {
		io.readString(msg + "Please Hit enter to continue");
	}
}
