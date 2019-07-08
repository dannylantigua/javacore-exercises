package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoFileImpl;
import com.sg.classroster.dto.Student;

class ClassRosterDaoFileImplTest {

	private ClassRosterDao dao;

	public ClassRosterDaoFileImplTest() {
		dao = new ClassRosterDaoFileImpl();
	}

	@Before
	public void setUp() throws Exception {
		List<Student> studentList = dao.getAllStudents();
		for(Student student : studentList) {
			dao.removeStudent(student.getStudentId());
		}
	}

	@Test
	public void testAddGetStudend() throws Exception {
		// Add student
		Student student = new Student("0001");
		student.setFirstName("Joe");
		student.setLastName("Smith");
		student.setCohort("Java");

		dao.addStudent(student.getStudentId(), student);
		Student fromDao = dao.getStudent(student.getStudentId());
		assertEquals(student, fromDao);
	}

	@Test
	public void testGetAllStudent() throws Exception {
		// Add first student
		Student student1 = new Student("0001");
		student1.setFirstName("Joe");
		student1.setLastName("Smith");
		student1.setCohort("Java");
		dao.addStudent(student1.getStudentId(), student1);

		// Add second student
		Student student2 = new Student("0002");
		student2.setFirstName("John");
		student2.setLastName("Doe");
		student2.setCohort(".NET");
		dao.addStudent(student2.getStudentId(), student2);

		// Test it returns two records
		assertEquals(2, dao.getAllStudents().size());
	}

	@Test
	public void testRemoveStudent() throws Exception {
		// Add first student
		Student student1 = new Student("0001");
		student1.setFirstName("Joe");
		student1.setLastName("Smith");
		student1.setCohort("Java");
		dao.addStudent(student1.getStudentId(), student1);

		// Add second student
		Student student2 = new Student("0002");
		student2.setFirstName("John");
		student2.setLastName("Doe");
		student2.setCohort(".NET");
		dao.addStudent(student2.getStudentId(), student2);

		// Test remove second student
		dao.removeStudent(student2.getStudentId());
		assertEquals(1,  dao.getAllStudents().size());
		assertNull(dao.getStudent(student2.getStudentId()));

		// Test remove first student
		dao.removeStudent(student1.getStudentId());
		assertEquals(0,  dao.getAllStudents().size());
		assertNull(dao.getStudent(student1.getStudentId()));
	}

}
