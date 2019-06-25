package com.softwareguild.main.dao;

import java.util.List;

import com.softwareguild.main.model.Student;

/**
 *
 * @author usgdal
 * @since 06-20-2019
 */
public interface StudentQuizesDao {

	Student addStudent(Student student);

	Student removeStudent(String name);

	List<Student> getAllStudents();

	Student getStudent(String name);
}
