/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

/**
 *
 * @author Xingze
 * @edit Rongli
 */
public class newOrder
{
    //
    private String productName;
    private int productNumber;
    private int productQuantity;
    private float productSize;
    private float productWeight;
    
    /*
     *@param a String productName, a integer productNumvber, an integer productQuantity
     *@param a float productSize itemNum, a float productWeight
     *add a new product into the management system
     */
    
    public newOrder(String productName, int productNumber, int productQuantity, float productSize, float productWeight)
    {
        this.productName = productName;
        this.productNumber = productNumber;
        this.productQuantity = productQuantity;
        this.productSize = productSize;
        this.productWeight = productWeight;
    }

    /*
     *
     *@return String
     */    
    @Override
    public String toString()
    {
        return "Name =" + productName  + "\r\n"
               +"Number =" + productNumber + "\r\n"
               +"Quantity =" + productQuantity +"\r\n"
               +"Size =" + productSize +"\r\n"
               +"Weight =" + productWeight + "\r\n";
    }



}
