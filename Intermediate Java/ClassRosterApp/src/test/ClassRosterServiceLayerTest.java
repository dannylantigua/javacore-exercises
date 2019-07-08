package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterAuditDaoStubImpl;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoStubImpl;
import com.sg.classroster.dto.Student;
import com.sg.classroster.service.ClassRosterDataValidationException;
import com.sg.classroster.service.ClassRosterDuplicateIdException;
import com.sg.classroster.service.ClassRosterServiceLayer;
import com.sg.classroster.service.ClassRosterServiceLayerImpl;

class ClassRosterServiceLayerTest {

	private ClassRosterServiceLayer service;

	public ClassRosterServiceLayerTest() {
		ClassRosterDao dao = new ClassRosterDaoStubImpl();
		ClassRosterAuditDao auditDao = new ClassRosterAuditDaoStubImpl();

		service = new ClassRosterServiceLayerImpl(dao, auditDao);
	}

	@Test
	public void testCreateStudent() throws Exception {
		Student student = new Student("0002");
		student.setFirstName("Sally");
		student.setLastName("Smith");
		student.setCohort("Java-Jan-2015");
		service.createStudent(student);
	}

	@Test
	public void testCreateStudentDuplicatedId() throws Exception {
		Student student = new Student("0001");
		student.setFirstName("Sally");
		student.setLastName("Smith");
		student.setCohort("Java-Jan-2015");

		try {
			service.createStudent(student);
			fail("Expected ClassRosterDuplicateIdException was not thrown.");
		} catch (ClassRosterDuplicateIdException e) {
			return;
		}
	}

	@Test
	public void testCreateStudentInvalidDate() throws Exception {
		Student student = new Student("0002");
		student.setFirstName("");
		student.setLastName("Smith");
		student.setCohort("Java-Jan-2015");

		try {
			service.createStudent(student);
			fail("Expected ClassRosterDataValidationException was not thrown.");
		} catch (ClassRosterDataValidationException e) {
			return;
		}
	}

	@Test
	public void testGetAllStudents() throws Exception {
		assertEquals(1, service.getAllStudents().size());
	}

	@Test
	public void testGetStudent() throws Exception {
		Student student = service.getStudent("0001");
		assertNotNull(student);
		student = service.getStudent("9999");
		assertNull(student);
	}

	@Test
	public void testRemoveStudent() throws Exception {
		Student student = service.getStudent("0001");
		assertNotNull(student);
		student = service.getStudent("9999");
		assertNull(student);
	}
}
