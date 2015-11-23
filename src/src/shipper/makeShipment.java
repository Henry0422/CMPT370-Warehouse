package shipper;

import database.shipper.ShipperDB;
import java.sql.Array;

/**
*
* @author Xingze
*/

public class makeShipment
{
    private ShipperDB database;
    private shipmentTask newTask;
    private int wayBill;
    private int deliveryTime;
    private String stockPicker;

    public makeShipment()
    {
        newTask = new shipmentTask();
        database =new ShipperDB();
    }


    /**
    * @return shipment number of all shipment requirements in an array
    *
    */
    public Object shipRequire()
    {
        //todo  get info from database
        Object shipmentInfo[][];
        shipmentInfo = (Object[][]) database.getShipmentList();
        return shipmentInfo;
    }

    /**
    * @param number: waybill number from user input
    * @param tiem : delivery time from user input
    */

    public void inputDeliveryInfo(int number, int time)
    {
        wayBill = number;
        deliveryTime = time;
    }

    public void inputItemInfor(int number, String name,
                               int quantity, String destination, String date)
    {
        newTask.setItemNumber(number);
        newTask.setitemName(name);
        newTask.setitemQuantity(quantity);
        newTask.setitemDestination(destination);
        newTask.setitemDate(date);

        //Test code
        System.out.println(number + name + quantity + destination +date);

    }

    public Object pickerRequire()
    {
        Object picker[][];
        picker = (Object[][]) database.getStockHandlers();
        return picker;
    }

    public Object companyRequire()
    {

        Object picker[][];
        picker = (Object[][]) database.getShippingCompanies();
        return picker;
    }
    /**
    *     @param picker: the choosen picker form GUI
         * @param wayBill
    */
    public void setPicker(String picker)
    {

        newTask.setStockPicker(picker);

    }

    public void setCompany(String company, String wayBill)
    {
        int bill = Integer.parseInt(wayBill);
        newTask.setShippingCompany(company);
        newTask.setwayBill(bill);
        
    }
    
    public void writeToDatabase(){
        database.setNewShipment(newTask);
        System.out.println(newTask.toString());
    }
    /**
    *	Assign task to a stock picker by create the shipment task
    */
    public void creatShipment()
    {

    }

    /**
     *  Store the information info database
     *  @return true is success, false otherwise
     */
    public Boolean makeRecord()
    {
        return false;
    }

}
