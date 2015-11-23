package warehouseui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xianming
 */
public class MainUITest {
    
    public MainUITest() {
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
     * Test of main method, of class MainUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of highlightBin method, of class MainUI.
     */
    @Test
    public void testHighlightBin() {
        System.out.println("highlightBin");
        int X = 0;
        int Y = 0;
        MainUI.highlightBin(X, Y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}