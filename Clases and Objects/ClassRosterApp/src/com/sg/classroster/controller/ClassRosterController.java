package com.sg.classroster.controller;

import java.util.List;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterPersistenceException;
import com.sg.classroster.dto.Student;
import com.sg.classroster.ui.ClassRosterView;

public class ClassRosterController {

	private ClassRosterDao dao;
	private ClassRosterView view;

	public ClassRosterController(ClassRosterDao dao, ClassRosterView view) {
		this.dao = dao;
		this.view = view;
	}

	public void run() {
		boolean keepGoing = true;
		int menuSelection = 0;

		try {
			while (keepGoing) {

				menuSelection = getMenuSelection();

				switch (menuSelection) {
				case 1:
					listStudents();
					break;
				case 2:
					createStudent();
					break;
				case 3:
					viewStudent();
					break;
				case 4:
					removeStudent();
					break;
				case 5:
					keepGoing = false;
					break;
				default:
					unknownCommand();
				}
			}
			exitMessage();
		} catch (ClassRosterPersistenceException e) {
			view.displayErrorMessage(e.getMessage());
		}
	}

	private int getMenuSelection() {
		return view.printMenuAndGetSelection();
	}

	private void createStudent() throws ClassRosterPersistenceException {
		view.displayCreateStudentBanner();
		Student currentStudent = view.getNewStudentInfo();
		dao.addStudent(currentStudent.getStudentId(), currentStudent);
		view.displayCreateSuccessBanner();
	}

	private void listStudents() throws ClassRosterPersistenceException {
		view.displayDisplayAllBanner();
		List<Student> studentList = dao.getAllStudents();
		view.displayStudentList(studentList);
	}

	private void viewStudent() throws ClassRosterPersistenceException {
		view.displayDisplayStudentBanner();
		String studentId = view.getStudentIdChoice();
		Student student = dao.getStudent(studentId);
		view.displayStudent(student);
	}

	private void removeStudent() throws ClassRosterPersistenceException {
		view.displayRemoveStudentBanner();
		String studentId = view.getStudentIdChoice();
		dao.removeStudent(studentId);
		view.displayRemoveSuccessBanner();
	}

	private void unknownCommand() {
		view.displayUnknownCommandBanner();
	}

	private void exitMessage() {
		view.displayExitBanner();
	}
}
