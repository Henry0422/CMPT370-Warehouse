/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.shipper;

import database.MysqlDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import shipper.shipmentTask;

/**
 *
 * @author Matt
 */
public class ShipperDB implements ShipperDBInterface
{

    @Override
    public Object[] getShipmentList()
    {
//        Object[][] returnArr=new Object[][]{
//                {1,"Nexus 7",30,"Saskatoon","2013-05-07"},
//                {2,"Lenovo X230",26,"Beijing","2013-06-09"},
//                {3,"iPad Mini",15,"London","2013-06-12"}
//            };
//
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT shipments.id, product.name, shipmentManifest.quantity, shipments.destination, shipments.sentDate FROM shipments INNER JOIN shipmentManifest INNER JOIN product WHERE status='ready' AND shipments.id=shipmentManifest.id AND shipmentManifest.prodID=product.id;");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[][] returnArray=new Object[numResults][5];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {

                        System.out.println(results.toString());
                        returnArray[rowCount][0]=results.getInt(1);
                        returnArray[rowCount][1]=results.getString(2);
                        returnArray[rowCount][2]=results.getInt(3);
                        returnArray[rowCount][3]=results.getString(4);
                        returnArray[rowCount][4]=results.getString(5);

                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ShipperDB.class.getName()).log(Level.SEVERE, null, ex);
        }


        return null;
    }

    @Override
    public Object[] getPendingShipmentList()
    {
//          Object[][] returnArr=new Object[][]{
//                {1,"CALL OF DUTY: GHOST",30,"Saskatoon","2013-05-07"},
//                {2,"Borderlands 2",26,"Beijing","2013-06-09"},
//                {3,"Far Cry 3",15,"London","2013-06-12"}
//            };

        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT shipments.id, product.name, shipmentManifest.quantity, shipments.destination, shipments.sentDate FROM shipments INNER JOIN shipmentManifest INNER JOIN product WHERE status='pending' AND shipments.id=shipmentManifest.id AND shipmentManifest.prodID=product.id;");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[][] returnArray=new Object[numResults][5];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {

                        System.out.println(results.toString());
                        returnArray[rowCount][0]=results.getInt(1);
                        returnArray[rowCount][1]=results.getString(2);
                        returnArray[rowCount][2]=results.getInt(3);
                        returnArray[rowCount][3]=results.getString(4);
                        returnArray[rowCount][4]=results.getString(5);

                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ShipperDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public Object[] getStockHandlers()
    {

        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT id,name FROM employees WHERE title='Stock Handler';");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[][] returnArray=new Object[numResults][2];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {

                        System.out.println(results.toString());
                        returnArray[rowCount][0]=results.getInt(1);
                        returnArray[rowCount][1]=results.getString(2);

                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ShipperDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public Object[] getShippingCompanies()
    {

        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT * FROM shipmentCompanies;");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[][] returnArray=new Object[numResults][2];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {

                        System.out.println(results.toString());
                        returnArray[rowCount][0]=results.getInt(1);
                        returnArray[rowCount][1]=results.getString(2);

                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ShipperDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public boolean setNewShipment(shipmentTask newTask) {
        String query="INSERT INTO shipments(sentDate, status, trackingNum, weight, destination) VALUES ("+newTask.getitemDate()+",'pending','"+newTask.getwayBill()+"', 30,'"+newTask.getitemDestination()+"');";
        System.out.println(query);
        try
        {
            MysqlDB.runQuery(query);

            query="SELECT id FROM shipments ORDER BY id DESC LIMIT 1;";
            ResultSet results=MysqlDB.runQuery(query);

            if(results.next())
            {
                int theId=results.getInt(1);
                query="INSERT INTO shipmentManifest values ("+theId+","+newTask.getItemNumber()+","+newTask.getitemQuantity()+") ON DUPLICATE KEY UPDATE quantity=quantity+"+newTask.getitemQuantity()+";";
                MysqlDB.runQuery(query);
                return true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ShipperDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
