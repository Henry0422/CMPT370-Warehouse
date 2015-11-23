/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import database.manager.ManagerDB;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ronglihan
 */
public class manageEmployeeTest {
    private manageEmployee mEmployee;
    private String[] newEmployee;
    private ManagerDB database;
    
    public manageEmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        newEmployee = new String[3];
        database = new ManagerDB();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testGetEmployeeList() {
         System.out.println("getEmployeeList");
         Object[] expectedArray=null;

         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
         
     }
     
     @Test
     public void testGetNew() {
         System.out.println("getNew");
         assertArrayEquals(newEmployee,mEmployee.getNew());
     }
     
     
     @Test
     public void testSetNew() {
         System.out.println("setNew");
         String name= "Tom";
         String number= "4";
         String title="Manager";
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         mEmployee.setNew(name,number,title);
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
     }
     
     @Test
     public void testDeleteEmployee(){
         System.out.println("Test deleteEmployee");
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         mEmployee.deleteEmployee(this);
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
     }
}
