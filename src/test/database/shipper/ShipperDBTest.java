/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.shipper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import shipper.shipmentTask;

/**
 *
 * @author Matt
 */
public class ShipperDBTest {
       /**
     * Database set and get methods are difficult to test,
     * If we had move time, a test database would have been 
     * set up for the testing.
     * 
     * As we did not have time, the current tests are very simple
     * black box tests.
     */
    
    public ShipperDBTest() {
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
     * Test of getShipmentList method, of class ShipperDB.
     */
    @Test
    public void testGetShipmentList() {
        /* Note: This method depends on your addition/deletion activities
         * Assumption is tha there is a shipment in the list
         */
        System.out.println("getShipmentList");
        ShipperDB instance = new ShipperDB();
        Object[] result = instance.getShipmentList();
        assertNotNull(result);
    }

    /**
     * Test of getPendingShipmentList method, of class ShipperDB.
     */
    @Test
    public void testGetPendingShipmentList() {
        /* Note: This method depends on your addition/deletion activities
         * Assumption is tha there is a shipment in the list
         */
        System.out.println("getPendingShipmentList");
        ShipperDB instance = new ShipperDB();
        Object[] expResult = null;
        Object[] result = instance.getPendingShipmentList();
        assertNotNull(result);
    }

    /**
     * Test of getStockHandlers method, of class ShipperDB.
     */
    @Test
    public void testGetStockHandlers() {
        System.out.println("getStockHandlers");
        ShipperDB instance = new ShipperDB();
        Object[] result = instance.getStockHandlers();
        assertNotNull(result);
    }

    /**
     * Test of getShippingCompanies method, of class ShipperDB.
     */
    @Test
    public void testGetShippingCompanies() {
        System.out.println("getShippingCompanies");
        ShipperDB instance = new ShipperDB();
        Object[] result = instance.getShippingCompanies();
        assertNotNull(result);
    }

    /**
     * Test of setNewShipment method, of class ShipperDB.
     */
    @Test
    public void testSetNewShipment() {
        System.out.println("setNewShipment");
        shipmentTask newTask = new shipmentTask();
        newTask.setItemNumber(65);
        newTask.setitemQuantity(1);
        ShipperDB instance = new ShipperDB();
        boolean expResult = true;
        boolean result = instance.setNewShipment(newTask);
        assertEquals(expResult, result);
    }
}