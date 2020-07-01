/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.services;

import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.VendingMachine;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author dannylantigua
 */
public interface VendingMachineServiceLayer {

    String purchaseItem(VendingMachine item, BigDecimal cash) throws
            VendingMachinePersistenceException;

    List<VendingMachine> getAllItems() throws VendingMachinePersistenceException;

    VendingMachine getItem(String itemID) throws VendingMachinePersistenceException;
    
    String validateInventory(VendingMachine item) throws NoItemInventoryException;
    
    String validateFunds(VendingMachine item, BigDecimal cash) throws InsufficientFundsException;
}
