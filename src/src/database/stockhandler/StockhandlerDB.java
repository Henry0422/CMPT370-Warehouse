/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.stockhandler;

import database.MysqlDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementation of all Stock Handler database tasks
 * @author Matt
 */
public class StockhandlerDB implements StockhandlerDBInterface
{
    /* Adds the orders items to the table */
    @Override
    public Object[][] getOrder(int orderId)
    {
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT shipments.id, product.name, shipmentManifest.quantity FROM shipments INNER JOIN shipmentManifest INNER JOIN product WHERE status='ready' AND shipments.id=shipmentManifest.id AND shipmentManifest.prodID=product.id AND shipments.id="+orderId+";");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[][] returnArray=new Object[numResults][7];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {
                        returnArray[rowCount][0]=results.getInt(1);
                        returnArray[rowCount][1]=rowCount+1;
                        returnArray[rowCount][2]=results.getString(2);
                        returnArray[rowCount][3]=results.getInt(3);
                        returnArray[rowCount][4]="Item "+(rowCount+1);
                        returnArray[rowCount][5]="";
                        returnArray[rowCount][6]="";

                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(StockhandlerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public Integer[] getReadyOrderNumbers()
    {

//        Integer[] returnArr;
//        returnArr = new Integer[]{1};
//        return returnArr;
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT shipments.id FROM shipments WHERE status='ready';");

            if(results.last())
            {
                int numResults=results.getRow();
                Integer[] returnArray=new Integer[numResults];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {
                        returnArray[rowCount]=results.getInt(1);

                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(StockhandlerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
