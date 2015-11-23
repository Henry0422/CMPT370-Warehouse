/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shipper;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xingze
 */
public class makeShipmentTest {
    
    public makeShipmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }



    /**
     * Test of inputDeliveryInfo method, of class makeShipment.
     */
    @Test
    public void testInputDeliveryInfo() {
        System.out.println("inputDeliveryInfo");
        int number = 1;
        int time = 2;
        makeShipment instance = new makeShipment();
        instance.inputDeliveryInfo(number, time);

    }

    /**
     * Test of inputItemInfor method, of class makeShipment.
     */
    @Test
    public void testInputItemInfor() {
        System.out.println("inputItemInfor");
        int number = 0;
        String name = "test";
        int quantity = 0;
        String destination = "test";
        String date = "1";
        makeShipment instance = new makeShipment();
        instance.inputItemInfor(number, name, quantity, destination, date);

    }




    /**
     * Test of setPicker method, of class makeShipment.
     */
    @Test
    public void testSetPicker() {
        System.out.println("setPicker");
        String picker = "";
        makeShipment instance = new makeShipment();
        instance.setPicker(picker);

    }

    /**
     * Test of setCompany method, of class makeShipment.
     */
    @Test
    public void testSetCompany() {
        System.out.println("setCompany");
        String company = "test company";
        String wayBill = "123456";
        makeShipment instance = new makeShipment();
        instance.setCompany(company, wayBill);

    }

    /**
     * Test of writeToDatabase method, of class makeShipment.
     */
    @Test
    public void testWriteToDatabase() {
        System.out.println("writeToDatabase");
        makeShipment instance = new makeShipment();
        instance.writeToDatabase();

    }

    /**
     * Test of creatShipment method, of class makeShipment.
     */
    @Test
    public void testCreatShipment() {
        System.out.println("creatShipment");
        makeShipment instance = new makeShipment();
        instance.creatShipment();

    }

    
}
