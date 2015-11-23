/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.manager;

/**
 *
 * @author Matt
 */
public interface ManagerDBInterface
{

    /**
     * Gets the list of all employees
     * @return An array containing all employees in the system, or null on failure
     */
    public Object[] getEmployeesList();


    /**
     * Add an employee to the company
     * @param name The name of the employee
     * @param id
     * @param title
     * @param currentWork
     * @param nextWork
     * @param number
     */
    public void addEmployee(String name, int id,String title);


    public String getEmployeeName(int employeeId);


    public void setEmployeeName(String name,int employeeId);

    /**
    public void setEmployeeID(String name,int employeeId);
     * Get the average speed of the employee in performing their tasks
     * @param employeeId The ID of the employee to check
     * @return The speed of the employee, or null on failure

    public float getEmployeeSpeed(int employeeId);

    public void setEmployeeSpeed(float speed,int employeeId);
     */
    public String getTitle(int employeeId);

    /**
     * Change the title of an employee
     * @param title
     * @param employeeId The ID of the employee whose title we will update
     */
    public void setTitle(String title,int employeeId);

    /**
     * Creates a new (empty) order with the current date
     * @return The ID of the newly created order
     */

    /**
     * Creates a new (empty) order with the current date
     * @param employeeId
     * @return The ID of the newly created order
   
    public String getCurrentWork(int employeeId);

    public void setCurrentWork(String currentWork, int employeeId);

    public String getNextWork(int employeeId);

    public void setNextWork(String nextWork, int employeeId);

    public int getNumofWorkDone(int employeeId);

    public void setNumofWorkDone(int num ,int employeeId);
  */

    /**
     *
     * @param itemNumber
     * @return
     */
    public String getProductName(int itemNumber);

    /**
     *
     * @param name
     * @param itemNumber
     */
    public void setProductName(String name, int itemNumber);

    /**
     *
     * @param itemName
     * @return
     */
    public int getProductNumber(String itemName);

    /**
     *
     * @param itemNumber
     * @param itemName

    public void setProductNumber(int itemNumber, String itemName);
     */
    /**
     *
     * @param description
     * @param itemNumber
     */
    public void setProductDescription (int itemNumber, String description);

    /**
     *
     * @param itemId
     * @param size
     */
    public void setProductSize(int itemId, float size);

    /**
     *
     * @param itemNumber
     * @return
     */
    public String getProductDescription(int itemNumber);
    /**
     *
     * @param itemId
     * @param categoryId
     */
    public void setProductCategory(int itemId, int categoryId);

    /**
     *
     * @param itemNumber
     * @return
     */
    public float getProductPrice(int itemNumber);

    /**
     *
     * @param itemId
     * @param price
     */
    public void setProductPrice(int itemId, float price);

    /**
     *
     * @param itemId
     * @return
     */
    public int getProductQuantity(int itemId);

    /**
     *
     * @param itemId
     * @param quantity
     */
    public void setProductQuantity(int itemId, int quantity);

    /**
     *
     * @param location
     * @param itemNumber
     */
    public void setLocation(int location, int itemNumber);

    /**
     *
     * @param itemNumber
     * @return
     */
    public int getLocation(int itemNumber);


    /**
     *
     * @param itemNumber
     * @return
     */
    public int getCategory(int itemNumber);

    /**
     *
     * @param itemNumber
     * @return
     */
    public float getProductSize(int itemNumber);

    /**
     *
     * @param itemNumber
     * @return
     */
    public float getProductWeight(int itemNumber);

    /**
     * Adds a new item to the warehouse system
     * @param name The name of the product
     * @param category ID of the category this product belongs to
     * @param price The price the product sells for
     * @param weight The weight of the item, in kilograms
     * @return The ID number of the newly added item
     */
    public int addProduct(String name);

    public Object[] getProductList();
    
    /**
     * Delete product
     * @param number ID of product
     */
    public void deleteProduct(int number);

    
    /**
     * Delete Employee
     * @param number ID of employee
     */
    public void deleteEmployee(int number);
    
    /**
     * Set the weight of a product
     * @param itemId ID of the product already in the database
     * @param weight Weight of the product to be set
     * @return True on success, False on failure
     */
    public boolean setProductWeight(int itemId, float weight);
}