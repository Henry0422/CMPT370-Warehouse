/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package receiver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xingze
 */
public class receiveOrderTest {
    
    public receiveOrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }



    /**
     * Test of setOrderID method, of class receiveOrder.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        int orderID = 0;
        receiveOrder instance = new receiveOrder();
        instance.setOrderID(orderID);
        
    }

    /**
     * Test of setItemQuantity method, of class receiveOrder.
     */
    @Test
    public void testSetItemQuantity() {
        System.out.println("setItemQuantity");
        int itemQuantity = 0;
        receiveOrder instance = new receiveOrder();
        instance.setItemQuantity(itemQuantity);
    }

    /**
     * Test of setItemName method, of class receiveOrder.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        receiveOrder instance = new receiveOrder();
        instance.setItemName(itemName);

    }

    /**
     * Test of setItemCategory method, of class receiveOrder.
     */
    @Test
    public void testSetItemCategory() {
        System.out.println("setItemCategory");
        int itemCategory = 0;
        receiveOrder instance = new receiveOrder();
        instance.setItemCategory(itemCategory);

    }

    /**
     * Test of setPrice method, of class receiveOrder.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        receiveOrder instance = new receiveOrder();
        instance.setPrice(price);

    }

    /**
     * Test of setWeight method, of class receiveOrder.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        float weight = 0.0F;
        receiveOrder instance = new receiveOrder();
        instance.setWeight(weight);

    }

    /**
     * Test of setSize method, of class receiveOrder.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        float size = 0.0F;
        receiveOrder instance = new receiveOrder();
        instance.setSize(size);

    }

    /**
     * Test of setDescription method, of class receiveOrder.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String des = "";
        receiveOrder instance = new receiveOrder();
        instance.setDescription(des);

    }

    /**
     * Test of printOrder method, of class receiveOrder.
     */
    @Test
    public void testPrintOrder() {
        System.out.println("printOrder");
        receiveOrder instance = new receiveOrder();
        instance.createOrder();
        instance.printOrder();
    }
    
}
