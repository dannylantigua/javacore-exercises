/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DVDLibraryController;
import com.sg.dvdlibrary.dao.*;
import com.sg.dvdlibrary.ui.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dannylantigua
 */
public class App {
    public static void main(String[] args) throws DVDLibraryDaoException {
        /*UserIO myIo = new UserIOConsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIo);
        DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
        DVDLibraryController controller = 
                   new DVDLibraryController(myDao, myView);*/
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DVDLibraryController controller = ctx.getBean("controller", DVDLibraryController.class);
        controller.runApp();
    }
}
