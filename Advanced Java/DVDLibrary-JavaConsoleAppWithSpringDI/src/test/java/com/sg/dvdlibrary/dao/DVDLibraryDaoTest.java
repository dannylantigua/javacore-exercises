/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVDLibrary;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dannylantigua
 */
public class DVDLibraryDaoTest {
    
    DVDLibraryDao dao;
    
    public DVDLibraryDaoTest() throws DVDLibraryDaoException {
        dao = new DVDLibraryDaoStubsFileImpl();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addDvd method, of class DVDLibraryDao.
     */
    @Test
    public void testAddDvd() throws Exception {
        DVDLibrary dvd1 = Add1();
        dao.addDvd(dvd1.getTitle(), dvd1);
        
        DVDLibrary fromDao = dao.getDvdByTitle(dvd1.getTitle());
        assertEquals(dvd1, fromDao);
    }

    /**
     * Test of removeDvd method, of class DVDLibraryDao.
     */
    @Test
    public void testRemoveDvd() throws Exception {
        DVDLibrary dvd1 = Add1();
        DVDLibrary dvd2 = Add2();
        
        dao.addDvd(dvd1.getTitle(), dvd1);
        dao.addDvd(dvd2.getTitle(), dvd2);
        
        dao.removeDvd(dvd1.getTitle());
        assertEquals(1, dao.getAllDvd().size());
        assertNull(dao.getDvdByTitle(dvd1.getTitle()));

        dao.removeDvd(dvd2.getTitle());
        assertEquals(0, dao.getAllDvd().size());
        assertNull(dao.getDvdByTitle(dvd2.getTitle()));
    }

    /**
     * Test of getAllDvd method, of class DVDLibraryDao.
     */
    @Test
    public void testGetAllDvd() throws Exception {
        DVDLibrary dvd1 = Add1();
        DVDLibrary dvd2 = Add2();
        
        dao.addDvd(dvd1.getTitle(), dvd1);
        dao.addDvd(dvd2.getTitle(), dvd2);
        assertEquals(2, dao.getAllDvd().size());
    }

    /**
     * Test of getDvdByTitle method, of class DVDLibraryDao.
     */
    @Test
    public void testGetDvdByTitle() throws Exception {
    }
    
    public DVDLibrary Add1() throws DVDLibraryDaoException{
        DVDLibrary dvd1 = new DVDLibrary("001");
        dvd1.setTitle("Carpinteros");
        dvd1.setDirectorName("Jose Maria Cabral");
        dvd1.setMpaaRating("PG-13");
        dvd1.setReleaseDate(LocalDate.parse("2017-05-01"));
        dvd1.setStudio("Studio 1");
        dvd1.setUserRating("Absolutely surprising!");
        
        return dvd1;
    }
    
    public DVDLibrary Add2() throws DVDLibraryDaoException{
        DVDLibrary dvd2 = new DVDLibrary("002");
        dvd2.setTitle("Jaque Mate");
        dvd2.setDirectorName("Jose Maria Cabral");
        dvd2.setMpaaRating("PG-13");
        dvd2.setReleaseDate(LocalDate.parse("2014-05-01"));
        dvd2.setStudio("Studio 2");
        dvd2.setUserRating("It's alright");
        
        return dvd2;
    }
    
}
