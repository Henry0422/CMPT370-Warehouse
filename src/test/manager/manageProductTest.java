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
import static org.junit.Assert.*;

/**
 *
 * @author ronglihan
 */
public class manageProductTest {
    
    private manageProduct mProduct;
    private ManagerDB database;
    
    public manageProductTest() {
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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    
     //test for manageProduct
     public void testGetProductList(){
         System.out.println("getProductList");
         database.getEmployeesList();Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mProduct.getProductList());
     }
     
     public void testAddProduct(){
         System.out.println("Test AddProduct");
         String name="iPad";
         int quantities=100;
         String catagory="3";
         float price=100;
         float size=10;
         mProduct.addProduct(name, quantities, catagory, price, size, catagory);   
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mProduct.getProductList());
     }
   
     
     public void testDeleteProduct(){
         System.out.println("Test deleteProduct");
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         mProduct.deleteProduct(this);
         assertArrayEquals(expectedArray,mProduct.getProductList());
         
     }
}
