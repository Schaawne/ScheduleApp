package com.schaawne.scheduleapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * MainClass class for ScheduleApp
 * <p>
 * Application entry point class
 * </p>
 * Created by Schaawne on 5/29/2016.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
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