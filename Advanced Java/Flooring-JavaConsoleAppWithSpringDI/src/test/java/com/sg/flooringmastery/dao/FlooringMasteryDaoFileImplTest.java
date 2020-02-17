/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Orders;
import com.sg.flooringmastery.dto.Products;
import com.sg.flooringmastery.dto.Taxes;
import java.math.BigDecimal;
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
public class FlooringMasteryDaoFileImplTest {
    
    FlooringMasteryDao dao;
    
    public FlooringMasteryDaoFileImplTest() {
        this.dao = new FlooringMasteryDaoStubImpl();
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
     * Test of getAllOrders method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testGetAllOrders() throws Exception {
        Orders odr1 = add1();
        Orders odr2 = add2();
        
        dao.addOrder(odr1.getOrderNumber(), odr1);
        dao.addOrder(odr2.getOrderNumber(), odr2);
        assertEquals(2, dao.getAllOrders("", "").size());
    }

    /**
     * Test of getProducts method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testGetProducts() throws Exception {
        assertEquals(3, dao.getProducts().size());
    }

    /**
     * Test of getTaxes method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testGetTaxes() throws Exception {
        assertEquals(3, dao.getTaxes().size());
    }

    /**
     * Test of getProductByName method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testGetProductByName() throws Exception {
        Products pr1 = dao.getProductByName("Wood");
        Products pr2 = dao.getProductByName("Wood");
        assertEquals(pr1.getProductType(), pr2.getProductType());
    }

    /**
     * Test of getTaxesByState method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testGetTaxesByState() throws Exception {
        Taxes tx1 = dao.getTaxesByState("PA");
        Taxes tx2 = dao.getTaxesByState("PA");
        assertEquals(tx1.getTaxRate(), tx2.getTaxRate());
    }

    /**
     * Test of addOrder method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testAddOrder() throws Exception {
        Orders odr1 = add1();
        dao.addOrder(odr1.getOrderNumber(), odr1);
        
        Orders fromDao = dao.addOrder(odr1.getOrderNumber(), odr1);
        assertEquals(odr1, fromDao);
    }

    /**
     * Test of getOrderByOrderNumber method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testGetOrderByOrderNumber() throws Exception {
        Orders odr1 = add1();
        Orders odr2 = add2();
        
        dao.addOrder(odr1.getOrderNumber(), odr1);
        dao.addOrder(odr2.getOrderNumber(), odr2);
        
        Orders odr3 = dao.getOrderByOrderNumber("2", "", "");
        Orders odr4 = dao.getOrderByOrderNumber("2", "", "");
        assertEquals(odr3, odr4);
    }

    /**
     * Test of updateOrder method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testUpdateOrder() throws Exception {
        Orders odr2 = add2();
        dao.addOrder(odr2.getOrderNumber(), odr2);
        
        Orders fromDao = dao.updateOrder(odr2.getOrderNumber(), "", odr2);
        assertEquals(odr2, fromDao);
    }

    /**
     * Test of removeOrder method, of class FlooringMasteryDaoFileImpl.
     */
    @Test
    public void testRemoveOrder() throws Exception {
        Orders odr1 = add1();
        Orders odr2 = add2();

        dao.addOrder(odr1.getOrderNumber(), odr1);
        dao.addOrder(odr2.getOrderNumber(), odr2);
        
        dao.removeOrder(odr1.getOrderNumber(), "");
        assertEquals(1, dao.getAllOrders("", "").size());
        assertNull(dao.getOrderByOrderNumber(odr1.getOrderNumber(), "", ""));
        
        dao.removeOrder(odr2.getOrderNumber(), "");
        assertEquals(0, dao.getAllOrders("", "").size());
        assertNull(dao.getOrderByOrderNumber(odr2.getOrderNumber(), "", ""));
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
