package com.sg.classroster;

import com.sg.classroster.controller.ClassRosterController;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;

public class App {

	public static void main(String[] args) {
		// Instantiate the UserIO implementation
		UserIO myIo = new UserIOConsoleImpl();
		// Instantiate the View and wire the UserIO implementation into it
		ClassRosterView myView = new ClassRosterView(myIo);
		// Instantiate the DAO
		ClassRosterDao myDao = new ClassRosterDaoFileImpl();
		// Instantiate the Controller and wire the Service Layer into it
		ClassRosterController controller = new ClassRosterController(myDao, myView);
		// Kick off the Controller
		controller.run();
	}
}
