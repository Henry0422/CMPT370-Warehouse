package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Singleton class to provide access to the MySQL database via JDBC
 * @author Matt
 */
public class MysqlDB
{

    /**
     * Singleton database class to run queries on
     */
    private static MysqlDB database;

    //Variables for database connection
    private static Connection connection=null;
    private static final String DATABASEURL="jdbc:mysql://edjo.usask.ca/cmpt370_group02";

    /**
     * Constructor, creates a database connector
     */
    private MysqlDB()
    {
        int rv;
        try
        {
            rv=connect();
            if(rv<0)
            {
                Logger.getLogger(MysqlDB.class.getName()).log(Level.SEVERE, null, "Unable to connect to DB!");
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MysqlDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static int connect() throws SQLException
    {
        //Connect to the database
        try
        {
            connection=DriverManager.getConnection(DATABASEURL, "cmpt370_group02", "23hkzz64gb");
        }
        catch(Exception ex)
        {
            System.out.println("Failed to connect");
            Logger.getLogger(MysqlDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(connection!=null)
        {
            return 0;
        }

        return -1;
    }

    /**
     * Accessor to the database
     * @return database connection
     */
    public static MysqlDB get()
    {
        if(database==null)
        {
            database=new MysqlDB();
        }

        return database;
    }

    /**
     * Runs the given query on the database
     * @param query A SQL query to be run on the MySQL database
     * @return The ResultSet generated from the query
     */
    public static ResultSet runQuery(String query) throws SQLException
    {
        Statement statement;
        if(connection==null)
        {
            connect();
        }

        if(connection!=null)
        {
            statement=connection.createStatement();
            boolean successful=statement.execute(query);
            if(successful)
            {
                return statement.getResultSet();
            }
        }


        return null;
    }

    public static void main(String [] args)
    {
        try
        {
            ResultSet ret=MysqlDB.runQuery("SELECT name FROM prodCategory;");
            if(ret==null)
            {
                System.out.println("DB returned nothing.");
            }
            else
            {
                ResultSetMetaData metaData = ret.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                while(ret.next())
                {
                    for(int j=1; j<=numberOfColumns; j++)
                    {
                        System.out.printf( "%-8s\t",ret.getObject(j) );
                        System.out.println("");
                    }
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MysqlDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
