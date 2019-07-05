package com.sg.addressbook.dao;

import java.util.List;

import com.sg.addressbook.dto.AddressBook;

public interface AddressBookDao {

	AddressBook addAddressBook(String lastName, AddressBook addressBook)
			throws AddressBookDaoException;

	AddressBook removeAddress(String lastName) throws AddressBookDaoException;

	List<AddressBook> findAddressByLastName(String lastName) throws AddressBookDaoException;

	int addressCount();

	List<AddressBook> listAllAddresses() throws AddressBookDaoException;
}
