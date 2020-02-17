/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

import com.sg.flooringmastery.dao.FlooringMasteryPersistenceException;
import com.sg.flooringmastery.dto.Orders;
import com.sg.flooringmastery.dto.Products;
import com.sg.flooringmastery.dto.Taxes;
import java.util.List;

/**
 *
 * @author dannylantigua
 */
public interface FlooringMasteryServiceLayer {
    
    List<Orders> getAllOrders(String date, String lastDateInserted) throws FlooringMasteryPersistenceException;
    
    List<Products> getProducts() throws FlooringMasteryPersistenceException;
    
    List<Taxes> getTaxes() throws FlooringMasteryPersistenceException;
    
    Orders addOrder(Orders order, String todayDate, String lastDateInserted) throws FlooringMasteryPersistenceException;
    
    Orders getOrderByOrderNumber(String orderNumber, String date, String lastDateInserted) throws FlooringMasteryPersistenceException;
    
    Orders updateOrder(String orderNummber, String date, Orders order) throws FlooringMasteryPersistenceException;
    
    Orders removeOrder(String orderNumber, String date) throws FlooringMasteryPersistenceException;
    
    boolean saveCurrentWork(String date) throws FlooringMasteryPersistenceException;

    Orders completeAddingNewOrder(Orders currentOrder) throws FlooringMasteryPersistenceException;
}
