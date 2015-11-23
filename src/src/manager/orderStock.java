/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import database.manager.ManagerDB;

/**
 *
 * @author Xingze
 */
public class orderStock extends modifyInventory
{

    private ManagerDB database;
    private newOrder newOrder;

    public orderStock()
    {
        super();
        database = new ManagerDB();

    }

    public float getItemSize(int itemnumber)
    {

        return database.getProductSize(itemnumber);
    }

    public float getItemWeight(int itemnumber)
    {

        return database.getProductWeight(itemnumber);
    }

    public void createOrder(String productName,int productNumber,int productQuantity,float productSize,float productWeight)
    {
        newOrder = new newOrder(productName,productNumber,productQuantity,productSize,productWeight);

        
        System.out.println(newOrder.toString());
    }

}
