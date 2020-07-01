/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

import com.sg.flooringmastery.dao.FlooringMasteryDao;
import com.sg.flooringmastery.dto.Orders;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dannylantigua
 */
public class FlooringMasteryServiceLayerImplTest {
    
    FlooringMasteryServiceLayer service;
    
    public FlooringMasteryServiceLayerImplTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = ctx.getBean("serviceLayer", FlooringMasteryServiceLayer.class);
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
     * Test of getAllOrders method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testGetAllOrders() throws Exception {
        Orders odr1 = add1();
        Orders odr2 = add2();
        
        service.completeAddingNewOrder(odr1);
        service.completeAddingNewOrder(odr2);
        assertEquals(2, service.getAllOrders("", "").size());
    }

    /**
     * Test of getProducts method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testGetProducts() throws Exception {
        assertEquals(3, service.getProducts().size());
    }

    /**
     * Test of getTaxes method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testGetTaxes() throws Exception {
         assertEquals(3, service.getTaxes().size());
    }

    /**
     * Test of addOrder method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testAddOrder() throws Exception {
        Orders currentOrder = new Orders("");
        currentOrder.setCustomerName("Danny");
        currentOrder.setState("PA");
        currentOrder.setProductType("Wood");
        currentOrder.setArea(new BigDecimal("90"));
        
        Orders fromService = service.addOrder(currentOrder, "", "");
        assertEquals("1", fromService.getOrderNumber());
    }

    /**
     * Test of getOrderByOrderNumber method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testGetOrderByOrderNumber() throws Exception {
        Orders odr1 = add1();
        Orders odr2 = add2();
        
        service.completeAddingNewOrder(odr1);
        service.completeAddingNewOrder(odr2);
        
        Orders odr3 = service.getOrderByOrderNumber("2", "", "");
        Orders odr4 = service.getOrderByOrderNumber("2", "", "");
        assertEquals(odr3, odr4);
    }

    /**
     * Test of updateOrder method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testUpdateOrder() throws Exception {
        Orders currentOrder = new Orders("");
        currentOrder.setCustomerName("Danny");
        currentOrder.setState("PA");
        currentOrder.setProductType("Wood");
        currentOrder.setArea(new BigDecimal("90"));
        
        Orders fromService = service.addOrder(currentOrder, "", "");
        service.completeAddingNewOrder(fromService);
        
        fromService.setArea(new BigDecimal("110"));
        Orders fromSUpdated = service.updateOrder(fromService.getOrderNumber(), "", fromService);
        assertEquals(new BigDecimal("110"), fromSUpdated.getArea());
    }

    /**
     * Test of removeOrder method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testRemoveOrder() throws Exception {
        Orders odr1 = add1();
        Orders odr2 = add2();
        
        service.completeAddingNewOrder(odr1);
        service.completeAddingNewOrder(odr2);
        
        service.removeOrder(odr1.getOrderNumber(), "");
        assertEquals(1, service.getAllOrders("", "").size());
        assertNull(service.getOrderByOrderNumber(odr1.getOrderNumber(), "", ""));
        
        service.removeOrder(odr2.getOrderNumber(), "");
        assertEquals(0, service.getAllOrders("", "").size());
        assertNull(service.getOrderByOrderNumber(odr2.getOrderNumber(), "", ""));
    }

    /**
     * Test of completeAddingNewOrder method, of class FlooringMasteryServiceLayerImpl.
     */
    @Test
    public void testCompleteAddingNewOrder() throws Exception {
        Orders currentOrder = new Orders("");
        currentOrder.setCustomerName("Danny");
        currentOrder.setState("PA");
        currentOrder.setProductType("Wood");
        currentOrder.setArea(new BigDecimal("90"));
        
        Orders fromService = service.addOrder(currentOrder, "", "");
        assertEquals(currentOrder, fromService);
    }

    public Orders add1(){
        Orders currentOrder = new Orders("1");
        currentOrder.setCustomerName("Nancy");
        currentOrder.setState("PA");
        currentOrder.setTaxRate(new BigDecimal("6.75"));
        currentOrder.setProductType("Wood");
        currentOrder.setArea(new BigDecimal("90"));
        currentOrder.setCostPerSquareFoot(new BigDecimal("5.15"));
        currentOrder.setLaborCostPerSquareFoot(new BigDecimal("4.75"));
        currentOrder.setMaterialCost(new BigDecimal("463.5"));
        currentOrder.setLaborCost(new BigDecimal("427.5"));
        currentOrder.setTax(new BigDecimal("60.14"));
        currentOrder.setTotal(new BigDecimal("951.14"));
        
        return currentOrder;
    }
    
    public Orders add2(){
        Orders currentOrder = new Orders("2");
        currentOrder.setCustomerName("Peter");
        currentOrder.setState("MI");
        currentOrder.setTaxRate(new BigDecimal("5.75"));
        currentOrder.setProductType("Carpet");
        currentOrder.setArea(new BigDecimal("110"));
        currentOrder.setCostPerSquareFoot(new BigDecimal("2.25"));
        currentOrder.setLaborCostPerSquareFoot(new BigDecimal("2.10"));
        currentOrder.setMaterialCost(new BigDecimal("247.5"));
        currentOrder.setLaborCost(new BigDecimal("231"));
        currentOrder.setTax(new BigDecimal("27.51"));
        currentOrder.setTotal(new BigDecimal("506.01"));
        
        return currentOrder;
    }
    
}
