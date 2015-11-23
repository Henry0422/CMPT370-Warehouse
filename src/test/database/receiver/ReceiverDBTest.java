/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.receiver;

import database.manager.ManagerDB;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import receiver.orderItem;

/**
 *
 * @author Matt
 */
public class ReceiverDBTest {
    /**
     * Database set and get methods are difficult to test,
     * If we had move time, a test database would have been 
     * set up for the testing.
     * 
     * As we did not have time, the current tests are very simple
     * black box tests.
     */
    
    public ReceiverDBTest() {
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
     * Test of addItemsToOrder method, of class ReceiverDB.
     */
    @Test
    public void testAddItemsToOrder() {
        System.out.println("addItemsToOrder");
        int orderId = 0;
        Object[] itemsList = new Object[1];
        itemsList[0]=new orderItem("TestProd", 1, 2, -99.99F, -99.99F, "TestProd", -99.99F);
        ReceiverDB instance = new ReceiverDB();
        boolean expResult = true;
        boolean result = instance.addItemsToOrder(orderId, itemsList);
        assertEquals(expResult, result);
    }

    /**
     * Test of addProduct method, of class ReceiverDB.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String name = "TestProd";
        int category = 1;
        float price = 0.0F;
        float size = 0.0F;
        float weight = 0.0F;
        ReceiverDB instance = new ReceiverDB();
        int result = instance.addProduct(name, category, price, size, weight);
        assert(-1!=result);
        ManagerDB data=new ManagerDB();
        data.deleteProduct(result);
    }

    /**
     * Test of getProductCategories method, of class ReceiverDB.
     */
    @Test
    public void testGetProductCategories() {
        System.out.println("getProductCategories");
        ReceiverDB instance = new ReceiverDB();
        Object[] result = instance.getProductCategories();
        assertNotNull(result);
    }
}