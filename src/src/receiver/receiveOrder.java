package receiver;

import database.receiver.ReceiverDB;

public class receiveOrder
{

    private orderItem newOrder;
    private ReceiverDB database;

    private String itemName;
    private int orderID;
    private int itemQuantity;
    private int itemCategory;
    private float price;
    private float size;
    private String itemDescription;
    private float weight;

    public receiveOrder()
    {
        database =new ReceiverDB();
    }


    /**
     * Create a new orderItem object
         * @return
     */
    public orderItem createOrder()
    {
        newOrder = new orderItem(itemName,itemQuantity,itemCategory,price,size,itemDescription,weight);
        printOrder();
        return newOrder;

    }
    /**
     * Get category list from database
     * @return
     */
    public Object[] getCategoryList()
    {

        Object[] tempArray;
        tempArray = database.getProductCategories();
        return tempArray;
    }

    public void addItemsToOrder()
    {
        orderItem itemsList[] = new orderItem[1];
        itemsList[0] = newOrder;
        database.addItemsToOrder(orderID, itemsList);
    }

    public int addProduct()
    {
        return database.addProduct(newOrder.getItemName(),newOrder.getItemCategory(), newOrder.getPrice(), newOrder.getSize(), newOrder.getWeight()) ;
    }

    /**
     * set orderID to orderItem
     * @param orderID
     */
    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }
    /**
     * set itemQuantity to orderItem
     * @param itemQuantity
     */
    public void setItemQuantity(int itemQuantity)
    {
        this.itemQuantity = itemQuantity;
    }
    /**
     * set itemName to orderItem
     * @param itemName
     */
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }
    /**
     * set itemCategory to orderItem
     * @param itemCategory
     */
    public void setItemCategory(int itemCategory)
    {
        this.itemCategory = itemCategory;
    }
    /**
     * set price to orderItem
     * @param price
     */
    public void setPrice(float price)
    {
        this.price = price;
    }

    /**
     * set weight to orderItem
     * @param weight
     */
    public void setWeight(float weight)
    {
        this.weight = weight;
    }
    /**
     *
     * @param size
     */
    public void setSize(float size)
    {
        this.size = size;
    }

    /**
     * set Description to orderItem
     * @param des
     */
    public void setDescription(String des)
    {
        this.itemDescription = des;
    }

    /**
     * print orderItem for test
     */
    public void printOrder()
    {
        System.out.println(newOrder.toString());

    }
}
