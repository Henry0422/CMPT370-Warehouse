/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shipper;

import database.shipper.ShipperDB;

/**
 *
 * @author Xingze
 */
public class futureShipment
{

    private ShipperDB database;

    public futureShipment()
    {
        database =new ShipperDB();
    }


    public Object getFurtureShip()
    {
        //todo  get info from database
        Object shipmentInfo[][];
        shipmentInfo = (Object[][]) database.getPendingShipmentList();
        return shipmentInfo;
    }
}
