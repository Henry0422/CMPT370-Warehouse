/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import database.manager.ManagerDB;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ronglihan
 */
public class modifyInventoryTest {
    
    private ManagerDB database;
    private modifyInventory mInventory;
    private String name;
    private int number;
    private int quantity;
    private int category;
    private int price;
    public modifyInventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        database = new ManagerDB();
        name="iPad";
        number=1214;
        quantity=23;
        category=3;
        price=499;
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSetProductName() {
         System.out.println("Test setProductName");
         mInventory.setProductName(name, number);
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mInventory.getProductList());
         
     }
    
    @Test
    public void testSetProductQuantity(){
         System.out.println("Test setProductQuantity");
         mInventory.setProductQuantity(quantity, number);
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mInventory.getProductList());
    }

    @Test
    public void testSetProductPrice(){
         System.out.println("Test setProductPrice");
         mInventory.setProductPrice(number, price);
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mInventory.getProductList());
    }
    
    @Test
    public void testSetCategory(){
         System.out.println("Test SetCategory");
         mInventory.setCategory(category, number);
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mInventory.getProductList());
    }
}
