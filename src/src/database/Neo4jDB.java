package database;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import static org.neo4j.kernel.impl.util.FileUtils.deleteRecursively;

/**
 * Singleton class to provide access to the Neo4j database
 * @author Matt
 */
public class Neo4jDB
{

    private static Neo4jDB database;

    //Variables for database connection
    private static final String DB_PATH="graphDatabase/warehouse-db";
    private static GraphDatabaseService graphDb;
    private static ExecutionEngine engine;


    /**
     * Constructor, creates a Neo4j database connection
     */
    private Neo4jDB()
    {
        //Connect to the database
        createDB();
    }

    static void createDB()
    {
        graphDb=new GraphDatabaseFactory().newEmbeddedDatabase(DB_PATH);
        registerShutdownHook(graphDb);
        engine=new ExecutionEngine(graphDb);
    }

    /**
     * Accessor to the database
     * @return database connection
     */
    static Neo4jDB get()
    {
        if(database==null)
        {
            database=new Neo4jDB();
        }

        return database;
    }

    /**
     * Runs the given query on the database
     * @param query A Cypher query to be run on the Neo4j database
     * @return The ResultSet generated from the query
     */
    public static ExecutionResult runQuery(String query)
    {
        if(graphDb==null)
        {
            createDB();
        }

        Transaction tx=graphDb.beginTx();

        try
        {
            ExecutionResult result=engine.execute(query);
            tx.success();
            return result;
        }
        catch(Exception ex)
        {
            System.out.println("Transaction failed.");
            Logger.getLogger(Neo4jDB.class.getName()).log(Level.SEVERE, null, ex);
            tx.finish();
            return null;
        }
        finally
        {
            tx.finish();
        }
    }

    private static void registerShutdownHook(final GraphDatabaseService graphDb)
    {
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                graphDb.shutdown();
            }
        });
    }

    private static void clearDbPath()
    {
        try
        {
            deleteRecursively( new File( DB_PATH ) );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }

    public static void main(String args[])
    {
        //Uncomment the following line to completely wipe your database
        // !!THIS IS NOT UNDOABLE!!
        //Neo4jDB.clearDbPath();

        //Hello World Example running a cypher query in
        ExecutionResult result=Neo4jDB.runQuery("CREATE (firstNode {hello: \"World\"}) RETURN firstNode");
        System.out.println(result.dumpToString());
    }
}
