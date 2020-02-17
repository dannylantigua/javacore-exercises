/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.VendingMachine;
import com.sg.vendingmachine.services.InsufficientFundsException;
import com.sg.vendingmachine.services.NoItemInventoryException;
import com.sg.vendingmachine.services.VendingMachineServiceLayer;
import com.sg.vendingmachine.ui.*;
import static java.lang.Integer.parseInt;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author dannylantigua
 */
public class VendingMachineController {

    VendingMachineView view;
    VendingMachineServiceLayer service;
    private UserIO io = new UserIOConsoleImpl();
    BigDecimal cash = new BigDecimal("0");

    public VendingMachineController(VendingMachineView view, VendingMachineServiceLayer service) {
        this.view = view;
        this.service = service;
    }

    public void run() throws
            VendingMachinePersistenceException, InsufficientFundsException, NoItemInventoryException {

        String selection;

        // Load all the items from Inventory and Display them
        List<VendingMachine> items = DisplaytMenuItems();

        // Ask for the client to insert cash
        insertCash();

        // Ask for the client to select an Item from the machine
        selection = getItemsSelection(items);

        // Validate selection to either exit program or proceed with the purchase
        if (selection.equalsIgnoreCase("0")) {
            exitMessage();
        } else {

            // Don't let it go through if the item is not in the list
            if ( items.stream()
                    .filter(s -> s.getItemID().equalsIgnoreCase(selection))
                    .collect(Collectors.toList()).size() > 0 ) {
                buyItemfromMachine(selection);
                exitMessage();
            } else {
                unknownCommand();
                exitMessage();
            }
        }
    }

    private List DisplaytMenuItems() throws VendingMachinePersistenceException {

        // Display Greetings
        view.displayGreeting();

        // Load all Items from inventory
        List<VendingMachine> items = service.getAllItems();

        // Display all items for the client
        view.displayAllItemsInInventory(items);
        return items;
    }

    private String getItemsSelection(List<VendingMachine> items) {

        // Display Banner
        view.displayChooseItemBanner();

        // Ask the client for the item to purchase
        String s = io.readString("Enter item number: ");
        return s;
    }

    private void insertCash() {

        // Display Banner
        view.displayInsertCashBanner();

        // Ask the client to insert cash
        cash = view.insertCash(cash);
    }

    private void buyItemfromMachine(String Item) throws
            InsufficientFundsException, NoItemInventoryException, VendingMachinePersistenceException {

        String rs = "";

        // Instanciating or creating a new object of the item the client wants to purchase
        // from the list of Items on inventory
        VendingMachine currentItem = service.getItem(Item);

        // Proceed with the validations 
        rs = service.validateInventory(currentItem);
        if (rs.equalsIgnoreCase("")){
            rs = service.validateFunds(currentItem, cash);
            if (rs.equalsIgnoreCase("")){
                // Subtract items in inventory and give change back to client
                rs = service.purchaseItem(currentItem, cash);
            }
        }
        
        // Display results of the purchase (change)
        if (rs.equalsIgnoreCase("Purchase not made.")) {
        } else if (rs != "") {
            view.displayPurchaseSuccess(cash.subtract(currentItem.getItemCost()), rs);
        }
    }

    private void errorMessage() {
        view.displayErrorMessage("Purchase could not be made");
    }

    // Exit
    private void exitMessage() {
        view.displayExitBaner();
    }

    // Unknown command
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

}
