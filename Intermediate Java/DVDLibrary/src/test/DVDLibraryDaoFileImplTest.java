package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.dvdlibrary.dto.DVDLibrary;

class DVDLibraryDaoFileImplTest {

	private DVDLibraryDao dao;

	public DVDLibraryDaoFileImplTest() {
		dao = new DVDLibraryDaoFileImpl();
	}

	@Before
	public void setUp() throws Exception {
		List<DVDLibrary> collection = dao.listAllDVDsInCollection();
		for (DVDLibrary dvd : collection) {
			dao.removeDVD(dvd.getTittle());
		}
	}

	public DVDLibrary dvd1() {
		LocalDate ld;
		DVDLibrary dvd1 = new DVDLibrary("Before the Devil Knows You're Dead");
		dvd1.setDirectorName("Sidney Lumet");
		dvd1.setMpaaRating("R");
		ld = LocalDate.parse("06/10/2007");
		dvd1.setReleaseDate(ld);
		dvd1.setStudio("Capitol Films");
		dvd1.setUserRatingNotes("Very good.");
		return dvd1;
	}

	public DVDLibrary dvd2() {
		LocalDate ld;
		DVDLibrary dvd2 = new DVDLibrary("Rust and Bone");
		dvd2.setDirectorName("Jacques Audiard");
		dvd2.setMpaaRating("R");
		ld = LocalDate.parse("17/05/2012");
		dvd2.setReleaseDate(ld);
		dvd2.setStudio("Why Not Productions");
		dvd2.setUserRatingNotes("Excellent piece.");
		return dvd2;
	}

	@Test
	void testAddFindDVDInCollection() throws Exception {
		DVDLibrary dvd1 = dvd1();
		dao.addDVDToCollection(dvd1.getTittle(), dvd1);

		DVDLibrary fromDao = dao.getDVD(dvd1.getTittle());
		assertEquals(dvd1, fromDao);
	}

	//@Test
	public void testUpdateDVD() throws Exception {

	}

	@Test
	public void testRemoveDVD() throws Exception {
		DVDLibrary dvd1 = dvd1();
		dao.addDVDToCollection(dvd1.getTittle(), dvd1);
		DVDLibrary dvd2 = dvd2();
		dao.addDVDToCollection(dvd2.getTittle(), dvd2);

		dao.removeDVD(dvd1.getTittle());
		assertEquals(1, dao.listAllDVDsInCollection().size());
		assertNull(dao.getDVD(dvd1.getTittle()));

		dao.removeDVD(dvd2.getTittle());
		assertEquals(0, dao.listAllDVDsInCollection().size());
		assertNull(dao.getDVD(dvd2.getTittle()));
	}
}
