/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.*;
import java.util.List;

/**
 *
 * @author dannylantigua
 */
public interface FlooringMasteryDao {
    
    List<Orders> getAllOrders(String date, String lastDateInserted) throws FlooringMasteryPersistenceException;
    
    List<Products> getProducts() throws FlooringMasteryPersistenceException;
    
    List<Taxes> getTaxes() throws FlooringMasteryPersistenceException;
    
    Products getProductByName(String name) throws FlooringMasteryPersistenceException;
    
    Taxes getTaxesByState(String state) throws FlooringMasteryPersistenceException;
    
    Orders addOrder(String orderNumber, Orders order) throws FlooringMasteryPersistenceException;
    
    Orders getOrderByOrderNumber(String orderNumber, String date, String lastDateInserted) throws FlooringMasteryPersistenceException;
    
    Orders updateOrder(String orderNummber, String date, Orders order) throws FlooringMasteryPersistenceException;
    
    Orders removeOrder(String orderNumber, String date) throws FlooringMasteryPersistenceException;
    
    boolean saveCurrentWork(String date) throws FlooringMasteryPersistenceException;
}
