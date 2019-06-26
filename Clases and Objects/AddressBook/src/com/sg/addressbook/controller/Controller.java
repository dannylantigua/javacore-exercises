package com.sg.addressbook.controller;

import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoException;
import com.sg.addressbook.ui.AddressBookView;

public class Controller {

	private AddressBookDao dao;
	private AddressBookView view;

	public Controller(AddressBookDao dao, AddressBookView view) {
		this.dao = dao;
		this.view = view;
	}

	public void run() {

	}

	private void removeStudent() throws AddressBookDaoException {
		view.displayBanner("Remove Address");
		/*String addressId = view.getStudentIdChoice();
		dao.removeStudent(studentId);*/
		view.generalMessageBanner("Address Deleted. ");
	}
}
