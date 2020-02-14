/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.sg.vendingmachine.dao;

import main.java.com.sg.vendingmachine.dto.VendingMachine;
import java.util.List;

/**
 *
 * @author dannylantigua
 */
public interface VendingMachineDao {

    boolean updateItem(String itemID)
            throws VendingMachinePersistenceException;

    List<VendingMachine> getAllItems() throws VendingMachinePersistenceException;

    VendingMachine getItem(String itemID) throws VendingMachinePersistenceException;
}
