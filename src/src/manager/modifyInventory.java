/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;


import database.manager.ManagerDB;
import javax.swing.JFrame;
import warehouseui.InventoryModifyPopup;

/**
 * modify inventory, change data and location
 * @author Xingze
 * @editor Rongli
 */
public class modifyInventory
{

    private ManagerDB database;
    private String testString;
    public modifyInventory()
    {
        database =new ManagerDB();
    }

   /**
    *
    * @param ProductNumber
    * @return
    */
    public String getProductName(int ProductNumber)
    {
        return database.getProductName(ProductNumber);
    }

    /**
     *
     * @param name
     * @param ProductNumber
     */
    public void setProductName(String name, int ProductNumber)
    {
        testString =  testString + "Name = " + name + "\r\n";// for test
        database.setProductName(name, ProductNumber);
    }

    /**
     *
     * @param ProductNumber
     * @return
     */
    public int getProductQuantity(int ProductNumber)
    {
        return database.getProductQuantity(ProductNumber);
    }

    /**
     *
     * @param quantity
     * @param ProductNumber
     */
    public void setProductQuantity(int quantity,int ProductNumber)
    {

        testString =  testString + "quantity = " + quantity + "\r\n"; // for test
        database.setProductQuantity(ProductNumber,quantity);
    }
    
    /**
     *
     * @param ProductNumber
     * @return
     */
    public float getProductPrice(int ProductNumber)
    {
        return database.getProductPrice(ProductNumber);
    }

    /**
     *
     * @param price
     * @param ProductNumber
     */
    public void setProductPrice(float price,int ProductNumber )
    {
        testString =  testString + "price = " + price + "\r\n";// for test
        database.setProductPrice(ProductNumber,price);
    }
    
    /**
     * 
     * @param ProductNumber
     * @return Object
     */
    public Object getProductCategory(int ProductNumber)
    {
        return database.getCategory(ProductNumber);
    }
    
    /**
     *
     * @param category
     * @param ProductNumber
     */
    public void setCategory(int category,int ProductNumber)
    {
        testString =  testString + "category = " + category + "\r\n";// for test
        database.setProductCategory(ProductNumber,category);
    }
    
    /**
     *
     * @param ProductName
     * @return int
     */
    public int getProductNumber(String ProductName)
    {

        return database.getProductNumber(ProductName);
    }

    /**
     *
     * @param ProductNumber
     * @param ProductName
     */
    public void setProductNumber(String ProductName,int ProductNumber)
    {
        testString =  testString + "ProductNumber = " + ProductNumber + "\r\n";// for test
        System.out.println("Not to be implemented, item number set by database only.");
//        database.setProductNumber(ProductNumber, ProductName);
    }
  
    /**
     * 
     * @param ProductNumber
     * @return Object
     */
    public String getProductDescription(int ProductNumber)
    {
        return database.getProductDescription(ProductNumber);
    }
    
    /**
     *
     * @param description
     * @param ProductNumber
     */
    public void setProductDescription (String description,int ProductNumber)
    {
        testString =  testString + "description = " + description + "\r\n";// for test
        database.setProductDescription(ProductNumber,description );
    }
        
    /**
     * @param ProductNumber
     * @return int
     */
    public int getLocation(int ProductNumber)
    {

        return database.getLocation(ProductNumber);
    }
    
    /**
     *
     * @param location
     * @param ProductNumber
     */
    public void setLocation(int location, int ProductNumber)
    {
        testString =  testString + "location = " + location + "\r\n";  // for test
        database.setLocation(location,ProductNumber);
    }
        
    /**
     * 
     * @param name
     * @return int
     */
    public int addProduct(String name){
        return database.addProduct(name);
    }
    
    public Object[] getProductList(){
        Object[] tempArray;
        tempArray = database.getProductList();
        return tempArray;
    }
  /**
   * 
   * @param size
   * @param productNumber 
   */   
    public void setSize(float size, int productNumber){
    database.setProductSize(productNumber, size);
    }
    
    
   public void setWeight(float weight, int productNumber){
    database.setProductWeight(productNumber, weight);
    }
   
   public float getSize(int number){
        return database.getProductSize(number);
   }
   public float getWeight(int number){
        return database.getProductWeight(number);
   }
   
    @Override
    public String toString()
    {
        return testString;
    }
    
    /**
     * 
     * test for modifyInventory
     * using the InventoryModifyPopup UI
     */
    public static void main(String[] argo){
        modifyInventory test = new modifyInventory();

        InventoryModifyPopup newInv = new InventoryModifyPopup();
        newInv.setVisible(true);
        }
}
