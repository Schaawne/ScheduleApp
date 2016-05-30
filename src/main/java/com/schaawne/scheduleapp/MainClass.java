package com.schaawne.scheduleapp;

import com.schaawne.scheduleapp.generated.tables.records.StudentsRecord;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.SQLException;

import static com.schaawne.scheduleapp.generated.Tables.*;

/**
 * MainClass class for ScheduleApp
 * <p>
 * Created by Schaawne on 5/29/2016.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class MainClass extends Application
{
    /**
     * Called by JavaFX framework on application start
     *
     * @param primaryStage the primary window's Stage
     * @throws Exception all Exceptions are passed up the callstack
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Schedule App");
        primaryStage.setScene(scene);
        primaryStage.show();

        Connection conn = null;

        try
        {
            conn = ConnectionPool.GetConnection();

            DSLContext context = DSL.using(conn, SQLDialect.H2);

            System.out.println("****FIRST DB CHECK****");
            Result<StudentsRecord> results = context.selectFrom(STUDENTS).fetch();
            if(results.isEmpty())
            {
                System.out.println("NO DB DATA!");
            }
            results.forEach(System.out::println);

            System.out.println("****INSERT DATA****");
            StudentsRecord record = context.newRecord(STUDENTS);
            record.setFirstname("Fake");
            record.setLastname("Student");
            record.setEmail("FakeStudent@gmail.com");
            record.store();

            System.out.println("****SECOND DB CHECK****");
            results = context.selectFrom(STUDENTS).fetch();
            if(results.isEmpty())
            {
                System.out.println("NO DB DATA!");
            }
            results.forEach(System.out::println);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(null != conn) try{ conn.close(); } catch(SQLException e) { e.printStackTrace(); }
        }
    }

    /**
     * Called by JavaFX framework on application exit
     */
    @Override
    public void stop()
    {
        //Cleanup ConnectionPool
        ConnectionPool.Cleanup();
    }
}