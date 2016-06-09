package com.schaawne.scheduleapp;

import org.h2.jdbcx.JdbcConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * ConnectionPool class for ScheduleApp
 * <p>
 * Singleton Class for managing the connection pool
 * </p>
 * Created by Schaawne on 5/29/2016.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public final class ConnectionPool
{
    /** Daabase name */
    private static final String DB_NAME = "scheduleapp";
    /** Database User */
    private static final String DB_USER = "SCHEDUSER";
    /** Database User Password */
    private static final String DB_PASS = "";

    /** The connection pool field */
    private JdbcConnectionPool theConnectionPool;

    /**
     * Private constructor for lazy initialization of Singleton
     */
    private ConnectionPool()
    {
        //Instantiate the connection pool
        theConnectionPool = JdbcConnectionPool.create("jdbc:h2:file:./database/" + DB_NAME, DB_USER, DB_PASS);
    }

    /**
     * Inner class for triggering lazy initialization
     */
    private static class ConnectionPoolHolder
    {
        public static final ConnectionPool instance = new ConnectionPool();
    }

    /**
     * Return a Connection from the pool
     *
     * @return the next available connection
     * @throws SQLException all SQLExceptions passed up the callstack
     */
    public static Connection GetConnection() throws SQLException
    {
        return ConnectionPoolHolder.instance.theConnectionPool.getConnection();
    }

    /**
     * Cleanup the JDBCConnectionPool
     */
    public static void Cleanup()
    {
        ConnectionPoolHolder.instance.theConnectionPool.dispose();
    }
}
