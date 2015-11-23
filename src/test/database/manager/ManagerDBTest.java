/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.manager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class ManagerDBTest {
    
    /**
     * Database set and get methods are difficult to test,
     * If we had move time, a test database would have been 
     * set up for the testing.
     * 
     * As we did not have time, the current tests are very simple
     * black box tests.
     */
    ManagerDB database;
    int testProdId;
    
    public ManagerDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        database=new ManagerDB();
        database.deleteEmployee(-99);
        database.addEmployee("TesterBob", -100, "ATest");
        testProdId=database.addProduct("TestProd");
        database.setLocation(-99, testProdId);
        database.setProductCategory(testProdId, -99);
        database.setProductPrice(testProdId, (float) -99.99);
        database.setProductQuantity(testProdId, -99);
        database.setProductSize(testProdId, (float) -99.99);
        database.setProductWeight(testProdId, (float) -99.99);
    }
    
    @After
    public void tearDown() {
        database.deleteEmployee(-100);
        database.deleteProduct(testProdId);
    }

    /**
     * Test of getEmployeesList method, of class ManagerDB.
     */
    @Test
    public void testGetEmployeesList() {
        System.out.println("getEmployeesList");
        Object[] result = database.getEmployeesList();
        assertNotNull(result);
    }

    /**
     * Test of addEmployee method, of class ManagerDB.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        String name = "MattTriff";
        int id = -99;
        String title = "test";
        database.addEmployee(name, id, title);
        assertEquals("MattTriff", database.getEmployeeName(-99));
    }

    /**
     * Test of getEmployeeName method, of class ManagerDB.
     */
    @Test
    public void testGetEmployeeName() {
        System.out.println("getEmployeeName");
        int employeeId = -100;
        String expResult = "TesterBob";
        String result = database.getEmployeeName(employeeId);
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmployeeName method, of class ManagerDB.
     */
    @Test
    public void testSetEmployeeName() {
        System.out.println("setEmployeeName");
        String name = "TesterJim";
        int employeeId = -100;
        database.setEmployeeName(name, employeeId);
        assertEquals("TesterJim", database.getEmployeeName(employeeId));
        database.setEmployeeName("TesterBob", employeeId);
        assertEquals("TesterBob", database.getEmployeeName(employeeId));
    }

    /**
     * Test of getTitle method, of class ManagerDB.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        int employeeId = -100;
        String expResult = "ATest";
        String result = database.getTitle(employeeId);
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class ManagerDB.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "NoTest";
        int employeeId = -100;
        database.setTitle(title, employeeId);
        assertEquals(title, database.getTitle(employeeId));
    }

    /**
     * Test of getProductName method, of class ManagerDB.
     */
    @Test
    public void testGetProductName() {
        System.out.println("getProductName"); 
        String expResult = "TestProd";
        String result = database.getProductName(testProdId);
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductName method, of class ManagerDB.
     */
    @Test
    public void testSetProductName() {
        System.out.println("setProductName");
        String itemName = "Test2";
        database.setProductName(itemName, testProdId);
        assertEquals(itemName, database.getProductName(testProdId));
        itemName = "TestProd";
        database.setProductName(itemName, testProdId);
        assertEquals(itemName, database.getProductName(testProdId));
    }

    /**
     * Test of getProductNumber method, of class ManagerDB.
     */
    @Test
    public void testGetProductNumber() {
        System.out.println("getProductNumber");
        String itemName = "TestProd";
        int result = database.getProductNumber(itemName);
        assertNotNull(result);
    }

    /**
     * Test of getProductPrice method, of class ManagerDB.
     */
    @Test
    public void testGetProductPrice() {
        System.out.println("getProductPrice");        
        float expResult = -99.99F;
        float result = database.getProductPrice(testProdId);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getProductQuantity method, of class ManagerDB.
     */
    @Test
    public void testGetProductQuantity() {
        System.out.println("getProductQuantity");
        int expResult = -99;
        int result = database.getProductQuantity(testProdId);
        assertEquals(expResult, result);
    }

    /**
     * Test of setProductQuantity method, of class ManagerDB.
     */
    @Test
    public void testSetProductQuantity() {
        System.out.println("setProductQuantity");
        int quantity = -100;
        database.setProductQuantity(testProdId, quantity);
        assertEquals(quantity, database.getProductQuantity(testProdId));
        quantity = -99;
        database.setProductQuantity(testProdId, quantity);
        assertEquals(quantity, database.getProductQuantity(testProdId));
    }

    /**
     * Test of setLocation method, of class ManagerDB.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        int location = 0;
        database.setLocation(location, testProdId);
        assertEquals(location, database.getLocation(testProdId));
        location = -99;
        database.setLocation(location, testProdId);
        assertEquals(location, database.getLocation(testProdId));
    }

    /**
     * Test of getLocation method, of class ManagerDB.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");        
        int expResult = -99;
        int result = database.getLocation(testProdId);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class ManagerDB.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");        
        int expResult = -99;
        int result = database.getCategory(testProdId);
        assertEquals(expResult, result);
    }

    /**
     * Test of getProductDescription method, of class ManagerDB.
     */
    @Test
    public void testGetProductDescription() {
        System.out.println("getProductDescription");        
        String expResult = "TestProd";
        String result = database.getProductDescription(testProdId);
        assertEquals(expResult, result);
    }

    /**
     * Test of getProductSize method, of class ManagerDB.
     */
    @Test
    public void testGetProductSize() {
        System.out.println("getProductSize");        
        float expResult = -99.99F;
        float result = database.getProductSize(testProdId);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getProductWeight method, of class ManagerDB.
     */
    @Test
    public void testGetProductWeight() {
        System.out.println("getProductWeight");        
        float expResult = -99.99F;
        float result = database.getProductWeight(testProdId);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setProductDescription method, of class ManagerDB.
     */
    @Test
    public void testSetProductDescription() {
        System.out.println("setProductDescription");
        String description = "TestDesc";
        database.setProductDescription(testProdId, description);
        assertEquals(description, database.getProductDescription(testProdId));
        description = "TestProd";
        database.setProductDescription(testProdId, description);
        assertEquals(description, database.getProductDescription(testProdId));        
    }

    /**
     * Test of setProductSize method, of class ManagerDB.
     */
    @Test
    public void testSetProductSize() {
        System.out.println("setProductSize");
        float size = 0.0F;
        database.setProductSize(testProdId, size);
        assertEquals(size, database.getProductSize(testProdId), 0.0);
        size = -99.99F;
        database.setProductSize(testProdId, size);
        assertEquals(size, database.getProductSize(testProdId), 0.0);
    }

    /**
     * Test of setProductCategory method, of class ManagerDB.
     */
    @Test
    public void testSetProductCategory() {
        System.out.println("setProductCategory");
        int categoryId = 0;
        database.setProductCategory(testProdId, categoryId);
        assertEquals(categoryId, database.getCategory(testProdId));
        categoryId = -99;
        database.setProductCategory(testProdId, categoryId);
        assertEquals(categoryId, database.getCategory(testProdId));
    }

    /**
     * Test of setProductPrice method, of class ManagerDB.
     */
    @Test
    public void testSetProductPrice() {
        System.out.println("setProductPrice");
        float price = 0.0F;
        database.setProductPrice(testProdId, price);
        assertEquals(price, database.getProductPrice(testProdId), 0.0);
        price = -99.99F;
        database.setProductPrice(testProdId, price);
        assertEquals(price, database.getProductPrice(testProdId), 0.0);
    }

    /**
     * Test of addProduct method, of class ManagerDB.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String name = "NoTest";
        int result = database.addProduct(name);
        assertNotNull(result);
        database.deleteEmployee(result);
    }

    /**
     * Test of getProductList method, of class ManagerDB.
     */
    @Test
    public void testGetProductList() {
        System.out.println("getProductList");
        Object[] results = database.getProductList();
        assertNotNull(results);
    }

    /**
     * Test of deleteProduct method, of class ManagerDB.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        database.deleteProduct(testProdId);
        assertNull(database.getProductName(testProdId));
    }

    /**
     * Test of deleteEmployee method, of class ManagerDB.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee");
        int employeeId = -99;
        database.deleteEmployee(employeeId);
        assertNull(database.getEmployeeName(employeeId));
    }

    /**
     * Test of setProductWeight method, of class ManagerDB.
     */
    @Test
    public void testSetProductWeight() {
        System.out.println("setProductWeight");
        float weight = -199.9F;
        boolean expResult = true;
        boolean result = database.setProductWeight(testProdId, weight);
        assertEquals(expResult, result);
        result = database.setProductWeight(testProdId, -99.99F);
        assertEquals(expResult, result);
    }
}