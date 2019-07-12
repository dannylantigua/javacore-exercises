package com.softwareguild.main;

/**
 *
 * @author usgdal
 * @since 06-19-2019
 */
public class Quiz {

	private transient Quizes quizName;
	private transient int quizScore;

	public Quiz(Quizes quizName, int quizScore) {
		this.quizName = quizName;
		this.quizScore = quizScore;
	}

	public Quizes getQuizName() {
		return quizName;
	}

	public void setQuizName(Quizes quizName) {
		this.quizName = quizName;
	}

	public int getQuizScore() {
		return quizScore;
	}

	public void setQuizScore(int quizScore) {
		this.quizScore = quizScore;
	}
}
