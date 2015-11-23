/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.shipper;

import shipper.shipmentTask;

/**
 * An interface, contains all methods to be used by Shipping features
 * @author Matt
 */
public interface ShipperDBInterface
{

    /**
     * Get a list of all the shipments and their full information
     * @return An array of the shipments
     */
    public Object[] getShipmentList();

    /**
     * Get a list of all the shipments that have not been sent with their full
     * information
     * @return An array of the shipments
     */
    public Object[] getPendingShipmentList();

    /**
     * Returns a listing of all stock pickers
     * @return an array that includes employee number and name
     */
    public Object[] getStockHandlers();


    /**
     * Return a listing of all shipping companies
     * @return an array that includes name of shipping companies
     */
    public Object[] getShippingCompanies(); //Added by Xingze
    
    
    /**
     * Set new shipment
     * @param newTask new shipment
     */
    public boolean setNewShipment(shipmentTask newTask); //Added by Xingze
}
