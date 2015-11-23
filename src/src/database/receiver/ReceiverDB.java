/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.receiver;

import database.MysqlDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import receiver.orderItem;


/**
 *
 * @author Matt
 */
public class ReceiverDB implements ReceiverDBInterface
{

    @Override
    public boolean addItemsToOrder(int orderId, Object[] itemsList)
    {
        orderItem newItem=(orderItem) itemsList[0];

        String query="INSERT INTO product(name, category, price, size, weight) VALUES ('"
                     +newItem.getItemName()+"',"+newItem.getItemCategory()+","+newItem.getPrice()+","+newItem.getSize()+","+newItem.getWeight()+");";
        System.out.println(query);
        try
        {
            MysqlDB.runQuery(query);

            query="SELECT id FROM product ORDER BY id DESC LIMIT 1;";
            ResultSet results=MysqlDB.runQuery(query);
            if(results.next())
            {
                int id=results.getInt(1);
                System.out.println("Returning ID: "+id);
              
                query="INSERT INTO shipmentManifest VALUES ("+orderId+","+id+","+newItem.getItemQuantity()+");";
                MysqlDB.runQuery(query);

                query="SELECT id FROM product ORDER BY id DESC LIMIT 1;";
                results=MysqlDB.runQuery(query);
                
                if(results!=null)
                {
                    return true;
                }           
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ReceiverDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public int addProduct(String name, int category, float price,float size, float weight)
    {
        String query="INSERT INTO product(name, category, price, size, weight) VALUES ('"
                 +name+"',"+category+","+price+","+size+","+weight+");";
        
        System.out.println(query);
        try
        {
            MysqlDB.runQuery(query);

            query="SELECT id FROM product ORDER BY id DESC LIMIT 1;";
            ResultSet results=MysqlDB.runQuery(query);
            if(results.next())
            {
                int id=results.getInt(1);
                System.out.println("Returning ID: "+id);
                return id;
            }
        }   catch (SQLException ex) {
            Logger.getLogger(ReceiverDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }

    @Override
    public Object[] getProductCategories()
    {
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT name FROM prodCategory;");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[] returnArray=new String[numResults];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {
                        returnArray[rowCount]=results.getObject("name");
                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ReceiverDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }


}
