/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui;

import database.MysqlDB;
import database.Neo4jDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.Node;


/**
 *
 * @author Matt
 */
public class GuiDB implements GuiDBInterface
{

    @Override
    public boolean createBin(int row, int column)
    {
        if(row<1 || column<1)
        {
            return false;
        }
        
        String query="CREATE (bin {row: "+row+", column:"+column+"}) RETURN bin";
        ExecutionResult result=Neo4jDB.runQuery(query);
        if(result.getQueryStatistics().getNodesCreated()==1)
        {
            System.out.println("Success create!");
            getBinLocations();
            return true;
        }

        return false;
    }

    @Override
    public boolean removeBin(int row, int column)
    {
        String query="START n=node(*) WHERE has(n.row) AND n.row="+row+" AND n.column="+column+" DELETE n";
        //System.out.println(query);
        ExecutionResult result=Neo4jDB.runQuery(query);
        if(result.getQueryStatistics().getDeletedNodes()>0)
        {
            System.out.println("Success delete!");
            return true;
        }

        return false;
    }

    public String[] getBinIndicesFromID(int id)
    {
        String query="START n=node(*) WHERE id(n)="+id+" return n";
        ExecutionResult result=Neo4jDB.runQuery(query);
       if(result!=null)
        {
            Iterator<Node> listNodes=result.columnAs("n");
            ArrayList<String> returnArray=new ArrayList<String>();

            while(listNodes.hasNext())
            {
                Node currNode=listNodes.next();
                if(currNode.hasProperty("row") && currNode.hasProperty("column"))
                {
                    System.out.println("Row: "+currNode.getProperty("row")+"Column: "+currNode.getProperty("column"));
                    returnArray.add(currNode.getProperty("row")+" "+currNode.getProperty("column"));
                }
            }

            return returnArray.toArray(new String[returnArray.size()]);

        }

        return null;
    }
    
    @Override
    public String[] getBinLocations()
    {
        String query="START n=node(*) RETURN n";
        ExecutionResult result=Neo4jDB.runQuery(query);
        if(result!=null)
        {
            Iterator<Node> listNodes=result.columnAs("n");
            ArrayList<String> returnArray=new ArrayList<String>();

            while(listNodes.hasNext())
            {
                Node currNode=listNodes.next();
                if(currNode.hasProperty("row") && currNode.hasProperty("column"))
                {
                    //System.out.println("GETALL-Row: "+currNode.getProperty("row")+"Column: "+currNode.getProperty("column"));
                    returnArray.add(currNode.getProperty("row")+" "+currNode.getProperty("column"));
                }
            }

            return returnArray.toArray(new String[returnArray.size()]);

        }

        return null;
    }

    @Override
    public boolean login(int userId, String password, int type)
    {

        //Currently the log in system does not use hashing, this will be changed for the next milestone
        // for security reasons
        String query="SELECT count(*) FROM users where id="+userId+" and password='"+password+"' and type="+type+";";
        //System.out.println(query);
        try
        {
            ResultSet results=MysqlDB.runQuery(query);

            //If we get a return count of 1, then the user authenticated correctly
            if(results!=null && results.next() && results.getInt(1)==1)
            {
                return true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(GuiDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    @Override
    public Integer[] getItemLocation(int itemId) {
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT binID FROM prodLocation WHERE id="+itemId+";");
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
            Logger.getLogger(GuiDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
