/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.receiver;


/**
 *
 * @author Matt
 */
public interface ReceiverDBInterface
{

    /**
     * Adds the list of items provided to an order
     * @param orderId ID of the order to be changed
     * @param itemsList List of items to be added to the list
     * @return True on success, false on failure
     */
    public boolean addItemsToOrder(int orderId, Object[] itemsList);


    /**
     * Adds a new item to the warehouse system
     * @param name The name of the product
     * @param category ID of the category this product belongs to
     * @param price The price the product sells for
     * @param weight The weight of the item, in kilograms
     * @return The ID number of the newly added item
     */
    public int addProduct(String name, int category, float price, float size,float weight);

    /**
     * Get the listing of all possible categories for a product
     * @return An Object[] containing all categories, or null on failure
     */
    public Object[] getProductCategories();
}