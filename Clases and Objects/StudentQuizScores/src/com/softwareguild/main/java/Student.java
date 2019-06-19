package com.softwareguild.main.java;

import java.util.ArrayList;

/**
 *
 * @author usgdal
 * @since 06-19-2019
 */
public class Student {

	private transient String fullName;
	private transient int age;
	private transient ArrayList<Quiz> myQuizScores;

	public Student(String fullName, int age, ArrayList<Quiz> myQuizScores) {
		this.fullName = fullName;
		this.age = age;
		this.myQuizScores = myQuizScores;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Quiz> getMyQuizScores() {
		return myQuizScores;
	}

	public void setMyQuizScores(ArrayList<Quiz> myQuizScores) {
		this.myQuizScores = myQuizScores;
	}
}
