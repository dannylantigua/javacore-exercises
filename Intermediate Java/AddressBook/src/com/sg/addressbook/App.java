package com.sg.addressbook;

import com.sg.addressbook.controller.Controller;
import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoFileImpl;
import com.sg.addressbook.ui.AddressBookView;
import com.sg.addressbook.ui.UserIO;
import com.sg.addressbook.ui.UserIOConsoleImpl;

public class App {

	public static void main(String[] args) {
		UserIO myIo = new UserIOConsoleImpl();
		AddressBookView myView = new AddressBookView(myIo);
		AddressBookDao myDao = new AddressBookDaoFileImpl();
		Controller controller = new Controller(myDao, myView);
		controller.run();
	}
}
