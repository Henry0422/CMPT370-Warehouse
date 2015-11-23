package database.stockhandler;

/**
 * An interface, contains all methods to be used by Stock Handler features
 * @author Matt
 */
public interface StockhandlerDBInterface
{
        /**
         * Gets all order details for the given order number
         * @param orderId The order to get the details for
         * @return The details for the order
         */
        public Object[][] getOrder(int orderId);
        
        /**
         * Gets all orders that are ready for shipment in the system.
         * @return The order ID number that is ready
         */
        public Integer[] getReadyOrderNumbers();
}
